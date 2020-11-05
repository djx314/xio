package xio.helper
import xio.nat.error.NatEitherToTag

trait AllToZIO[In, -R, +E, +A] {
  def input(in: In): zio.ZIO[R, E, A]
}

object AllToZIO {
  implicit def implicit1[Err <: xio.nat.error.NatEither, R, E, A](implicit
    lift: NatEitherToTag[Err, xio.XError1[E]]
  ): AllToZIO[xio.XIO[R, Err, A], R, E, A] = new AllToZIO[xio.XIO[R, Err, A], R, E, A] {
    override def input(in: xio.XIO[R, Err, A]): zio.ZIO[R, E, A] = in.mapError(d => lift.tag(d).sureRight)
  }
  implicit def implicit2[R, E, A]: AllToZIO[zio.ZIO[R, E, A], R, E, A] = new AllToZIO[zio.ZIO[R, E, A], R, E, A] {
    override def input(in: zio.ZIO[R, E, A]): zio.ZIO[R, E, A] = in
  }
  implicit def implicit3[R, E, A]: AllToZIO[E, R, E, A] = new AllToZIO[E, R, E, A] {
    override def input(in: E): zio.ZIO[R, E, A] = zio.ZIO.fail(in)
  }
}
