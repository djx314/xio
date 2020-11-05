package xio.helper
object XIOErrorHelperInstance4 {
  def errorCompat1[P, E1, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    u: xio.XError1[E1]
  ): zio.ZIO[Input, P, Out] = e1(u.sureRight)
  def errorCompat2[P, E1, E2, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    u: xio.XError2[E1, E2]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat1(e1, ii1), ii2 => e2(ii2))
  def errorCompat3[P, E1, E2, E3, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    u: xio.XError3[E1, E2, E3]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat2(e1, e2, ii1), ii2 => e3(ii2))
  def errorCompat4[P, E1, E2, E3, E4, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    u: xio.XError4[E1, E2, E3, E4]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat3(e1, e2, e3, ii1), ii2 => e4(ii2))
  def errorCompat5[P, E1, E2, E3, E4, E5, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    u: xio.XError5[E1, E2, E3, E4, E5]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat4(e1, e2, e3, e4, ii1), ii2 => e5(ii2))
  def errorCompat6[P, E1, E2, E3, E4, E5, E6, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    u: xio.XError6[E1, E2, E3, E4, E5, E6]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat5(e1, e2, e3, e4, e5, ii1), ii2 => e6(ii2))
  def errorCompat7[P, E1, E2, E3, E4, E5, E6, E7, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    u: xio.XError7[E1, E2, E3, E4, E5, E6, E7]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat6(e1, e2, e3, e4, e5, e6, ii1), ii2 => e7(ii2))
  def errorCompat8[P, E1, E2, E3, E4, E5, E6, E7, E8, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    u: xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat7(e1, e2, e3, e4, e5, e6, e7, ii1), ii2 => e8(ii2))
  def errorCompat9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    u: xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat8(e1, e2, e3, e4, e5, e6, e7, e8, ii1), ii2 => e9(ii2))
  def errorCompat10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    u: xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat9(e1, e2, e3, e4, e5, e6, e7, e8, e9, ii1), ii2 => e10(ii2))
  def errorCompat11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    u: xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat10(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, ii1), ii2 => e11(ii2))
  def errorCompat12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    u: xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat11(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, ii1), ii2 => e12(ii2))
  def errorCompat13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    u: xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat12(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, ii1), ii2 => e13(ii2))
  def errorCompat14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    u: xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat13(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, ii1), ii2 => e14(ii2))
  def errorCompat15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    e15: E15 => zio.ZIO[Input, P, Out],
    u: xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat14(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, ii1), ii2 => e15(ii2))
  def errorCompat16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    e15: E15 => zio.ZIO[Input, P, Out],
    e16: E16 => zio.ZIO[Input, P, Out],
    u: xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat15(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, ii1), ii2 => e16(ii2))
  def errorCompat17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    e15: E15 => zio.ZIO[Input, P, Out],
    e16: E16 => zio.ZIO[Input, P, Out],
    e17: E17 => zio.ZIO[Input, P, Out],
    u: xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat16(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, ii1), ii2 => e17(ii2))
  def errorCompat18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    e15: E15 => zio.ZIO[Input, P, Out],
    e16: E16 => zio.ZIO[Input, P, Out],
    e17: E17 => zio.ZIO[Input, P, Out],
    e18: E18 => zio.ZIO[Input, P, Out],
    u: xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat17(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, ii1), ii2 => e18(ii2))
  def errorCompat19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    e15: E15 => zio.ZIO[Input, P, Out],
    e16: E16 => zio.ZIO[Input, P, Out],
    e17: E17 => zio.ZIO[Input, P, Out],
    e18: E18 => zio.ZIO[Input, P, Out],
    e19: E19 => zio.ZIO[Input, P, Out],
    u: xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]
  ): zio.ZIO[Input, P, Out] = u.either.fold(ii1 => errorCompat18(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, ii1), ii2 => e19(ii2))
  def errorCompat20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    e15: E15 => zio.ZIO[Input, P, Out],
    e16: E16 => zio.ZIO[Input, P, Out],
    e17: E17 => zio.ZIO[Input, P, Out],
    e18: E18 => zio.ZIO[Input, P, Out],
    e19: E19 => zio.ZIO[Input, P, Out],
    e20: E20 => zio.ZIO[Input, P, Out],
    u: xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]
  ): zio.ZIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat19(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, ii1), ii2 => e20(ii2))
  def errorCompat21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    e15: E15 => zio.ZIO[Input, P, Out],
    e16: E16 => zio.ZIO[Input, P, Out],
    e17: E17 => zio.ZIO[Input, P, Out],
    e18: E18 => zio.ZIO[Input, P, Out],
    e19: E19 => zio.ZIO[Input, P, Out],
    e20: E20 => zio.ZIO[Input, P, Out],
    e21: E21 => zio.ZIO[Input, P, Out],
    u: xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]
  ): zio.ZIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat20(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, ii1), ii2 => e21(ii2))
  def errorCompat22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, Input, Out](
    e1: E1 => zio.ZIO[Input, P, Out],
    e2: E2 => zio.ZIO[Input, P, Out],
    e3: E3 => zio.ZIO[Input, P, Out],
    e4: E4 => zio.ZIO[Input, P, Out],
    e5: E5 => zio.ZIO[Input, P, Out],
    e6: E6 => zio.ZIO[Input, P, Out],
    e7: E7 => zio.ZIO[Input, P, Out],
    e8: E8 => zio.ZIO[Input, P, Out],
    e9: E9 => zio.ZIO[Input, P, Out],
    e10: E10 => zio.ZIO[Input, P, Out],
    e11: E11 => zio.ZIO[Input, P, Out],
    e12: E12 => zio.ZIO[Input, P, Out],
    e13: E13 => zio.ZIO[Input, P, Out],
    e14: E14 => zio.ZIO[Input, P, Out],
    e15: E15 => zio.ZIO[Input, P, Out],
    e16: E16 => zio.ZIO[Input, P, Out],
    e17: E17 => zio.ZIO[Input, P, Out],
    e18: E18 => zio.ZIO[Input, P, Out],
    e19: E19 => zio.ZIO[Input, P, Out],
    e20: E20 => zio.ZIO[Input, P, Out],
    e21: E21 => zio.ZIO[Input, P, Out],
    e22: E22 => zio.ZIO[Input, P, Out],
    u: xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22]
  ): zio.ZIO[Input, P, Out] =
    u.either.fold(ii1 => errorCompat21(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, ii1), ii2 => e22(ii2))
}
