package xio.nat

trait NatReversePlus[N2 <: Nat, N1 <: Nat] {
  type PluI = N1#Plus[N2]
  def plus(t1: N1, t2: N2): PluI
  def takeHead(t1: PluI): N1
  def takeTail(t1: PluI): N2
}

class NatReversePlusZero[N2 <: Nat] extends NatReversePlus[N2, NatZero] {
  override type PluI = N2
  override def plus(t1: NatZero, t2: N2): N2 = t2
  override def takeHead(t1: N2): NatZero     = NatZero
  override def takeTail(t1: N2): N2          = t1
}

class NatReversePlusPositive[N1Tail <: Nat, N1Head, N2 <: Nat](val tail: NatReversePlus[N2, N1Tail]) extends NatReversePlus[N2, NatPositive[N1Tail, N1Head]] {
  override type PluI = NatPositive[N1Tail#Plus[N2], N1Head]
  override def plus(t1: NatPositive[N1Tail, N1Head], t2: N2): NatPositive[N1Tail#Plus[N2], N1Head] = new NatPositive(tail = tail.plus(t1.tail, t2), head = t1.head)
  override def takeHead(t1: NatPositive[N1Tail#Plus[N2], N1Head]): NatPositive[N1Tail, N1Head]     = new NatPositive(tail = tail.takeHead(t1.tail), head = t1.head)
  override def takeTail(t1: NatPositive[N1Tail#Plus[N2], N1Head]): N2                              = tail.takeTail(t1.tail)
}
