package xio.nat

trait HeaderFunctor[NN <: Nat, HeadR] {
  def to(t: NN): HeadR
}

object HeaderFunctor extends HeaderFunctorImplicit1 {
  implicit def implicit1[HeadT, Tail <: Nat]: HeaderFunctor[NatPositive[Tail, HeadT], HeadT] =
    new HeaderFunctor[NatPositive[Tail, HeadT], HeadT] {
      override def to(t: NatPositive[Tail, HeadT]): HeadT = t.head
    }
}

trait HeaderFunctorImplicit1 {
  implicit def implicit2[HeadT, HeadR, Tail <: Nat](implicit tailH: HeaderFunctor[Tail, HeadR]): HeaderFunctor[NatPositive[Tail, HeadT], HeadR] =
    new HeaderFunctor[NatPositive[Tail, HeadT], HeadR] {
      override def to(t: NatPositive[Tail, HeadT]): HeadR = tailH.to(t.tail)
    }
}
