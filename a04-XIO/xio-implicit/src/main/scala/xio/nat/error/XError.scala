package xio

trait XError {
  type Plus[NI <: XError] <: XError
  type RePlus[NI <: XError] <: XError
}

package nat.error {

  final abstract class NoError private()

  class XErrorFirst[I](val one: I) extends XError {
    self =>
    override type Plus[NI <: XError] = XErrorPositive[NI, I]
    override type RePlus[NI <: XError] = NI#Plus[XErrorFirst[I]]

    override def toString: String = s"First(${one})"
  }

  class XErrorPositive[Pre <: XError, I](val either: Either[Pre, I]) extends XError {
    self =>
    override type Plus[NI <: XError] = XErrorPositive[Pre#Plus[NI], I]
    override type RePlus[NI <: XError] = NI#Plus[XErrorPositive[Pre, I]]

    override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
  }

}


