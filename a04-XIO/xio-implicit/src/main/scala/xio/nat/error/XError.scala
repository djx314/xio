package xio

trait XError {
  type Plus[NI <: XError] <: XError
  type RePlus[NI <: XError] <: XError
}

package nat.error {

  trait XErrorHas[Current] extends XError {
    type HasPlus[NI <: XErrorHas[I], I] <: XErrorHas[Current]
    type HasRePlus[NI <: XErrorHas[I], I] <: XErrorHas[I]
    type Plus[NI <: XError] <: XError
    type RePlus[NI <: XError] <: XError
  }

  class XErrorFirst[I](val one: I) extends XErrorHas[I] {
    self =>
    override type HasPlus[NI <: XErrorHas[I1], I1] = XErrorPositive[NI, I]
    override type HasRePlus[NI <: XErrorHas[I1], I1] = NI#HasPlus[XErrorFirst[I], I]
    override type Plus[NI <: XError] = XErrorPositive[NI, I]
    override type RePlus[NI <: XError] = NI#Plus[XErrorFirst[I]]

    override def toString: String = s"First(${one})"
  }

  class XErrorPositive[Pre <: XError, I](val either: Either[Pre, I]) extends XErrorHas[I] {
    self =>
    override type HasPlus[NI <: XErrorHas[I1], I1] = XErrorPositive[Pre#Plus[NI], I]
    override type HasRePlus[NI <: XErrorHas[I1], I1] = NI#HasPlus[XErrorPositive[Pre, I],I]
    override type Plus[NI <: XError] = XErrorPositive[Pre#Plus[NI], I]
    override type RePlus[NI <: XError] = NI#Plus[XErrorPositive[Pre, I]]

    override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
  }

}


