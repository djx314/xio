package xio

import xio.nat.error.NatEither

class IsNotNatEitherOrNothing[T]

object IsNotNatEitherOrNothing {
  val any: IsNotNatEitherOrNothing[Any]          = new IsNotNatEitherOrNothing[Any]
  def anyInstance[T]: IsNotNatEitherOrNothing[T] = any.asInstanceOf[IsNotNatEitherOrNothing[T]]

  implicit def isNotNatEither1[T]: IsNotNatEitherOrNothing[T]              = anyInstance
  implicit def isNotNatEither2[T <: NatEither]: IsNotNatEitherOrNothing[T] = anyInstance
  implicit val isNotNatEither3: IsNotNatEitherOrNothing[Nothing]           = anyInstance
}

class IsNotNothing[T]

object IsNotNothing {
  implicit val isNotNatEither1: IsNotNothing[Nothing] = new IsNotNothing[Nothing]
}
