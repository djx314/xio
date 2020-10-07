package xio

import xio.nat.error.NatEither

class IsNotNatEitherOrNothing[T]

object IsNotNatEitherOrNothing {
  val any: IsNotNatEitherOrNothing[Any]          = new IsNotNatEitherOrNothing[Any]
  def anyInstance[T]: IsNotNatEitherOrNothing[T] = any.asInstanceOf[IsNotNatEitherOrNothing[T]]

  implicit def isNotNatEither1[T]: IsNotNatEitherOrNothing[T]              = anyInstance
  implicit def isNotNatEither2[T <: NatEither]: IsNotNatEitherOrNothing[T] = anyInstance
  implicit val isNotNatEither3: IsNotNatEitherOrNothing[Nothing] = anyInstance
}

class IsNatEither[T]

object IsNatEither {
  val any: IsNatEither[Any]          = new IsNatEither[Any]
  def anyInstance[T]: IsNatEither[T] = any.asInstanceOf[IsNatEither[T]]

  implicit def isNotNatEither1[T <: NatEither]: IsNatEither[T] = anyInstance
}

class IsNothing[T]

object IsNothing {
  implicit val isNotNatEither1: IsNothing[Nothing]              = new IsNothing[Nothing]
}