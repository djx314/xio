package xio

import xio.helper.{XIOErrorHelper, XIOHelper}
import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag}

import scala.language.implicitConversions
import zio._

import scala.concurrent.ExecutionContext

trait XIO[-I, L <: NatEither, +R] {
  self =>

  def zio: ZIO[I, L, R]

  def map[E1](cv: R => E1): XIO[I, L, E1] = XIO.fromZIO(zio.map(cv))

  def flatMap[R1 <: I, E1 <: NatEither, B](k: R => XIO[R1, E1, B])(implicit n: NatEitherReversePlus[L, E1]): XIO[R1, E1#Plus[L], B] =
    XIO.fromZIO(self.zio.mapError(n.takeTail).flatMap(i => k(i).zio.mapError(n.takeHead)))

  def liftError[E1 <: NatEither](implicit nm: NatEitherToTag[L, E1]): XIO[I, E1, R] = XIOHelper.simpeMapError(self)(nm.tag)

  def mapError[E1, ESUM <: NatEither](
    n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
  )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): XIO[I, ESUM, R] =
    XIOHelper.simpeMapError(self)(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))

  final def provideLayer[E1, R0, R1](
    layer: ZLayer[R0, E1, R1]
  )(implicit ev1: R1 <:< I, ev2: NeedsEnv[I]): XIO[R0, NatEitherPositive[L, E1], R] =
    XIO.fromZIO(self.zio.mapError(s => new NatEitherPositive[L, E1](Left(s))).provideLayer(layer.mapError(s => new NatEitherPositive[L, E1](Right(s)))))

  final def provide(r: I)(implicit ev: NeedsEnv[I]): XIO[Any, L, R] = XIO.fromZIO(self.zio.provide(r))

  final def either: XIO[I, XError0, Either[L, R]] = XIO.fromZIO(self.zio.either)

  final def catchAll[R1 <: I, E2 <: NatEither, A1 >: R](h: L => XIO[R1, E2, A1]): XIO[R1, E2, A1] = XIO.fromZIO(self.zio.catchAll(l => h(l).zio))

  final def retryN(n: Int): XIO[I, L, R] = XIO.fromZIO(self.zio.retryN(n))

}

object XIO extends XIOErrorHelper {

  private def identityFn[A]: A => A = s => s

  implicit def xioImplicit[I1 >: I2, I2, E1 <: NatEither, E2 <: NatEither, O1 <: O2, O2](
    i: XIO[I1, E1, O1]
  )(implicit v: NatEitherToTag[E1, E2]): XIO[I2, E2, O2] = XIOHelper.simpeMapError(i)(v.tag)

  def identity[T]: XIO[T, XError0, T] = XIO.fromFunction(identityFn)

  def fail[T](i: T): XIO[Any, XError1[T], Nothing]                          = XIOHelper.simpleFail(XError1(i))
  def fromOption[T](i: => Option[T]): XIO[Any, XError1[Option[Nothing]], T] = XIOHelper.simpleFromOption(i)

  def fromFutureInterrupt[A](make: ExecutionContext => scala.concurrent.Future[A]): XIO[Any, XError1[Throwable], A] =
    XIO.fromZIO(ZIO.fromFutureInterrupt(f => make(f)).mapError(s => XError1(s)))

  def fromUIO[I](u: UIO[I]): XIO[Any, XError0, I] = XIO.fromZIO(u)

  def fromRIO[P, I](u: RIO[P, I]): XIO[P, XError1[Throwable], I] = XIO.fromZIO(u.mapError(n => XError1(n)))
  def fromTask[I](u: Task[I]): XIO[Any, XError1[Throwable], I]   = XIO.fromZIO(u.mapError(n => XError1(n)))
  def fromIO[E <: NatEither, I](i: IO[E, I]): XIO[Any, E, I]     = XIO.fromZIO(i)

  def effect[A](effect: => A): XIO[Any, XError1[Throwable], A] = XIO.fromZIO(ZIO.effect(effect).mapError(e => XError1(e)))
  def effectTotal[A](effect: => A): XIO[Any, XError0, A]       = XIO.fromZIO(ZIO.effectTotal(effect))

  def fromFunction[N, I](i: N => I): XIO[N, XError0, I]          = XIOHelper.simpleFromFunction(i)
  def fromEither[N, I](i: Either[N, I]): XIO[Any, XError1[N], I] = XIOHelper.simpleFromEither(i)

  class XIOImpl[I, L <: NatEither, R](override val zio: ZIO[I, L, R]) extends XIO[I, L, R]

  def fromZIO[I, L <: NatEither, R](i: ZIO[I, L, R]): XIO[I, L, R] = new XIOImpl(i)

  def collectAll[R, E <: NatEither, A, Collection[+Element] <: Iterable[Element]](
    in: Collection[XIO[R, E, A]]
  )(implicit bf: BuildFrom[Collection[XIO[R, E, A]], A, Collection[A]]): XIO[R, E, Collection[A]] =
    XIOHelper.simpleForeach(in)(identityFn)

}
