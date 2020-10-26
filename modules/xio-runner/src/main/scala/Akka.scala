package xio.akka.runner

import java.util

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed._
import akka.actor.typed.scaladsl.AskPattern._
import akka.pattern.Patterns
import akka.util.Timeout
import zio._

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.reflect.ClassTag

object HelloWorld {
  final case class RunResult(value: Any)
  sealed trait QueueReceive
  final case class InputZIO(zio: ZIO[ZEnv, Throwable, Any], replyTo: ActorRef[RunResult]) extends QueueReceive
  final case class Greeted(from: ActorRef[Greet])                                         extends QueueReceive

  final case class StartZIO(replyTo: ActorRef[Greeted])
  final case class Greet(zio: ZIO[ZEnv, Throwable, Any], replyTo: ActorRef[RunResult])

  def apply(): Behavior[StartZIO] = Behaviors.receive { (context, message) =>
    // context.log.info("Hello {}!", message.whom)
    // message.replyTo ! Greeted(message.whom, context.self)

    import scala.concurrent.duration._
    import scala.util._
    implicit val timeOut: Timeout             = 10.seconds
    implicit val system: ActorSystem[Nothing] = context.system
    implicit val ec: ExecutionContext         = context.system.executionContext

    def forZIO: ZIO[ZEnv, Throwable, Int] = {
      val ii = ZIO.effectAsync[ZEnv, Throwable, Greet] { result =>
        message.replyTo.ask((i: ActorRef[Greet]) => Greeted(i)).onComplete {
          case Success(i) => result(ZIO.succeed(i))
          case Failure(e) => result(ZIO.fail(e))
        }
      }
      for {
        inner   <- ii
        result1 <- forZIO.fork
        result2 <- inner.zio.fork
        result3 <- result2.join
        result4 = inner.replyTo ! RunResult(result3)
        i <- result1.join
      } yield i
    }

    Runtime.default.unsafeRunToFuture(forZIO)
    Behaviors.same

  }
}

object HelloWorldBot {

  val queue: java.util.Queue[HelloWorld.Greet] = new util.LinkedList[HelloWorld.Greet]

  def apply(): Behavior[HelloWorld.QueueReceive] =
    Behaviors.receive { (context, message) =>
      message match {
        case HelloWorld.InputZIO(i1, i2) =>
          queue.offer(HelloWorld.Greet(i1, i2))
        case i @ HelloWorld.Greeted(_) =>
          val ele = queue.poll()
          if (ele != null) {
            i.from ! ele
          }
      }
      Behaviors.same
    }
}

object HelloWorldMain {

  final case class SayHello(zioTask: ZIO[ZEnv, Throwable, Any], replyTo: ActorRef[HelloWorld.RunResult])

  def apply(): Behavior[SayHello] =
    Behaviors.setup { context =>
      val greeter = context.spawnAnonymous(HelloWorld())
      val replyTo = context.spawnAnonymous(HelloWorldBot.apply())
      greeter ! HelloWorld.StartZIO(replyTo)

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
      system.ask((ac: ActorRef[HelloWorld.RunResult]) => HelloWorldMain.SayHello(zio, ac)).map(r => r.value).mapTo[T]

    val aa = (1 to 1000)
      .to(List)
      .map(i =>
        for {
          _ <- clock.sleep(zio.duration.Duration.fromMillis(Random.nextLong(6000)))
        } yield i
      )

    val n: Future[List[Int]] = Future.sequence(aa.map(i => runToFuture(i)))

    val n1: Future[Unit] = n.map { list =>
      println(list.mkString("\n"))
      println((1 to 1000).to(List) == list)
    }

    Await.result(n1, Duration.Inf)
    system.terminate()
  }
}
