package xio.nat.has

import xio.XHas

trait XHasReversePlus[N2 <: XHas, N1 <: XHas] {
  type PluI = N1#Plus[N2]
  def plus(t1: N1, t2: N2): PluI
  def takeHead(t1: PluI): N1
  def takeTail(t1: PluI): N2
}

object XHasReversePlus {
  implicit def zeroNat[N2 <: XHas]: XHasReversePlus[N2, XHasZero] = new XHasReversePlusZero
  implicit def positiveNat[N1Tail <: XHas, N1Head, N2 <: XHas](implicit n: XHasReversePlus[N2, N1Tail]): XHasReversePlus[N2, XHasPositive[N1Tail, N1Head]] =
    new XHasReversePlusPositive(tail = n)
}

class XHasReversePlusZero[N2 <: XHas] extends XHasReversePlus[N2, XHasZero] {
  override type PluI = N2
  override def plus(t1: XHasZero, t2: N2): N2 = t2
  override def takeHead(t1: N2): XHasZero     = XHasZero
  override def takeTail(t1: N2): N2           = t1
}

class XHasReversePlusPositive[N1Tail <: XHas, N1Head, N2 <: XHas](val tail: XHasReversePlus[N2, N1Tail]) extends XHasReversePlus[N2, XHasPositive[N1Tail, N1Head]] {
  override type PluI = XHasPositive[N1Tail#Plus[N2], N1Head]
  override def plus(t1: XHasPositive[N1Tail, N1Head], t2: N2): XHasPositive[N1Tail#Plus[N2], N1Head] = new XHasPositive(tail = tail.plus(t1.tail, t2), head = t1.head)
  override def takeHead(t1: XHasPositive[N1Tail#Plus[N2], N1Head]): XHasPositive[N1Tail, N1Head]     = new XHasPositive(tail = tail.takeHead(t1.tail), head = t1.head)
  override def takeTail(t1: XHasPositive[N1Tail#Plus[N2], N1Head]): N2                               = tail.takeTail(t1.tail)
}
