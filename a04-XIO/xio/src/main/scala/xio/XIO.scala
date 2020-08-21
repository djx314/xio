package xio

import xio.nat.error.XErrorReversePlus
import xio.nat.has.XHasReversePlus
import zio.ZIO

import scala.language.implicitConversions

trait XIO[I <: XHas, L <: XError, R] {
  self =>
  def zio: ZIO[I, L, R]
  def map[E1](cv: R => E1): XIO[I, L, E1] =
    new XIO[I, L, E1] {
      override def zio: ZIO[I, L, E1] = self.zio.map(cv)
    }
  def flatMap[I1 <: XHas, L1 <: XError, E1](cv: R => XIO[I1, L1, E1])(implicit v: XHasReversePlus[I, I1], n: XErrorReversePlus[L, L1]): XIO[I1#Plus[I], L1#Plus[L], E1] =
    new XIO[I1#Plus[I], L1#Plus[L], E1] {
      override def zio: ZIO[I1#Plus[I], L1#Plus[L], E1] =
        for {
          plus <- ZIO.identity[I1#Plus[I]]
          r    <- self.zio.provide(v.takeTail(plus)).mapError(e => n.takeTail(e))
          r1   <- cv(r).zio.provide(v.takeHead(plus)).mapError(e => n.takeHead(e))
        } yield r1
    }
}

object XIO {

  /*implicit def xioImplicit[I1 <: XHas, I2 <: XHas, E](i: XIO[I1, E])(implicit cv: NatToTag[I1, I2]): XIO[I2, E] =
    new XIO[I2, E] {
      override def in(n: I2): E = i.in(cv.tag(n))
    }*/

  def identity[T <: XHas]: XIO[T, Nothing, T] =
    new XIO[T, Nothing, T] {
      override def zio: ZIO[T, Nothing, T] = ZIO.identity[T]
    }

}
