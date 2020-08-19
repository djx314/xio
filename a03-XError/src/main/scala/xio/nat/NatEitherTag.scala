package xio.nat

trait TagNatEitherM[Model <: NatEither] {
  type NatTarget <: NatEither
}

class TagNatEitherPositive[Model <: NatEither, Tail <: NatEither] extends TagNatEitherM[Model] {
  self =>
  override type NatTarget = Tail
}
