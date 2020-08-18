package xio.nat.subduction

trait NatToAbove[N <: AboveNat] {
  def tag: N
}

object NatToAbove {

  implicit val aboveNatZeroImplicit: NatToAbove[AboveNatZero] = new NatToAbove[AboveNatZero] {
    override def tag: AboveNatZero = AboveNatZero.value
  }

  implicit def aboveNatPositiveImplicit[Tail <: AboveNat](implicit cv: NatToAbove[Tail]): NatToAbove[AboveNatPositive[Tail]] =
    new NatToAbove[AboveNatPositive[Tail]] {
      override def tag: AboveNatPositive[Tail] = new AboveNatPositive(cv.tag)
    }

}
