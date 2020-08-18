package xio.nat.subduction

import xio.nat.Nat

trait NatToSubduction[P1 <: Nat, P2 <: Nat] {
  def plus(p1: P1, p2: P2): P2#Plus[P1] = p2.plus(p1)
  def takeHead(p: P2#Plus[P1]): P1
  def takeTail(p: P2#Plus[P1]): P2
}

object NatToSubduction {

  implicit def subductionNatPositiveImplicit[P1 <: Nat, P2 <: Nat](implicit
    cv: P2#Plus[P1]#消融1[P2#ToAbove] <:< AboveNatPairImpl[AboveNatZero, P1],
    cv2: P2#Plus[P1]#PlusBottom[P1#ToBottom] <:< P2,
    n1: NatToAbove[P2#ToAbove],
    n2: NatToBottom[P1#ToBottom]
  ): NatToSubduction[P1, P2] =
    new NatToSubduction[P1, P2] {
      override def takeHead(p: P2#Plus[P1]): P1 = p.消融1.natN
      override def takeTail(p: P2#Plus[P1]): P2 = p.plusBottom
    }

}
