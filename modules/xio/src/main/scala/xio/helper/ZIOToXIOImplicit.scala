package xio.helper

import xio.{IsNotNatEitherOrNothing, IsNotNothing, XError0, XError1, XIO}
import xio.nat.error.NatEither
import zio._

trait ZIOToXIOImplicit[R1, E1, A1, R, E <: NatEither, A] {
  def to(zio: ZIO[R1, E1, A1]): XIO[R, E, A]
}

object ZIOToXIOImplicit {
  implicit def XIOStartErrorImplicitClass1_1[R1, E1, A1](implicit i: IsNotNatEitherOrNothing[E1]): ZIOToXIOImplicit[R1, E1, A1, R1, XError1[E1], A1] =
    new ZIOToXIOImplicit[R1, E1, A1, R1, XError1[E1], A1] {
      override def to(zio: ZIO[R1, E1, A1]): XIO[R1, XError1[E1], A1] = new XIO(zio.mapError(i => XError1(i)))
    }

  implicit def XIOStartErrorImplicitClass2_1[R1, A1]: ZIOToXIOImplicit[R1, Nothing, A1, R1, XError0, A1] = new ZIOToXIOImplicit[R1, Nothing, A1, R1, XError0, A1] {
    override def to(zio: ZIO[R1, Nothing, A1]): XIO[R1, XError0, A1] = new XIO(zio)
  }

  implicit def XIOStartErrorImplicitClass3_1[R1, E1 <: NatEither, A1](implicit i: IsNotNothing[E1]): ZIOToXIOImplicit[R1, E1, A1, R1, E1, A1] =
    new ZIOToXIOImplicit[R1, E1, A1, R1, E1, A1] {
      override def to(zio: ZIO[R1, E1, A1]): XIO[R1, E1, A1] = new XIO(zio)
    }
}
