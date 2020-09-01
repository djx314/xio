package xio

import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatReversePlus, NatToTag, NatZero}

import scala.language.implicitConversions
import zio._

import scala.concurrent.ExecutionContext

trait XManaged[I <: Nat, L <: NatEither, R <: Nat] {
  self =>
  def zmanaged: ZManaged[I, L, R]
  def map[R2 <: Nat](n: R => R2): XManaged[I, L, R2] = new XManaged[I, L, R2] {
    override def zmanaged: ZManaged[I, L, R2] = self.zmanaged.map(n)
  }
}

object XManaged {

  def make[R <: Nat, R1 <: Nat, E <: NatEither, A <: Nat](acquire: XIO[R, E, A])(release: A => XIO[R1, XError0, Any])(implicit n: NatToTag[R, R1]): XManaged[R1, E, A] =
    new XManaged[R1, E, A] {
      override val zmanaged: ZManaged[R1, E, A] =
        ZManaged.make(XIOHelper.simpleProvideLayer(acquire)(XLayer.fromFunctionMany[E](n.tag)).zio)(n1 => release(n1).noErrorZIO)
    }
  /*implicit def xioImplicit[I1 <: Nat, I2 <: Nat, E1 <: NatEither, E2 <: NatEither, O1, O2](
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
  }*/

}
