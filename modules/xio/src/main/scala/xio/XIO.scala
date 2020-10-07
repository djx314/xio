package xio

import xio.nat.error.{NatEither, NatEitherReversePlus, NatEitherToTag}
import zio._

import scala.language.implicitConversions

class XIO[-I, L <: NatEither, +R](private val inner: ZIO[I, L, R]) {

  def toZIO: ZIO[I, L, R] = inner

  def flatMap[R1 <: I, E1 <: NatEither, B](k: R => XIO[R1, E1, B])(implicit n: NatEitherReversePlus[L, E1]): XIO[R1, E1#Plus[L], B] =
    new XIO(toZIO.mapError(n.takeTail).flatMap(i => k(i).toZIO.mapError(n.takeHead)))

  def map[R1](i: R => R1): XIO[I, L, R1] = new XIO(inner.map(i))

  def liftError[E1 <: NatEither](implicit nm: NatEitherToTag[L, E1]): XIO[I, E1, R] = new XIO(inner.mapError(nm.tag))

}

object XIO {
  // implicit def XIOToZIOImplicitClass1[I, L <: NatEither, R](i: XIO[I, L, R]): ZIO[I, L, R] = i.toZIO
  implicit def zioCompat1[I, L <: NatEither, R, I2 <: I, E2 <: NatEither, O2 >: R](xio: XIO[I, L, R])(implicit v: NatEitherToTag[L, E2]): XIO[I, E2, R] =
    new XIO(xio.toZIO.mapError(v.tag))
}
