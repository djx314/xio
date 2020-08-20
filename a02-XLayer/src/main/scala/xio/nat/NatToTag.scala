package xio.nat

trait NatToTag[T <: Nat, N <: Nat] {
  def tag(input: N): T
}

object NatToTag {
  implicit def zeroNat[N <: Nat]: NatToTag[NatZero, N] =
    new NatToTag[NatZero, N] {
      override def tag(input: N): NatZero = NatZero
    }

  implicit def positiveNat[Head, TagTail <: Nat, N <: Nat](implicit
    to: NatToTag[TagTail, N],
    p: HeaderFunctor[N, Head]
  ): NatToTag[NatPositive[TagTail, Head], N] =
    new NatToTag[NatPositive[TagTail, Head], N] {
      override def tag(input: N): NatPositive[TagTail, Head] = new NatPositive(tail = to.tag(input), head = p.to(input))
    }
}
