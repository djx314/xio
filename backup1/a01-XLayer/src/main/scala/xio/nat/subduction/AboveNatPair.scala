package xio.nat.subduction

import xio.nat.Nat

trait AboveNatPair {
  type Self <: AboveNatPair
  def selfN: Self
}

class AboveNatPairImpl[Above <: AboveNat, N <: Nat](val aboveNat: Above, val natN: N) extends AboveNatPair {
  self =>
  override type Self = AboveNatPairImpl[Above, N]
  override def selfN: AboveNatPairImpl[Above, N] = self
  override def toString: String                  = s"AboveNatPairImpl(above = ${aboveNat}, nat = ${natN})"
}
