package xio.nat

trait TagNat[NatModel <: Nat] {
  type NatTarget <: Nat
  def n(model: NatModel): NatTarget
}

class TagNatZero[N <: Nat] extends TagNat[N] {
  self =>
  override type NatTarget = NatZero
  override def n(model: N): NatZero = NatZero
  override def toString: String     = "TagNatZero"
}

class TagNatPositive[N <: Nat, Tail <: TagNat[N], Head](val tail: Tail, p: HeaderFunctor[N, Head]) extends TagNat[N] {
  self =>
  override type NatTarget = NatPositive[Tail#NatTarget, Head]
  override def n(model: N): NatPositive[Tail#NatTarget, Head] = new NatPositive(tail.n(model), p.to(model))
}
