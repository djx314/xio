package xio.nat

trait NatEither {

  type Next[I] <: NatEither

  def nextLeft[I]: Next[I]
  def nextRight[I](item: I): Next[I]

}

class NatEitherFirst[I](val one: I) extends NatEither {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherFirst[I], I1]

  override def nextLeft[I1]: NatEitherPositive[NatEitherFirst[I], I1]            = new NatEitherHave(Left(self))
  override def nextRight[I1](item: I1): NatEitherPositive[NatEitherFirst[I], I1] = new NatEitherHave(Right(item))

  override def toString: String = s"First(${one})"
}

object NatEitherFirst {
  type Type[I1] = NatEitherFirst[I1]
}

trait NatEitherPositive[Pre <: NatEither, I] extends NatEither {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherPositive[Pre, I], I1]

  override def nextLeft[I1]: NatEitherPositive[NatEitherPositive[Pre, I], I1]
  override def nextRight[I1](item: I1): NatEitherPositive[NatEitherPositive[Pre, I], I1]
}

class NatEitherHave[Pre <: NatEither, I](val either: Either[Pre, I]) extends NatEitherPositive[Pre, I] {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherPositive[Pre, I], I1]

  override def nextLeft[I1]: NatEitherPositive[NatEitherPositive[Pre, I], I1] =
    either.fold(
      pre => new NatEitherHave(Left(new NatEitherHave(Left(pre)))),
      data => new NatSuccess(new NatEitherHave(Right(data)))
    )
  override def nextRight[I1](item: I1): NatEitherPositive[NatEitherPositive[Pre, I], I1] =
    either.fold(
      _ => new NatEitherHave(Right(item)),
      data => new NatSuccess(new NatEitherHave(Right(data)))
    )

  override def toString: String = s"${either}"
}

class NatSuccess[Pre <: NatEither, I](val pre: Pre) extends NatEitherPositive[Pre, I] {
  self =>
  override type Next[I1] = NatEitherPositive[NatEitherPositive[Pre, I], I1]

  override def nextLeft[I1]: NatEitherPositive[NatEitherPositive[Pre, I], I1]            = new NatSuccess(self)
  override def nextRight[I1](item: I1): NatEitherPositive[NatEitherPositive[Pre, I], I1] = new NatSuccess(self)

  override def toString: String = s"${pre} :: success"
}
