package xio.nat

trait NatEither {
  type Next[I] <: NatEither
}

class NatEitherFirst[I](val one: I) extends NatEither {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherFirst[I], I1]
  override def toString: String = s"First(${one})"
}

class NatEitherPositive[Pre <: NatEither, I](val either: Either[Pre, I]) extends NatEither {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherPositive[Pre, I], I1]
  override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
}
