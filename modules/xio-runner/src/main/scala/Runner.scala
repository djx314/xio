package xio.akka.runner

import akka.actor.typed._
import zio._

import scala.concurrent.{Promise => SPromise, Future}
import scala.reflect.ClassTag

trait Runner[Env] extends AutoCloseable {
  val env: Either[Env, ZLayer[Any, Throwable, Env]]

  private val layer: ZLayer[Any, Throwable, Env] = env.fold(l => ZLayer.fromFunctionMany(_ => l), r => r)

  val system: ActorSystem[ActorToZIO.InputZIO] = ActorSystem(ActorSystemStarter(), "hello")

  private def runToFuture[T](zio: ZIO[Any, Throwable, T])(implicit tag: ClassTag[T]): Future[T] = {
    val promise = SPromise[Any]()
    val f       = promise.future
    system ! ActorToZIO.InputZIO(zio, promise)
    f.mapTo[T]
  }

  def unsafeToFuture[Env1, T](zio: ZIO[Env1, Throwable, T])(implicit tag: ClassTag[T], ev1: Env <:< Env1): Future[T] = runToFuture(zio.provideLayer(layer))

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
  class RunnerImpl[T](override val env: Either[T, ZLayer[Any, Throwable, T]]) extends Runner[T]
  def default: Runner[ZEnv] = new RunnerImpl[ZEnv](Right(ZEnv.live))
}
