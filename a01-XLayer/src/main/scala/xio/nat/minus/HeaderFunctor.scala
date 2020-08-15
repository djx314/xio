package xio.nat

trait AddNat {1
  type U[N <: Nat] <: Nat
}

class KeepAddNat extends AddNat {
  override type U[N <: Nat] = N
}

class NextAddNat[M] extends AddNat {
  override type U[N <: Nat] = NatPositive[N, M]
}

trait HeaderFunctor[HeadT, HeadR, NN <: AddNat] {
  def apply[N <: Nat](t: HeadT, u: N): NN#U[N]
}

object HeaderFunctor extends HeaderFunctorImplicit1 {
  implicit def implicit1[HeadT]: HeaderFunctor[HeadT, HeadT, NextAddNat[HeadT]] =
    new HeaderFunctor[HeadT, HeadT, NextAddNat[HeadT]] {
      override def apply[N <: Nat](t: HeadT, u: N): NatPositive[N, HeadT] = new NatPositive(tail = u, head = t)
    }
}

trait HeaderFunctorImplicit1 {
  implicit def implicit2[HeadT, HeadR]: HeaderFunctor[HeadT, HeadR, KeepAddNat] =
    new HeaderFunctor[HeadT, HeadR, KeepAddNat] {
      override def apply[N <: Nat](t: HeadT, u: N): N = u
    }
}
