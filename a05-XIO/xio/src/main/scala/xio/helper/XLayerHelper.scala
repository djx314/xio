package xio.helper

import xio.XLayer
import xio.nat.error.NatEither
import xio.nat.has.Nat
import zio._

object XLayerHelper {

  def simpeMapError[I <: Nat, L <: NatEither, R <: Nat, ESUM <: NatEither](n: XLayer[I, L, R])(p: L => ESUM): XLayer[I, ESUM, R] = XLayer.fromZLayer(n.zlayer.mapError(p))

  def simple_>>>[I <: Nat, L <: NatEither, R <: Nat, ROut2 <: Nat](i: XLayer[I, L, R])(that: XLayer[R, L, ROut2]): XLayer[I, L, ROut2] =
    XLayer.fromZLayer(i.zlayer.>>>(that.zlayer))

  class FunctinManyApply[ErrorType <: NatEither] {
    def apply[R <: Nat, A <: Nat](m: R => A): XLayer[R, ErrorType, A] = XLayer.fromZLayer(ZLayer.fromFunctionMany(m))
  }

  def simpleFromFunctionMany[ErrorType <: NatEither]: FunctinManyApply[ErrorType] = new FunctinManyApply[ErrorType]

  final def simpleZipWithPar[E <: NatEither, RIn2 <: Nat, ROut1 <: Nat, ROut2 <: Nat, ROut3 <: Nat](i: XLayer[RIn2, E, ROut1])(that: XLayer[RIn2, E, ROut2])(
    f: (ROut1, ROut2) => ROut3
  ): XLayer[RIn2, E, ROut3] = XLayer.fromZLayer(i.zlayer.zipWithPar(that.zlayer)(f))

}
