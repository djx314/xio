package xio

import xio.helper.XIOErrorHelper
import xio.nat.error.{NatEither, NatEitherReversePlus, NatEitherToTag}
import zio._

import scala.language.implicitConversions

class XIO[-R, E <: NatEither, +A](private val inner: ZIO[R, E, A]) {

  def flatMap[R1 <: R, E1 <: NatEither, A1](k: A => XIO[R1, E1, A1])(implicit n: NatEitherReversePlus[E, E1]): XIO[R1, E1#Plus[E], A1] =
    new XIO(inner.mapError(n.takeTail).flatMap(i => k(i).inner.mapError(n.takeHead)))

  def map[A1](i: A => A1): XIO[R, E, A1] = new XIO(inner.map(i))

  def liftError[E1 <: NatEither](implicit nm: NatEitherToTag[E, E1]): XIO[R, E1, A] = new XIO(inner.mapError(nm.tag))

}

object XIO extends XIOErrorHelper {
  implicit def XIOToZIOImplicitClass1[I, L <: NatEither, R](i: XIO[I, L, R]): ZIO[I, L, R]                                            = i.inner
  implicit def zioCompat1[R, E <: NatEither, E1 <: NatEither, A](xio: XIO[R, E, A])(implicit v: NatEitherToTag[E, E1]): XIO[R, E1, A] = new XIO(xio.inner.mapError(v.tag))

  def effectTotal[T](t: => T): XIO[Any, XError1[EffectError], T] = using xio ZIO.effect(t).mapError((n: Throwable) => new EffectError(n))
}
