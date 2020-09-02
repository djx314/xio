package xio

import xio.nat.error.{NatEither, NatEitherPositive, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatPositive, NatToTag, NatZero}
import zio._
import zio.internal.Platform

trait XRuntime[R <: Nat] {
  self =>

  def zioRuntime: Runtime[R]

  def map[R1 <: Nat](f: R => R1): XRuntime[R1] =
    new XRuntime[R1] {
      override val zioRuntime: Runtime[R1] = self.zioRuntime.map(f)
    }

  def mapPlatform(f: Platform => Platform): XRuntime[R] with Object =
    new XRuntime[R] {
      override val zioRuntime: Runtime[R] = self.zioRuntime.mapPlatform(f)
    }

  final def unsafeRun[R1 <: Nat, E <: NatEither, A](zio: => XIO[R1, E, A])(implicit n: NatToTag[R1, R]): A = self.zioRuntime.map(n.tag).unsafeRun(zio.zio)

  final def unsafeRunTask[R1 <: Nat, A](task: => XIO[R1, NatEitherPositive[NatEitherZero, Throwable], A])(implicit n: NatToTag[R1, R]): A =
    self.zioRuntime.map(n.tag).unsafeRunTask(task.zio.mapError(_.either.right.getOrElse(throw new NoSuchElementException("Either.right.get on Left"))))

  final def unsafeRunSync[R1 <: Nat, E <: NatEither, A](zio: => XIO[R1, E, A])(implicit n: NatToTag[R1, R]): Exit[E, A] =
    self.zioRuntime.map(n.tag).unsafeRunSync(zio.zio)

  final def unsafeRunToFuture[R1 <: Nat, E <: NatEither, A](
    zio: XIO[R1, E, A]
  )(implicit n: NatToTag[R1, R], nn: NatEitherToTag[E, NatEitherPositive[NatEitherZero, Throwable]]): CancelableFuture[A] = {
    self.zioRuntime.map(n.tag).unsafeRunToFuture(zio.zio.mapError(s => nn.tag(s).sureRight))
  }

}

object XRuntime {
  type XEnv = XHas5[clock.Clock.Service, console.Console.Service, system.System.Service, random.Random.Service, blocking.Blocking.Service]

  object XEnv {

    val xlive: XEnv =
      XHasTuple5(clock.Clock.Service.live, console.Console.Service.live, system.System.Service.live, random.Random.Service.live, blocking.Blocking.Service.live)

    val any: XLayer[XEnv, XError0, XEnv] = XLayer.requires[XEnv]

    val live: XLayer[XHas0, XError0, XEnv] = {
      val live1: XLayer[XHas0, XError0, XHasTuple1[clock.Clock.Service]] =
        new XLayer[NatZero, XError0, XHasTuple1[clock.Clock.Service]] {
          override val zlayer: ZLayer[XHas0, XError0, XHasTuple1[clock.Clock.Service]] = clock.Clock.live.map(r => XHasTuple1(r.get))
        }
      val live2: XLayer[XHas0, XError0, XHasTuple1[console.Console.Service]] =
        new XLayer[XHas0, XError0, XHasTuple1[console.Console.Service]] {
          override val zlayer: ZLayer[XHas0, XError0, XHasTuple1[console.Console.Service]] =
            console.Console.live.map(r => XHasTuple1(r.get))
        }
      val live3: XLayer[XHas0, XError0, XHasTuple1[system.System.Service]] =
        new XLayer[XHas0, XError0, XHasTuple1[system.System.Service]] {
          override val zlayer: ZLayer[XHas0, NatEitherZero, XHasTuple1[system.System.Service]] = system.System.live.map(r => XHasTuple1(r.get))
        }
      val live4: XLayer[XHas0, XError0, XHasTuple1[random.Random.Service]] =
        new XLayer[XHas0, XError0, XHasTuple1[random.Random.Service]] {
          override val zlayer: ZLayer[XHas0, XError0, XHasTuple1[random.Random.Service]] = random.Random.live.map(r => XHasTuple1(r.get))
        }
      val live5: XLayer[XHas0, XError0, XHasTuple1[blocking.Blocking.Service]] =
        new XLayer[XHas0, XError0, XHasTuple1[blocking.Blocking.Service]] {
          override val zlayer: ZLayer[XHas0, XError0, XHasTuple1[blocking.Blocking.Service]] =
            blocking.Blocking.live.map(r => XHasTuple1(r.get))
        }
      live5 ++ live4 ++ live3 ++ live2 ++ live1
    }

  }

  lazy val default: XRuntime[XEnv] = new XRuntime[XEnv] {
    override val zioRuntime: Runtime[XEnv] = Runtime(XEnv.xlive, Platform.default)
  }
  lazy val global: XRuntime[XEnv] = new XRuntime[XEnv] {
    override val zioRuntime: Runtime[XEnv] = Runtime(XEnv.xlive, Platform.global)
  }
}
