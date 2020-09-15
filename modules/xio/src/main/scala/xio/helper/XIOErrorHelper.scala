package xio.helper
trait XIOErrorHelper {
  implicit class XIOErrorMatchAll1ImplicitClass1[X <: xio.nat.has.Nat, E1, I](i: xio.XIO[X, xio.XError1[E1], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply1[P, E1, X, I] {
        override def input1[Out1 <: I, Input1 <: xio.nat.has.Nat](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1]
        )(implicit natReversePlus1: xio.nat.has.NatReversePlus[Input1, X]): xio.XIO[xio.XHasM2[X, Input1], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError1[E1]](XIOPlusHelper.take1Plus1(natReversePlus1))
          val preXIO   = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2
              .errorCompat1(e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus1)))), ii)
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass2[X <: xio.nat.has.Nat, E1, E2, I](i: xio.XIO[X, xio.XError2[E1, E2], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply2[P, E1, E2, X, I] {
        override def input2[Out1 <: I, Input1 <: xio.nat.has.Nat, Out2 <: I, Input2 <: xio.nat.has.Nat](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2]
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]]
        ): xio.XIO[xio.XHasM2[xio.XHasM2[X, Input1], Input2], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError2[E1, E2]](XIOPlusHelper.take1Plus2(natReversePlus1, natReversePlus2))
          val preXIO   = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat2(
              e1.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus1, natReversePlus2)))),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus2)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass3[X <: xio.nat.has.Nat, E1, E2, E3, I](i: xio.XIO[X, xio.XError3[E1, E2, E3], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply3[P, E1, E2, E3, X, I] {
        override def input3[Out1 <: I, Input1 <: xio.nat.has.Nat, Out2 <: I, Input2 <: xio.nat.has.Nat, Out3 <: I, Input3 <: xio.nat.has.Nat](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3]
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]]
        ): xio.XIO[xio.XHasM2[xio.XHasM3[X, Input1, Input2], Input3], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError3[E1, E2, E3]](XIOPlusHelper.take1Plus3(natReversePlus1, natReversePlus2, natReversePlus3))
          val preXIO   = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat3(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus1, natReversePlus2, natReversePlus3)))
              ),
              e2.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus2, natReversePlus3)))),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus3)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass4[X <: xio.nat.has.Nat, E1, E2, E3, E4, I](i: xio.XIO[X, xio.XError4[E1, E2, E3, E4], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply4[P, E1, E2, E3, E4, X, I] {
        override def input4[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4]
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]]
        ): xio.XIO[xio.XHasM2[xio.XHasM4[X, Input1, Input2, Input3], Input4], P, I] = {
          val preLayer =
            XLayerHelper.simpleFromFunctionMany[xio.XError4[E1, E2, E3, E4]](XIOPlusHelper.take1Plus4(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4))
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat4(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4))
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus2, natReversePlus3, natReversePlus4)))
              ),
              e3.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus3, natReversePlus4)))),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus4)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass5[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, I](i: xio.XIO[X, xio.XError5[E1, E2, E3, E4, E5], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply5[P, E1, E2, E3, E4, E5, X, I] {
        override def input5[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5]
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]]
        ): xio.XIO[xio.XHasM2[xio.XHasM5[X, Input1, Input2, Input3, Input4], Input5], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError5[E1, E2, E3, E4, E5]](
            XIOPlusHelper.take1Plus5(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5)
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat5(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5))
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5))
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus3, natReversePlus4, natReversePlus5)))
              ),
              e4.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus4, natReversePlus5)))),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus5)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass6[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, I](i: xio.XIO[X, xio.XError6[E1, E2, E3, E4, E5, E6], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply6[P, E1, E2, E3, E4, E5, E6, X, I] {
        override def input6[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6]
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]]
        ): xio.XIO[xio.XHasM2[xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5], Input6], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError6[E1, E2, E3, E4, E5, E6]](
            XIOPlusHelper.take1Plus6(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6)
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat6(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6)
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6))
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6))
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus4, natReversePlus5, natReversePlus6)))
              ),
              e5.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus5, natReversePlus6)))),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus6)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass7[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, I](i: xio.XIO[X, xio.XError7[E1, E2, E3, E4, E5, E6, E7], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply7[P, E1, E2, E3, E4, E5, E6, E7, X, I] {
        override def input7[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7]
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]]
        ): xio.XIO[xio.XHasM2[xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6], Input7], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError7[E1, E2, E3, E4, E5, E6, E7]](
            XIOPlusHelper.take1Plus7(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7)
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat7(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7)
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7)
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7))
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7))
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus5, natReversePlus6, natReversePlus7)))
              ),
              e6.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus6, natReversePlus7)))),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus7)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass8[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, I](i: xio.XIO[X, xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8], I]) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply8[P, E1, E2, E3, E4, E5, E6, E7, E8, X, I] {
        override def input8[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat
        ](
          e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
          e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
          e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
          e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
          e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
          e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6],
          e7: xio.ErrorContent[E7, P] => xio.XIO[Input7, P, Out7],
          e8: xio.ErrorContent[E8, P] => xio.XIO[Input8, P, Out8]
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]]
        ): xio.XIO[xio.XHasM2[xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7], Input8], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8]](
            XIOPlusHelper
              .take1Plus8(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8)
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat8(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper
                      .takePlus8(natReversePlus1, natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8)
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8)
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8)
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8))
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8))
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus6, natReversePlus7, natReversePlus8)))
              ),
              e7.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus7, natReversePlus8)))),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus8)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass9[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, I](
    i: xio.XIO[X, xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply9[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, X, I] {
        override def input9[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]]
        ): xio.XIO[xio.XHasM2[xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8], Input9], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9]](
            XIOPlusHelper.take1Plus9(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat9(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper
                      .takePlus8(natReversePlus2, natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9)
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9)
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9)
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9))
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9))
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus7, natReversePlus8, natReversePlus9)))
              ),
              e8.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus8, natReversePlus9)))),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus9)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass10[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, I](
    i: xio.XIO[X, xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply10[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, X, I] {
        override def input10[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]]
        ): xio.XIO[xio.XHasM2[xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9], Input10], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]](
            XIOPlusHelper.take1Plus10(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat10(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper
                      .takePlus8(natReversePlus3, natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10)
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10)
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10)
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10))
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10))
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus8, natReversePlus9, natReversePlus10)))
              ),
              e9.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus9, natReversePlus10)))),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus10)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass11[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, I](
    i: xio.XIO[X, xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply11[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, X, I] {
        override def input11[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]]
        ): xio.XIO[xio.XHasM2[xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10], Input11], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]](
            XIOPlusHelper.take1Plus11(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat11(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper
                      .takePlus8(natReversePlus4, natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11)
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus5, natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11)
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11)
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11))
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11))
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus9, natReversePlus10, natReversePlus11)))
              ),
              e10.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus10, natReversePlus11)))),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus11)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass12[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, I](
    i: xio.XIO[X, xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply12[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, X, I] {
        override def input12[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]]
        ): xio.XIO[xio.XHasM2[xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11], Input12], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]](
            XIOPlusHelper.take1Plus12(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat12(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus6, natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12)
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12)
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12))
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12))
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus10, natReversePlus11, natReversePlus12)))
              ),
              e11.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus11, natReversePlus12)))),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus12)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass13[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, I](
    i: xio.XIO[X, xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply13[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, X, I] {
        override def input13[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]]
        ): xio.XIO[xio.XHasM2[xio.XHasM13[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11, Input12], Input13], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]](
            XIOPlusHelper.take1Plus13(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12,
              natReversePlus13
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat13(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus7, natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13)
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13)
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13))
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13))
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus11, natReversePlus12, natReversePlus13)))
              ),
              e12.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus12, natReversePlus13)))),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus13)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass14[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, I](
    i: xio.XIO[X, xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply14[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, X, I] {
        override def input14[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]]
        ): xio.XIO[
          xio.XHasM2[xio.XHasM14[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11, Input12, Input13], Input14],
          P,
          I
        ] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]](
            XIOPlusHelper.take1Plus14(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12,
              natReversePlus13,
              natReversePlus14
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat14(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus8, natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14)
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14)
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14))
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14))
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus12, natReversePlus13, natReversePlus14)))
              ),
              e13.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus13, natReversePlus14)))),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus14)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass15[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, I](
    i: xio.XIO[X, xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]: XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply15[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, X, I] {
        override def input15[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]],
          natReversePlus15: xio.nat.has.NatReversePlus[Input15, xio.XHasM15[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14
          ]]
        ): xio.XIO[
          xio.XHasM2[xio.XHasM15[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11, Input12, Input13, Input14], Input15],
          P,
          I
        ] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]](
            XIOPlusHelper.take1Plus15(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12,
              natReversePlus13,
              natReversePlus14,
              natReversePlus15
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat15(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus15(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15
                    )
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus9, natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15)
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15)
                  )
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15))
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15))
                )
              ),
              e13.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus13, natReversePlus14, natReversePlus15)))
              ),
              e14.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus14, natReversePlus15)))),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus15)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass16[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, I](
    i: xio.XIO[X, xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply16[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, X, I] {
        override def input16[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]],
          natReversePlus15: xio.nat.has.NatReversePlus[Input15, xio.XHasM15[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14
          ]],
          natReversePlus16: xio.nat.has.NatReversePlus[Input16, xio.XHasM16[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15
          ]]
        ): xio.XIO[xio.XHasM2[
          xio.XHasM16[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11, Input12, Input13, Input14, Input15],
          Input16
        ], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]](
            XIOPlusHelper.take1Plus16(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12,
              natReversePlus13,
              natReversePlus14,
              natReversePlus15,
              natReversePlus16
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat16(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus16(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus15(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16
                    )
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus10, natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16)
                  )
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16)
                  )
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16))
                )
              ),
              e13.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16))
                )
              ),
              e14.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus14, natReversePlus15, natReversePlus16)))
              ),
              e15.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus15, natReversePlus16)))),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus16)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass17[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, I](
    i: xio.XIO[X, xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply17[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, X, I] {
        override def input17[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]],
          natReversePlus15: xio.nat.has.NatReversePlus[Input15, xio.XHasM15[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14
          ]],
          natReversePlus16: xio.nat.has.NatReversePlus[Input16, xio.XHasM16[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15
          ]],
          natReversePlus17: xio.nat.has.NatReversePlus[Input17, xio.XHasM17[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16
          ]]
        ): xio.XIO[xio.XHasM2[
          xio.XHasM17[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11, Input12, Input13, Input14, Input15, Input16],
          Input17
        ], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]](
            XIOPlusHelper.take1Plus17(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12,
              natReversePlus13,
              natReversePlus14,
              natReversePlus15,
              natReversePlus16,
              natReversePlus17
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat17(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus17(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus16(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus15(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17
                    )
                  )
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus11, natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17)
                  )
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17)
                  )
                )
              ),
              e13.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17))
                )
              ),
              e14.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17))
                )
              ),
              e15.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus15, natReversePlus16, natReversePlus17)))
              ),
              e16.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus16, natReversePlus17)))),
              e17.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus17)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass18[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, I](
    i: xio.XIO[X, xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply18[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, X, I] {
        override def input18[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]],
          natReversePlus15: xio.nat.has.NatReversePlus[Input15, xio.XHasM15[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14
          ]],
          natReversePlus16: xio.nat.has.NatReversePlus[Input16, xio.XHasM16[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15
          ]],
          natReversePlus17: xio.nat.has.NatReversePlus[Input17, xio.XHasM17[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16
          ]],
          natReversePlus18: xio.nat.has.NatReversePlus[Input18, xio.XHasM18[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17
          ]]
        ): xio.XIO[xio.XHasM2[
          xio.XHasM18[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11, Input12, Input13, Input14, Input15, Input16, Input17],
          Input18
        ], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]](
            XIOPlusHelper.take1Plus18(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12,
              natReversePlus13,
              natReversePlus14,
              natReversePlus15,
              natReversePlus16,
              natReversePlus17,
              natReversePlus18
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat18(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus18(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus17(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus16(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus15(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18
                    )
                  )
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus12, natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18)
                  )
                )
              ),
              e13.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18)
                  )
                )
              ),
              e14.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18))
                )
              ),
              e15.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18))
                )
              ),
              e16.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus16, natReversePlus17, natReversePlus18)))
              ),
              e17.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus17, natReversePlus18)))),
              e18.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus18)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass19[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, I](
    i: xio.XIO[X, xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply19[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, X, I] {
        override def input19[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat,
          Out19 <: I,
          Input19 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]],
          natReversePlus15: xio.nat.has.NatReversePlus[Input15, xio.XHasM15[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14
          ]],
          natReversePlus16: xio.nat.has.NatReversePlus[Input16, xio.XHasM16[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15
          ]],
          natReversePlus17: xio.nat.has.NatReversePlus[Input17, xio.XHasM17[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16
          ]],
          natReversePlus18: xio.nat.has.NatReversePlus[Input18, xio.XHasM18[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17
          ]],
          natReversePlus19: xio.nat.has.NatReversePlus[Input19, xio.XHasM19[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18
          ]]
        ): xio.XIO[xio.XHasM2[xio.XHasM19[
          X,
          Input1,
          Input2,
          Input3,
          Input4,
          Input5,
          Input6,
          Input7,
          Input8,
          Input9,
          Input10,
          Input11,
          Input12,
          Input13,
          Input14,
          Input15,
          Input16,
          Input17,
          Input18
        ], Input19], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]](
            XIOPlusHelper.take1Plus19(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12,
              natReversePlus13,
              natReversePlus14,
              natReversePlus15,
              natReversePlus16,
              natReversePlus17,
              natReversePlus18,
              natReversePlus19
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat19(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus19(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus18(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus17(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus16(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus15(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19
                    )
                  )
                )
              ),
              e13.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus13, natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19)
                  )
                )
              ),
              e14.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19)
                  )
                )
              ),
              e15.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19))
                )
              ),
              e16.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19))
                )
              ),
              e17.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus17, natReversePlus18, natReversePlus19)))
              ),
              e18.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus18, natReversePlus19)))),
              e19.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus19)))),
              ii
            )
          )
        }
      }
  }
  implicit class XIOErrorMatchAll1ImplicitClass20[X <: xio.nat.has.Nat, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, I](
    i: xio.XIO[X, xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20], I]
  ) {
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply20[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, X, I] {
        override def input20[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat,
          Out19 <: I,
          Input19 <: xio.nat.has.Nat,
          Out20 <: I,
          Input20 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]],
          natReversePlus15: xio.nat.has.NatReversePlus[Input15, xio.XHasM15[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14
          ]],
          natReversePlus16: xio.nat.has.NatReversePlus[Input16, xio.XHasM16[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15
          ]],
          natReversePlus17: xio.nat.has.NatReversePlus[Input17, xio.XHasM17[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16
          ]],
          natReversePlus18: xio.nat.has.NatReversePlus[Input18, xio.XHasM18[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17
          ]],
          natReversePlus19: xio.nat.has.NatReversePlus[Input19, xio.XHasM19[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18
          ]],
          natReversePlus20: xio.nat.has.NatReversePlus[Input20, xio.XHasM20[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18,
            Input19
          ]]
        ): xio.XIO[xio.XHasM2[xio.XHasM20[
          X,
          Input1,
          Input2,
          Input3,
          Input4,
          Input5,
          Input6,
          Input7,
          Input8,
          Input9,
          Input10,
          Input11,
          Input12,
          Input13,
          Input14,
          Input15,
          Input16,
          Input17,
          Input18,
          Input19
        ], Input20], P, I] = {
          val preLayer = XLayerHelper.simpleFromFunctionMany[xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]](
            XIOPlusHelper.take1Plus20(
              natReversePlus1,
              natReversePlus2,
              natReversePlus3,
              natReversePlus4,
              natReversePlus5,
              natReversePlus6,
              natReversePlus7,
              natReversePlus8,
              natReversePlus9,
              natReversePlus10,
              natReversePlus11,
              natReversePlus12,
              natReversePlus13,
              natReversePlus14,
              natReversePlus15,
              natReversePlus16,
              natReversePlus17,
              natReversePlus18,
              natReversePlus19,
              natReversePlus20
            )
          )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat20(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus20(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus19(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus18(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus17(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus16(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus15(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e13.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20
                    )
                  )
                )
              ),
              e14.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus14, natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20)
                  )
                )
              ),
              e15.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20)
                  )
                )
              ),
              e16.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20))
                )
              ),
              e17.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20))
                )
              ),
              e18.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus18, natReversePlus19, natReversePlus20)))
              ),
              e19.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus19, natReversePlus20)))),
              e20.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus20)))),
              ii
            )
          )
        }
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
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply21[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, X, I] {
        override def input21[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat,
          Out19 <: I,
          Input19 <: xio.nat.has.Nat,
          Out20 <: I,
          Input20 <: xio.nat.has.Nat,
          Out21 <: I,
          Input21 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]],
          natReversePlus15: xio.nat.has.NatReversePlus[Input15, xio.XHasM15[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14
          ]],
          natReversePlus16: xio.nat.has.NatReversePlus[Input16, xio.XHasM16[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15
          ]],
          natReversePlus17: xio.nat.has.NatReversePlus[Input17, xio.XHasM17[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16
          ]],
          natReversePlus18: xio.nat.has.NatReversePlus[Input18, xio.XHasM18[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17
          ]],
          natReversePlus19: xio.nat.has.NatReversePlus[Input19, xio.XHasM19[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18
          ]],
          natReversePlus20: xio.nat.has.NatReversePlus[Input20, xio.XHasM20[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18,
            Input19
          ]],
          natReversePlus21: xio.nat.has.NatReversePlus[Input21, xio.XHasM21[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18,
            Input19,
            Input20
          ]]
        ): xio.XIO[xio.XHasM2[xio.XHasM21[
          X,
          Input1,
          Input2,
          Input3,
          Input4,
          Input5,
          Input6,
          Input7,
          Input8,
          Input9,
          Input10,
          Input11,
          Input12,
          Input13,
          Input14,
          Input15,
          Input16,
          Input17,
          Input18,
          Input19,
          Input20
        ], Input21], P, I] = {
          val preLayer =
            XLayerHelper.simpleFromFunctionMany[xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]](
              XIOPlusHelper.take1Plus21(
                natReversePlus1,
                natReversePlus2,
                natReversePlus3,
                natReversePlus4,
                natReversePlus5,
                natReversePlus6,
                natReversePlus7,
                natReversePlus8,
                natReversePlus9,
                natReversePlus10,
                natReversePlus11,
                natReversePlus12,
                natReversePlus13,
                natReversePlus14,
                natReversePlus15,
                natReversePlus16,
                natReversePlus17,
                natReversePlus18,
                natReversePlus19,
                natReversePlus20,
                natReversePlus21
              )
            )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat21(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus21(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus20(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus19(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus18(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus17(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus16(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus15(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e13.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e14.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21
                    )
                  )
                )
              ),
              e15.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus15, natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20, natReversePlus21)
                  )
                )
              ),
              e16.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20, natReversePlus21)
                  )
                )
              ),
              e17.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20, natReversePlus21))
                )
              ),
              e18.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus18, natReversePlus19, natReversePlus20, natReversePlus21))
                )
              ),
              e19.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus19, natReversePlus20, natReversePlus21)))
              ),
              e20.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus20, natReversePlus21)))),
              e21.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus21)))),
              ii
            )
          )
        }
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
    def allErrorTo[P <: xio.nat.error.NatEither]
      : XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] =
      new XIOErrorHelperInstance.MatchAll1Apply22[P, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, X, I] {
        override def input22[
          Out1 <: I,
          Input1 <: xio.nat.has.Nat,
          Out2 <: I,
          Input2 <: xio.nat.has.Nat,
          Out3 <: I,
          Input3 <: xio.nat.has.Nat,
          Out4 <: I,
          Input4 <: xio.nat.has.Nat,
          Out5 <: I,
          Input5 <: xio.nat.has.Nat,
          Out6 <: I,
          Input6 <: xio.nat.has.Nat,
          Out7 <: I,
          Input7 <: xio.nat.has.Nat,
          Out8 <: I,
          Input8 <: xio.nat.has.Nat,
          Out9 <: I,
          Input9 <: xio.nat.has.Nat,
          Out10 <: I,
          Input10 <: xio.nat.has.Nat,
          Out11 <: I,
          Input11 <: xio.nat.has.Nat,
          Out12 <: I,
          Input12 <: xio.nat.has.Nat,
          Out13 <: I,
          Input13 <: xio.nat.has.Nat,
          Out14 <: I,
          Input14 <: xio.nat.has.Nat,
          Out15 <: I,
          Input15 <: xio.nat.has.Nat,
          Out16 <: I,
          Input16 <: xio.nat.has.Nat,
          Out17 <: I,
          Input17 <: xio.nat.has.Nat,
          Out18 <: I,
          Input18 <: xio.nat.has.Nat,
          Out19 <: I,
          Input19 <: xio.nat.has.Nat,
          Out20 <: I,
          Input20 <: xio.nat.has.Nat,
          Out21 <: I,
          Input21 <: xio.nat.has.Nat,
          Out22 <: I,
          Input22 <: xio.nat.has.Nat
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
        )(implicit
          natReversePlus1: xio.nat.has.NatReversePlus[Input1, xio.XHasM1[X]],
          natReversePlus2: xio.nat.has.NatReversePlus[Input2, xio.XHasM2[X, Input1]],
          natReversePlus3: xio.nat.has.NatReversePlus[Input3, xio.XHasM3[X, Input1, Input2]],
          natReversePlus4: xio.nat.has.NatReversePlus[Input4, xio.XHasM4[X, Input1, Input2, Input3]],
          natReversePlus5: xio.nat.has.NatReversePlus[Input5, xio.XHasM5[X, Input1, Input2, Input3, Input4]],
          natReversePlus6: xio.nat.has.NatReversePlus[Input6, xio.XHasM6[X, Input1, Input2, Input3, Input4, Input5]],
          natReversePlus7: xio.nat.has.NatReversePlus[Input7, xio.XHasM7[X, Input1, Input2, Input3, Input4, Input5, Input6]],
          natReversePlus8: xio.nat.has.NatReversePlus[Input8, xio.XHasM8[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7]],
          natReversePlus9: xio.nat.has.NatReversePlus[Input9, xio.XHasM9[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8]],
          natReversePlus10: xio.nat.has.NatReversePlus[Input10, xio.XHasM10[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9]],
          natReversePlus11: xio.nat.has.NatReversePlus[Input11, xio.XHasM11[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10]],
          natReversePlus12: xio.nat.has.NatReversePlus[Input12, xio.XHasM12[X, Input1, Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10, Input11]],
          natReversePlus13: xio.nat.has.NatReversePlus[Input13, xio.XHasM13[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12
          ]],
          natReversePlus14: xio.nat.has.NatReversePlus[Input14, xio.XHasM14[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13
          ]],
          natReversePlus15: xio.nat.has.NatReversePlus[Input15, xio.XHasM15[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14
          ]],
          natReversePlus16: xio.nat.has.NatReversePlus[Input16, xio.XHasM16[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15
          ]],
          natReversePlus17: xio.nat.has.NatReversePlus[Input17, xio.XHasM17[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16
          ]],
          natReversePlus18: xio.nat.has.NatReversePlus[Input18, xio.XHasM18[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17
          ]],
          natReversePlus19: xio.nat.has.NatReversePlus[Input19, xio.XHasM19[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18
          ]],
          natReversePlus20: xio.nat.has.NatReversePlus[Input20, xio.XHasM20[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18,
            Input19
          ]],
          natReversePlus21: xio.nat.has.NatReversePlus[Input21, xio.XHasM21[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18,
            Input19,
            Input20
          ]],
          natReversePlus22: xio.nat.has.NatReversePlus[Input22, xio.XHasM22[
            X,
            Input1,
            Input2,
            Input3,
            Input4,
            Input5,
            Input6,
            Input7,
            Input8,
            Input9,
            Input10,
            Input11,
            Input12,
            Input13,
            Input14,
            Input15,
            Input16,
            Input17,
            Input18,
            Input19,
            Input20,
            Input21
          ]]
        ): xio.XIO[xio.XHasM2[xio.XHasM22[
          X,
          Input1,
          Input2,
          Input3,
          Input4,
          Input5,
          Input6,
          Input7,
          Input8,
          Input9,
          Input10,
          Input11,
          Input12,
          Input13,
          Input14,
          Input15,
          Input16,
          Input17,
          Input18,
          Input19,
          Input20,
          Input21
        ], Input22], P, I] = {
          val preLayer =
            XLayerHelper.simpleFromFunctionMany[xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22]](
              XIOPlusHelper.take1Plus22(
                natReversePlus1,
                natReversePlus2,
                natReversePlus3,
                natReversePlus4,
                natReversePlus5,
                natReversePlus6,
                natReversePlus7,
                natReversePlus8,
                natReversePlus9,
                natReversePlus10,
                natReversePlus11,
                natReversePlus12,
                natReversePlus13,
                natReversePlus14,
                natReversePlus15,
                natReversePlus16,
                natReversePlus17,
                natReversePlus18,
                natReversePlus19,
                natReversePlus20,
                natReversePlus21,
                natReversePlus22
              )
            )
          val preXIO = XIOHelper.simpleProvideLayer(i)(preLayer)
          XIOHelper.simpleCatchAll(preXIO)(ii =>
            XIOErrorHelperInstance2.errorCompat22(
              e1.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus22(
                      natReversePlus1,
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e2.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus21(
                      natReversePlus2,
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e3.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus20(
                      natReversePlus3,
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e4.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus19(
                      natReversePlus4,
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e5.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus18(
                      natReversePlus5,
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e6.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus17(
                      natReversePlus6,
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e7.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus16(
                      natReversePlus7,
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e8.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus15(
                      natReversePlus8,
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e9.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus14(
                      natReversePlus9,
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e10.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus13(
                      natReversePlus10,
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e11.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus12(
                      natReversePlus11,
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e12.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus11(
                      natReversePlus12,
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e13.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus10(
                      natReversePlus13,
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e14.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus9(
                      natReversePlus14,
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e15.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus8(
                      natReversePlus15,
                      natReversePlus16,
                      natReversePlus17,
                      natReversePlus18,
                      natReversePlus19,
                      natReversePlus20,
                      natReversePlus21,
                      natReversePlus22
                    )
                  )
                )
              ),
              e16.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus7(natReversePlus16, natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20, natReversePlus21, natReversePlus22)
                  )
                )
              ),
              e17.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](
                    XIOPlusHelper.takePlus6(natReversePlus17, natReversePlus18, natReversePlus19, natReversePlus20, natReversePlus21, natReversePlus22)
                  )
                )
              ),
              e18.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper
                    .simpleFromFunctionMany[P](XIOPlusHelper.takePlus5(natReversePlus18, natReversePlus19, natReversePlus20, natReversePlus21, natReversePlus22))
                )
              ),
              e19.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(
                  XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus4(natReversePlus19, natReversePlus20, natReversePlus21, natReversePlus22))
                )
              ),
              e20.andThen(p =>
                XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus3(natReversePlus20, natReversePlus21, natReversePlus22)))
              ),
              e21.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus2(natReversePlus21, natReversePlus22)))),
              e22.andThen(p => XIOHelper.simpleProvideLayer(p)(XLayerHelper.simpleFromFunctionMany[P](XIOPlusHelper.takePlus1(natReversePlus22)))),
              ii
            )
          )
        }
      }
  }
}
