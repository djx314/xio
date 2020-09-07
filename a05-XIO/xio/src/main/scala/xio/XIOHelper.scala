package xio

import xio.nat.error.{NatEither, NatEitherZero}
import xio.nat.has.{Nat, NatZero}
import zio._

import scala.collection.mutable

object XIOHelper {

  def simpleFlatMap[I <: Nat, L <: NatEither, R, E1](p: XIO[I, L, R])(cv: R => XIO[I, L, E1]): XIO[I, L, E1] = XIO.fromZIO(p.zio.flatMap(v => cv(v).zio))

  def simpeMapError[I <: Nat, L <: NatEither, R, ESUM <: NatEither](p: XIO[I, L, R])(n: L => ESUM): XIO[I, ESUM, R] = XIO.fromZIO(p.zio.mapError(n))

  def simpleProvideLayer[I <: Nat, L <: NatEither, R, R0 <: Nat](p: XIO[I, L, R])(layer: XLayer[R0, L, I]): XIO[R0, L, R] =
    XIO.fromZIO(p.zio.provideLayer(layer.zlayer))

  def simpleProvide[I <: Nat, L <: NatEither, R](p: XIO[I, L, R])(layer: I): XIO[NatZero, L, R] = XIO.fromZIO(p.zio.provide(layer))

  class XIOSimpleCatchAllApply[I <: Nat, L <: NatEither, R](p: XIO[I, L, R]) {
    def apply[E2 <: NatEither, A1 >: R](h: L => XIO[I, E2, A1]): XIO[I, E2, A1] = XIO.fromZIO(p.zio.catchAll(u => h(u).zio))
  }

  def simpleCatchAll[I <: Nat, L <: NatEither, R, E2 <: NatEither, A1 >: R](p: XIO[I, L, R]): XIOSimpleCatchAllApply[I, L, R] = new XIOSimpleCatchAllApply(p)

  def simpleFail[N <: Nat, T <: NatEither, R](i: T): XIO[N, T, R] = XIO.fromZIO(ZIO.fail(i))

  def simpleFromOption[N <: Nat, R](i: => Option[R]): XIO[N, XError1[Option[Nothing]], R] =
    XIO.fromZIO(ZIO.fromOption(i).mapError(i => XError1(i)))

  final def simpleZipWith[R1 <: Nat, E1 <: NatEither, A, B, C](thidMOdel: => XIO[R1, E1, A], that: => XIO[R1, E1, B])(f: (A, B) => C): XIO[R1, E1, C] =
    XIO.fromZIO(thidMOdel.zio.zipWith(that.zio)(f))

  def effectTotal[In <: Nat, P <: NatEither, A](effect: => A): XIO[In, P, A] = XIO.fromZIO(ZIO.effectTotal(effect))

  def simpleForeach[R <: Nat, E <: NatEither, A, B, Collection[+Element] <: Iterable[Element]](
    in: Collection[A]
  )(f: A => XIO[R, E, B])(implicit bf: BuildFrom[Collection[A], B, Collection[B]]): XIO[R, E, Collection[B]] =
    in.foldLeft[XIO[R, E, mutable.Builder[B, Collection[B]]]](effectTotal(bf.newBuilder(in)))((io, a) => XIOHelper.simpleZipWith(io, f(a))(_ += _)).map(_.result())

  class FunctinManyApply[ErrorType <: NatEither] {
    def apply[N <: Nat, A](effect: N => A): XIO[N, ErrorType, A] = XIO.fromZIO(ZIO.fromFunction(effect))
  }
  def simpleFromFunction[NErrorType <: NatEither]: FunctinManyApply[NErrorType] = new FunctinManyApply[NErrorType]

  def simpleNoErrorZIO[I <: Nat, P](i: XIO[I, NatEitherZero, P]): ZIO[I, Nothing, P] = i.zio.asInstanceOf[ZIO[I, Nothing, P]]

}
