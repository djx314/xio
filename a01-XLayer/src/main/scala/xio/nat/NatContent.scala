package xio.nat

trait NatContent[T1 <: Nat, T2 <: Nat] {
  def content(t: T1): T2
}

object NatContent {

  implicit def natContentImplicit[N <: Nat, R2 <: Nat](implicit cv1: NatToTag[R2#ToTag], imp2: NatPairFilter.Aux[N#Multiply[R2], R2]): NatContent[N, R2] =
    new NatContent[N, R2] {
      override def content(n: N): R2 = imp2.filter(n.multiply(cv1))
    }

}
