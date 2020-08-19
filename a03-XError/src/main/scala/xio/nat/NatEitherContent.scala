package xio.nat

import scala.language.implicitConversions

class NatEitherContent[N1 <: NatEither](val n: N1)

object NatEitherContent {
  class NatEitherContentApply[N1 <: NatEither] {
    def apply[I1](item: I1)(implicit natEitherSetter: NatEitherSetter[N1, I1]): NatEitherContent[N1] = new NatEitherContent(natEitherSetter.put(item))
  }

  def apply[N1 <: NatEither]: NatEitherContentApply[N1] = new NatEitherContentApply[N1]

  implicit def natContentImplicit[N <: NatEither, R2 <: NatEither](n: NatEitherContent[N])(implicit
    cv1: NatEitherToTag[N#ToTag[R2], R2],
    c: N <:< N#ToTag[R2]#NatTarget
  ): NatEitherContent[R2] = new NatEitherContent(cv1.tag(n.n))

}
