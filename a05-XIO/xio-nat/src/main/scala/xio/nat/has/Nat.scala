package xio.nat.has

trait Nat {
  self =>
  type Plus[I <: Nat] <: Nat
  type RePlus[I <: Nat] <: Nat

  def plus[I <: Nat](i: I): Plus[I]
  def rePlus[I <: Nat](i: I): RePlus[I]
}

class NatZero extends Nat {
  self =>
  override type Plus[I <: Nat]   = I
  override type RePlus[I <: Nat] = I#Plus[NatZero]

  override def plus[I <: Nat](i: I): I                 = i
  override def rePlus[I <: Nat](i: I): I#Plus[NatZero] = i.plus(self)
  override def toString: String                        = "NatZero"
}

object NatZero extends NatZero

class NatPositive[Tail <: Nat, Head](val tail: Tail, val head: Head) extends Nat {
  self =>
  override type Plus[I <: Nat]   = NatPositive[Tail#Plus[I], Head]
  override type RePlus[I <: Nat] = I#Plus[NatPositive[Tail, Head]]

  override def plus[I <: Nat](i: I): NatPositive[Tail#Plus[I], Head]           = new NatPositive(tail.plus(i), head)
  override def rePlus[I <: Nat](i: I): I#Plus[NatPositive[Tail, Head]]         = i.plus(self)
  def get[P](implicit headerFunctor: NatFinder[NatPositive[Tail, Head], P]): P = headerFunctor.to(self)
  override def toString: String                                                = s"${tail} :: ${head}"
}
