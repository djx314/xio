package xio.nat

trait NatContent[T <: Nat] {
  def content: T
}

object NatContent {

  def apply[N <: Nat, R2 <: Nat](n: N)(implicit cv1: NatToTag[R2#ToTag], imp2: NatPairFilter.Aux[N#Multiply[R2], R2]): NatContent[R2] =
    new NatContent[R2] {
      override def content: R2 = imp2.filter(n.multiply(cv1))
    }

}
