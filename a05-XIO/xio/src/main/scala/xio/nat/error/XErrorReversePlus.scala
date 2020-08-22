package xio.nat.error

import xio.XError

trait XErrorReversePlus[N2 <: XError, N1 <: XError] {
  type PluI = N1#Plus[N2]
  def plus(t1: PluI): Either[N1, N2]
  def takeHead(t1: N1): PluI
  def takeTail(t1: N2): PluI
}

object XErrorReversePlus {
  implicit def firstNat[N2 <: XError, F](implicit n: NatEitherSetter[N2, XErrorZero]): XErrorReversePlus[N2, XErrorZero] = new XErrorReversePlusFirst(n = n)
  implicit def positiveNat[N1Tail <: XError, N1Head, N2 <: XError](implicit n: XErrorReversePlus[N2, N1Tail]): XErrorReversePlus[N2, XErrorPositive[N1Tail, N1Head]] =
    new XErrorReversePlusPositive(tail = n)
}

class XErrorReversePlusFirst[N2 <: XError](n: NatEitherSetter[N2, XErrorZero]) extends XErrorReversePlus[N2, XErrorZero] {
  override type PluI = N2
  override def plus(t1: N2): Either[XErrorZero, N2] = Right(t1)
  override def takeHead(t1: XErrorZero): N2         = n.put(t1)
  override def takeTail(t1: N2): N2                 = t1
}

class XErrorReversePlusPositive[N1Tail <: XError, N1Head, N2 <: XError](val tail: XErrorReversePlus[N2, N1Tail])
    extends XErrorReversePlus[N2, XErrorPositive[N1Tail, N1Head]] {
  override type PluI = XErrorPositive[N1Tail#Plus[N2], N1Head]
  override def plus(t1: XErrorPositive[N1Tail#Plus[N2], N1Head]): Either[XErrorPositive[N1Tail, N1Head], N2] =
    t1.either.fold(n => tail.plus(n).left.map(u => new XErrorPositive(either = Left(u))), n => Left(new XErrorPositive(Right(n))))
  override def takeHead(t1: XErrorPositive[N1Tail, N1Head]): XErrorPositive[N1Tail#Plus[N2], N1Head] =
    t1.either.fold(n => new XErrorPositive(Left(tail.takeHead(n))), n => new XErrorPositive(Right(n)))
  override def takeTail(t1: N2): XErrorPositive[N1Tail#Plus[N2], N1Head] = new XErrorPositive(Left(tail.takeTail(t1)))
}
