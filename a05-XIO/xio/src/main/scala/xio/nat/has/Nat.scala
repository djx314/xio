package xio.nat.has

trait Nat {
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

case class NatTuple2[T1, T2](_1: T1, _2: T2) extends NatPositive[NatPositive[NatZero, T1], T2](tail = new NatPositive(tail = NatZero, head = _1), head = _2) {
  override type Plus[I <: Nat] = NatPositive[NatPositive[I, T1], T2]
  override def plus[I <: Nat](i: I): NatPositive[NatPositive[I, T1], T2] = new NatPositive(tail = new NatPositive(tail = i, head = _1), head = _2)
  override def toString: String                                          = s"(${_1}, ${_2})"
}
