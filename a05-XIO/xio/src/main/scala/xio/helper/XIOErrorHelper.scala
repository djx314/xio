package xio.helper
object XIOErrorHelperInstance {
  trait MatchAll1Apply1[P <: xio.nat.error.NatEither, E1, Input <: xio.nat.has.Nat, Out] {
    def input1(e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out]): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply2[P <: xio.nat.error.NatEither, E1, E2, Input <: xio.nat.has.Nat, Out] {
    def input2(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply3[P <: xio.nat.error.NatEither, E1, E2, E3, Input <: xio.nat.has.Nat, Out] {
    def input3(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply4[P <: xio.nat.error.NatEither, E1, E2, E3, E4, Input <: xio.nat.has.Nat, Out] {
    def input4(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply5[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, Input <: xio.nat.has.Nat, Out] {
    def input5(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply6[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, Input <: xio.nat.has.Nat, Out] {
    def input6(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply7[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, Input <: xio.nat.has.Nat, Out] {
    def input7(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply8[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, Input <: xio.nat.has.Nat, Out] {
    def input8(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply9[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input <: xio.nat.has.Nat, Out] {
    def input9(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply10[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input <: xio.nat.has.Nat, Out] {
    def input10(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply11[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input <: xio.nat.has.Nat, Out] {
    def input11(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply12[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input <: xio.nat.has.Nat, Out] {
    def input12(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply13[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input <: xio.nat.has.Nat, Out] {
    def input13(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply14[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input <: xio.nat.has.Nat, Out] {
    def input14(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply15[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input <: xio.nat.has.Nat, Out] {
    def input15(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out],
      e15: xio.ErrorContent[E15, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply16[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input <: xio.nat.has.Nat, Out] {
    def input16(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out],
      e15: xio.ErrorContent[E15, P, Input, Out] => xio.XIO[Input, P, Out],
      e16: xio.ErrorContent[E16, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply17[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input <: xio.nat.has.Nat, Out] {
    def input17(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out],
      e15: xio.ErrorContent[E15, P, Input, Out] => xio.XIO[Input, P, Out],
      e16: xio.ErrorContent[E16, P, Input, Out] => xio.XIO[Input, P, Out],
      e17: xio.ErrorContent[E17, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply18[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input <: xio.nat.has.Nat, Out] {
    def input18(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out],
      e15: xio.ErrorContent[E15, P, Input, Out] => xio.XIO[Input, P, Out],
      e16: xio.ErrorContent[E16, P, Input, Out] => xio.XIO[Input, P, Out],
      e17: xio.ErrorContent[E17, P, Input, Out] => xio.XIO[Input, P, Out],
      e18: xio.ErrorContent[E18, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply19[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    Input <: xio.nat.has.Nat,
    Out
  ] {
    def input19(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out],
      e15: xio.ErrorContent[E15, P, Input, Out] => xio.XIO[Input, P, Out],
      e16: xio.ErrorContent[E16, P, Input, Out] => xio.XIO[Input, P, Out],
      e17: xio.ErrorContent[E17, P, Input, Out] => xio.XIO[Input, P, Out],
      e18: xio.ErrorContent[E18, P, Input, Out] => xio.XIO[Input, P, Out],
      e19: xio.ErrorContent[E19, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply20[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    Input <: xio.nat.has.Nat,
    Out
  ] {
    def input20(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out],
      e15: xio.ErrorContent[E15, P, Input, Out] => xio.XIO[Input, P, Out],
      e16: xio.ErrorContent[E16, P, Input, Out] => xio.XIO[Input, P, Out],
      e17: xio.ErrorContent[E17, P, Input, Out] => xio.XIO[Input, P, Out],
      e18: xio.ErrorContent[E18, P, Input, Out] => xio.XIO[Input, P, Out],
      e19: xio.ErrorContent[E19, P, Input, Out] => xio.XIO[Input, P, Out],
      e20: xio.ErrorContent[E20, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply21[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    Input <: xio.nat.has.Nat,
    Out
  ] {
    def input21(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out],
      e15: xio.ErrorContent[E15, P, Input, Out] => xio.XIO[Input, P, Out],
      e16: xio.ErrorContent[E16, P, Input, Out] => xio.XIO[Input, P, Out],
      e17: xio.ErrorContent[E17, P, Input, Out] => xio.XIO[Input, P, Out],
      e18: xio.ErrorContent[E18, P, Input, Out] => xio.XIO[Input, P, Out],
      e19: xio.ErrorContent[E19, P, Input, Out] => xio.XIO[Input, P, Out],
      e20: xio.ErrorContent[E20, P, Input, Out] => xio.XIO[Input, P, Out],
      e21: xio.ErrorContent[E21, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
  trait MatchAll1Apply22[
    P <: xio.nat.error.NatEither,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    E22,
    Input <: xio.nat.has.Nat,
    Out
  ] {
    def input22(
      e1: xio.ErrorContent[E1, P, Input, Out] => xio.XIO[Input, P, Out],
      e2: xio.ErrorContent[E2, P, Input, Out] => xio.XIO[Input, P, Out],
      e3: xio.ErrorContent[E3, P, Input, Out] => xio.XIO[Input, P, Out],
      e4: xio.ErrorContent[E4, P, Input, Out] => xio.XIO[Input, P, Out],
      e5: xio.ErrorContent[E5, P, Input, Out] => xio.XIO[Input, P, Out],
      e6: xio.ErrorContent[E6, P, Input, Out] => xio.XIO[Input, P, Out],
      e7: xio.ErrorContent[E7, P, Input, Out] => xio.XIO[Input, P, Out],
      e8: xio.ErrorContent[E8, P, Input, Out] => xio.XIO[Input, P, Out],
      e9: xio.ErrorContent[E9, P, Input, Out] => xio.XIO[Input, P, Out],
      e10: xio.ErrorContent[E10, P, Input, Out] => xio.XIO[Input, P, Out],
      e11: xio.ErrorContent[E11, P, Input, Out] => xio.XIO[Input, P, Out],
      e12: xio.ErrorContent[E12, P, Input, Out] => xio.XIO[Input, P, Out],
      e13: xio.ErrorContent[E13, P, Input, Out] => xio.XIO[Input, P, Out],
      e14: xio.ErrorContent[E14, P, Input, Out] => xio.XIO[Input, P, Out],
      e15: xio.ErrorContent[E15, P, Input, Out] => xio.XIO[Input, P, Out],
      e16: xio.ErrorContent[E16, P, Input, Out] => xio.XIO[Input, P, Out],
      e17: xio.ErrorContent[E17, P, Input, Out] => xio.XIO[Input, P, Out],
      e18: xio.ErrorContent[E18, P, Input, Out] => xio.XIO[Input, P, Out],
      e19: xio.ErrorContent[E19, P, Input, Out] => xio.XIO[Input, P, Out],
      e20: xio.ErrorContent[E20, P, Input, Out] => xio.XIO[Input, P, Out],
      e21: xio.ErrorContent[E21, P, Input, Out] => xio.XIO[Input, P, Out],
      e22: xio.ErrorContent[E22, P, Input, Out] => xio.XIO[Input, P, Out]
    ): xio.XIO[Input, P, Out]
  }
}
trait XIOErrorHelper {
  implicit class XIOErrorMatchAll1ImplicitClass1[X <: xio.nat.has.Nat, E1, I](i: xio.XIO[X, xio.XError1[E1], I]) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] {
        override def input1(e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I]): xio.XIO[X, P, I] =
          XIOHelper.simpleCatchAll(i) { n => e1(new xio.ErrorContentImpl(n.sureRight)) }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass2[X <: xio.nat.has.Nat, E1, E2, I](i: xio.XIO[X, xio.XError2[E1, E2], I]) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] {
        override def input2(e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I], e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I]): xio.XIO[X, P, I] =
          1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass3[X <: xio.nat.has.Nat, E1, E2, E3, I](i: xio.XIO[X, xio.XError3[E1, E2, E3], I]) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] {
        override def input3(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass4[X <: xio.nat.has.Nat, E1, E2, E3, E4, I](i: xio.XIO[X, xio.XError4[E1, E2, E3, E4], I]) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] {
        override def input4(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass5[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, I](i: xio.XIO[X, xio.XError5[E1, E2, E3, E4, E5], I]) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] {
        override def input5(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass6[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, I](i: xio.XIO[X, xio.XError6[E1, E2, E3, E4, E5, E6], I]) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] {
        override def input6(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass7[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, I](i: xio.XIO[X, xio.XError7[E1, E2, E3, E4, E5, E6, E7], I]) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] {
        override def input7(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass8[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, I](i: xio.XIO[X, xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8], I]) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] {
        override def input8(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass9[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, I](
    i: xio.XIO[X, xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] {
        override def input9(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass10[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, I](
    i: xio.XIO[X, xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] {
        override def input10(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass11[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, I](
    i: xio.XIO[X, xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] {
        override def input11(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass12[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, I](
    i: xio.XIO[X, xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] {
        override def input12(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass13[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, I](
    i: xio.XIO[X, xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] {
        override def input13(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass14[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, I](
    i: xio.XIO[X, xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] {
        override def input14(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass15[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, I](
    i: xio.XIO[X, xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] {
        override def input15(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I],
          e15: xio.ErrorContent[E15, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass16[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, I](
    i: xio.XIO[X, xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] {
        override def input16(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I],
          e15: xio.ErrorContent[E15, P, X, I] => xio.XIO[X, P, I],
          e16: xio.ErrorContent[E16, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass17[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, I](
    i: xio.XIO[X, xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] {
        override def input17(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I],
          e15: xio.ErrorContent[E15, P, X, I] => xio.XIO[X, P, I],
          e16: xio.ErrorContent[E16, P, X, I] => xio.XIO[X, P, I],
          e17: xio.ErrorContent[E17, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass18[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, I](
    i: xio.XIO[X, xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] {
        override def input18(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I],
          e15: xio.ErrorContent[E15, P, X, I] => xio.XIO[X, P, I],
          e16: xio.ErrorContent[E16, P, X, I] => xio.XIO[X, P, I],
          e17: xio.ErrorContent[E17, P, X, I] => xio.XIO[X, P, I],
          e18: xio.ErrorContent[E18, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass19[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, I](
    i: xio.XIO[X, xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] {
        override def input19(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I],
          e15: xio.ErrorContent[E15, P, X, I] => xio.XIO[X, P, I],
          e16: xio.ErrorContent[E16, P, X, I] => xio.XIO[X, P, I],
          e17: xio.ErrorContent[E17, P, X, I] => xio.XIO[X, P, I],
          e18: xio.ErrorContent[E18, P, X, I] => xio.XIO[X, P, I],
          e19: xio.ErrorContent[E19, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass20[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, I](
    i: xio.XIO[X, xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20], I]
  ) {
    def allError[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] {
        override def input20(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I],
          e15: xio.ErrorContent[E15, P, X, I] => xio.XIO[X, P, I],
          e16: xio.ErrorContent[E16, P, X, I] => xio.XIO[X, P, I],
          e17: xio.ErrorContent[E17, P, X, I] => xio.XIO[X, P, I],
          e18: xio.ErrorContent[E18, P, X, I] => xio.XIO[X, P, I],
          e19: xio.ErrorContent[E19, P, X, I] => xio.XIO[X, P, I],
          e20: xio.ErrorContent[E20, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass21[
    X <: xio.nat.has.Nat,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    I
  ](i: xio.XIO[X, xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21], I]) {
    def allError[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] {
        override def input21(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I],
          e15: xio.ErrorContent[E15, P, X, I] => xio.XIO[X, P, I],
          e16: xio.ErrorContent[E16, P, X, I] => xio.XIO[X, P, I],
          e17: xio.ErrorContent[E17, P, X, I] => xio.XIO[X, P, I],
          e18: xio.ErrorContent[E18, P, X, I] => xio.XIO[X, P, I],
          e19: xio.ErrorContent[E19, P, X, I] => xio.XIO[X, P, I],
          e20: xio.ErrorContent[E20, P, X, I] => xio.XIO[X, P, I],
          e21: xio.ErrorContent[E21, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass22[
    X <: xio.nat.has.Nat,
    E1,
    E2,
    E3,
    E4,
    E5,
    E6,
    E7,
    E8,
    E9,
    E10,
    E11,
    E12,
    E13,
    E14,
    E15,
    E16,
    E17,
    E18,
    E19,
    E20,
    E21,
    E22,
    I
  ](i: xio.XIO[X, xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22], I]) {
    def allError[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] {
        override def input22(
          e1: xio.ErrorContent[E1, P, X, I] => xio.XIO[X, P, I],
          e2: xio.ErrorContent[E2, P, X, I] => xio.XIO[X, P, I],
          e3: xio.ErrorContent[E3, P, X, I] => xio.XIO[X, P, I],
          e4: xio.ErrorContent[E4, P, X, I] => xio.XIO[X, P, I],
          e5: xio.ErrorContent[E5, P, X, I] => xio.XIO[X, P, I],
          e6: xio.ErrorContent[E6, P, X, I] => xio.XIO[X, P, I],
          e7: xio.ErrorContent[E7, P, X, I] => xio.XIO[X, P, I],
          e8: xio.ErrorContent[E8, P, X, I] => xio.XIO[X, P, I],
          e9: xio.ErrorContent[E9, P, X, I] => xio.XIO[X, P, I],
          e10: xio.ErrorContent[E10, P, X, I] => xio.XIO[X, P, I],
          e11: xio.ErrorContent[E11, P, X, I] => xio.XIO[X, P, I],
          e12: xio.ErrorContent[E12, P, X, I] => xio.XIO[X, P, I],
          e13: xio.ErrorContent[E13, P, X, I] => xio.XIO[X, P, I],
          e14: xio.ErrorContent[E14, P, X, I] => xio.XIO[X, P, I],
          e15: xio.ErrorContent[E15, P, X, I] => xio.XIO[X, P, I],
          e16: xio.ErrorContent[E16, P, X, I] => xio.XIO[X, P, I],
          e17: xio.ErrorContent[E17, P, X, I] => xio.XIO[X, P, I],
          e18: xio.ErrorContent[E18, P, X, I] => xio.XIO[X, P, I],
          e19: xio.ErrorContent[E19, P, X, I] => xio.XIO[X, P, I],
          e20: xio.ErrorContent[E20, P, X, I] => xio.XIO[X, P, I],
          e21: xio.ErrorContent[E21, P, X, I] => xio.XIO[X, P, I],
          e22: xio.ErrorContent[E22, P, X, I] => xio.XIO[X, P, I]
        ): xio.XIO[X, P, I] = 1.asInstanceOf[xio.XIO[X, P, I]]
      }
  }
}
