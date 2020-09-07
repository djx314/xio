package xio

import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag, NatEitherZero}
import xio.nat.has.{Nat, NatReversePlus, NatToTag, NatZero}

import scala.language.implicitConversions
import zio._

import scala.concurrent.ExecutionContext

trait XManaged[I <: Nat, L <: NatEither, R <: Nat] {
  self =>
  def zmanaged: ZManaged[I, L, R]
  def map[R2 <: Nat](n: R => R2): XManaged[I, L, R2] =
    new XManaged[I, L, R2] {
      override def zmanaged: ZManaged[I, L, R2] = self.zmanaged.map(n)
    }
}

object XManaged {

  def make[R <: Nat, R1 <: Nat, E <: NatEither, A <: Nat](acquire: XIO[R, E, A])(release: A => XIO[R1, XError0, Any])(implicit n: NatToTag[R, R1]): XManaged[R1, E, A] =
    new XManaged[R1, E, A] {
      override val zmanaged: ZManaged[R1, E, A] =
        ZManaged.make(XIOHelper.simpleProvideLayer(acquire)(XLayer.fromFunctionMany[E](n.tag)).zio)(n1 => XIOHelper.simpleNoErrorZIO(release(n1)))
    }

  implicit def xioImplicit[I1 <: Nat, I2 <: Nat, E1 <: NatEither, E2 <: NatEither, O1 <: Nat, O2 <: Nat](
    i: XManaged[I1, E1, O1]
  )(implicit cv: NatToTag[I1, I2], v: NatEitherToTag[E1, E2], cv3: NatToTag[O2, O1]): XManaged[I2, E2, O2] =
    new XManaged[I2, E2, O2] {
      override val zmanaged: ZManaged[I2, E2, O2] = ZManaged.fromFunction(cv.tag).>>>(i.zmanaged).mapError(v.tag).map(cv3.tag)
    }

}
