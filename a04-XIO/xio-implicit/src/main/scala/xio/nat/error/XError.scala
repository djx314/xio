package xio

trait XError {
  type Plus[NI <: XError] <: XError
  type RePlus[NI <: XError] <: XError
}

package nat.error {

  final abstract class XErrorZero private () extends XError {
    type Plus[NI <: XError] = NI
    type RePlus[NI <: XError] = NI
  }

  trait XErrorHas extends XError {
    type Current
    type Plus[NI <: XError] <: XError
    type RePlus[NI <: XError] <: XError
  }

  class XErrorFirst[I](val one: I) extends XErrorHas {
    self =>
    override type Current = I
    override type Plus[NI <: XError] = XErrorPositive[NI, I]
    override type RePlus[NI <: XError] = NI#Plus[XErrorFirst[I]]

    override def toString: String = s"First(${one})"
  }

  class XErrorPositive[Pre <: XError, I](val either: Either[Pre, I]) extends XErrorHas {
    self =>
    override type Current = I
    override type Plus[NI <: XError] = XErrorPositive[Pre#Plus[NI], I]
    override type RePlus[NI <: XError] = NI#Plus[XErrorPositive[Pre, I]]

    override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
  }

}


