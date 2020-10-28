package xio.akka.runner

import java.util
import java.util.Random

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed._
import akka.actor.typed.scaladsl.AskPattern._
import akka.util.Timeout
import zio._

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.reflect.ClassTag

object HelloWorld {
  final case class RunResult(value: Either[Throwable, Any])
  sealed trait QueueReceive
  final case class InputZIO(zio: ZIO[Any, Throwable, Any], replyTo: ActorRef[RunResult]) extends QueueReceive
  final case class Greeted(from: ActorRef[InputZIO])                                     extends QueueReceive

  def fromActorRef(replyTo: ActorRef[Greeted])(actorSystem: ActorSystem[Nothing]): CancelableFuture[Int] = {

    import scala.concurrent.duration._
    import scala.util._
    implicit val timeOut: Timeout             = 3.days
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
        _ <- result1.join
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

trait Runner[Env] extends AutoCloseable {
  def env: ZLayer[Any, Throwable, Env]

  def timeoutMillions: Long

  implicit val system: ActorSystem[HelloWorldMain.SayHello] = ActorSystem(HelloWorldMain(), "hello")

  import scala.concurrent.duration._
  implicit def timeOut: Timeout                   = timeoutMillions.millis
  implicit val executionContext: ExecutionContext = system.executionContext

  private def runToFuture[Env1, Env2, E1 <: Throwable, T](
    zio: ZIO[Env2, Throwable, T]
  )(env: ZLayer[Any, E1, Env1])(implicit tag: ClassTag[T], ev1: Env1 <:< Env2): Future[T] =
    system
      .ask((ac: ActorRef[HelloWorld.RunResult]) => HelloWorldMain.SayHello(zio.provideLayer(env), ac))
      .flatMap(r => r.value.fold(Future.failed, Future.successful))
      .mapTo[T]

  def unsafeToFuture[Env1, T](zio: ZIO[Env1, Throwable, T])(implicit tag: ClassTag[T], ev1: Env <:< Env1): Future[T] = runToFuture(zio)(env)

  override def close(): Unit = {
    try {
      system.terminate()
    } catch {
      case e: Exception =>
        e.printStackTrace()
    }
  }
}

object Runner {
  def default(timeoutMillions: Long): Runner[ZEnv] = {
    val timeoutMillions1 = timeoutMillions
    new Runner[ZEnv] {
      override val env: ZLayer[Any, Throwable, ZEnv] = ZEnv.live
      override val timeoutMillions: Long             = timeoutMillions1
    }
  }
}

object HelloWorldMain {

  final case class SayHello(zioTask: ZIO[Any, Throwable, Any], replyTo: ActorRef[HelloWorld.RunResult])

  def apply(): Behavior[SayHello] = Behaviors.setup { context =>
    val replyTo = context.spawn(HelloWorldBot.apply(), "zio-sender")
    HelloWorld.fromActorRef(replyTo)(context.system)

    Behaviors.receiveMessage { message =>
      replyTo ! HelloWorld.InputZIO(message.zioTask, message.replyTo)
      Behaviors.same
    }
  }

  def main(args: Array[String]): Unit = {

    import scala.collection.compat._

    val aa = (1 to 1000)
      .to(List)
      .map(i =>
        for {
          i1 <- random.nextLongBounded(3000)
          _  <- clock.sleep(zio.duration.Duration.fromMillis(i1))
        } yield i
      )

    val runner = Runner.default(10 * 1000)

    implicit val ec = runner.executionContext

    val n: Future[List[Int]] = Future.sequence(aa.map(i => runner.unsafeToFuture(i)))

    val n1: Future[Unit] = n.map { list =>
      println(list.mkString("\n"))
      println((1 to 1000).to(List) == list) // true
    }

    Await.result(n1, Duration.Inf)
    runner.close()
  }
}
