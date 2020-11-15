package xio.helper
object XIOErrorHelperInstance2 {
  def errorCompat1[P <: xio.nat.error.NatEither, E1, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    u: xio.XError1[E1]
  ): xio.XIO[Input, P, Out] = e1(new xio.ErrorContentImpl(u.sureRight))
  def errorCompat2[P <: xio.nat.error.NatEither, E1, E2, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    u: xio.XError2[E1, E2]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat1(e1, ii1), ii2 => e2(new xio.ErrorContentImpl(ii2)))
  def errorCompat3[P <: xio.nat.error.NatEither, E1, E2, E3, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    u: xio.XError3[E1, E2, E3]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat2(e1, e2, ii1), ii2 => e3(new xio.ErrorContentImpl(ii2)))
  def errorCompat4[P <: xio.nat.error.NatEither, E1, E2, E3, E4, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    u: xio.XError4[E1, E2, E3, E4]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat3(e1, e2, e3, ii1), ii2 => e4(new xio.ErrorContentImpl(ii2)))
  def errorCompat5[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    u: xio.XError5[E1, E2, E3, E4, E5]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat4(e1, e2, e3, e4, ii1), ii2 => e5(new xio.ErrorContentImpl(ii2)))
  def errorCompat6[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    u: xio.XError6[E1, E2, E3, E4, E5, E6]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat5(e1, e2, e3, e4, e5, ii1), ii2 => e6(new xio.ErrorContentImpl(ii2)))
  def errorCompat7[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    u: xio.XError7[E1, E2, E3, E4, E5, E6, E7]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat6(e1, e2, e3, e4, e5, e6, ii1), ii2 => e7(new xio.ErrorContentImpl(ii2)))
  def errorCompat8[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    u: xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat7(e1, e2, e3, e4, e5, e6, e7, ii1), ii2 => e8(new xio.ErrorContentImpl(ii2)))
  def errorCompat9[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    u: xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat8(e1, e2, e3, e4, e5, e6, e7, e8, ii1), ii2 => e9(new xio.ErrorContentImpl(ii2)))
  def errorCompat10[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    u: xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat9(e1, e2, e3, e4, e5, e6, e7, e8, e9, ii1), ii2 => e10(new xio.ErrorContentImpl(ii2)))
  def errorCompat11[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    u: xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat10(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, ii1), ii2 => e11(new xio.ErrorContentImpl(ii2)))
  def errorCompat12[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    u: xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat11(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, ii1), ii2 => e12(new xio.ErrorContentImpl(ii2)))
  def errorCompat13[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    u: xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat12(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, ii1), ii2 => e13(new xio.ErrorContentImpl(ii2)))
  def errorCompat14[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    u: xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]
  ): xio.XIO[Input, P, Out] = u.either.fold(ii1 => errorCompat13(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, ii1), ii2 => e14(new xio.ErrorContentImpl(ii2)))
  def errorCompat15[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    u: xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat14(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, ii1), ii2 => e15(new xio.ErrorContentImpl(ii2)))
  def errorCompat16[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    u: xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat15(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, ii1), ii2 => e16(new xio.ErrorContentImpl(ii2)))
  def errorCompat17[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    u: xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat16(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, ii1), ii2 => e17(new xio.ErrorContentImpl(ii2)))
  def errorCompat18[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    u: xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat17(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, ii1), ii2 => e18(new xio.ErrorContentImpl(ii2)))
  def errorCompat19[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input, P, Out],
    u: xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]
  ): xio.XIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat18(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, ii1), ii2 => e19(new xio.ErrorContentImpl(ii2)))
  def errorCompat20[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input, P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input, P, Out],
    u: xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]
  ): xio.XIO[Input, P, Out] = u.either
    .fold(ii1 => errorCompat19(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, ii1), ii2 => e20(new xio.ErrorContentImpl(ii2)))
  def errorCompat21[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input, P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input, P, Out],
    e21: xio.ErrorContent[E21, P] => xio.XIO[Input, P, Out],
    u: xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]
  ): xio.XIO[Input, P, Out] = u.either
    .fold(ii1 => errorCompat20(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, ii1), ii2 => e21(new xio.ErrorContentImpl(ii2)))
  def errorCompat22[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, Input, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input, P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input, P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input, P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input, P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input, P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input, P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input, P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input, P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input, P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input, P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input, P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input, P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input, P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input, P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input, P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input, P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input, P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input, P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input, P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input, P, Out],
    e21: xio.ErrorContent[E21, P] => xio.XIO[Input, P, Out],
    e22: xio.ErrorContent[E22, P] => xio.XIO[Input, P, Out],
    u: xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22]
  ): xio.XIO[Input, P, Out] = u.either.fold(
    ii1 => errorCompat21(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, ii1),
    ii2 => e22(new xio.ErrorContentImpl(ii2))
  )
}
