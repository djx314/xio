package xio

import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatReversePlus, NatToTag, NatZero}

import scala.language.implicitConversions
import zio._

import scala.concurrent.ExecutionContext

trait XIO[I <: Nat, L <: NatEither, R] {
  self =>
  def zio: ZIO[I, L, R]
  def map[E1](cv: R => E1): XIO[I, L, E1] =
    new XIO[I, L, E1] {
      override def zio: ZIO[I, L, E1] = self.zio.map(cv)
    }
  def flatMap[I1 <: Nat, L1 <: NatEither, E1](
    cv: R => XIO[I1, L1, E1]
  )(implicit v: NatReversePlus[I, I1], n: NatEitherReversePlus[L, L1]): XIO[I1#Plus[I], L1#Plus[L], E1] = {
    new XIO[I1#Plus[I], L1#Plus[L], E1] {
      override def zio: ZIO[I1#Plus[I], L1#Plus[L], E1] =
        for {
          plus <- ZIO.identity[I1#Plus[I]]
          r    <- self.zio.provide(v.takeTail(plus)).mapError(e => n.takeTail(e))
          r1   <- cv(r).zio.provide(v.takeHead(plus)).mapError(e => n.takeHead(e))
        } yield r1
    }
  }
  def mapError[E1, ESUM <: NatEither](
    n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
  )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): XIO[I, ESUM, R] =
    new XIO[I, ESUM, R] {
      override def zio: ZIO[I, ESUM, R] = {
        self.zio.mapError(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))
      }
    }

  final def provideLayer[E1 <: NatEither, R0 <: Nat, R1 <: Nat](
    layer: ZLayer[R0, E1, R1]
  )(implicit ev1: NatToTag[I, R1], ev2: NatEitherReversePlus[L, E1]): XIO[R0, E1#Plus[L], R] =
    new XIO[R0, E1#Plus[L], R] {
      override def zio: ZIO[R0, E1#Plus[L], R] = self.zio.mapError(ev2.takeTail).provideLayer(layer.map(ev1.tag).mapError(ev2.takeHead))
    }

  final def provide[R1 <: Nat](r: R1)(implicit ev: NatToTag[I, R1]): XIO[NatZero, L, R] =
    new XIO[NatZero, L, R] {
      override def zio: ZIO[NatZero, L, R] = self.zio.provide(ev.tag(r))
    }

}

object XIO {

  implicit def xioImplicit[I1 <: Nat, I2 <: Nat, E1 <: NatEither, E2 <: NatEither, O1, O2](
    i: XIO[I1, E1, O1]
  )(implicit cv: NatToTag[I1, I2], v: NatEitherToTag[E1, E2], cv3: O1 <:< O2): XIO[I2, E2, O2] =
    new XIO[I2, E2, O2] {
      override def zio: ZIO[I2, E2, O2] =
        for {
          i2 <- ZIO.identity[I2]
          u  <- i.zio.provide(cv.tag(i2)).mapError(n => v.tag(n))
        } yield u
    }

  def identity[T <: Nat]: XIO[T, XError#_0, T] =
    new XIO[T, NatEitherZero, T] {
      override def zio: ZIO[T, NatEitherZero, T] = ZIO.identity[T]
    }

  def fail[T](i: T): XIO[NatZero, XError#_1[T], Nothing] =
    new XIO[NatZero, NatEitherPositive[NatEitherZero, T], Nothing] {
      override def zio: ZIO[NatZero, NatEitherPositive[NatEitherZero, T], Nothing] = ZIO.fail(new NatEitherPositive(Right(i)))
    }

  def fromFutureInterrupt[A](make: ExecutionContext => scala.concurrent.Future[A]): XIO[XHas#_0, XError#_1[Throwable], A] = new XIO[XHas#_0, XError#_1[Throwable], A] {
    override def zio: ZIO[XHas#_0, XError#_1[Throwable], A] = ZIO.fromFutureInterrupt(f => make(f)).mapError(s => new NatEitherPositive(Right(s)))
  }

  def fromUIO[I](u: UIO[I]): XIO[XHas#_0, XError#_0, I] = new XIO[XHas#_0, XError#_0, I] {
    override def zio: ZIO[XHas#_0, XError#_0, I] = u
  }

  def effect[A](effect: => A): XIO[XHas#_0, XError#_1[Throwable], A] = new XIO[XHas#_0, XError#_1[Throwable], A] {
    override val zio: ZIO[XHas#_0, XError#_1[Throwable], A] = ZIO.effect(effect).mapError(e => new NatEitherPositive(Right(e)))
  }

}
