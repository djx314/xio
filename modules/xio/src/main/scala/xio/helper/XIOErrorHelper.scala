package xio.helper
import xio._
trait XIOErrorHelper {
  implicit class XIOErrorMatchAll1ImplicitClass1[X, E1, I](i: xio.XIO[X, xio.XError1[E1], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] = new XIOErrorHelperInstance.MatchAll1Apply1Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply1[P, E1, X, I]                        = new XIOErrorHelperInstance3.MatchAll1Apply1Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass2[X, E1, E2, I](i: xio.XIO[X, xio.XError2[E1, E2], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] = new XIOErrorHelperInstance.MatchAll1Apply2Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply2[P, E1, E2, X, I]                        = new XIOErrorHelperInstance3.MatchAll1Apply2Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass3[X, E1, E2, E3, I](i: xio.XIO[X, xio.XError3[E1, E2, E3], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] = new XIOErrorHelperInstance.MatchAll1Apply3Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply3[P, E1, E2, E3, X, I]                        = new XIOErrorHelperInstance3.MatchAll1Apply3Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass4[X, E1, E2, E3, E4, I](i: xio.XIO[X, xio.XError4[E1, E2, E3, E4], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] = new XIOErrorHelperInstance.MatchAll1Apply4Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply4[P, E1, E2, E3, E4, X, I]                        = new XIOErrorHelperInstance3.MatchAll1Apply4Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass5[X, E1, E2, E3, E4, E5, I](i: xio.XIO[X, xio.XError5[E1, E2, E3, E4, E5], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] = new XIOErrorHelperInstance.MatchAll1Apply5Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I]                        = new XIOErrorHelperInstance3.MatchAll1Apply5Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass6[X, E1, E2, E3, E4, E5, E6, I](i: xio.XIO[X, xio.XError6[E1, E2, E3, E4, E5, E6], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply6Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] = new XIOErrorHelperInstance3.MatchAll1Apply6Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass7[X, E1, E2, E3, E4, E5, E6, E7, I](i: xio.XIO[X, xio.XError7[E1, E2, E3, E4, E5, E6, E7], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply7Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] = new XIOErrorHelperInstance3.MatchAll1Apply7Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass8[X, E1, E2, E3, E4, E5, E6, E7, E8, I](i: xio.XIO[X, xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply8Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] = new XIOErrorHelperInstance3.MatchAll1Apply8Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass9[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, I](i: xio.XIO[X, xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply9Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] = new XIOErrorHelperInstance3.MatchAll1Apply9Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass10[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, I](
    i: xio.XIO[X, xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply10Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] = new XIOErrorHelperInstance3.MatchAll1Apply10Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass11[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, I](
    i: xio.XIO[X, xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply11Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply11Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass12[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, I](
    i: xio.XIO[X, xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply12Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply12Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass13[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, I](
    i: xio.XIO[X, xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply13Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply13Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass14[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, I](
    i: xio.XIO[X, xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply14Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply14Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass15[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, I](
    i: xio.XIO[X, xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply15Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply15Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass16[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, I](
    i: xio.XIO[X, xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply16Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply16Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass17[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, I](
    i: xio.XIO[X, xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply17Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply17Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass18[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, I](
    i: xio.XIO[X, xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply18Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply18Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass19[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, I](
    i: xio.XIO[X, xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply19Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply19Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass20[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, I](
    i: xio.XIO[X, xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply20Impl(i)
    def allErrorToZIO[P]: XIOErrorHelperInstance3.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply20Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass21[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, I](
    i: xio.XIO[X, xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply21Impl(i)
    def allErrorToZIO[P]
      : XIOErrorHelperInstance3.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply21Impl(i)
  }
  implicit class XIOErrorMatchAll1ImplicitClass22[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, I](
    i: xio.XIO[X, xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply22Impl(i)
    def allErrorToZIO[P]
      : XIOErrorHelperInstance3.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] =
      new XIOErrorHelperInstance3.MatchAll1Apply22Impl(i)
  }
}
