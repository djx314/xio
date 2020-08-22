package xio

import xio.nat.error.{NatEitherSetter, NatEitherToTag, XErrorPositive, XErrorReversePlus}
import xio.nat.has.{NatToTag, XHasReversePlus}
import zio.ZIO

import scala.language.implicitConversions

trait XIO[I <: XHas, L <: XError, R] {
  self =>
  def zio: ZIO[I, L, R]
  def map[E1](cv: R => E1): XIO[I, L, E1] =
    new XIO[I, L, E1] {
      override def zio: ZIO[I, L, E1] = self.zio.map(cv)
    }
  def flatMap[I1 <: XHas, L1 <: XError, E1](
    cv: R => XIO[I1, L1, E1]
  )(implicit v: XHasReversePlus[I, I1], n: XErrorReversePlus[L, L1]): XIO[I1#Plus[I], L1#Plus[L], E1] = {
    new XIO[I1#Plus[I], L1#Plus[L], E1] {
      override def zio: ZIO[I1#Plus[I], L1#Plus[L], E1] =
        for {
          plus <- ZIO.identity[I1#Plus[I]]
          r    <- self.zio.provide(v.takeTail(plus)).mapError(e => n.takeTail(e))
          r1   <- cv(r).zio.provide(v.takeHead(plus)).mapError(e => n.takeHead(e))
        } yield r1
    }
  }
  def mapError[E1, ESUM <: XError](n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM)(implicit nm: NatEitherToTag[L, XErrorPositive[ESUM, E1]]): XIO[I, ESUM, R] =
    new XIO[I, ESUM, R] {
      override def zio: ZIO[I, ESUM, R] = {
        self.zio.mapError(l => nm.tag(l).either.fold(identity, e1 => n(e1, NatEitherSetter.set)))
      }
    }
}

object XIO {

  implicit def xioImplicit[I1 <: XHas, I2 <: XHas, E1 <: XError, E2 <: XError, O1, O2](
    i: XIO[I1, E1, O1]
  )(implicit cv: NatToTag[I1, I2], v: NatEitherToTag[E1, E2], cv3: O1 <:< O2): XIO[I2, E2, O2] =
    new XIO[I2, E2, O2] {
      override def zio: ZIO[I2, E2, O2] =
        for {
          i2 <- ZIO.identity[I2]
          u  <- i.zio.provide(cv.tag(i2)).mapError(n => v.tag(n))
        } yield u
    }

  def identity[T <: XHas]: XIO[T, XError#_0, T] =
    new XIO[T, XError#_0, T] {
      override def zio: ZIO[T, XError#_0, T] = ZIO.identity[T]
    }

  def fail[T](i: T): XIO[XHas#_0, XError#_1[T], Nothing] =
    new XIO[XHas#_0, XError#_1[T], Nothing] {
      override def zio: ZIO[XHas#_0, XError#_1[T], Nothing] = ZIO.fail(new XErrorPositive(Right(i)))
    }

}
