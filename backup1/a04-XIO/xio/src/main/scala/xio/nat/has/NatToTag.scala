package xio.nat.has

import xio.XHas

trait NatToTag[T <: XHas, N <: XHas] {
  def tag(input: N): T
}

object NatToTag {
  implicit def zeroNat[N <: XHas]: NatToTag[XHasZero, N] = new NatToTagZero
  implicit def positiveNat[Head, TagTail <: XHas, N <: XHas](implicit
    to: NatToTag[TagTail, N],
    p: HeaderFunctor[N, Head]
  ): NatToTag[XHasPositive[TagTail, Head], N] = new NatToTagPositive(to = to, p = p)
}

class NatToTagZero[N <: XHas] extends NatToTag[XHasZero, N] {
  override def tag(input: N): XHasZero = XHasZero
}

class NatToTagPositive[NatTail <: XHas, NatHead, N <: XHas](to: NatToTag[NatTail, N], p: HeaderFunctor[N, NatHead]) extends NatToTag[XHasPositive[NatTail, NatHead], N] {
  override def tag(input: N): XHasPositive[NatTail, NatHead] = new XHasPositive(tail = to.tag(input), head = p.to(input))
}
