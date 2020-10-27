package xio.akka.runner

import java.util

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed._
import akka.actor.typed.scaladsl.AskPattern._
import akka.util.Timeout
import zio._

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.reflect.ClassTag

object HelloWorld {
  final case class RunResult(value: Either[Throwable, Any])
  sealed trait QueueReceive
  final case class InputZIO(zio: ZIO[ZEnv, Throwable, Any], replyTo: ActorRef[RunResult]) extends QueueReceive
  final case class Greeted(from: ActorRef[InputZIO])                                      extends QueueReceive

  def fromActorRef(replyTo: ActorRef[Greeted])(actorSystem: ActorSystem[Nothing]): CancelableFuture[Int] = {

    import scala.concurrent.duration._
    import scala.util._
    implicit val timeOut: Timeout             = 10.seconds
    implicit val system: ActorSystem[Nothing] = actorSystem
    implicit val ec: ExecutionContext         = actorSystem.executionContext

    def forZIO: ZIO[ZEnv, Throwable, Int] = {
      val ii = ZIO.effectAsync[ZEnv, Throwable, InputZIO] { result =>
        replyTo.ask((i: ActorRef[InputZIO]) => Greeted(i)).onComplete {
          case Success(i) => result(ZIO.succeed(i))
          case Failure(e) => result(ZIO.fail(e))
        }
      }
      for {
        inner   <- ii
        result1 <- forZIO.fork
        result2 <- inner.zio.either.fork
        result3 <- result2.join
        result4 = inner.replyTo ! RunResult(result3)
        i <- result1.join
      } yield 2
    }

    Runtime.default.unsafeRunToFuture(forZIO)
  }

}

object HelloWorldBot {

  val queue: java.util.Queue[HelloWorld.InputZIO] = new util.LinkedList[HelloWorld.InputZIO]
  var replyTo: HelloWorld.Greeted                 = null

  def apply(): Behavior[HelloWorld.QueueReceive] =
    Behaviors.receive { (context, message) =>
      message match {
        case in: HelloWorld.InputZIO =>
          queue.offer(in)
          if (replyTo != null) {
            val ele = queue.poll()
            if (ele != null) {
              replyTo.from ! ele
              replyTo = null
            }
          }
        case i: HelloWorld.Greeted =>
          val ele = queue.poll()
          if (ele != null) {
            i.from ! ele
          } else {
            replyTo = i
          }
      }
      Behaviors.same
    }
}

object HelloWorldMain {

  final case class SayHello(zioTask: ZIO[ZEnv, Throwable, Any], replyTo: ActorRef[HelloWorld.RunResult])

  def apply(): Behavior[SayHello] = Behaviors.setup { context =>
    val replyTo = context.spawn(HelloWorldBot.apply(), "zio-sender")
    HelloWorld.fromActorRef(replyTo)(context.system)

    Behaviors.receiveMessage { message =>
      replyTo ! HelloWorld.InputZIO(message.zioTask, message.replyTo)
      Behaviors.same
    }
  }

  def main(args: Array[String]): Unit = {
    implicit val system: ActorSystem[HelloWorldMain.SayHello] = ActorSystem(HelloWorldMain(), "hello")

    import scala.concurrent.duration._
    import scala.util._
    implicit val timeOut: Timeout     = 10.seconds
    implicit val ec: ExecutionContext = system.executionContext

    def runToFuture[T](zio: ZIO[ZEnv, Throwable, T])(implicit tag: ClassTag[T]): Future[T] =
      system.ask((ac: ActorRef[HelloWorld.RunResult]) => HelloWorldMain.SayHello(zio, ac)).flatMap(r => r.value.fold(Future.failed, Future.successful)).mapTo[T]

    val aa = (1 to 1000)
      .to(List)
      .map(i =>
        for {
          _ <- clock.sleep(zio.duration.Duration.fromMillis(Random.nextLong(3000)))
        } yield i
      )

    val n: Future[List[Int]] = Future.sequence(aa.map(i => runToFuture(i)))

    val n1: Future[Unit] = n.map { list =>
      println(list.mkString("\n"))
      println((1 to 1000).to(List) == list) // true
    }

    Await.result(n1, Duration.Inf)
    system.terminate()
  }
}
