package xio

import xio.nat.error.XErrorProjection

trait XError extends XErrorProjection {
  type Plus[NI <: XError] <: XError
  type RePlus[NI <: XError] <: XError
}

package nat.error {

  final abstract class XErrorZero private () extends XError {
    override type Plus[NI <: XError]   = NI
    override type RePlus[NI <: XError] = NI#Plus[XErrorZero]

    override def toString: String = "XErrorZero"
  }

  class XErrorPositive[Pre <: XError, I](val either: Either[Pre, I]) extends XError {
    self =>
    override type Plus[NI <: XError]   = XErrorPositive[Pre#Plus[NI], I]
    override type RePlus[NI <: XError] = NI#Plus[XErrorPositive[Pre, I]]

    override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
  }

}
