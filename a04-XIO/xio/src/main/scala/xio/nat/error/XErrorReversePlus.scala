package xio.nat.error

import xio.XError

trait XErrorReversePlus[N2 <: XError, N1 <: XError] {
  type PluI = N1#Plus[N2]
  def plus(t1: PluI): Either[N1, N2]
  def takeHead(t1: N1): PluI
  def takeTail(t1: N2): PluI
}

object XErrorReversePlus {
  implicit def zeroNat[N2 <: XError, F]: XErrorReversePlus[N2, XErrorFirst[F]] = new XErrorReversePlusZero
  implicit def positiveNat[N1Tail <: XError, N1Head, N2 <: XError](implicit n: XErrorReversePlus[N2, N1Tail]): XErrorReversePlus[N2, XErrorPositive[N1Tail, N1Head]] =
    new XErrorReversePlusPositive(tail = n)
}

class XErrorReversePlusZero[N2 <: XError, F] extends XErrorReversePlus[N2, XErrorFirst[F]] {
  override type PluI = XErrorPositive[N2, F]
  override def plus(t1: XErrorPositive[N2, F]): Either[XErrorFirst[F], N2] = t1.either.fold(n2 => Right(n2), f => Left(new XErrorFirst(f)))
  override def takeHead(t1: XErrorFirst[F]): XErrorPositive[N2, F]         = new XErrorPositive(Right(t1.one))
  override def takeTail(t1: N2): XErrorPositive[N2, F]                     = new XErrorPositive(Left(t1))
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
