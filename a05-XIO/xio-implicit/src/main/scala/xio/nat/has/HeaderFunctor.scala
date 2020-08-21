package xio.nat.has

import xio.XHas

trait HeaderFunctor[NN <: XHas, HeadR] {
  def to(t: NN): HeadR
}

object HeaderFunctor extends HeaderFunctorImplicit1 {
  implicit def implicit1[HeadT, Tail <: XHas]: HeaderFunctor[XHasPositive[Tail, HeadT], HeadT] =
    new HeaderFunctor[XHasPositive[Tail, HeadT], HeadT] {
      override def to(t: XHasPositive[Tail, HeadT]): HeadT = t.head
    }
}

trait HeaderFunctorImplicit1 {
  implicit def implicit2[HeadT, HeadR, Tail <: XHas](implicit tailH: HeaderFunctor[Tail, HeadR]): HeaderFunctor[XHasPositive[Tail, HeadT], HeadR] =
    new HeaderFunctor[XHasPositive[Tail, HeadT], HeadR] {
      override def to(t: XHasPositive[Tail, HeadT]): HeadR = tailH.to(t.tail)
    }
}
