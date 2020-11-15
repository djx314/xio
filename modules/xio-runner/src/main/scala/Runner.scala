package xio.akka.runner

import akka.actor.typed._
import zio.Exit.{Failure, Success}
import zio._

import scala.concurrent.{ExecutionContext, Future, Promise => SPromise}
import scala.reflect.ClassTag

trait Runner[Env] extends AutoCloseable {
  val env: Either[Env, ZLayer[Any, Throwable, Env]]

  private val layer: ZLayer[Any, Throwable, Env] = env.fold(l => ZLayer.fromFunctionMany(_ => l), r => r)

  val system: ActorSystem[ActorToZIO.InputZIO] = ActorSystem(ActorSystemStarter(), "hello")

  private def runToFuture[T](zio: ZIO[Any, Throwable, T])(implicit tag: ClassTag[T]): CancelableFuture[T] = {
    val promise          = SPromise[Any]()
    val promiseCancel    = SPromise[ZIO[Any, Nothing, Exit[Throwable, Any]]]()
    val promiseCancelOpt = Option(promiseCancel)
    system ! ActorToZIO.InputZIO(zio, promise, promiseCancelOpt)
    val f = promise.future
    new CancelableFuture(f.mapTo[T]) {
      override def cancel(): Future[Exit[Throwable, T]] = {
        val promiseCancel1 = SPromise[Any]()

        implicit val ec = system.executionContext
        for (n <- promiseCancel.future) yield system ! ActorToZIO.InputZIO(n, promiseCancel1, Option.empty)

        promiseCancel1.future.mapTo[Exit[Throwable, T]]
      }
    }
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
