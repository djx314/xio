package xio.nat

trait NatReversePlusToTag[N1 <: Nat, N2 <: Nat] {
  def tag: NatReversePlus[N1, N2]
}

object NatReversePlusToTag {
  implicit def zeroNat[N2 <: Nat]: NatReversePlusToTag[N2, NatZero] =
    new NatReversePlusToTag[N2, NatZero] {
      override val tag: NatReversePlus[N2, NatZero] = new NatReversePlusZero[N2]
    }
  implicit def positiveNat[N1Tail <: Nat, N1Head, N2 <: Nat](implicit n: NatReversePlusToTag[N2, N1Tail]): NatReversePlusToTag[N2, NatPositive[N1Tail, N1Head]] =
    new NatReversePlusToTag[N2, NatPositive[N1Tail, N1Head]] {
      override val tag: NatReversePlus[N2, NatPositive[N1Tail, N1Head]] = new NatReversePlusPositive(tail = n.tag)
    }
}
