import xio.helper.XIOErrorHelper
import xio.nat.error.{NatEither, NatEitherToTag}
import zio._

import scala.language.implicitConversions

package object xio extends XErrorAlias with XIOErrorHelper {

  /*def mapError[E1, ESUM <: NatEither](
                                         n: (E1, NatEitherSetter.NatEitherApply[ESUM]) => ESUM
                                       )(implicit nm: NatEitherToTag[L, NatEitherPositive[ESUM, E1]]): ZIO[I, ESUM, R] =
      zio.mapError(l => nm.tag(l).either.fold(identity, e1 => n(e1, new NatEitherSetter.NatEitherApply)))*/

  implicit class XIOStartErrorImplicitClass1_1[II, LL, RR](private val xio: ZIO[II, LL, RR]) {
    def startError(implicit isNot: IsNotNatEither[LL]): XIO[II, XError1[LL], RR] = new XIO(xio.mapError(i => XError1(i)))
  }

  implicit class XIOStartErrorImplicitClass2_1[II, RR](private val xio: ZIO[II, Nothing, RR]) {
    def startError: XIO[II, XError0, RR] = new XIO(xio)
  }

  implicit class XIOStartErrorImplicitClass3_1[I, L <: NatEither, R](private val xio: ZIO[I, L, R]) {
    def toXIO: XIO[I, L, R] = new XIO(xio)
  }

  implicit class XIOEndErrorImplicitClass1[I, L, R](private val zio: XIO[I, XError1[L], R]) {
    def endError(implicit isNot: IsNotNatEither[L]): ZIO[I, L, R] = zio.toZIO.mapError(s => s.sureRight)
  }

  implicit class XIOEndErrorImplicitClass2[I, R](private val zio: XIO[I, XError0, R]) {
    def endError: ZIO[I, Nothing, R] = zio.toZIO.asInstanceOf[ZIO[I, Nothing, R]]
  }

  implicit def zioCompat1[I, L <: NatEither, R, I2 <: I, E2 <: NatEither, O2 >: R](xio: XIO[I, L, R])(implicit v: NatEitherToTag[L, E2]): XIO[I, E2, R] =
    new XIO(xio.toZIO.mapError(v.tag))

}
