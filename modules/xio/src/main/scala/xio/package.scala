import xio.nat.error.{NatEither, NatEitherPositive, NatEitherReversePlus, NatEitherSetter, NatEitherToTag}
import zio._

package object xio extends XErrorAlias {

  type XIO[-I, L, +R] = ZIO[I, L, R]

  implicit class XIOImplicitClass[-I, L <: NatEither, +R](private val zio: XIO[I, L, R]) extends AnyVal {
    self =>

    def toXIO: XIO[I, L, R] = zio

    def flatMap[R1 <: I, E1 <: NatEither, B](k: R => ZIO[R1, E1, B])(implicit n: NatEitherReversePlus[L, E1]): ZIO[R1, E1#Plus[L], B] =
      zio.mapError(n.takeTail).flatMap(i => k(i).mapError(n.takeHead))

    def liftError[E1 <: NatEither](implicit nm: NatEitherToTag[L, E1]): ZIO[I, E1, R] = zio.mapError(nm.tag)

    /*def mapError[E1, ESUM <: NatEither](
                                         n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
                                       )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): ZIO[I, ESUM, R] =
      zio.mapError(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))*/

    final def provideLayer[E1, R0, R1](
      layer: ZLayer[R0, E1, R1]
    )(implicit ev1: R1 <:< I, ev2: NeedsEnv[I]): ZIO[R0, NatEitherPositive[L, E1], R] =
      zio.mapError(s => new NatEitherPositive[L, E1](Left(s))).provideLayer(layer.mapError(s => new NatEitherPositive[L, E1](Right(s))))

    final def xeither: ZIO[I, XError0, Either[L, R]] = zio.either

  }

  implicit class XIOStartErrorImplicitClass1[-I, L, +R](private val xio: XIO[I, L, R]) extends AnyVal {
    def startError(implicit i: CanFail[L]): XIO[I, XError1[L], R] = xio.mapError(s => XError1(s))
  }

  implicit class XIOStartErrorImplicitClass2[-I, +R](private val xio: XIO[I, Nothing, R]) extends AnyVal {
    def startError: XIO[I, XError0, R] = xio.mapError(s => s: XError0)(CanFail.canFailAmbiguous1)
  }

  implicit class XIOEndErrorImplicitClass1[-I, L, +R](private val zio: XIO[I, XError1[L], R]) extends AnyVal {
    def endError: XIO[I, L, R] = zio.mapError(s => s.sureRight)
  }

  implicit class XIOEndErrorImplicitClass2[-I, L, +R](private val zio: XIO[I, XError0, R]) extends AnyVal {
    def endError: XIO[I, Nothing, R] = zio.asInstanceOf[ZIO[I, Nothing, R]]
  }

  implicit def zioCompat1[I, L <: NatEither, R, I2 <: I, E2 <: NatEither, O2 >: R](xio: XIO[I, L, R])(implicit v: NatEitherToTag[L, E2]): XIO[I, E2, R] =
    xio.mapError(v.tag)

}
