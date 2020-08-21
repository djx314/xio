package xio


trait XHas extends xio.nat.has.XHasProjection {
  self =>
  type Plus[I <: XHas] <: XHas
  type RePlus[I <: XHas] <: XHas

  def plus[I <: XHas](i: I): Plus[I]
  def rePlus[I <: XHas](i: I): RePlus[I]
}

object XHas extends xio.nat.has.XHasProjectionApply

package nat.has {
  class XHasZero extends XHas {
    self =>
    override type Plus[I <: XHas] = I
    override type RePlus[I <: XHas] = I #Plus[XHasZero]
    override def plus[I <: XHas](i: I): I = i
    override def rePlus[I <: XHas](i: I): I #Plus[XHasZero] = i.plus(self)
    override def toString: String         = "XHasZero"
  }

  object XHasZero extends XHasZero

  class XHasPositive[Tail <: XHas, Head](val tail: Tail, val head: Head) extends XHas {
    self =>
    override type Plus[I <: XHas] = XHasPositive[Tail#Plus[I], Head]
    type RePlus[I <: XHas] = I#Plus[XHasPositive[Tail,Head]]
    override def plus[I <: XHas](i: I): XHasPositive[Tail#Plus[I], Head]              = new XHasPositive(tail.plus(i), head)
    override def rePlus[I <: XHas](i: I): I#Plus[XHasPositive[Tail,Head]] = i.plus(self)
    def get[P](implicit headerFunctor: HeaderFunctor[XHasPositive[Tail, Head], P]): P = headerFunctor.to(self)

    override def toString: String = s"${tail} :: ${head}"
  }
}
