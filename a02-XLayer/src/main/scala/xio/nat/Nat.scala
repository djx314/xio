package xio.nat

import xio.nat.subduction.{AboveNat, AboveNatPair, AboveNatPairImpl, AboveNatPositive, AboveNatZero, BottomNat, BottomNatPositive, BottomNatZero, NatToAbove, NatToBottom}

trait Nat extends BottomNat {

  type Next[T] <: Nat
  override type AppendBottom[T] <: Nat
  type PlusBottom[T <: BottomNat] <: BottomNat
  type ToBottom <: BottomNat
  type ToAbove <: AboveNat
  type Pair[T <: Nat] <: NatPair
  type Plus[I <: Nat] <: Nat
  type ToTag <: TagNat

  type 消融1[T <: AboveNat] <: AboveNatPair
  def 消融1[T <: AboveNat](implicit item: NatToAbove[T]): 消融1[T]

  def next[T](t: T): Next[T]
  override def appendBottom[T](t: T): AppendBottom[T]
  def plusBottom[T <: BottomNat](implicit t: NatToBottom[T]): PlusBottom[T]
  def toBottom: ToBottom
  def toAbove: ToAbove
  def pair[T <: Nat](implicit natToTag: NatToTag[T#ToTag]): Pair[T]
  def plus[I <: Nat](i: I): Plus[I]
  def toTag: ToTag
}

class NatZero extends Nat {
  self =>
  override type Next[T]                    = NatPositive[NatZero, T]
  override type AppendBottom[T]            = NatPositive[NatZero, T]
  override type PlusBottom[T <: BottomNat] = T
  override type ToBottom                   = BottomNatZero
  override type ToAbove                    = AboveNatZero
  override type Pair[T <: Nat]             = T#ToTag#PairNat[NatZero]
  override type Plus[I <: Nat]             = I
  override type ToTag                      = TagNatZero

  override type 消融1[T <: AboveNat] = AboveNatPairImpl[T, NatZero]
  override def 消融1[T <: AboveNat](implicit item: NatToAbove[T]): AboveNatPairImpl[T, NatZero] = new AboveNatPairImpl(aboveNat = item.tag, natN = self)

  override def next[T](t: T): NatPositive[NatZero, T]                                         = new NatPositive(self, t)
  override def appendBottom[T](t: T): NatPositive[NatZero, T]                                 = new NatPositive(tail = self, head = t)
  override def plusBottom[T <: BottomNat](implicit t: NatToBottom[T]): T                      = t.tag
  override def toBottom: BottomNatZero                                                        = BottomNatZero.value
  override def toAbove: AboveNatZero                                                          = AboveNatZero.value
  override def pair[T <: Nat](implicit natToTag: NatToTag[T#ToTag]): T#ToTag#PairNat[NatZero] = natToTag.tag.pairNat(self)
  override def plus[I <: Nat](i: I): I                                                        = i
  override def toTag: TagNatZero                                                              = TagNatZero.value

  override def toString: String = "NatZero"
}

object NatZero extends NatZero

class NatPositive[Tail <: Nat, Head](val tail: Tail, val head: Head) extends Nat {
  self =>
  override type Next[H]                    = NatPositive[NatPositive[Tail, Head], H]
  override type AppendBottom[T]            = NatPositive[NatPositive[Tail, Head], T]
  override type PlusBottom[T <: BottomNat] = Tail#PlusBottom[T]#AppendBottom[Head]
  override type ToBottom                   = BottomNatPositive[Tail#ToBottom]
  override type ToAbove                    = AboveNatPositive[Tail#ToAbove]
  override type Pair[T <: Nat]             = T#ToTag#PairNat[NatPositive[Tail, Head]]
  override type Plus[I <: Nat]             = NatPositive[Tail#Plus[I], Head]
  override type ToTag                      = TagNatPositive[Tail#ToTag, Head]

  override type 消融1[T <: AboveNat] = T#消融2[Tail, Head]
  override def 消融1[T <: AboveNat](implicit item: NatToAbove[T]): T#消融2[Tail, Head] = item.tag.消融2(tail, head)

  override def next[H](h: H): NatPositive[NatPositive[Tail, Head], H]                                         = new NatPositive(tail = self, head = h)
  override def appendBottom[T](t: T): NatPositive[NatPositive[Tail, Head], T]                                 = new NatPositive(tail = self, head = t)
  override def plusBottom[T <: BottomNat](implicit t: NatToBottom[T]): Tail#PlusBottom[T]#AppendBottom[Head]  = tail.plusBottom(t).appendBottom(head)
  override def toBottom: BottomNatPositive[Tail#ToBottom]                                                     = new BottomNatPositive(tail.toBottom)
  override def toAbove: AboveNatPositive[Tail#ToAbove]                                                        = new AboveNatPositive(tail.toAbove)
  override def pair[T <: Nat](implicit natToTag: NatToTag[T#ToTag]): T#ToTag#PairNat[NatPositive[Tail, Head]] = natToTag.tag.pairNat(self)
  override def plus[I <: Nat](i: I): NatPositive[Tail#Plus[I], Head]                                          = new NatPositive(tail.plus(i), head)
  override def toTag: TagNatPositive[Tail#ToTag, Head]                                                        = new TagNatPositive(tail.toTag)

  override def toString: String = s"${tail} :: ${head}"
}
