package xio.nat

trait NatPair {
  type Self <: NatPair
  type NatModel <: Nat
  type NatGen <: Nat
  def selfNatPair: Self
  def natModel: NatModel
}

class NatPairZero[Model <: Nat](override val natModel: Model) extends NatPair {
  self =>
  override type Self     = NatPairZero[Model]
  override type NatModel = Model
  override type NatGen   = NatZero
  override def selfNatPair: NatPairZero[Model] = self
  override def toString: String                = "NatPairZero"
}

class NatPairPositive[Tail <: NatPair, HeadR](val tail: Tail) extends NatPair {
  self =>
  override type Self     = NatPairPositive[Tail, HeadR]
  override type NatModel = Tail#NatModel
  override type NatGen   = NatPositive[Tail#NatGen, HeadR]
  override def selfNatPair: NatPairPositive[Tail, HeadR] = self
  override def natModel: Tail#NatModel                   = tail.natModel
  override def toString: String                          = s"${tail} :: tag"
}
