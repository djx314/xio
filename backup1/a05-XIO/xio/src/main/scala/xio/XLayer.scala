package xio

import xio.helper.XLayerHelper
import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatReversePlus, NatToTag}

import scala.language.implicitConversions
import zio._

trait XLayer[I <: Nat, L <: NatEither, R <: Nat] {
  self =>

  def zlayer: ZLayer[I, L, R]

  def map[E1 <: Nat](c: R => E1): XLayer[I, L, E1] = XLayer.fromZLayer(self.zlayer.map(c))

  def mapError[E1, ESUM <: NatEither](
    n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
  )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): XLayer[I, ESUM, R] = {
    def nn(l: L): ESUM = nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply))
    XLayerHelper.simpeMapError(self)(nn)
  }

  def >>>[E1 <: NatEither, RIn2 <: Nat, ROut2 <: Nat](
    that: XLayer[RIn2, E1, ROut2]
  )(implicit n: NatToTag[RIn2, R], e: NatEitherReversePlus[L, E1]): XLayer[I, E1#Plus[L], ROut2] = {
    val l1 = XLayerHelper.simpeMapError(self)(e.takeTail)
    val l2 = XLayerHelper.simple_>>>(XLayerHelper.simpleFromFunctionMany[E1](n.tag))(that)
    val l3 = XLayerHelper.simpeMapError(l2)(e.takeHead)
    XLayerHelper.simple_>>>(l1)(l3)
  }

  def ++[E1 <: NatEither, RIn2 <: Nat, ROut2 <: Nat](
    that: XLayer[RIn2, E1, ROut2]
  )(implicit n1: NatReversePlus[RIn2, I], e: NatEitherReversePlus[L, E1]): XLayer[I#InnerPlus[RIn2], E1#Plus[L], R#InnerPlus[ROut2]] = {
    val l1  = XLayerHelper.simple_>>>(XLayerHelper.simpleFromFunctionMany[L](n1.takeHead))(self)
    val l11 = XLayerHelper.simpeMapError(l1)(e.takeTail)
    val l2  = XLayerHelper.simple_>>>(XLayerHelper.simpleFromFunctionMany[E1](n1.takeTail))(that)
    val l21 = XLayerHelper.simpeMapError(l2)(e.takeHead)
    XLayerHelper.simpleZipWithPar(l11)(l21)((s, t) => s.innerPlus(t))
  }

  final def >+>[E1 <: NatEither, RIn2 <: Nat, ROut2 <: Nat](
    that: XLayer[RIn2, E1, ROut2]
  )(implicit nt: NatToTag[RIn2, R], e: NatEitherReversePlus[L, E1]): XLayer[I, E1#Plus[L], R#InnerPlus[ROut2]] = {
    val l1 = XLayerHelper.simpeMapError(self)(e.takeTail)
    val l2 = XLayerHelper.simpeMapError(that)(e.takeHead)
    val l3 = XLayerHelper.simple_>>>(l1.map(nt.tag))(l2)
    XLayerHelper.simpleZipWithPar(l3)(l1)((s, t) => t.innerPlus(s))
  }

  final def <&>[E1 <: NatEither, RIn2 <: Nat, ROut2 <: Nat](
    that: XLayer[RIn2, E1, ROut2]
  )(implicit n1: NatReversePlus[RIn2, I], e: NatEitherReversePlus[L, E1]): XLayer[I#InnerPlus[RIn2], E1#Plus[L], XHas2[ROut2, R]] = {
    val l1  = XLayerHelper.simple_>>>(XLayerHelper.simpleFromFunctionMany[L](n1.takeHead))(self)
    val l11 = XLayerHelper.simpeMapError(l1)(e.takeTail)
    val l2  = XLayerHelper.simple_>>>(XLayerHelper.simpleFromFunctionMany[E1](n1.takeTail))(that)
    val l21 = XLayerHelper.simpeMapError(l2)(e.takeHead)
    XLayerHelper.simpleZipWithPar(l11)(l21)((s, t) => XHas2(_1 = t, _2 = s))
  }

}

object XLayer {
  implicit def xlayerImplicit[I1 <: Nat, I2 <: Nat, E1 <: NatEither, E2 <: NatEither, O1 <: Nat, O2 <: Nat](
    i: XLayer[I1, E1, O1]
  )(implicit cv: NatToTag[I1, I2], v: NatEitherToTag[E1, E2], cv3: NatToTag[O2, O1]): XLayer[I2, E2, O2] = {
    val l1 = XLayerHelper.simpleFromFunctionMany[E1](cv.tag)
    val l2 = XLayerHelper.simple_>>>(l1)(i)
    XLayerHelper.simpeMapError(l2)(v.tag).map(cv3.tag)
  }

  def identity[T <: Nat]: XLayer[T, XError0, T] = XLayerHelper.simpleFromFunctionMany(i => i)

  def requires[A <: Nat]: XLayer[A, XError0, A] = fromZLayer(ZLayer.requires[A])

  def fromManagedMany[R <: Nat, E <: NatEither, A <: Nat](m: XManaged[R, E, A]): XLayer[R, E, A] = fromZLayer(ZLayer.fromManagedMany(m.zmanaged))

  def fromFunctionMany[R <: Nat, A <: Nat](m: R => A): XLayer[R, XError0, A] = XLayerHelper.simpleFromFunctionMany(m)

  class XLayerImpl[I <: Nat, L <: NatEither, R <: Nat](override val zlayer: ZLayer[I, L, R]) extends XLayer[I, L, R]
  def fromZLayer[I <: Nat, L <: NatEither, R <: Nat](zlayer: ZLayer[I, L, R]): XLayer[I, L, R] = new XLayerImpl(zlayer)

}
