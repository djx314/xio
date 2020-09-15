package xio.nat

trait NatPair {
  type Self <: NatPair
  type Next[T, R] <: NatPair
  type Plus[O <: NatPair] <: NatPair

  def selfNatPair: Self
  def next[T, R](p: T): Next[T, R]
  def plus[O <: NatPair](n: O): Plus[O]
}

class NatPairZero extends NatPair {
  self =>
  override type Self               = NatPairZero
  override type Next[T, R]         = NatPairPositive[NatPairZero, T, R]
  override type Plus[O <: NatPair] = O
  override def selfNatPair: NatPairZero                             = self
  override def next[T, R](p: T): NatPairPositive[NatPairZero, T, R] = new NatPairPositive(self, p)
  override def plus[O <: NatPair](n: O): O                          = n

  override def toString: String = "NatPairZero"
}

object NatPairZero {
  val value: NatPairZero = new NatPairZero
}

class NatPairPositive[Tail <: NatPair, HeadT, HeadR](val tail: Tail, val head: HeadT) extends NatPair {
  self =>
  override type Self               = NatPairPositive[Tail, HeadT, HeadR]
  override type Next[T, R]         = NatPairPositive[NatPairPositive[Tail, HeadT, HeadR], T, R]
  override type Plus[O <: NatPair] = NatPairPositive[Tail#Plus[O], HeadT, HeadR]
  override def selfNatPair: NatPairPositive[Tail, HeadT, HeadR]                             = self
  override def next[T, R](p: T): NatPairPositive[NatPairPositive[Tail, HeadT, HeadR], T, R] = new NatPairPositive(tail = self, head = p)
  override def plus[O <: NatPair](n: O): NatPairPositive[Tail#Plus[O], HeadT, HeadR]        = new NatPairPositive(tail = tail.plus(n), head = head)

  override def toString: String = s"${tail} :: ${head}"
}
