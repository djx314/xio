package xio.nat

trait NatPairFilter[T <: NatPair] {
  type R <: Nat
  def filter(t: T): R
}

object NatPairFilter {

  type Aux[T <: NatPair, R1 <: Nat] = NatPairFilter[T] { type R = R1 }

  def pair[T <: NatPair, R <: Nat](natPair: T)(implicit n: NatPairFilter.Aux[T, R]): R = n.filter(natPair)

  implicit val natFilterZero: NatPairFilter.Aux[NatPairZero, NatZero] =
    new NatPairFilter[NatPairZero] {
      override type R = NatZero
      override def filter(t: NatPairZero): NatZero = NatZero
    }

  implicit def natFilterPositive2[PairTail <: NatPair, HeadT, HeadR, NatTail <: Nat, NN <: AddNat](implicit
    filterImplicit: NatPairFilter.Aux[PairTail, NatTail],
    n: HeaderFunctor[HeadT, HeadR, NN]
  ): NatPairFilter.Aux[NatPairPositive[PairTail, HeadT, HeadR], NN#U[NatTail]] =
    new NatPairFilter[NatPairPositive[PairTail, HeadT, HeadR]] {
      override type R = NN#U[NatTail]
      override def filter(t: NatPairPositive[PairTail, HeadT, HeadR]): NN#U[NatTail] = n(t.head, filterImplicit.filter(t.tail))
    }

}
