package xio.nat.subduction

import xio.nat.Nat

trait AboveNatPair {
  type AboveNatN <: AboveNat
  type NatN <: Nat
  type Self <: AboveNatPair
  def selfN: Self
  def aboveNat: AboveNatN
  def natN: NatN
}

class AboveNatPairImpl[Above <: AboveNat, N <: Nat](override val aboveNat: Above, override val natN: N) extends AboveNatPair {
  self =>
  override type AboveNatN = Above
  override type NatN      = N
  override type Self      = AboveNatPairImpl[Above, N]
  override def selfN: AboveNatPairImpl[Above, N] = self
  override def toString: String                  = s"AboveNatPairImpl(above = ${aboveNat}, nat = ${natN})"
}
