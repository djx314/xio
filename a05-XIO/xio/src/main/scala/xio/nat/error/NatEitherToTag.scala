package xio.nat.error

import xio.XError

trait NatEitherToTag[T <: XError, N <: XError] {
  def tag(k: T): N
}

object NatEitherToTag {
  implicit def zeroNat[N <: XError](implicit n: ZeroSetter[N]): NatEitherToTag[XErrorZero, N] = new NatEitherToTagZero(n = n)
  implicit def positiveNat[Head, TagTail <: XError, N <: XError](implicit
    to: NatEitherToTag[TagTail, N],
    p: NatEitherSetter[N, Head]
  ): NatEitherToTag[XErrorPositive[TagTail, Head], N] = new NatEitherToTagPositive(to = to, p = p)
}

class NatEitherToTagZero[N <: XError](n: ZeroSetter[N]) extends NatEitherToTag[XErrorZero, N] {
  def tag(k: XErrorZero): N = n.tag(k)
}

class NatEitherToTagPositive[NatTail <: XError, NatHead, N <: XError](to: NatEitherToTag[NatTail, N], p: NatEitherSetter[N, NatHead])
    extends NatEitherToTag[XErrorPositive[NatTail, NatHead], N] {
  def tag(k: XErrorPositive[NatTail, NatHead]): N = k.either.fold(pre => to.tag(pre), data => p.put(data))
}
