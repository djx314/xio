package xio

import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatReversePlus, NatToTag, NatZero}

import scala.language.implicitConversions
import zio._

import scala.concurrent.ExecutionContext

trait XIO[I <: Nat, L <: NatEither, R] {
  self =>

  def zio: ZIO[I, L, R]
  def noErrorZIO(implicit ev: L <:< NatEitherZero): ZIO[I, Nothing, R] = self.zio.asInstanceOf[ZIO[I, Nothing, R]]

  def map[E1](cv: R => E1): XIO[I, L, E1] = new XIO[I, L, E1] {
    override val zio: ZIO[I, L, E1] = self.zio.map(cv)
  }

  def flatMap[I1 <: Nat, L1 <: NatEither, E1](cv: R => XIO[I1, L1, E1])(implicit v: NatReversePlus[I, I1],
                                                                        n: NatEitherReversePlus[L, L1]): XIO[I1#Plus[I], L1#Plus[L], E1] =
    XIO
      .fromFunction[L1#Plus[L]](identity[I1#Plus[I]])
      .scalax_simpleFlatMap(
        plus =>
          self
            .scalax_simpleProvide(v.takeTail(plus))
            .scalax_simpeMapError(n.takeTail)
            .scalax_simpleFlatMap(n1 => cv(n1).scalax_simpleProvide(v.takeHead(plus)).scalax_simpeMapError(n.takeHead)))

  def scalax_simpleFlatMap[E1](cv: R => XIO[I, L, E1]): XIO[I, L, E1] = new XIO[I, L, E1] {
    override val zio: ZIO[I, L, E1] = self.zio.flatMap(v => cv(v).zio)
  }

  def mapError[E1, ESUM <: NatEither](n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM)(
    implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): XIO[I, ESUM, R] =
    scalax_simpeMapError(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))

  def scalax_simpeMapError[ESUM <: NatEither](n: L => ESUM): XIO[I, ESUM, R] =
    new XIO[I, ESUM, R] {
      override val zio: ZIO[I, ESUM, R] = self.zio.mapError(n)
    }

  final def provideLayer[E1 <: NatEither, R0 <: Nat, R1 <: Nat](
    layer: XLayer[R0, E1, R1]
  )(implicit ev1: NatToTag[I, R1], ev2: NatEitherReversePlus[L, E1]): XIO[R0, E1#Plus[L], R] =
    scalax_simpeMapError(ev2.takeTail).scalax_simpleProvideLayer(layer.map(ev1.tag).scalax_simpeMapError(ev2.takeHead))

  final def scalax_simpleProvideLayer[R0 <: Nat](layer: XLayer[R0, L, I]): XIO[R0, L, R] =
    new XIO[R0, L, R] {
      override val zio: ZIO[R0, L, R] = self.zio.provideLayer(layer.zlayer)
    }

  final def provide[R1 <: Nat](r: R1)(implicit ev: NatToTag[I, R1]): XIO[NatZero, L, R] = scalax_simpleProvide(ev.tag(r))

  final def scalax_simpleProvide(layer: I): XIO[NatZero, L, R] =
    new XIO[NatZero, L, R] {
      override val zio: ZIO[NatZero, L, R] = self.zio.provide(layer)
    }

  final def either: XIO[I, XError#_0, Either[L, R]] = new XIO[I, XError#_0, Either[L, R]] {
    override val zio: ZIO[I, XError#_0, Either[L, R]] = self.zio.either
  }

  final def catchAll[R1 <: Nat, E2 <: NatEither, A1 >: R](h: L => XIO[R1, E2, A1])(implicit n: NatToTag[I, R1]): XIO[R1, E2, A1] =
    scalax_simpleProvideLayer(XLayer.fromFunctionMany[L](n.tag)).scalax_simpleCatchAll(h)

  final def scalax_simpleCatchAll[E2 <: NatEither, A1 >: R](h: L => XIO[I, E2, A1]): XIO[I, E2, A1] = new XIO[I, E2, A1] {
    override def zio: ZIO[I, E2, A1] = self.zio.catchAll(u => h(u).zio)
  }

  final def retryN(n: Int): XIO[I, L, R] =
    self.scalax_simpleCatchAll(e => if (n <= 0) XIO.scalax_simeFail(e) else self.retryN(n - 1))

}

object XIO {

  implicit def xioImplicit[I1 <: Nat, I2 <: Nat, E1 <: NatEither, E2 <: NatEither, O1, O2](
    i: XIO[I1, E1, O1])(implicit cv: NatToTag[I1, I2], v: NatEitherToTag[E1, E2], cv3: O1 <:< O2): XIO[I2, E2, O2] =
    i.scalax_simpeMapError(v.tag).map(cv3).scalax_simpleProvideLayer(XLayer.fromFunctionMany[E2](cv.tag))

  def identity[T <: Nat]: XIO[T, XError#_0, T] =
    new XIO[T, NatEitherZero, T] {
      override def zio: ZIO[T, NatEitherZero, T] = ZIO.identity[T]
    }

  def fail[T](i: T): XIO[NatZero, XError#_1[T], Nothing] = scalax_simeFail(new NatEitherPositive(Right(i)))

  def scalax_simeFail[N <: Nat, T <: NatEither, R](i: T): XIO[N, T, R] = new XIO[N, T, R] {
    override def zio: ZIO[N, T, R] = ZIO.fail(i)
  }

  def fromFutureInterrupt[A](make: ExecutionContext => scala.concurrent.Future[A]): XIO[XHas#_0, XError#_1[Throwable], A] = new XIO[XHas#_0, XError#_1[Throwable], A] {
    override def zio: ZIO[XHas#_0, XError#_1[Throwable], A] = ZIO.fromFutureInterrupt(f => make(f)).mapError(s => new NatEitherPositive(Right(s)))
  }

  def fromUIO[I](u: UIO[I]): XIO[XHas#_0, XError#_0, I] = new XIO[XHas#_0, XError#_0, I] {
    override def zio: ZIO[XHas#_0, XError#_0, I] = u
  }

  def fromRIO[P <: Nat, I](u: RIO[P, I]): XIO[P, XError#_1[Throwable], I] = XIO.fromZIO(u.mapError(n => new NatEitherPositive(Right(n))))
  def fromTask[I](u: Task[I]): XIO[NatZero, XError#_1[Throwable], I]      = XIO.fromZIO(u.mapError(n => new NatEitherPositive(Right(n))))
  def fromIO[E <: NatEither, I](i: IO[E, I]): XIO[NatZero, E, I]          = XIO.fromZIO(i)

  def effect[A](effect: => A): XIO[XHas#_0, XError#_1[Throwable], A] = new XIO[XHas#_0, XError#_1[Throwable], A] {
    override val zio: ZIO[XHas#_0, XError#_1[Throwable], A] = ZIO.effect(effect).mapError(e => new NatEitherPositive(Right(e)))
  }

  class FunctinManyApply[ErrorType <: NatEither] {
    def apply[N <: Nat, A](effect: N => A): XIO[N, ErrorType, A] = new XIO[N, ErrorType, A] {
      override val zio: ZIO[N, ErrorType, A] = ZIO.fromFunction(effect)
    }
  }

  def fromFunction[NErrorType <: NatEither]: FunctinManyApply[NErrorType] = new FunctinManyApply[NErrorType]

  def fromZIO[I <: Nat, L <: NatEither, R](i: ZIO[I, L, R]): XIO[I, L, R] = new XIO[I, L, R] {
    override def zio: ZIO[I, L, R] = i
  }

}
