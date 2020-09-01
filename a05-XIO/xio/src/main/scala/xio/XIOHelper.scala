package xio

import xio.nat.error.{NatEither, NatEitherPositive}
import xio.nat.has.{Nat, NatZero}
import zio._

object XIOHelper {

  def scalax_simpleFlatMap[I <: Nat, L <: NatEither, R, E1](p: XIO[I, L, R])(cv: R => XIO[I, L, E1]): XIO[I, L, E1] = XIO.fromZIO(p.zio.flatMap(v => cv(v).zio))

  def scalax_simpeMapError[I <: Nat, L <: NatEither, R, ESUM <: NatEither](p: XIO[I, L, R])(n: L => ESUM): XIO[I, ESUM, R] = XIO.fromZIO(p.zio.mapError(n))

  def scalax_simpleProvideLayer[I <: Nat, L <: NatEither, R, R0 <: Nat](p: XIO[I, L, R])(layer: XLayer[R0, L, I]): XIO[R0, L, R] =
    XIO.fromZIO(p.zio.provideLayer(layer.zlayer))

  def scalax_simpleProvide[I <: Nat, L <: NatEither, R](p: XIO[I, L, R])(layer: I): XIO[NatZero, L, R] = XIO.fromZIO(p.zio.provide(layer))

  class XIOSimpleCatchAllApply[I <: Nat, L <: NatEither, R](p: XIO[I, L, R]) {
    def apply[E2 <: NatEither, A1 >: R](h: L => XIO[I, E2, A1]): XIO[I, E2, A1] = XIO.fromZIO(p.zio.catchAll(u => h(u).zio))
  }

  def scalax_simpleCatchAll[I <: Nat, L <: NatEither, R, E2 <: NatEither, A1 >: R](p: XIO[I, L, R]): XIOSimpleCatchAllApply[I, L, R] = new XIOSimpleCatchAllApply(p)

  def scalax_simpleFail[N <: Nat, T <: NatEither, R](i: T): XIO[N, T, R] = XIO.fromZIO(ZIO.fail(i))

  def simpleFromOption[N <: Nat, R](i: => Option[R]): XIO[N, XError#_1[Option[Nothing]], R] =
    XIO.fromZIO(ZIO.fromOption(i).mapError(i => new NatEitherPositive(Right(i))))

}
