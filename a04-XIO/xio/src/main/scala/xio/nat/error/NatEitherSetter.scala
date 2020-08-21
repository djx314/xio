package xio.nat.error

import xio.XError

trait NatEitherSetter[Ei <: XError, I] {
  def put(item: I): Ei
}

object NatEitherSetter extends NatEitherSetterImplicit1 {
  trait NatEitherApply[Ei <: XError] {
    def apply[I](item: I)(implicit nt: NatEitherSetter[Ei, I]): Ei
  }

  def set[Ei <: XError]: NatEitherApply[Ei] =
    new NatEitherApply[Ei] {
      override def apply[I](item: I)(implicit nt: NatEitherSetter[Ei, I]): Ei = nt.put(item)
    }

  implicit def positiveSetter[Tail <: XError, Head]: NatEitherSetter[XErrorPositive[Tail, Head], Head] =
    new NatEitherSetter[XErrorPositive[Tail, Head], Head] {
      override def put(item: Head): XErrorPositive[Tail, Head] = new XErrorPositive(Right(item))
    }

  implicit def positiveSetterImplicit1[Head]: NatEitherSetter[XErrorFirst[Head], Head] =
    new NatEitherSetter[XErrorFirst[Head], Head] {
      override def put(item: Head): XErrorFirst[Head] = new XErrorFirst(item)
    }
}

trait NatEitherSetterImplicit1 {
  implicit def positiveSetterImplicit2[Tail <: XError, Head1, Head2](implicit
    iImplicit: NatEitherSetter[Tail, Head2]
  ): NatEitherSetter[XErrorPositive[Tail, Head1], Head2] =
    new NatEitherSetter[XErrorPositive[Tail, Head1], Head2] {
      override def put(item: Head2): XErrorPositive[Tail, Head1] = new XErrorPositive(Left(iImplicit.put(item)))
    }
}
