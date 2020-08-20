package xio.nat

trait NatEitherToTag[T <: NatEither, N <: NatEither] {
  def tag(k: T): N
}

object NatEitherToTag {
  implicit def zeroNat[N <: NatEither, Head](implicit d: NatEitherSetter[N, Head]): NatEitherToTag[NatEitherFirst[Head], N] =
    new NatEitherToTag[NatEitherFirst[Head], N] {
      override def tag(k: NatEitherFirst[Head]): N = d.put(k.one)
    }

  implicit def positiveNat[Head, TagTail <: NatEither, N <: NatEither](implicit
    to: NatEitherToTag[TagTail, N],
    p: NatEitherSetter[N, Head]
  ): NatEitherToTag[NatEitherPositive[TagTail, Head], N] =
    new NatEitherToTag[NatEitherPositive[TagTail, Head], N] {
      override def tag(k: NatEitherPositive[TagTail, Head]): N = k.either.fold(pre => to.tag(pre), data => p.put(data))
    }
}
