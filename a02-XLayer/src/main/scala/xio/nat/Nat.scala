package xio.nat

import xio.nat.subduction.{AboveNat, AboveNatPair, AboveNatPairImpl, AboveNatPositive, AboveNatZero, BottomNat, BottomNatPositive, NatToAbove, NatToBottom}

trait Nat extends BottomNat {
  self =>
  override type Next[T] <: Nat
  type PlusBottom[T <: BottomNat] <: BottomNat
  type ToBottom <: BottomNat
  type ToAbove <: AboveNat
  type Plus[I <: Nat] <: Nat
  type ToTag[N <: Nat] <: TagNat[N]

  type 消融1[T <: AboveNat] <: AboveNatPair
  def 消融1[T <: AboveNat](implicit item: NatToAbove[T]): 消融1[T]

  override def next[T](t: T): Next[T]
  def plusBottom[T <: BottomNat](implicit t: NatToBottom[T]): PlusBottom[T]
  def toBottom: ToBottom
  def toAbove: ToAbove
  def plus[I <: Nat](i: I): Plus[I]
  def toTag[N <: Nat](implicit toTag: NatToTag[ToTag[N], N]): ToTag[N]
}

class NatZero extends Nat {
  self =>
  override type Next[T]                    = NatPositive[NatZero, T]
  override type PlusBottom[T <: BottomNat] = T
  override type ToBottom                   = NatZero
  override type ToAbove                    = AboveNatZero
  override type Plus[I <: Nat]             = I
  override type ToTag[N <: Nat]            = TagNatZero[N]

  override type 消融1[T <: AboveNat] = AboveNatPairImpl[T, NatZero]
  override def 消融1[T <: AboveNat](implicit item: NatToAbove[T]): AboveNatPairImpl[T, NatZero] = new AboveNatPairImpl(aboveNat = item.tag, natN = self)

  override def next[T](t: T): NatPositive[NatZero, T]                                 = new NatPositive(self, t)
  override def plusBottom[T <: BottomNat](implicit t: NatToBottom[T]): T              = t.tag
  override def toBottom: NatZero                                                      = self
  override def toAbove: AboveNatZero                                                  = AboveNatZero.value
  override def plus[I <: Nat](i: I): I                                                = i
  override def toTag[N <: Nat](implicit n: NatToTag[TagNatZero[N], N]): TagNatZero[N] = n.tag

  override def toString: String = "NatZero"
}

object NatZero extends NatZero

class NatPositive[Tail <: Nat, Head](val tail: Tail, val head: Head) extends Nat {
  self =>
  override type Next[H]                    = NatPositive[NatPositive[Tail, Head], H]
  override type PlusBottom[T <: BottomNat] = Tail#PlusBottom[T]#Next[Head]
  override type ToBottom                   = BottomNatPositive[Tail#ToBottom]
  override type ToAbove                    = AboveNatPositive[Tail#ToAbove]
  override type Plus[I <: Nat]             = NatPositive[Tail#Plus[I], Head]
  override type ToTag[N <: Nat]            = TagNatPositive[N, Tail#ToTag[N], Head]

  override type 消融1[T <: AboveNat] = T#消融2[Tail, Head]
  override def 消融1[T <: AboveNat](implicit item: NatToAbove[T]): T#消融2[Tail, Head] = item.tag.消融2(tail, head)

  override def next[H](h: H): NatPositive[NatPositive[Tail, Head], H]                                                                   = new NatPositive(tail = self, head = h)
  override def plusBottom[T <: BottomNat](implicit t: NatToBottom[T]): Tail#PlusBottom[T]#Next[Head]                                    = tail.plusBottom(t).next(head)
  override def toBottom: BottomNatPositive[Tail#ToBottom]                                                                               = new BottomNatPositive(tail.toBottom)
  override def toAbove: AboveNatPositive[Tail#ToAbove]                                                                                  = new AboveNatPositive(tail.toAbove)
  override def plus[I <: Nat](i: I): NatPositive[Tail#Plus[I], Head]                                                                    = new NatPositive(tail.plus(i), head)
  override def toTag[N <: Nat](implicit n: NatToTag[TagNatPositive[N, Tail#ToTag[N], Head], N]): TagNatPositive[N, Tail#ToTag[N], Head] = n.tag
  def get[P](implicit headerFunctor: HeaderFunctor[NatPositive[Tail, Head], P]): P                                                      = headerFunctor.to(self)

  override def toString: String = s"${tail} :: ${head}"
}
