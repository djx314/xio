package xio.nat.subduction

trait BottomNat {
  type Next[T] <: BottomNat
  def next[T](t: T): Next[T]
}

class BottomNatPositive[Tail <: BottomNat](val tail: Tail) extends BottomNat {
  override type Next[T] = Tail
  override def next[T](t: T): Tail = tail
}
