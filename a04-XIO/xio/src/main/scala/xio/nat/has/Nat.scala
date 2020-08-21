package xio.nat

trait Nat {
  self =>
  type Next[T] <: Nat
  type Plus[I <: Nat] <: Nat

  def next[T](t: T): Next[T]
  def plus[I <: Nat](i: I): Plus[I]
}

class NatZero extends Nat {
  self =>
  override type Next[T]        = NatPositive[NatZero, T]
  override type Plus[I <: Nat] = I

  override def next[T](t: T): NatPositive[NatZero, T] = new NatPositive(self, t)
  override def plus[I <: Nat](i: I): I                = i

  override def toString: String = "NatZero"
}

object NatZero extends NatZero

class NatPositive[Tail <: Nat, Head](val tail: Tail, val head: Head) extends Nat {
  self =>
  override type Next[H]        = NatPositive[NatPositive[Tail, Head], H]
  override type Plus[I <: Nat] = NatPositive[Tail#Plus[I], Head]

  override def next[H](h: H): NatPositive[NatPositive[Tail, Head], H]              = new NatPositive(tail = self, head = h)
  override def plus[I <: Nat](i: I): NatPositive[Tail#Plus[I], Head]               = new NatPositive(tail.plus(i), head)
  def get[P](implicit headerFunctor: HeaderFunctor[NatPositive[Tail, Head], P]): P = headerFunctor.to(self)

  override def toString: String = s"${tail} :: ${head}"
}
