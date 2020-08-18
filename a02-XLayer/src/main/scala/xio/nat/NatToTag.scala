package xio.nat

trait NatToTag[T <: TagNat] {
  def tag: T
}

object NatToTag {
  implicit val zeroNat: NatToTag[TagNatZero] = new NatToTag[TagNatZero] {
    override def tag: TagNatZero = TagNatZero.value
  }

  implicit def positiveNat[Head, TagTail <: TagNat](implicit to: NatToTag[TagTail]): NatToTag[TagNatPositive[TagTail, Head]] =
    new NatToTag[TagNatPositive[TagTail, Head]] {
      override def tag: TagNatPositive[TagTail, Head] = new TagNatPositive[TagTail, Head](tail = to.tag)
    }
}
