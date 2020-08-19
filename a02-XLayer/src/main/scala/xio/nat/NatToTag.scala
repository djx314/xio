package xio.nat

trait NatToTag[T <: TagNat[N], N <: Nat] {
  def tag: T
}

object NatToTag {
  implicit def zeroNat[N <: Nat]: NatToTag[TagNatZero[N], N] =
    new NatToTag[TagNatZero[N], N] {
      override def tag: TagNatZero[N] = new TagNatZero
    }

  implicit def positiveNat[Head, TagTail <: TagNat[N], N <: Nat](implicit
    to: NatToTag[TagTail, N],
    p: HeaderFunctor[N, Head]
  ): NatToTag[TagNatPositive[N, TagTail, Head], N] =
    new NatToTag[TagNatPositive[N, TagTail, Head], N] {
      override def tag: TagNatPositive[N, TagTail, Head] = new TagNatPositive(tail = to.tag, p = p)
    }
}
