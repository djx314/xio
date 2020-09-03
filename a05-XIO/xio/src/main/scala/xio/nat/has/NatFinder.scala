package xio.nat.has

trait NatFinder[NN <: Nat, HeadR] {
  def to(t: NN): HeadR
}

object NatFinder {
  implicit def implicit1[HeadT, N <: Nat](implicit n: NatFinderImpl[N#InnerPlus[NatZero], HeadT]): NatFinder[N, HeadT] =
    new NatFinder[N, HeadT] {
      override def to(t: N): HeadT = n.to(t.innerPlus(NatZero))
    }
}

trait NatFinderImpl[NN <: Nat, HeadR] {
  def to(t: NN): HeadR
}

object NatFinderImpl extends NatFinderImplImplicit1 {
  implicit def implicit1[HeadT, Tail <: Nat]: NatFinderImpl[NatPositive[Tail, HeadT], HeadT] =
    new NatFinderImpl[NatPositive[Tail, HeadT], HeadT] {
      override def to(t: NatPositive[Tail, HeadT]): HeadT = t.head
    }
}

trait NatFinderImplImplicit1 {
  implicit def implicit2[HeadT, HeadR, Tail <: Nat](implicit tailH: NatFinderImpl[Tail, HeadR]): NatFinderImpl[NatPositive[Tail, HeadT], HeadR] =
    new NatFinderImpl[NatPositive[Tail, HeadT], HeadR] {
      override def to(t: NatPositive[Tail, HeadT]): HeadR = tailH.to(t.tail)
    }
}
