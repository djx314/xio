package xio.nat.subduction

import xio.nat.{Nat, NatPositive}

trait AboveNat {
  type 消融2[T <: Nat, I] <: AboveNatPair
  def 消融2[T <: Nat, I](item: T, i: I): 消融2[T, I]
}

class AboveNatZero extends AboveNat {
  self =>
  override type 消融2[T <: Nat, I] = AboveNatPairImpl[AboveNatZero, NatPositive[T, I]]
  override def 消融2[T <: Nat, I](item: T, i: I): AboveNatPairImpl[AboveNatZero, NatPositive[T, I]] = new AboveNatPairImpl(self, new NatPositive(tail = item, head = i))
  override def toString: String                                                                   = s"AboveNatZero"
}

object AboveNatZero {
  val value: AboveNatZero = new AboveNatZero
}

class AboveNatPositive[Tail <: AboveNat](val tail: Tail) extends AboveNat {
  self =>
  override type 消融2[T <: Nat, I] = T#消融1[Tail]#Self
  override def 消融2[T <: Nat, I](item: T, i: I): T#消融1[Tail]#Self =
    item
      .消融1(new NatToAbove[Tail] {
        override val tag = tail
      })
      .selfN
  override def toString: String = s"AboveNatPositive($self)"
}
