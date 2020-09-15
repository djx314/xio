package xio.nat

trait NatEither {
  type Next[I] <: NatEither
  type Plus[NI <: NatEither] <: NatEither
}

class NatEitherFirst[I](val one: I) extends NatEither {
  self =>
  override type Next[I1]              = NatEitherPositive[NatEitherFirst[I], I1]
  override type Plus[NI <: NatEither] = NI
  override def toString: String = s"First(${one})"
}

class NatEitherPositive[Pre <: NatEither, I](val either: Either[Pre, I]) extends NatEither {
  self =>
  override type Next[I1]              = NatEitherPositive[NatEitherPositive[Pre, I], I1]
  override type Plus[NI <: NatEither] = NatEitherPositive[Pre#Plus[NI], I]
  override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
}
