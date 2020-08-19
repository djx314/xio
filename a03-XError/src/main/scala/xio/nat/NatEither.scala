package xio.nat

trait NatEither {

  type Next[I] <: NatEither
  type ToTag[N <: NatEither] <: TagNatEitherM[N]

}

class NatEitherFirst[I](val one: I) extends NatEither {
  self =>
  override type Next[I1]              = NatEitherPositive[NatEitherFirst[I], I1]
  override type ToTag[N <: NatEither] = TagNatEitherPositive[N, NatEitherFirst[I]]

  override def toString: String = s"First(${one})"
}

object NatEitherFirst {
  type Type[I1] = NatEitherFirst[I1]
}

class NatEitherPositive[Pre <: NatEither, I](val either: Either[Pre, I]) extends NatEither {
  self =>
  override type Next[I1]              = NatEitherPositive[NatEitherPositive[Pre, I], I1]
  override type ToTag[N <: NatEither] = TagNatEitherPositive[N, NatEitherPositive[Pre, I]]

  override def toString: String = either.fold(pre => s"${pre} :: success", i => s"Right(${i})")
}
