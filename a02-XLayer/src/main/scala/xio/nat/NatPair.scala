package xio.nat

trait NatPair {
  type NatModel <: Nat
  type NatGen <: Nat
  def natModel: NatModel
}

class NatPairZero[Model <: Nat](override val natModel: Model) extends NatPair {
  self =>
  override type NatModel = Model
  override type NatGen   = NatZero
  override def toString: String = "NatPairZero"
}

class NatPairPositive[Tail <: NatPair, HeadR](val tail: Tail) extends NatPair {
  self =>
  override type NatModel = Tail#NatModel
  override type NatGen   = NatPositive[Tail#NatGen, HeadR]
  override def natModel: Tail#NatModel = tail.natModel
  override def toString: String        = s"${tail} :: tag"
}
