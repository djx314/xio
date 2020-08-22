package xio.nat.error

trait NatEitherToTag[T <: NatEither, N <: NatEither] {
  def tag(k: T): N
}

object NatEitherToTag {
  implicit def zeroNat[N <: NatEither](implicit n: ZeroSetter[N]): NatEitherToTag[NatEitherZero, N] = new NatEitherToTagZero(n = n)
  implicit def positiveNat[Head, TagTail <: NatEither, N <: NatEither](implicit
    to: NatEitherToTag[TagTail, N],
    p: NatEitherSetter[N, Head]
  ): NatEitherToTag[NatEitherPositive[TagTail, Head], N] = new NatEitherToTagPositive(to = to, p = p)
}

class NatEitherToTagZero[N <: NatEither](n: ZeroSetter[N]) extends NatEitherToTag[NatEitherZero, N] {
  def tag(k: NatEitherZero): N = n.tag(k)
}

class NatEitherToTagPositive[NatTail <: NatEither, NatHead, N <: NatEither](to: NatEitherToTag[NatTail, N], p: NatEitherSetter[N, NatHead])
    extends NatEitherToTag[NatEitherPositive[NatTail, NatHead], N] {
  def tag(k: NatEitherPositive[NatTail, NatHead]): N = k.either.fold(pre => to.tag(pre), data => p.put(data))
}
