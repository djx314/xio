package xio.nat.has

trait NatFinder[NN <: Nat, HeadR] {
  def to(t: NN): HeadR
}

object NatFinder extends NatFinderImplicit1 {
  implicit def implicit1[HeadT, Tail <: Nat]: NatFinder[NatPositive[Tail, HeadT], HeadT] =
    new NatFinder[NatPositive[Tail, HeadT], HeadT] {
      override def to(t: NatPositive[Tail, HeadT]): HeadT = t.head
    }
}

trait NatFinderImplicit1 {
  implicit def implicit2[HeadT, HeadR, Tail <: Nat](implicit tailH: NatFinder[Tail, HeadR]): NatFinder[NatPositive[Tail, HeadT], HeadR] =
    new NatFinder[NatPositive[Tail, HeadT], HeadR] {
      override def to(t: NatPositive[Tail, HeadT]): HeadR = tailH.to(t.tail)
    }
}
