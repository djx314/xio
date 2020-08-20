package xio.nat

trait NatEitherToTag[T <: NatEither, N <: NatEither] {
  def tag(k: T): N
}

object NatEitherToTag {
  implicit def zeroNat[N <: NatEither, Head](implicit d: NatEitherSetter[N, Head]): NatEitherToTag[NatEitherFirst[Head], N] = new NatEitherToTagZero(d)
  implicit def positiveNat[Head, TagTail <: NatEither, N <: NatEither](implicit
    to: NatEitherToTag[TagTail, N],
    p: NatEitherSetter[N, Head]
  ): NatEitherToTag[NatEitherPositive[TagTail, Head], N] = new NatEitherToTagPositive(to = to, p = p)
}

class NatEitherToTagZero[Head, N <: NatEither](d: NatEitherSetter[N, Head]) extends NatEitherToTag[NatEitherFirst[Head], N] {
  def tag(k: NatEitherFirst[Head]): N = d.put(k.one)
}

class NatEitherToTagPositive[NatTail <: NatEither, NatHead, N <: NatEither](to: NatEitherToTag[NatTail, N], p: NatEitherSetter[N, NatHead])
    extends NatEitherToTag[NatEitherPositive[NatTail, NatHead], N] {
  def tag(k: NatEitherPositive[NatTail, NatHead]): N = k.either.fold(pre => to.tag(pre), data => p.put(data))
}
