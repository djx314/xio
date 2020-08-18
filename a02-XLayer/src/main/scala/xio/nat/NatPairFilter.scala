package xio.nat

trait NatPairFilter[T <: NatPair] {
  def filter(t: T): T#NatGen
}

object NatPairFilter {

  def pair[T <: NatPair](natPair: T)(implicit n: NatPairFilter[T]): T#NatGen = n.filter(natPair)

  implicit def natFilterZero[N <: Nat]: NatPairFilter[NatPairZero[N]] =
    new NatPairFilter[NatPairZero[N]] {
      override def filter(t: NatPairZero[N]): NatZero = NatZero
    }

  implicit def natFilterPositive2[PairTail <: NatPair, HeadR](implicit
    filterImplicit: NatPairFilter[PairTail],
    n: HeaderFunctor[PairTail#NatModel, HeadR]
  ): NatPairFilter[NatPairPositive[PairTail, HeadR]] =
    new NatPairFilter[NatPairPositive[PairTail, HeadR]] {
      override def filter(t: NatPairPositive[PairTail, HeadR]): NatPositive[PairTail#NatGen, HeadR] =
        new NatPositive(tail = filterImplicit.filter(t.tail), head = n.to(t.natModel))
    }

}
