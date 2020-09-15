package xio.nat.error

trait ZeroSetter[N <: NatEither] {
  def tag(k: NatEitherZero): N
}

object ZeroSetter {
  implicit val zeroNat: ZeroSetter[NatEitherZero] = new ZeroSetter[NatEitherZero] {
    override def tag(k: NatEitherZero): NatEitherZero = k
  }
  implicit def positiveNat[N <: NatEither, Head](implicit n: ZeroSetter[N]): ZeroSetter[NatEitherPositive[N, Head]] =
    new ZeroSetter[NatEitherPositive[N, Head]] {
      override def tag(k: NatEitherZero): NatEitherPositive[N, Head] = new NatEitherPositive(either = Left(n.tag(k)))
    }
}
