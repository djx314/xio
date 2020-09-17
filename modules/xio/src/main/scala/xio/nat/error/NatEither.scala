package xio.nat.error

trait NatEither {
  type Plus[NI <: NatEither] <: NatEither
  type RePlus[NI <: NatEither] <: NatEither
}

final abstract class NatEitherZero private () extends NatEither {
  override type Plus[NI <: NatEither]   = NI
  override type RePlus[NI <: NatEither] = NI#Plus[NatEitherZero]
  override def toString: String = "NatEitherZero"
}

class NatEitherPositive[Pre <: NatEither, I](val either: Either[Pre, I]) extends NatEither {
  override type Plus[NI <: NatEither]   = NatEitherPositive[Pre#Plus[NI], I]
  override type RePlus[NI <: NatEither] = NI#Plus[NatEitherPositive[Pre, I]]
  override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
}

object NatEitherPositive {
  implicit class sureRightImplicitClass[I](i: NatEitherPositive[NatEitherZero, I]) {
    def sureRight: I = xio.helper.EitherHelper.getRight(i.either)
  }
}
