package xio.nat.error

import xio.XError

trait NatEitherToTag[T <: XError, N <: XError] {
  def tag(k: T): N
}

object NatEitherToTag {
  implicit def zeroNat[N <: XError, Head](implicit d: NatEitherSetter[N, Head]): NatEitherToTag[XErrorFirst[Head], N] = new NatEitherToTagZero(d)
  implicit def positiveNat[Head, TagTail <: XError, N <: XError](implicit
    to: NatEitherToTag[TagTail, N],
    p: NatEitherSetter[N, Head]
  ): NatEitherToTag[XErrorPositive[TagTail, Head], N] = new NatEitherToTagPositive(to = to, p = p)
}

class NatEitherToTagZero[Head, N <: XError](d: NatEitherSetter[N, Head]) extends NatEitherToTag[XErrorFirst[Head], N] {
  def tag(k: XErrorFirst[Head]): N = d.put(k.one)
}

class NatEitherToTagPositive[NatTail <: XError, NatHead, N <: XError](to: NatEitherToTag[NatTail, N], p: NatEitherSetter[N, NatHead])
    extends NatEitherToTag[XErrorPositive[NatTail, NatHead], N] {
  def tag(k: XErrorPositive[NatTail, NatHead]): N = k.either.fold(pre => to.tag(pre), data => p.put(data))
}
