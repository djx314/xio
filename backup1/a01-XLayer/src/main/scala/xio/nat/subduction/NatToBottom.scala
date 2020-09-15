package xio.nat.subduction

trait NatToBottom[N <: BottomNat] {
  def tag: N
}

object NatToBottom {

  implicit val bottomNatZeroImplicit: NatToBottom[BottomNatZero] = new NatToBottom[BottomNatZero] {
    override def tag: BottomNatZero = BottomNatZero.value
  }

  implicit def bottomNatPositiveImplicit[Tail <: BottomNat](implicit cv: NatToBottom[Tail]): NatToBottom[BottomNatPositive[Tail]] =
    new NatToBottom[BottomNatPositive[Tail]] {
      override def tag: BottomNatPositive[Tail] = new BottomNatPositive(cv.tag)
    }

}
