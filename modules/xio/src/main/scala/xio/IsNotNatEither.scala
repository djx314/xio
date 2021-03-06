package xio

import xio.nat.error.NatEither

class IsNotNatEitherOrNothing[T]

object IsNotNatEitherOrNothing {
  val any: IsNotNatEitherOrNothing[Any]          = new IsNotNatEitherOrNothing[Any]
  def anyInstance[T]: IsNotNatEitherOrNothing[T] = any.asInstanceOf[IsNotNatEitherOrNothing[T]]

  implicit def isNotNatEither1[T]: IsNotNatEitherOrNothing[T]              = anyInstance
  implicit def isNotNatEither2[T <: NatEither]: IsNotNatEitherOrNothing[T] = anyInstance
  implicit def isNotNatEither3[T <: NatEither]: IsNotNatEitherOrNothing[T] = anyInstance
  implicit val isNotNatEither4: IsNotNatEitherOrNothing[Nothing]           = anyInstance
  implicit val isNotNatEither5: IsNotNatEitherOrNothing[Nothing]           = anyInstance
}

class IsNotNothing[T]

object IsNotNothing {
  implicit def isNotNatEither1[T]: IsNotNothing[T]    = isNotNatEither2.asInstanceOf[IsNotNothing[T]]
  implicit val isNotNatEither2: IsNotNothing[Nothing] = new IsNotNothing[Nothing]
  implicit val isNotNatEither3: IsNotNothing[Nothing] = new IsNotNothing[Nothing]
}
