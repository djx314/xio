package xio.nat.error

trait NatEitherSetter[Ei <: NatEither, I] {
  def put(item: I): Ei
}

object NatEitherSetter extends NatEitherSetterImplicit1 {
  class NatEitherApply[Ei <: NatEither] {
    def apply[I](item: I)(implicit nt: NatEitherSetter[Ei, I]): Ei = nt.put(item)
  }

  implicit def positiveSetter3[Tail <: NatEither, Head]: NatEitherSetter[NatEitherPositive[Tail, Head], Head] =
    new NatEitherSetter[NatEitherPositive[Tail, Head], Head] {
      override def put(item: Head): NatEitherPositive[Tail, Head] = new NatEitherPositive(Right(item))
    }
}

trait NatEitherSetterImplicit1 {
  implicit def positiveSetterImplicit2[Tail <: NatEither, Head1, Head2](implicit
    iImplicit: NatEitherSetter[Tail, Head2]
  ): NatEitherSetter[NatEitherPositive[Tail, Head1], Head2] =
    new NatEitherSetter[NatEitherPositive[Tail, Head1], Head2] {
      override def put(item: Head2): NatEitherPositive[Tail, Head1] = new NatEitherPositive(Left(iImplicit.put(item)))
    }
}
