package xio.helper
trait XIOErrorHelper {
  implicit class XIOErrorMatchAll1ImplicitClass1[X, E1, I](i: xio.XIO[X, xio.XError1[E1], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] {
        override def input1[Out1 <: I, Input1](e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1]): xio.XIO[X with Input1, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat1(e1, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass2[X, E1, E2, I](i: xio.XIO[X, xio.XError2[E1, E2], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] {
        override def input2[Out1 <: I, Input1, Out2 <: I, Input2](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2]
        ): xio.XIO[X with Input1 with Input2, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat2(e1, e2, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass3[X, E1, E2, E3, I](i: xio.XIO[X, xio.XError3[E1, E2, E3], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] {
        override def input3[Out1 <: I, Input1, Out2 <: I, Input2, Out3 <: I, Input3](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3]
        ): xio.XIO[X with Input1 with Input2 with Input3, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat3(e1, e2, e3, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass4[X, E1, E2, E3, E4, I](i: xio.XIO[X, xio.XError4[E1, E2, E3, E4], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] {
        override def input4[Out1 <: I, Input1, Out2 <: I, Input2, Out3 <: I, Input3, Out4 <: I, Input4](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4]
        ): xio.XIO[X with Input1 with Input2 with Input3 with Input4, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat4(e1, e2, e3, e4, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass5[X, E1, E2, E3, E4, E5, I](i: xio.XIO[X, xio.XError5[E1, E2, E3, E4, E5], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] {
        override def input5[Out1 <: I, Input1, Out2 <: I, Input2, Out3 <: I, Input3, Out4 <: I, Input4, Out5 <: I, Input5](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5]
        ): xio.XIO[X with Input1 with Input2 with Input3 with Input4 with Input5, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat5(e1, e2, e3, e4, e5, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass6[X, E1, E2, E3, E4, E5, E6, I](i: xio.XIO[X, xio.XError6[E1, E2, E3, E4, E5, E6], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] {
        override def input6[Out1 <: I, Input1, Out2 <: I, Input2, Out3 <: I, Input3, Out4 <: I, Input4, Out5 <: I, Input5, Out6 <: I, Input6](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6]
        ): xio.XIO[X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat6(e1, e2, e3, e4, e5, e6, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass7[X, E1, E2, E3, E4, E5, E6, E7, I](i: xio.XIO[X, xio.XError7[E1, E2, E3, E4, E5, E6, E7], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] {
        override def input7[Out1 <: I, Input1, Out2 <: I, Input2, Out3 <: I, Input3, Out4 <: I, Input4, Out5 <: I, Input5, Out6 <: I, Input6, Out7 <: I, Input7](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7]
        ): xio.XIO[X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat7(e1, e2, e3, e4, e5, e6, e7, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass8[X, E1, E2, E3, E4, E5, E6, E7, E8, I](i: xio.XIO[X, xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] {
        override def input8[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
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
        ): xio.XIO[X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat8(e1, e2, e3, e4, e5, e6, e7, e8, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass9[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, I](i: xio.XIO[X, xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] {
        override def input9[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
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
        ): xio.XIO[X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat9(e1, e2, e3, e4, e5, e6, e7, e8, e9, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass10[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, I](
    i: xio.XIO[X, xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] {
        override def input10[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
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
        ): xio.XIO[X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat10(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass11[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, I](
    i: xio.XIO[X, xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] {
        override def input11[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
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
        ): xio.XIO[X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11, P, I] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat11(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass12[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, I](
    i: xio.XIO[X, xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] {
        override def input12[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12,
          P,
          I
        ] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat12(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass13[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, I](
    i: xio.XIO[X, xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] {
        override def input13[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13,
          P,
          I
        ] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat13(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass14[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, I](
    i: xio.XIO[X, xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] {
        override def input14[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14,
          P,
          I
        ] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat14(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass15[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, I](
    i: xio.XIO[X, xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] {
        override def input15[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
          Input14,
          Out15 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15,
          P,
          I
        ] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat15(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass16[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, I](
    i: xio.XIO[X, xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] {
        override def input16[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
          Input14,
          Out15 <: I,
          Input15,
          Out16 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16,
          P,
          I
        ] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat16(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass17[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, I](
    i: xio.XIO[X, xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] {
        override def input17[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
          Input14,
          Out15 <: I,
          Input15,
          Out16 <: I,
          Input16,
          Out17 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17,
          P,
          I
        ] = {
          new xio.XIO(i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat17(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, ii).toZIO))
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass18[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, I](
    i: xio.XIO[X, xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] {
        override def input18[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
          Input14,
          Out15 <: I,
          Input15,
          Out16 <: I,
          Input16,
          Out17 <: I,
          Input17,
          Out18 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18,
          P,
          I
        ] = {
          new xio.XIO(
            i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat18(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, ii).toZIO)
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass19[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, I](
    i: xio.XIO[X, xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] {
        override def input19[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
          Input14,
          Out15 <: I,
          Input15,
          Out16 <: I,
          Input16,
          Out17 <: I,
          Input17,
          Out18 <: I,
          Input18,
          Out19 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19,
          P,
          I
        ] = {
          new xio.XIO(
            i.toZIO.catchAll(ii => XIOErrorHelperInstance2.errorCompat19(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, ii).toZIO)
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass20[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, I](
    i: xio.XIO[X, xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] {
        override def input20[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
          Input14,
          Out15 <: I,
          Input15,
          Out16 <: I,
          Input16,
          Out17 <: I,
          Input17,
          Out18 <: I,
          Input18,
          Out19 <: I,
          Input19,
          Out20 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20,
          P,
          I
        ] = {
          new xio.XIO(
            i.toZIO.catchAll(ii =>
              XIOErrorHelperInstance2.errorCompat20(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, ii).toZIO
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass21[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, I](
    i: xio.XIO[X, xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] {
        override def input21[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
          Input14,
          Out15 <: I,
          Input15,
          Out16 <: I,
          Input16,
          Out17 <: I,
          Input17,
          Out18 <: I,
          Input18,
          Out19 <: I,
          Input19,
          Out20 <: I,
          Input20,
          Out21 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20 with Input21,
          P,
          I
        ] = {
          new xio.XIO(
            i.toZIO.catchAll(ii =>
              XIOErrorHelperInstance2.errorCompat21(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, ii).toZIO
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass22[X, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, I](
    i: xio.XIO[X, xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] {
        override def input22[
          Out1 <: I,
          Input1,
          Out2 <: I,
          Input2,
          Out3 <: I,
          Input3,
          Out4 <: I,
          Input4,
          Out5 <: I,
          Input5,
          Out6 <: I,
          Input6,
          Out7 <: I,
          Input7,
          Out8 <: I,
          Input8,
          Out9 <: I,
          Input9,
          Out10 <: I,
          Input10,
          Out11 <: I,
          Input11,
          Out12 <: I,
          Input12,
          Out13 <: I,
          Input13,
          Out14 <: I,
          Input14,
          Out15 <: I,
          Input15,
          Out16 <: I,
          Input16,
          Out17 <: I,
          Input17,
          Out18 <: I,
          Input18,
          Out19 <: I,
          Input19,
          Out20 <: I,
          Input20,
          Out21 <: I,
          Input21,
          Out22 <: I,
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
          X with Input1 with Input2 with Input3 with Input4 with Input5 with Input6 with Input7 with Input8 with Input9 with Input10 with Input11 with Input12 with Input13 with Input14 with Input15 with Input16 with Input17 with Input18 with Input19 with Input20 with Input21 with Input22,
          P,
          I
        ] = {
          new xio.XIO(
            i.toZIO.catchAll(ii =>
              XIOErrorHelperInstance2.errorCompat22(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, ii).toZIO
            )
          )
        }
      }
  }
}
