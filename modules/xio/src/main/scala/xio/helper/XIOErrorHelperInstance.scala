package xio.helper
object XIOErrorHelperInstance {
  trait MatchAll1Apply1[P <: xio.nat.error.NatEither, E1, Input, Out] {
    def input1[Out1 <: Out, Input1](e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1]): xio.XIO[Input with Input1, P, Out]
  }
  class MatchAll1Apply1Impl[P <: xio.nat.error.NatEither, E1, Input, Out](val xioInstance: xio.XIO[Input, xio.XError1[E1], Out])
      extends MatchAll1Apply1[P, E1, Input, Out] {
    def input1[Out1 <: Out, Input1](e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1]): xio.XIO[Input with Input1, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat1(e1, ii))
  }
  trait MatchAll1Apply2[P <: xio.nat.error.NatEither, E1, E2, Input, Out] {
    def input2[Out1 <: Out, Input1, Out2 <: Out, Input2](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2]
    ): xio.XIO[Input with Input1 with Input2, P, Out]
  }
  class MatchAll1Apply2Impl[P <: xio.nat.error.NatEither, E1, E2, Input, Out](val xioInstance: xio.XIO[Input, xio.XError2[E1, E2], Out])
      extends MatchAll1Apply2[P, E1, E2, Input, Out] {
    def input2[Out1 <: Out, Input1, Out2 <: Out, Input2](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2]
    ): xio.XIO[Input with Input1 with Input2, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat2(e1, e2, ii))
  }
  trait MatchAll1Apply3[P <: xio.nat.error.NatEither, E1, E2, E3, Input, Out] {
    def input3[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3]
    ): xio.XIO[Input with Input1 with Input2 with Input3, P, Out]
  }
  class MatchAll1Apply3Impl[P <: xio.nat.error.NatEither, E1, E2, E3, Input, Out](val xioInstance: xio.XIO[Input, xio.XError3[E1, E2, E3], Out])
      extends MatchAll1Apply3[P, E1, E2, E3, Input, Out] {
    def input3[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3]
    ): xio.XIO[Input with Input1 with Input2 with Input3, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat3(e1, e2, e3, ii))
  }
  trait MatchAll1Apply4[P <: xio.nat.error.NatEither, E1, E2, E3, E4, Input, Out] {
    def input4[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3, Out4 <: Out, Input4](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4, P, Out]
  }
  class MatchAll1Apply4Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, Input, Out](val xioInstance: xio.XIO[Input, xio.XError4[E1, E2, E3, E4], Out])
      extends MatchAll1Apply4[P, E1, E2, E3, E4, Input, Out] {
    def input4[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3, Out4 <: Out, Input4](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat4(e1, e2, e3, e4, ii))
  }
  trait MatchAll1Apply5[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, Input, Out] {
    def input5[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3, Out4 <: Out, Input4, Out5 <: Out, Input5](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5, P, Out]
  }
  class MatchAll1Apply5Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, Input, Out](val xioInstance: xio.XIO[Input, xio.XError5[E1, E2, E3, E4, E5], Out])
      extends MatchAll1Apply5[P, E1, E2, E3, E4, E5, Input, Out] {
    def input5[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3, Out4 <: Out, Input4, Out5 <: Out, Input5](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat5(e1, e2, e3, e4, e5, ii))
  }
  trait MatchAll1Apply6[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, Input, Out] {
    def input6[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3, Out4 <: Out, Input4, Out5 <: Out, Input5, Out6 <: Out, Input6](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6, P, Out]
  }
  class MatchAll1Apply6Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, Input, Out](val xioInstance: xio.XIO[Input, xio.XError6[E1, E2, E3, E4, E5, E6], Out])
      extends MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, Input, Out] {
    def input6[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3, Out4 <: Out, Input4, Out5 <: Out, Input5, Out6 <: Out, Input6](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat6(e1, e2, e3, e4, e5, e6, ii))
  }
  trait MatchAll1Apply7[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, Input, Out] {
    def input7[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3, Out4 <: Out, Input4, Out5 <: Out, Input5, Out6 <: Out, Input6, Out7 <: Out, Input7](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7, P, Out]
  }
  class MatchAll1Apply7Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError7[E1, E2, E3, E4, E5, E6, E7], Out]
  ) extends MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, Input, Out] {
    def input7[Out1 <: Out, Input1, Out2 <: Out, Input2, Out3 <: Out, Input3, Out4 <: Out, Input4, Out5 <: Out, Input5, Out6 <: Out, Input6, Out7 <: Out, Input7](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat7(e1, e2, e3, e4, e5, e6, e7, ii))
  }
  trait MatchAll1Apply8[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, Input, Out] {
    def input8[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8, P, Out]
  }
  class MatchAll1Apply8Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8], Out]
  ) extends MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, Input, Out] {
    def input8[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat8(e1, e2, e3, e4, e5, e6, e7, e8, ii))
  }
  trait MatchAll1Apply9[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input, Out] {
    def input9[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9, P, Out]
  }
  class MatchAll1Apply9Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9], Out]
  ) extends MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input, Out] {
    def input9[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat9(e1, e2, e3, e4, e5, e6, e7, e8, e9, ii))
  }
  trait MatchAll1Apply10[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input, Out] {
    def input10[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10, P, Out]
  }
  class MatchAll1Apply10Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10], Out]
  ) extends MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input, Out] {
    def input10[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat10(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, ii))
  }
  trait MatchAll1Apply11[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input, Out] {
    def input11[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11, P, Out]
  }
  class MatchAll1Apply11Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11], Out]
  ) extends MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input, Out] {
    def input11[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11]
    ): xio.XIO[Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11, P, Out] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat11(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, ii))
  }
  trait MatchAll1Apply12[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input, Out] {
    def input12[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12,
      P,
      Out
    ]
  }
  class MatchAll1Apply12Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12], Out]
  ) extends MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input, Out] {
    def input12[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat12(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, ii))
  }
  trait MatchAll1Apply13[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input, Out] {
    def input13[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13,
      P,
      Out
    ]
  }
  class MatchAll1Apply13Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13], Out]
  ) extends MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input, Out] {
    def input13[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat13(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, ii))
  }
  trait MatchAll1Apply14[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input, Out] {
    def input14[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14,
      P,
      Out
    ]
  }
  class MatchAll1Apply14Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14], Out]
  ) extends MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input, Out] {
    def input14[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat14(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, ii))
  }
  trait MatchAll1Apply15[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input, Out] {
    def input15[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15,
      P,
      Out
    ]
  }
  class MatchAll1Apply15Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15], Out]
  ) extends MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input, Out] {
    def input15[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat15(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, ii))
  }
  trait MatchAll1Apply16[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input, Out] {
    def input16[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16,
      P,
      Out
    ]
  }
  class MatchAll1Apply16Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16], Out]
  ) extends MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input, Out] {
    def input16[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat16(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, ii))
  }
  trait MatchAll1Apply17[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input, Out] {
    def input17[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17,
      P,
      Out
    ]
  }
  class MatchAll1Apply17Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17], Out]
  ) extends MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input, Out] {
    def input17[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat17(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, ii))
  }
  trait MatchAll1Apply18[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input, Out] {
    def input18[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18,
      P,
      Out
    ]
  }
  class MatchAll1Apply18Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18], Out]
  ) extends MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input, Out] {
    def input18[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii => XIOErrorHelperInstance2.errorCompat18(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, ii))
  }
  trait MatchAll1Apply19[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, Input, Out] {
    def input19[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18,
      Out19 <: Out,
      Input19
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19,
      P,
      Out
    ]
  }
  class MatchAll1Apply19Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19], Out]
  ) extends MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, Input, Out] {
    def input19[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18,
      Out19 <: Out,
      Input19
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii =>
        XIOErrorHelperInstance2.errorCompat19(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, ii)
      )
  }
  trait MatchAll1Apply20[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, Input, Out] {
    def input20[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18,
      Out19 <: Out,
      Input19,
      Out20 <: Out,
      Input20
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20,
      P,
      Out
    ]
  }
  class MatchAll1Apply20Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20], Out]
  ) extends MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, Input, Out] {
    def input20[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18,
      Out19 <: Out,
      Input19,
      Out20 <: Out,
      Input20
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii =>
        XIOErrorHelperInstance2.errorCompat20(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, ii)
      )
  }
  trait MatchAll1Apply21[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, Input, Out] {
    def input21[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18,
      Out19 <: Out,
      Input19,
      Out20 <: Out,
      Input20,
      Out21 <: Out,
      Input21
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20],
      e21: xio.ErrorContent[E21, P] => xio.XIO[Input21, P, Out21]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20 with Input21,
      P,
      Out
    ]
  }
  class MatchAll1Apply21Impl[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, Input, Out](
    val xioInstance: xio.XIO[Input, xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21], Out]
  ) extends MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, Input, Out] {
    def input21[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18,
      Out19 <: Out,
      Input19,
      Out20 <: Out,
      Input20,
      Out21 <: Out,
      Input21
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20],
      e21: xio.ErrorContent[E21, P] => xio.XIO[Input21, P, Out21]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20 with Input21,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii =>
        XIOErrorHelperInstance2.errorCompat21(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, ii)
      )
  }
  trait MatchAll1Apply22[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, Input, Out] {
    def input22[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18,
      Out19 <: Out,
      Input19,
      Out20 <: Out,
      Input20,
      Out21 <: Out,
      Input21,
      Out22 <: Out,
      Input22
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20],
      e21: xio.ErrorContent[E21, P] => xio.XIO[Input21, P, Out21],
      e22: xio.ErrorContent[E22, P] => xio.XIO[Input22, P, Out22]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20 with Input21 with Input22,
      P,
      Out
    ]
  }
  class MatchAll1Apply22Impl[
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
    Input,
    Out
  ](val xioInstance: xio.XIO[Input, xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22], Out])
      extends MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, Input, Out] {
    def input22[
      Out1 <: Out,
      Input1,
      Out2 <: Out,
      Input2,
      Out3 <: Out,
      Input3,
      Out4 <: Out,
      Input4,
      Out5 <: Out,
      Input5,
      Out6 <: Out,
      Input6,
      Out7 <: Out,
      Input7,
      Out8 <: Out,
      Input8,
      Out9 <: Out,
      Input9,
      Out10 <: Out,
      Input10,
      Out11 <: Out,
      Input11,
      Out12 <: Out,
      Input12,
      Out13 <: Out,
      Input13,
      Out14 <: Out,
      Input14,
      Out15 <: Out,
      Input15,
      Out16 <: Out,
      Input16,
      Out17 <: Out,
      Input17,
      Out18 <: Out,
      Input18,
      Out19 <: Out,
      Input19,
      Out20 <: Out,
      Input20,
      Out21 <: Out,
      Input21,
      Out22 <: Out,
      Input22
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
      e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
      e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8],
      e9: xio.ErrorContent[E9, P] => xio.XIO[Input9, P, Out9],
      e10: xio.ErrorContent[E10, P] => xio.XIO[Input10, P, Out10],
      e11: xio.ErrorContent[E11, P] => xio.XIO[Input11, P, Out11],
      e12: xio.ErrorContent[E12, P] => xio.XIO[Input12, P, Out12],
      e13: xio.ErrorContent[E13, P] => xio.XIO[Input13, P, Out13],
      e14: xio.ErrorContent[E14, P] => xio.XIO[Input14, P, Out14],
      e15: xio.ErrorContent[E15, P] => xio.XIO[Input15, P, Out15],
      e16: xio.ErrorContent[E16, P] => xio.XIO[Input16, P, Out16],
      e17: xio.ErrorContent[E17, P] => xio.XIO[Input17, P, Out17],
      e18: xio.ErrorContent[E18, P] => xio.XIO[Input18, P, Out18],
      e19: xio.ErrorContent[E19, P] => xio.XIO[Input19, P, Out19],
      e20: xio.ErrorContent[E20, P] => xio.XIO[Input20, P, Out20],
      e21: xio.ErrorContent[E21, P] => xio.XIO[Input21, P, Out21],
      e22: xio.ErrorContent[E22, P] => xio.XIO[Input22, P, Out22]
    ): xio.XIO[
      Input with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20 with Input21 with Input22,
      P,
      Out
    ] =
      xio.using xio xioInstance.catchAll(ii =>
        XIOErrorHelperInstance2.errorCompat22(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, ii)
      )
  }
}
