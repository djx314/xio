import xio.helper.XIOErrorHelper
import xio.nat.error.{NatEither, NatEitherToTag}
import zio._

package object xio extends XErrorAlias with XIOErrorHelper with xio.helper.XIOPackageObjectImplicit1 {

  implicit class XIOImplicitClass[-I, L <: NatEither, +R](private val zio: XIO[I, L, R]) {
    self =>

    def liftError[E1 <: NatEither](implicit nm: NatEitherToTag[L, E1]): ZIO[I, E1, R] = zio.toZIO.mapError(nm.tag)

    /*def mapError[E1, ESUM <: NatEither](
                                         n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
                                       )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): ZIO[I, ESUM, R] =
      zio.mapError(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))*/

  }

  implicit class XIOStartErrorImplicitClass1[-I, L <: NatEither, +R](private val xio: ZIO[I, L, R]) {
    def startError: XIO[I, L, R] = new XIO(xio)
  }

  implicit class XIOStartErrorImplicitClass2[-I, +R](private val xio: ZIO[I, Nothing, R]) {
    def startError: XIO[I, XError0, R] = new XIO(xio.mapError(s => s: XError0)(CanFail.canFailAmbiguous1))
  }

  implicit class XIOEndErrorImplicitClass1[-I, L, +R](private val zio: XIO[I, XError1[L], R]) {
    def endError: ZIO[I, L, R] = zio.toZIO.mapError(s => s.sureRight)
  }

  implicit class XIOEndErrorImplicitClass2[-I, L, +R](private val zio: XIO[I, XError0, R]) {
    def endError: ZIO[I, Nothing, R] = zio.toZIO.asInstanceOf[ZIO[I, Nothing, R]]
  }

  implicit def zioCompat1[I, L <: NatEither, R, I2 <: I, E2 <: NatEither, O2 >: R](xio: XIO[I, L, R])(implicit v: NatEitherToTag[L, E2]): XIO[I, E2, R] =
    new XIO(xio.toZIO.mapError(v.tag))

  implicit def XIOToZIOImplicitClass1[I, L <: NatEither, R](i: XIO[I, L, R]): ZIO[I, L, R] = i.toZIO

}
