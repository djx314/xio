package xio.nat.subduction

import xio.nat.NatZero

trait NatToBottom[N <: BottomNat] {
  def tag: N
}

object NatToBottom {

  implicit val bottomNatZeroImplicit: NatToBottom[NatZero] = new NatToBottom[NatZero] {
    override def tag: NatZero = NatZero
  }

  implicit def bottomNatPositiveImplicit[Tail <: BottomNat](implicit cv: NatToBottom[Tail]): NatToBottom[BottomNatPositive[Tail]] =
    new NatToBottom[BottomNatPositive[Tail]] {
      override def tag: BottomNatPositive[Tail] = new BottomNatPositive(cv.tag)
    }

}
