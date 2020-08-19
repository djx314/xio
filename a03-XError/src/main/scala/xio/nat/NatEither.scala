package xio.nat

trait NatEither {

  type Next[I] <: NatEither
  type Map[I] <: NatEither
  type Current

  def map[I](cv: Current => I): Map[I]

}

class NatEitherFirst[I](val one: I) extends NatEither {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherFirst[I], I1]
  override type Map[I]   = NatEitherFirst[I]
  override type Current  = I

  override def map[I](cv: Current => I): NatEitherFirst[I] = new NatEitherFirst[I](cv(one))

  override def toString: String = s"First(${one})"
}

object NatEitherFirst {
  type Type[I1] = NatEitherFirst[I1]
}

class NatEitherPositive[Pre <: NatEither, I](val either: Either[Pre, I]) extends NatEither {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherPositive[Pre, I], I1]
  override type Map[I]   = NatEitherPositive[Pre, I]
  override type Current  = I

  override def map[I](cv: Current => I): NatEitherPositive[Pre, I] = new NatEitherPositive(either.map(cv))

  override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
}
