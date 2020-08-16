package xio

import xio.nat.NatContent
import xio.nat.subduction.NatToSubduction
import scala.language.implicitConversions

trait XIO[I <: nat.Nat, E] {
  self =>
  def in(n: I): E
  def map[E1](cv: E => E1): XIO[I, E1] =
    new XIO[I, E1] {
      override def in(n: I): E1 = cv(self.in(n))
    }
  def flatMap[I1 <: nat.Nat, E1](cv: E => XIO[I1, E1])(implicit v: NatToSubduction[I, I1]): XIO[I1#Plus[I], E1] =
    new XIO[I1#Plus[I], E1] {
      override def in(n: I1#Plus[I]): E1 = {
        cv(self.in(v.takeHead(n))).in(v.takeTail(n))
      }
    }
}

object XIO {

  implicit def xioImplicit[I1 <: nat.Nat, I2 <: nat.Nat, E](i: XIO[I1, E])(implicit cv: NatContent[I2, I1]): XIO[I2, E] =
    new XIO[I2, E] {
      override def in(n: I2): E = i.in(cv.content(n))
    }

  def identity[T <: nat.Nat]: XIO[T, T] = s => s

}
