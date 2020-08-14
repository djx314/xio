package xio.nat

trait TagNat {
  type Next[T] <: TagNat
  type Multiply[N <: Nat] <: NatPair

  def next[T]: Next[T]
  def multiply[N <: Nat](n: N): Multiply[N]
}

class TagNatZero extends TagNat {
  self =>
  override type Next[T]            = TagNatPositive[TagNatZero, T]
  override type Multiply[N <: Nat] = NatPairZero

  override def next[T]: TagNatPositive[TagNatZero, T] = new TagNatPositive(tail = self)
  override def multiply[N <: Nat](n: N): NatPairZero  = new NatPairZero

  override def toString: String = "NatZero"
}

object TagNatZero {
  implicit val value: TagNatZero = new TagNatZero
}

class TagNatPositive[Tail <: TagNat, Head](val tail: Tail) extends TagNat {
  self =>
  override type Next[H]            = TagNatPositive[TagNatPositive[Tail, Head], H]
  override type Multiply[N <: Nat] = N#Pair[Head]#Plus[Tail#Multiply[N]]

  override def next[H]: TagNatPositive[TagNatPositive[Tail, Head], H]        = new TagNatPositive(tail = self)
  override def multiply[N <: Nat](n: N): N#Pair[Head]#Plus[Tail#Multiply[N]] = n.pair[Head].plus(tail.multiply(n))
}
