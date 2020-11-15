import xio.helper.ZIOToXIOImplicit
import xio.nat.error.NatEither
import zio._

package object xio extends XErrorAlias {

  object using {
    def xio[R, E, A, R1, E1 <: NatEither, A1](zio: ZIO[R, E, A])(implicit i: ZIOToXIOImplicit[R, E, A, R1, E1, A1]): XIO[R1, E1, A1] = i.to(zio)
  }

  implicit class XIOEndErrorImplicitClass1[I, L, R](private val zio: XIO[I, XError1[L], R]) {
    def endError(implicit isNot: IsNotNatEitherOrNothing[L]): ZIO[I, L, R] = zio.mapError(s => s.sureRight)
  }

  implicit class XIOEndErrorImplicitClass2[I, R](private val xio: XIO[I, XError0, R]) {
    def endError: ZIO[I, Nothing, R] = (xio: ZIO[I, XError0, R]).asInstanceOf[ZIO[I, Nothing, R]]
  }

}
