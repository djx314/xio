package xio.nat.error

trait NatEitherReversePlus[N2 <: NatEither, N1 <: NatEither] {
  type PluI = N1#Plus[N2]
  def plus(t1: PluI): Either[N1, N2]
  def takeHead(t1: N1): PluI
  def takeTail(t1: N2): PluI
}

object NatEitherReversePlus {
  implicit def firstNat[N2 <: NatEither, F](implicit n: ZeroSetter[N2]): NatEitherReversePlus[N2, NatEitherZero] = new NatEitherReversePlusFirst(n = n)
  implicit def positiveNat[N1Tail <: NatEither, N1Head, N2 <: NatEither](implicit
    n: NatEitherReversePlus[N2, N1Tail]
  ): NatEitherReversePlus[N2, NatEitherPositive[N1Tail, N1Head]] =
    new NatEitherReversePlusPositive(tail = n)
}

class NatEitherReversePlusFirst[N2 <: NatEither](n: ZeroSetter[N2]) extends NatEitherReversePlus[N2, NatEitherZero] {
  override type PluI = N2
  override def plus(t1: N2): Either[NatEitherZero, N2] = Right(t1)
  override def takeHead(t1: NatEitherZero): N2         = n.tag(t1)
  override def takeTail(t1: N2): N2                    = t1
}

class NatEitherReversePlusPositive[N1Tail <: NatEither, N1Head, N2 <: NatEither](val tail: NatEitherReversePlus[N2, N1Tail])
    extends NatEitherReversePlus[N2, NatEitherPositive[N1Tail, N1Head]] {
  override type PluI = NatEitherPositive[N1Tail#Plus[N2], N1Head]
  override def plus(t1: NatEitherPositive[N1Tail#Plus[N2], N1Head]): Either[NatEitherPositive[N1Tail, N1Head], N2] =
    t1.either.fold(n => tail.plus(n).left.map(u => new NatEitherPositive(either = Left(u))), n => Left(new NatEitherPositive(Right(n))))
  override def takeHead(t1: NatEitherPositive[N1Tail, N1Head]): NatEitherPositive[N1Tail#Plus[N2], N1Head] =
    t1.either.fold(n => new NatEitherPositive(Left(tail.takeHead(n))), n => new NatEitherPositive(Right(n)))
  override def takeTail(t1: N2): NatEitherPositive[N1Tail#Plus[N2], N1Head] = new NatEitherPositive(Left(tail.takeTail(t1)))
}
