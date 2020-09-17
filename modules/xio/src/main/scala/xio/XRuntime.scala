package xio

import xio.nat.error.{NatEither, NatEitherPositive, NatEitherToTag, NatEitherZero}
import zio._
import zio.internal.Platform

trait XRuntime[R] {
  self =>

  def zioRuntime: Runtime[R]

  def map[R1](f: R => R1): XRuntime[R1] =
    new XRuntime[R1] {
      override val zioRuntime: Runtime[R1] = self.zioRuntime.map(f)
    }

  def mapPlatform(f: Platform => Platform): XRuntime[R] =
    new XRuntime[R] {
      override val zioRuntime: Runtime[R] = self.zioRuntime.mapPlatform(f)
    }

  final def unsafeRun[E <: NatEither, A](zio: => XIO[R, E, A]): A = self.zioRuntime.unsafeRun(zio.zio)

  final def unsafeRunTask[A, E <: NatEither](task: => XIO[R, E, A])(implicit nn: NatEitherToTag[E, NatEitherPositive[NatEitherZero, Throwable]]): A =
    self.zioRuntime.unsafeRunTask(task.zio.mapError(nn.tag).mapError(_.sureRight))

  final def unsafeRunSync[E <: NatEither, A](zio: => XIO[R, E, A]): Exit[E, A] =
    self.zioRuntime.unsafeRunSync(zio.zio)

  final def unsafeRunToFuture[E <: NatEither, A](
    zio: XIO[R, E, A]
  )(implicit nn: NatEitherToTag[E, NatEitherPositive[NatEitherZero, Throwable]]): CancelableFuture[A] = {
    self.zioRuntime.unsafeRunToFuture(zio.zio.mapError(s => nn.tag(s).sureRight))
  }

}

object XRuntime {

  lazy val default: XRuntime[zio.ZEnv] = new XRuntime[zio.ZEnv] {
    override val zioRuntime: Runtime[zio.ZEnv] = Runtime.default
  }
  lazy val global: XRuntime[zio.ZEnv] = new XRuntime[zio.ZEnv] {
    override val zioRuntime: Runtime[zio.ZEnv] = Runtime.global
  }
}
