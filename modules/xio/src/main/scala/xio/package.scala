import xio.helper.XIOErrorHelper
import xio.nat.error.{NatEither, NatEitherToTag}
import zio._

package object xio extends XErrorAlias with XIOErrorHelper with xio.helper.XIOPackageObjectImplicit1 {

  /*def mapError[E1, ESUM <: NatEither](
                                         n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
                                       )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): ZIO[I, ESUM, R] =
      zio.mapError(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))*/

  implicit class XIOStartErrorImplicitClass1_1[-I, L, +R](private val xio: ZIO[I, L, R]) {
    def startError(implicit isNot: IsNotNatEither[L]): XIO[I, XError1[L], R] = new XIO(xio.mapError(i => XError1(i)))
  }

  implicit class XIOStartErrorImplicitClass2_1[-I, +R](private val xio: ZIO[I, Nothing, R]) {
    def startError: XIO[I, XError0, R] = new XIO(xio.mapError(s => s: XError0)(CanFail.canFailAmbiguous1))
  }

  implicit class XIOStartErrorImplicitClass3_1[-I, L <: NatEither, +R](private val xio: ZIO[I, L, R]) {
    def toXIO: XIO[I, L, R] = new XIO(xio)
  }

  implicit class XIOEndErrorImplicitClass1[-I, L, +R](private val zio: XIO[I, XError1[L], R]) {
    def endError(implicit isNot: IsNotNatEither[L]): ZIO[I, L, R] = zio.toZIO.mapError(s => s.sureRight)
  }

  implicit class XIOEndErrorImplicitClass2[-I, +R](private val zio: XIO[I, XError0, R]) {
    def endError: ZIO[I, Nothing, R] = zio.toZIO.asInstanceOf[ZIO[I, Nothing, R]]
  }

  implicit def zioCompat1[I, L <: NatEither, R, I2 <: I, E2 <: NatEither, O2 >: R](xio: XIO[I, L, R])(implicit v: NatEitherToTag[L, E2]): XIO[I, E2, R] =
    new XIO(xio.toZIO.mapError(v.tag))

}
