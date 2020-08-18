package xio.nat

trait TagNat {
  type PairNat[N <: Nat] <: NatPair
  def pairNat[N <: Nat](n: N): PairNat[N]
}

class TagNatZero extends TagNat {
  self =>
  override type PairNat[N <: Nat] = NatPairZero[N]
  override def pairNat[N <: Nat](n: N): NatPairZero[N] = new NatPairZero(n)
  override def toString: String                        = "TagNatZero"
}

object TagNatZero {
  val value: TagNatZero = new TagNatZero
}

class TagNatPositive[Tail <: TagNat, Head](val tail: Tail) extends TagNat {
  self =>
  override type PairNat[N <: Nat] = NatPairPositive[Tail#PairNat[N], Head]
  override def pairNat[N <: Nat](n: N): NatPairPositive[Tail#PairNat[N], Head] = new NatPairPositive(tail = tail.pairNat(n))
}
