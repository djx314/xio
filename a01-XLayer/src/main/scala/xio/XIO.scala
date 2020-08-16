package xio

import xio.nat.subduction.NatToSubduction

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
