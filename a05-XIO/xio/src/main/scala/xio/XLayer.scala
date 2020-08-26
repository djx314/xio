package xio

import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatPositive, NatReversePlus, NatToTag, NatTuple2, NatZero}

import scala.language.implicitConversions
import zio._

trait XLayer[I <: Nat, L <: NatEither, R <: Nat] {
  self =>

  def zlayer: ZLayer[I, L, R]

  def map[E1 <: Nat](c: R => E1): XLayer[I, L, E1] =
    new XLayer[I, L, E1] {
      override val zlayer: ZLayer[I, L, E1] = self.zlayer.map(c)
    }

  def mapError[E1, ESUM <: NatEither](
    n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
  )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): XLayer[I, ESUM, R] =
    new XLayer[I, ESUM, R] {
      override val zlayer: ZLayer[I, ESUM, R] = {
        self.zlayer.mapError(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))
      }
    }

  def scalax_simpeMapError[ESUM <: NatEither](n: L => ESUM): XLayer[I, ESUM, R] =
    new XLayer[I, ESUM, R] {
      override val zlayer: ZLayer[I, ESUM, R] = self.zlayer.mapError(n)
    }

  def >>>[E1 <: NatEither, RIn2 <: Nat, ROut2 <: Nat](
    that: XLayer[RIn2, E1, ROut2]
  )(implicit n: NatToTag[RIn2, R], e: NatEitherReversePlus[L, E1]): XLayer[I, E1#Plus[L], ROut2] =
    new XLayer[I, E1#Plus[L], ROut2] {
      override val zlayer: ZLayer[I, E1#Plus[L], ROut2] = self.zlayer.mapError(e.takeTail).>>>(ZLayer.requires[R].map(n.tag).>>>(that.zlayer.mapError(e.takeHead)))
    }

  def ++[E1 <: NatEither, RIn2 <: Nat, ROut2 <: Nat](
    that: XLayer[RIn2, E1, ROut2]
  )(implicit n1: NatReversePlus[I, RIn2], e: NatEitherReversePlus[L, E1]): XLayer[RIn2#Plus[I], E1#Plus[L], ROut2#Plus[R]] =
    new XLayer[RIn2#Plus[I], E1#Plus[L], ROut2#Plus[R]] {
      override val zlayer: ZLayer[RIn2#Plus[I], E1#Plus[L], ROut2#Plus[R]] = {
        val l1: ZLayer[RIn2#Plus[I], E1#Plus[L], R]     = ZLayer.requires[RIn2#Plus[I]].map(r => n1.takeTail(r)).>>>(self.zlayer).mapError(e.takeTail)
        val l2: ZLayer[RIn2#Plus[I], E1#Plus[L], ROut2] = ZLayer.requires[RIn2#Plus[I]].map(r => n1.takeHead(r)).>>>(that.zlayer).mapError(e.takeHead)
        l2.zipWithPar(l1)((s, t) => s.plus(t))
      }
    }

  final def >+>[E1 <: NatEither, RIn2 <: Nat, ROut2 <: Nat](
    that: XLayer[RIn2, E1, ROut2]
  )(implicit nt: NatToTag[RIn2, R], e: NatEitherReversePlus[L, E1]): XLayer[I, E1#Plus[L], ROut2#Plus[R]] =
    new XLayer[I, E1#Plus[L], ROut2#Plus[R]] {
      override val zlayer: ZLayer[I, E1#Plus[L], ROut2#Plus[R]] = {
        val l1: ZLayer[I, E1#Plus[L], R]     = self.zlayer.mapError(e.takeTail)
        val l2: ZLayer[I, E1#Plus[L], ROut2] = l1.map(nt.tag).>>>(that.zlayer.mapError(e.takeHead))
        l2.zipWithPar(l1)((s, t) => s.plus(t))
      }
    }

  final def <&>[E1 <: NatEither, RIn2 <: Nat, ROut2 <: Nat](
    that: XLayer[RIn2, E1, ROut2]
  )(implicit n1: NatReversePlus[I, RIn2], e: NatEitherReversePlus[L, E1]): XLayer[RIn2#Plus[I], E1#Plus[L], NatTuple2[ROut2, R]] =
    new XLayer[RIn2#Plus[I], E1#Plus[L], NatTuple2[ROut2, R]] {
      override val zlayer: ZLayer[RIn2#Plus[I], E1#Plus[L], NatTuple2[ROut2, R]] = {
        val l1: ZLayer[RIn2#Plus[I], E1#Plus[L], R]     = ZLayer.requires[RIn2#Plus[I]].map(r => n1.takeTail(r)).>>>(self.zlayer).mapError(e.takeTail)
        val l2: ZLayer[RIn2#Plus[I], E1#Plus[L], ROut2] = ZLayer.requires[RIn2#Plus[I]].map(r => n1.takeHead(r)).>>>(that.zlayer).mapError(e.takeHead)
        l1.zipWithPar(l2)((s, t) => NatTuple2(_1 = t, _2 = s))
      }
    }

}

object XLayer {
  implicit def xlayerImplicit[I1 <: Nat, I2 <: Nat, E1 <: NatEither, E2 <: NatEither, O1 <: Nat, O2 <: Nat](
    i: XLayer[I1, E1, O1]
  )(implicit cv: NatToTag[I1, I2], v: NatEitherToTag[E1, E2], cv3: NatToTag[O2, O1]): XLayer[I2, E2, O2] =
    new XLayer[I2, E2, O2] {
      override val zlayer: ZLayer[I2, E2, O2] =
        ZLayer.requires[I2].map(cv.tag).>>>(i.zlayer).mapError(v.tag).map(cv3.tag)
    }

  def identity[T <: Nat]: XLayer[T, XError#_0, T] =
    new XLayer[T, NatEitherZero, T] {
      override val zlayer: ZLayer[T, NatEitherZero, T] = ZLayer.identity[T]
    }

  def requires[A <: Nat]: XLayer[A, XError#_0, A] =
    new XLayer[A, NatEitherZero, A] {
      override val zlayer: ZLayer[A, NatEitherZero, A] = ZLayer.requires[A]
    }

  def fromManagedMany[R <: Nat, E <: NatEither, A <: Nat](m: XManaged[R, E, A]): XLayer[R, E, A] =
    new XLayer[R, E, A] {
      override val zlayer: ZLayer[R, E, A] = ZLayer.fromManagedMany(m.zmanaged)
    }

  def fromZLayer[R <: Nat, E <: NatEither, A <: Nat](m: ZLayer[R, E, A]): XLayer[R, E, A] =
    new XLayer[R, E, A] {
      override val zlayer: ZLayer[R, E, A] = m
    }

  class FunctinManyApply[ErrorType <: NatEither] {
    def apply[R <: Nat, A <: Nat](m: R => A): XLayer[R, ErrorType, A] = new XLayer[R, ErrorType, A] {
      override def zlayer: ZLayer[R, ErrorType, A] = ZLayer.fromFunctionMany(m)
    }
  }

  def fromFunctionMany[ErrorType <: NatEither]: FunctinManyApply[ErrorType] = new FunctinManyApply[ErrorType]

}
