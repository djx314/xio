package xio.nat

trait NatEitherToTag[T <: TagNatEitherM[N], N <: NatEither] {
  def tag(k: T#NatTarget): N
}

object NatEitherToTag {
  implicit def zeroNat[N <: NatEither, Head](implicit d: NatEitherSetter[N, Head]): NatEitherToTag[TagNatEitherPositive[N, NatEitherFirst[Head]], N] =
    new NatEitherToTag[TagNatEitherPositive[N, NatEitherFirst[Head]], N] {
      override def tag(k: NatEitherFirst[Head]): N = d.put(k.one)
    }

  implicit def positiveNat[Head, TagTail <: NatEither, N <: NatEither](implicit
    to: NatEitherToTag[TagNatEitherPositive[N, TagTail], N],
    p: NatEitherSetter[N, Head]
  ): NatEitherToTag[TagNatEitherPositive[N, NatEitherPositive[TagTail, Head]], N] =
    new NatEitherToTag[TagNatEitherPositive[N, NatEitherPositive[TagTail, Head]], N] {
      override def tag(k: NatEitherPositive[TagTail, Head]): N = k.either.fold(pre => to.tag(pre), data => p.put(data))
    }
}
