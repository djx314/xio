package xio.nat

trait NatContent[T1 <: Nat, T2 <: Nat] {
  def content(t: T1): T2
}

object NatContent {

  implicit def natContentImplicit[N <: Nat, R2 <: Nat](implicit
    cv1: NatToTag[R2, N]
  ): NatContent[N, R2] =
    new NatContent[N, R2] {
      override def content(n: N): R2 = cv1.tag(n)
    }

}
