package xio

trait XError[I <: nat.NatEither, E] {
  self =>
  def in(n: I): E
}
