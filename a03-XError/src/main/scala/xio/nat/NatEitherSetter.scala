package xio.nat

trait NatEitherSetter[Ei <: NatEither, I] {
  def put(item: I): Ei
}

object NatEitherSetter extends NatEitherSetterImplicit1 {
  trait NatEitherApply[Ei <: NatEither] {
    def apply[I](item: I)(implicit nt: NatEitherSetter[Ei, I]): Ei
  }

  def set[Ei <: NatEither]: NatEitherApply[Ei] =
    new NatEitherApply[Ei] {
      override def apply[I](item: I)(implicit nt: NatEitherSetter[Ei, I]): Ei = nt.put(item)
    }

  implicit def positiveSetter[Tail <: NatEither, Head]: NatEitherSetter[NatEitherPositive[Tail, Head], Head] =
    new NatEitherSetter[NatEitherPositive[Tail, Head], Head] {
      override def put(item: Head): NatEitherPositive[Tail, Head] = new NatEitherHave(Right(item))
    }

  implicit def positiveSetterImplicit1[Head]: NatEitherSetter[NatEitherFirst[Head], Head] =
    new NatEitherSetter[NatEitherFirst[Head], Head] {
      override def put(item: Head): NatEitherFirst[Head] = new NatEitherFirst(item)
    }
}

trait NatEitherSetterImplicit1 {
  implicit def positiveSetterImplicit2[Tail <: NatEither, Head1, Head2](implicit
    iImplicit: NatEitherSetter[Tail, Head2]
  ): NatEitherSetter[NatEitherPositive[Tail, Head1], Head2] =
    new NatEitherSetter[NatEitherPositive[Tail, Head1], Head2] {
      override def put(item: Head2): NatEitherPositive[Tail, Head1] = new NatSuccess(iImplicit.put(item))
    }

}
