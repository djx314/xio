package xio.nat

trait NatEither {

  type Next[I] <: NatEither
  type Map[I] <: NatEither
  type Current

  def nextLeft[I]: Next[I]
  def map[I](cv: Current => I): Map[I]
  def nextRight[I](item: I): Next[I]

}

class NatEitherFirst[I](val one: I) extends NatEither {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherFirst[I], I1]
  override type Map[I]   = NatEitherFirst[I]
  override type Current  = I

  override def nextLeft[I1]: NatEitherPositive[NatEitherFirst[I], I1]            = new NatEitherPositive(Left(self))
  override def map[I](cv: Current => I): NatEitherFirst[I]                       = new NatEitherFirst[I](cv(one))
  override def nextRight[I1](item: I1): NatEitherPositive[NatEitherFirst[I], I1] = new NatEitherPositive(Right(item))

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

  override def nextLeft[I1]: NatEitherPositive[NatEitherPositive[Pre, I], I1] =
    either.fold(
      pre => new NatEitherPositive(Left(new NatEitherPositive(Left(pre)))),
      data => new NatEitherPositive(Left(new NatEitherPositive[Pre, I](Right(data))))
    )
  override def map[I](cv: Current => I): NatEitherPositive[Pre, I] = new NatEitherPositive(either.map(cv))
  override def nextRight[I1](item: I1): NatEitherPositive[NatEitherPositive[Pre, I], I1] =
    either.fold(
      _ => new NatEitherPositive(Right(item)),
      data => new NatEitherPositive(Left(new NatEitherPositive(Right(data))))
    )

  override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
}
