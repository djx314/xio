package xio

import xio.nat.error.NatEither

class IsNotNatEither[T]

object IsNotNatEither {
  val any: IsNotNatEither[Any]          = new IsNotNatEither[Any]
  def anyInstance[T]: IsNotNatEither[T] = any.asInstanceOf[IsNotNatEither[T]]

  implicit def isNotNatEither1[T]: IsNotNatEither[T]              = anyInstance
  implicit def isNotNatEither2[T <: NatEither]: IsNotNatEither[T] = anyInstance
}
