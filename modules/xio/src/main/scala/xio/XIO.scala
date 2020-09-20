package xio

import xio.nat.error.{NatEither, NatEitherReversePlus, NatEitherToTag}
import zio._

class XIO[-I, L <: NatEither, +R](private val inner: ZIO[I, L, R]) {

  def toZIO: ZIO[I, L, R] = inner

  def flatMap[R1 <: I, E1 <: NatEither, B](k: R => XIO[R1, E1, B])(implicit n: NatEitherReversePlus[L, E1]): XIO[R1, E1#Plus[L], B] =
    toZIO.mapError(n.takeTail).flatMap(i => k(i).toZIO.mapError(n.takeHead))

  def map[R1](i: R => R1): XIO[I, L, R1] = inner.map(i)

  def liftError[E1 <: NatEither](implicit nm: NatEitherToTag[L, E1]): XIO[I, E1, R] = new XIO(inner.mapError(nm.tag))

}

object XIO extends XIOImplicit1 {
  implicit def ZIOToXIOImplicitClass1[I, L <: NatEither, R](i: ZIO[I, L, R]): XIO[I, L, R] = new XIO(i)
}

trait XIOImplicit1 {
  implicit def ZIOToXIOImplicitClass2[I, L, R](i: ZIO[I, L, R]): XIO[I, XError1[L], R] = i.startError
}
