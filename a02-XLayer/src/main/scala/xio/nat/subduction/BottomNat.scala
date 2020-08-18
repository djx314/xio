package xio.nat.subduction

import xio.nat.{NatPositive, NatZero}

trait BottomNat {
  type AppendBottom[T] <: BottomNat
  def appendBottom[T](t: T): AppendBottom[T]
}

class BottomNatZero extends BottomNat {
  override type AppendBottom[T] = NatPositive[NatZero, T]
  override def appendBottom[T](t: T): NatPositive[NatZero, T] = new NatPositive(NatZero, t)
}

object BottomNatZero {
  val value: BottomNatZero = new BottomNatZero
}

class BottomNatPositive[Tail <: BottomNat](val tail: Tail) extends BottomNat {
  override type AppendBottom[T] = Tail
  override def appendBottom[T](t: T): Tail = tail
}
