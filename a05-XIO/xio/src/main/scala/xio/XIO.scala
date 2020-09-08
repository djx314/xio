package xio

import xio.helper.{XIOHelper, XLayerHelper}
import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatReversePlus, NatToTag, NatZero}

import scala.language.implicitConversions
import zio._

import scala.concurrent.ExecutionContext

trait XIO[I <: Nat, L <: NatEither, R] {
  self =>

  def zio: ZIO[I, L, R]

  def map[E1](cv: R => E1): XIO[I, L, E1] = XIO.fromZIO(zio.map(cv))

  def flatMap[I1 <: Nat, L1 <: NatEither, E1](
    cv: R => XIO[I1, L1, E1]
  )(implicit v: NatReversePlus[I1, I], n: NatEitherReversePlus[L, L1]): XIO[I#InnerPlus[I1], L1#Plus[L], E1] =
    XIOHelper.simpleFlatMap(XIOHelper.simpleFromFunction[L1#Plus[L]](identity[I#InnerPlus[I1]]))(plus =>
      XIOHelper.simpleFlatMap(XIOHelper.simpeMapError(XIOHelper.simpleProvide(self)(v.takeHead(plus)))(n.takeTail))(n1 =>
        XIOHelper.simpeMapError(XIOHelper.simpleProvide(cv(n1))(v.takeTail(plus)))(n.takeHead)
      )
    )

  def mapError[E1, ESUM <: NatEither](
    n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
  )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): XIO[I, ESUM, R] =
    XIOHelper.simpeMapError(self)(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))

  final def provideLayer[E1 <: NatEither, R0 <: Nat, R1 <: Nat](
    layer: XLayer[R0, E1, R1]
  )(implicit ev1: NatToTag[I, R1], ev2: NatEitherReversePlus[L, E1]): XIO[R0, E1#Plus[L], R] =
    XIOHelper.simpleProvideLayer(XIOHelper.simpeMapError(self)(ev2.takeTail))(XLayerHelper.simpeMapError(layer.map(ev1.tag))(ev2.takeHead))

  final def provide[R1 <: Nat](r: R1)(implicit ev: NatToTag[I, R1]): XIO[NatZero, L, R] = XIOHelper.simpleProvide(self)(ev.tag(r))

  final def either: XIO[I, XError0, Either[L, R]] =
    new XIO[I, XError0, Either[L, R]] {
      override val zio: ZIO[I, XError0, Either[L, R]] = self.zio.either
    }

  final def catchAll[R1 <: Nat, E2 <: NatEither, A1 >: R](h: L => XIO[R1, E2, A1])(implicit n: NatToTag[I, R1]): XIO[R1, E2, A1] =
    XIOHelper.simpleCatchAll(XIOHelper.simpleProvideLayer(self)(XLayerHelper.simpleFromFunctionMany[L](n.tag)))(h)

  final def retryN(n: Int): XIO[I, L, R] =
    XIOHelper.simpleCatchAll(self)(e => if (n <= 0) XIOHelper.simpleFail(e) else self.retryN(n - 1))

}

object XIO {

  private def identityFn[A]: A => A = s => s

  implicit def xioImplicit[I1 <: Nat, I2 <: Nat, E1 <: NatEither, E2 <: NatEither, O1, O2](
    i: XIO[I1, E1, O1]
  )(implicit cv: NatToTag[I1, I2], v: NatEitherToTag[E1, E2], cv3: O1 <:< O2): XIO[I2, E2, O2] =
    XIOHelper.simpleProvideLayer(XIOHelper.simpeMapError(i)(v.tag).map(cv3))(XLayerHelper.simpleFromFunctionMany[E2](cv.tag))

  def identity[T <: Nat]: XIO[T, XError0, T] = XIO.fromFunction(identityFn)

  def fail[T](i: T): XIO[XHas0, XError1[T], Nothing]                          = XIOHelper.simpleFail(XError1(i))
  def fromOption[T](i: => Option[T]): XIO[XHas0, XError1[Option[Nothing]], T] = XIOHelper.simpleFromOption(i)

  def fromFutureInterrupt[A](make: ExecutionContext => scala.concurrent.Future[A]): XIO[XHas0, XError1[Throwable], A] =
    XIO.fromZIO(ZIO.fromFutureInterrupt(f => make(f)).mapError(s => XError1(s)))

  def fromUIO[I](u: UIO[I]): XIO[XHas0, XError0, I] = XIO.fromZIO(u)

  def fromRIO[P <: Nat, I](u: RIO[P, I]): XIO[P, XError1[Throwable], I] = XIO.fromZIO(u.mapError(n => XError1(n)))
  def fromTask[I](u: Task[I]): XIO[NatZero, XError1[Throwable], I]      = XIO.fromZIO(u.mapError(n => XError1(n)))
  def fromIO[E <: NatEither, I](i: IO[E, I]): XIO[NatZero, E, I]        = XIO.fromZIO(i)

  def effect[A](effect: => A): XIO[XHas0, XError1[Throwable], A] = XIO.fromZIO(ZIO.effect(effect).mapError(e => XError1(e)))

  def fromFunction[N <: Nat, I](i: N => I): XIO[N, XError0, I] = XIOHelper.simpleFromFunction(i)

  class XIOImpl[I <: Nat, L <: NatEither, R](override val zio: ZIO[I, L, R]) extends XIO[I, L, R]

  def fromZIO[I <: Nat, L <: NatEither, R](i: ZIO[I, L, R]): XIO[I, L, R] = new XIOImpl(i)

  def collectAll[R <: Nat, E <: NatEither, A, Collection[+Element] <: Iterable[Element]](
    in: Collection[XIO[R, E, A]]
  )(implicit bf: BuildFrom[Collection[XIO[R, E, A]], A, Collection[A]]): XIO[R, E, Collection[A]] =
    XIOHelper.simpleForeach(in)(identityFn)

}
