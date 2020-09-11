package xio

import xio.helper.XIOHelper
import xio.nat.error.NatEitherSetter

trait ErrorContent[T, I <: xio.nat.error.NatEither, P] {
  def error: T
  def inputError[N](n: N)(implicit i: NatEitherSetter[I, N]): XIO[XHas0, I, P] = XIOHelper.simpleFail(i.put(n))
  def lift[N](n: N)(implicit i: NatEitherSetter[I, N]): I                      = i.put(n)
}

class ErrorContentImpl[T, I <: xio.nat.error.NatEither, P](override val error: T) extends ErrorContent[T, I, P]
