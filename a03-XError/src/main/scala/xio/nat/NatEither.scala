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
  override type Map[I1]  = NatEitherFirst[I1]
  override type Current  = I

  override def map[I1](cv: Current => I1): NatEitherFirst[I1] = new NatEitherFirst(cv(one))

  override def toString: String = s"First(${one})"
}

object NatEitherFirst {
  type Type[I1] = NatEitherFirst[I1]
}

class NatEitherPositive[Pre <: NatEither, I](val either: Either[Pre, I]) extends NatEither {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherPositive[Pre, I], I1]
  override type Map[I1]  = NatEitherPositive[Pre, I1]
  override type Current  = I

  override def map[I1](cv: Current => I1): NatEitherPositive[Pre, I1] = new NatEitherPositive(either.map(cv))

  override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
}