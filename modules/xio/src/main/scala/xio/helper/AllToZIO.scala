package xio.helper
import xio.nat.error.NatEitherToTag

trait AllToZIO[In, R, E, A] {
  def input(in: In): zio.ZIO[R, E, A]
}

object AllToZIO {
  implicit def implicit1[R1 >: R, A1 <: A, Err <: xio.nat.error.NatEither, R, E, A](implicit
    lift: NatEitherToTag[Err, xio.XError1[E]]
  ): AllToZIO[xio.XIO[R1, Err, A1], R, E, A] = new AllToZIO[xio.XIO[R1, Err, A1], R, E, A] {
    override def input(in: xio.XIO[R1, Err, A1]): zio.ZIO[R, E, A] = in.mapError(d => lift.tag(d).sureRight)
  }
  implicit def implicit2[R1 >: R, A1 <: A, R, E, A]: AllToZIO[zio.ZIO[R1, E, A1], R, E, A] = new AllToZIO[zio.ZIO[R1, E, A1], R, E, A] {
    override def input(in: zio.ZIO[R1, E, A1]): zio.ZIO[R, E, A] = in
  }
  implicit def implicit3[R, E, A]: AllToZIO[E, R, E, A] = new AllToZIO[E, R, E, A] {
    override def input(in: E): zio.ZIO[R, E, A] = zio.ZIO.fail(in)
  }
}
