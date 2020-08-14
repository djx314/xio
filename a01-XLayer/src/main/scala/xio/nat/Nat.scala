package xio.nat

trait Nat {
  type Next[T] <: Nat
  type Pair[T] <: NatPair
  type Plus[I <: Nat] <: Nat
  type Multiply[O <: Nat] <: NatPair
  type ToTag <: TagNat

  def next[T](t: T): Next[T]
  def pair[T]: Pair[T]
  def plus[I <: Nat](i: I): Plus[I]
  def multiply[O <: Nat](implicit o: NatToTag[O#ToTag]): Multiply[O]
  def toTag: ToTag
}

class NatZero extends Nat {
  self =>
  override type Next[T]            = NatPositive[NatZero, T]
  override type Pair[T]            = NatPairZero
  override type Plus[I <: Nat]     = I
  override type Multiply[O <: Nat] = O#ToTag#Multiply[NatZero]
  override type ToTag              = TagNatZero

  override def next[T](t: T): NatPositive[NatZero, T]                                       = new NatPositive(self, t)
  override def pair[T]: NatPairZero                                                         = new NatPairZero
  override def plus[I <: Nat](i: I): I                                                      = i
  override def multiply[O <: Nat](implicit o: NatToTag[O#ToTag]): O#ToTag#Multiply[NatZero] = o.tag.multiply(self)
  override def toTag: TagNatZero                                                            = TagNatZero.value

  override def toString: String = "NatZero"
}

object NatZero {
  val value: NatZero = new NatZero
}

class NatPositive[Tail <: Nat, Head](val tail: Tail, val head: Head) extends Nat {
  self =>
  override type Next[H]            = NatPositive[NatPositive[Tail, Head], H]
  override type Pair[T]            = Tail#Pair[T]#Next[Head, T]
  override type Plus[I <: Nat]     = Tail#Plus[I]#Next[Head]
  override type Multiply[O <: Nat] = O#ToTag#Multiply[NatPositive[Tail, Head]]#Self
  override type ToTag              = Tail#ToTag#Next[Head]

  override def next[H](h: H): NatPositive[NatPositive[Tail, Head], H]                                            = new NatPositive(tail = self, head = h)
  override def pair[T]: Tail#Pair[T]#Next[Head, T]                                                               = tail.pair[T].next(head)
  override def plus[I <: Nat](i: I): Tail#Plus[I]#Next[Head]                                                     = tail.plus(i).next(head)
  override def multiply[O <: Nat](implicit o: NatToTag[O#ToTag]): O#ToTag#Multiply[NatPositive[Tail, Head]]#Self = o.tag.multiply(self).selfNatPair
  override def toTag: Tail#ToTag#Next[Head]                                                                      = tail.toTag.next[Head]

  override def toString: String = s"${tail} :: ${head}"
}
