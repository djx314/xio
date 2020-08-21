package xio.nat.error

import xio.XError

import scala.language.implicitConversions

class NatEitherContent[N1 <: XError](val n: N1)

object NatEitherContent {
  class NatEitherContentApply[N1 <: XError] {
    def apply[I1](item: I1)(implicit natEitherSetter: NatEitherSetter[N1, I1]): NatEitherContent[N1] = new NatEitherContent(natEitherSetter.put(item))
  }

  def apply[N1 <: XError]: NatEitherContentApply[N1] = new NatEitherContentApply[N1]

  implicit def natContentImplicit[N <: XError, R2 <: XError](n: NatEitherContent[N])(implicit cv1: NatEitherToTag[N, R2]): NatEitherContent[R2] =
    new NatEitherContent(cv1.tag(n.n))
}
