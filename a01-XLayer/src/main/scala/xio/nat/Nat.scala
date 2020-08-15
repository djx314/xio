package xio.nat

import xio.nat.subduction.{BottomNat, BottomNatPositive, BottomNatZero}

trait Nat extends BottomNat {

  type Next[T] <: Nat
  override type AppendBottom[T] <: Nat
  type PlusBottom[T <: BottomNat] <: BottomNat
  type ToBottom <: BottomNat
  type Pair[T] <: NatPair
  type Plus[I <: Nat] <: Nat
  type Multiply[O <: Nat] <: NatPair
  type ToTag <: TagNat

  def next[T](t: T): Next[T]
  override def appendBottom[T](t: T): AppendBottom[T]
  def plusBottom[T <: BottomNat](t: T): PlusBottom[T]
  def toBottom: ToBottom
  def pair[T]: Pair[T]
  def plus[I <: Nat](i: I): Plus[I]
  def multiply[O <: Nat](implicit o: NatToTag[O#ToTag]): Multiply[O]
  def toTag: ToTag
}

class NatZero extends Nat {
  self =>
  override type Next[T]                    = NatPositive[NatZero, T]
  override type AppendBottom[T]            = NatPositive[NatZero, T]
  override type PlusBottom[T <: BottomNat] = T
  override type ToBottom                   = BottomNatZero
  override type Pair[T]                    = NatPairZero
  override type Plus[I <: Nat]             = I
  override type Multiply[O <: Nat]         = O#ToTag#Multiply[NatZero]
  override type ToTag                      = TagNatZero

  override def next[T](t: T): NatPositive[NatZero, T]                                       = new NatPositive(self, t)
  override def appendBottom[T](t: T): NatPositive[NatZero, T]                               = new NatPositive(tail = self, head = t)
  override def plusBottom[T <: BottomNat](t: T): T                                          = t
  override def toBottom: BottomNatZero                                                      = BottomNatZero.value
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
  override type Next[H]                    = NatPositive[NatPositive[Tail, Head], H]
  override type AppendBottom[T]            = NatPositive[NatPositive[Tail, Head], T]
  override type PlusBottom[T <: BottomNat] = Tail#PlusBottom[T]#AppendBottom[Head]
  override type ToBottom                   = BottomNatPositive[Tail#ToBottom]
  override type Pair[T]                    = NatPairPositive[Tail#Pair[T], Head, T]
  override type Plus[I <: Nat]             = NatPositive[Tail#Plus[I], Head]
  override type Multiply[O <: Nat]         = O#ToTag#Multiply[NatPositive[Tail, Head]]#Self
  override type ToTag                      = TagNatPositive[Tail#ToTag, Head]

  override def next[H](h: H): NatPositive[NatPositive[Tail, Head], H]                                            = new NatPositive(tail = self, head = h)
  override def appendBottom[T](t: T): NatPositive[NatPositive[Tail, Head], T]                                    = new NatPositive(tail = self, head = t)
  override def plusBottom[T <: BottomNat](t: T): Tail#PlusBottom[T]#AppendBottom[Head]                           = tail.plusBottom(t).appendBottom(head)
  override def toBottom: BottomNatPositive[Tail#ToBottom]                                                        = new BottomNatPositive(tail.toBottom)
  override def pair[T]: NatPairPositive[Tail#Pair[T], Head, T]                                                   = new NatPairPositive(tail = tail.pair[T], head = head)
  override def plus[I <: Nat](i: I): NatPositive[Tail#Plus[I], Head]                                             = new NatPositive(tail.plus(i), head)
  override def multiply[O <: Nat](implicit o: NatToTag[O#ToTag]): O#ToTag#Multiply[NatPositive[Tail, Head]]#Self = o.tag.multiply(self).selfNatPair
  override def toTag: TagNatPositive[Tail#ToTag, Head]                                                           = new TagNatPositive(tail.toTag)

  override def toString: String = s"${tail} :: ${head}"
}
