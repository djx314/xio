package xio.helper
object XIOErrorHelperInstance {
  trait MatchAll1Apply1[P <: xio.nat.error.NatEither, E1, Input <: xio.nat.has.Nat, Out] {
    def input1[Out1 <: Out, Input1 <: xio.nat.has.Nat](e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1])(implicit
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input]
    ): xio.XIO[Input#InnerPlus[Input1], P, Out]
  }
  trait MatchAll1Apply2[P <: xio.nat.error.NatEither, E1, E2, Input <: xio.nat.has.Nat, Out] {
    def input2[Out1 <: Out, Input1 <: xio.nat.has.Nat, Out2 <: Out, Input2 <: xio.nat.has.Nat](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2]
    )(implicit
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2], P, Out]
  }
  trait MatchAll1Apply3[P <: xio.nat.error.NatEither, E1, E2, E3, Input <: xio.nat.has.Nat, Out] {
    def input3[Out1 <: Out, Input1 <: xio.nat.has.Nat, Out2 <: Out, Input2 <: xio.nat.has.Nat, Out3 <: Out, Input3 <: xio.nat.has.Nat](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3]
    )(implicit
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3], P, Out]
  }
  trait MatchAll1Apply4[P <: xio.nat.error.NatEither, E1, E2, E3, E4, Input <: xio.nat.has.Nat, Out] {
    def input4[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4]
    )(implicit
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4], P, Out]
  }
  trait MatchAll1Apply5[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, Input <: xio.nat.has.Nat, Out] {
    def input5[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5]
    )(implicit
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5], P, Out]
  }
  trait MatchAll1Apply6[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, Input <: xio.nat.has.Nat, Out] {
    def input6[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat
    ](
      e1: xio.ErrorContent[E1, P] => xio.XIO[Input1, P, Out1],
      e2: xio.ErrorContent[E2, P] => xio.XIO[Input2, P, Out2],
      e3: xio.ErrorContent[E3, P] => xio.XIO[Input3, P, Out3],
      e4: xio.ErrorContent[E4, P] => xio.XIO[Input4, P, Out4],
      e5: xio.ErrorContent[E5, P] => xio.XIO[Input5, P, Out5],
      e6: xio.ErrorContent[E6, P] => xio.XIO[Input6, P, Out6]
    )(implicit
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6], P, Out]
  }
  trait MatchAll1Apply7[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, Input <: xio.nat.has.Nat, Out] {
    def input7[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7], P, Out]
  }
  trait MatchAll1Apply8[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, Input <: xio.nat.has.Nat, Out] {
    def input8[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ]
    ): xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ]
  }
  trait MatchAll1Apply9[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, Input <: xio.nat.has.Nat, Out] {
    def input9[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9], P, Out]
  }
  trait MatchAll1Apply10[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, Input <: xio.nat.has.Nat, Out] {
    def input10[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10], P, Out]
  }
  trait MatchAll1Apply11[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, Input <: xio.nat.has.Nat, Out] {
    def input11[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out]
  }
  trait MatchAll1Apply12[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, Input <: xio.nat.has.Nat, Out] {
    def input12[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out]
  }
  trait MatchAll1Apply13[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, Input <: xio.nat.has.Nat, Out] {
    def input13[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out]
  }
  trait MatchAll1Apply14[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, Input <: xio.nat.has.Nat, Out] {
    def input14[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out]
  }
  trait MatchAll1Apply15[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, Input <: xio.nat.has.Nat, Out] {
    def input15[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]],
      natReversePlus15: xio.nat.has.NatReversePlus[Input15, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out]
  }
  trait MatchAll1Apply16[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, Input <: xio.nat.has.Nat, Out] {
    def input16[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]],
      natReversePlus15: xio.nat.has.NatReversePlus[Input15, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]],
      natReversePlus16: xio.nat.has.NatReversePlus[
        Input16,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]
      ]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16], P, Out]
  }
  trait MatchAll1Apply17[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, Input <: xio.nat.has.Nat, Out] {
    def input17[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]],
      natReversePlus15: xio.nat.has.NatReversePlus[Input15, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]],
      natReversePlus16: xio.nat.has.NatReversePlus[
        Input16,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]
      ],
      natReversePlus17: xio.nat.has.NatReversePlus[
        Input17,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]
      ]
    ): xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ]
  }
  trait MatchAll1Apply18[P <: xio.nat.error.NatEither, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, Input <: xio.nat.has.Nat, Out] {
    def input18[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]],
      natReversePlus15: xio.nat.has.NatReversePlus[Input15, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]],
      natReversePlus16: xio.nat.has.NatReversePlus[
        Input16,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]
      ],
      natReversePlus17: xio.nat.has.NatReversePlus[
        Input17,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]
      ],
      natReversePlus18: xio.nat.has.NatReversePlus[
        Input18,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17]
      ]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
      Input17
    ]#InnerPlus[Input18], P, Out]
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
    def input19[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat,
      Out19 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]],
      natReversePlus15: xio.nat.has.NatReversePlus[Input15, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]],
      natReversePlus16: xio.nat.has.NatReversePlus[
        Input16,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]
      ],
      natReversePlus17: xio.nat.has.NatReversePlus[
        Input17,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]
      ],
      natReversePlus18: xio.nat.has.NatReversePlus[
        Input18,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17]
      ],
      natReversePlus19: xio.nat.has.NatReversePlus[Input19, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
      Input17
    ]#InnerPlus[Input18]#InnerPlus[Input19], P, Out]
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
    def input20[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat,
      Out19 <: Out,
      Input19 <: xio.nat.has.Nat,
      Out20 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]],
      natReversePlus15: xio.nat.has.NatReversePlus[Input15, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]],
      natReversePlus16: xio.nat.has.NatReversePlus[
        Input16,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]
      ],
      natReversePlus17: xio.nat.has.NatReversePlus[
        Input17,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]
      ],
      natReversePlus18: xio.nat.has.NatReversePlus[
        Input18,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17]
      ],
      natReversePlus19: xio.nat.has.NatReversePlus[Input19, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]],
      natReversePlus20: xio.nat.has.NatReversePlus[Input20, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
      Input17
    ]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out]
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
    def input21[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat,
      Out19 <: Out,
      Input19 <: xio.nat.has.Nat,
      Out20 <: Out,
      Input20 <: xio.nat.has.Nat,
      Out21 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]],
      natReversePlus15: xio.nat.has.NatReversePlus[Input15, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]],
      natReversePlus16: xio.nat.has.NatReversePlus[
        Input16,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]
      ],
      natReversePlus17: xio.nat.has.NatReversePlus[
        Input17,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]
      ],
      natReversePlus18: xio.nat.has.NatReversePlus[
        Input18,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17]
      ],
      natReversePlus19: xio.nat.has.NatReversePlus[Input19, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]],
      natReversePlus20: xio.nat.has.NatReversePlus[Input20, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]],
      natReversePlus21: xio.nat.has.NatReversePlus[Input21, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
      Input17
    ]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out]
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
    def input22[
      Out1 <: Out,
      Input1 <: xio.nat.has.Nat,
      Out2 <: Out,
      Input2 <: xio.nat.has.Nat,
      Out3 <: Out,
      Input3 <: xio.nat.has.Nat,
      Out4 <: Out,
      Input4 <: xio.nat.has.Nat,
      Out5 <: Out,
      Input5 <: xio.nat.has.Nat,
      Out6 <: Out,
      Input6 <: xio.nat.has.Nat,
      Out7 <: Out,
      Input7 <: xio.nat.has.Nat,
      Out8 <: Out,
      Input8 <: xio.nat.has.Nat,
      Out9 <: Out,
      Input9 <: xio.nat.has.Nat,
      Out10 <: Out,
      Input10 <: xio.nat.has.Nat,
      Out11 <: Out,
      Input11 <: xio.nat.has.Nat,
      Out12 <: Out,
      Input12 <: xio.nat.has.Nat,
      Out13 <: Out,
      Input13 <: xio.nat.has.Nat,
      Out14 <: Out,
      Input14 <: xio.nat.has.Nat,
      Out15 <: Out,
      Input15 <: xio.nat.has.Nat,
      Out16 <: Out,
      Input16 <: xio.nat.has.Nat,
      Out17 <: Out,
      Input17 <: xio.nat.has.Nat,
      Out18 <: Out,
      Input18 <: xio.nat.has.Nat,
      Out19 <: Out,
      Input19 <: xio.nat.has.Nat,
      Out20 <: Out,
      Input20 <: xio.nat.has.Nat,
      Out21 <: Out,
      Input21 <: xio.nat.has.Nat,
      Out22 <: Out,
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
      natReversePlus1: xio.nat.has.NatReversePlus[Input1, Input],
      natReversePlus2: xio.nat.has.NatReversePlus[Input2, Input#InnerPlus[Input1]],
      natReversePlus3: xio.nat.has.NatReversePlus[Input3, Input#InnerPlus[Input1]#InnerPlus[Input2]],
      natReversePlus4: xio.nat.has.NatReversePlus[Input4, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]],
      natReversePlus5: xio.nat.has.NatReversePlus[Input5, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]],
      natReversePlus6: xio.nat.has.NatReversePlus[Input6, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]],
      natReversePlus7: xio.nat.has.NatReversePlus[
        Input7,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]
      ],
      natReversePlus8: xio.nat.has.NatReversePlus[
        Input8,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]
      ],
      natReversePlus9: xio.nat.has.NatReversePlus[
        Input9,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]
      ],
      natReversePlus10: xio.nat.has.NatReversePlus[Input10, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]],
      natReversePlus11: xio.nat.has.NatReversePlus[Input11, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]],
      natReversePlus12: xio.nat.has.NatReversePlus[Input12, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]],
      natReversePlus13: xio.nat.has.NatReversePlus[Input13, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]],
      natReversePlus14: xio.nat.has.NatReversePlus[Input14, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]],
      natReversePlus15: xio.nat.has.NatReversePlus[Input15, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]],
      natReversePlus16: xio.nat.has.NatReversePlus[
        Input16,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]
      ],
      natReversePlus17: xio.nat.has.NatReversePlus[
        Input17,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]
      ],
      natReversePlus18: xio.nat.has.NatReversePlus[
        Input18,
        Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
          Input9
        ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17]
      ],
      natReversePlus19: xio.nat.has.NatReversePlus[Input19, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]],
      natReversePlus20: xio.nat.has.NatReversePlus[Input20, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]],
      natReversePlus21: xio.nat.has.NatReversePlus[Input21, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]],
      natReversePlus22: xio.nat.has.NatReversePlus[Input22, Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[
        Input6
      ]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[
        Input15
      ]#InnerPlus[Input16]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]]
    ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
      Input8
    ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
      Input17
    ]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out]
  }
  def errorCompat1[P <: xio.nat.error.NatEither, E1, Input1 <: xio.nat.has.Nat, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1], P, Out],
    u: xio.XError1[E1]
  ): xio.XIO[Input#InnerPlus[Input1], P, Out] = e1(new xio.ErrorContentImpl(u.sureRight))
  def errorCompat2[P <: xio.nat.error.NatEither, E1, Input1 <: xio.nat.has.Nat, E2, Input2 <: xio.nat.has.Nat, Input <: xio.nat.has.Nat, Out](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2], P, Out],
    u: xio.XError2[E1, E2]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2], P, Out] = u.either.fold(ii1 => errorCompat1(e1, ii1), ii2 => e2(new xio.ErrorContentImpl(ii2)))
  def errorCompat3[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3], P, Out],
    u: xio.XError3[E1, E2, E3]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3], P, Out] =
    u.either.fold(ii1 => errorCompat2(e1, e2, ii1), ii2 => e3(new xio.ErrorContentImpl(ii2)))
  def errorCompat4[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4], P, Out],
    u: xio.XError4[E1, E2, E3, E4]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4], P, Out] =
    u.either.fold(ii1 => errorCompat3(e1, e2, e3, ii1), ii2 => e4(new xio.ErrorContentImpl(ii2)))
  def errorCompat5[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5], P, Out],
    u: xio.XError5[E1, E2, E3, E4, E5]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5], P, Out] =
    u.either.fold(ii1 => errorCompat4(e1, e2, e3, e4, ii1), ii2 => e5(new xio.ErrorContentImpl(ii2)))
  def errorCompat6[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6], P, Out],
    u: xio.XError6[E1, E2, E3, E4, E5, E6]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6], P, Out] =
    u.either.fold(ii1 => errorCompat5(e1, e2, e3, e4, e5, ii1), ii2 => e6(new xio.ErrorContentImpl(ii2)))
  def errorCompat7[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7],
      P,
      Out
    ],
    e2: xio.ErrorContent[E2, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7],
      P,
      Out
    ],
    e3: xio.ErrorContent[E3, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7],
      P,
      Out
    ],
    e4: xio.ErrorContent[E4, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7],
      P,
      Out
    ],
    e5: xio.ErrorContent[E5, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7],
      P,
      Out
    ],
    e6: xio.ErrorContent[E6, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7],
      P,
      Out
    ],
    e7: xio.ErrorContent[E7, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7],
      P,
      Out
    ],
    u: xio.XError7[E1, E2, E3, E4, E5, E6, E7]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7], P, Out] =
    u.either.fold(ii1 => errorCompat6(e1, e2, e3, e4, e5, e6, ii1), ii2 => e7(new xio.ErrorContentImpl(ii2)))
  def errorCompat8[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ],
    e2: xio.ErrorContent[E2, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ],
    e3: xio.ErrorContent[E3, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ],
    e4: xio.ErrorContent[E4, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ],
    e5: xio.ErrorContent[E5, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ],
    e6: xio.ErrorContent[E6, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ],
    e7: xio.ErrorContent[E7, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ],
    e8: xio.ErrorContent[E8, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
      P,
      Out
    ],
    u: xio.XError8[E1, E2, E3, E4, E5, E6, E7, E8]
  ): xio.XIO[
    Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8],
    P,
    Out
  ] = u.either.fold(ii1 => errorCompat7(e1, e2, e3, e4, e5, e6, e7, ii1), ii2 => e8(new xio.ErrorContentImpl(ii2)))
  def errorCompat9[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9], P, Out],
    u: xio.XError9[E1, E2, E3, E4, E5, E6, E7, E8, E9]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9], P, Out] = u.either.fold(ii1 => errorCompat8(e1, e2, e3, e4, e5, e6, e7, e8, ii1), ii2 => e9(new xio.ErrorContentImpl(ii2)))
  def errorCompat10[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10], P, Out],
    u: xio.XError10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10], P, Out] = u.either.fold(ii1 => errorCompat9(e1, e2, e3, e4, e5, e6, e7, e8, e9, ii1), ii2 => e10(new xio.ErrorContentImpl(ii2)))
  def errorCompat11[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out],
    u: xio.XError11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11], P, Out] =
    u.either.fold(ii1 => errorCompat10(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, ii1), ii2 => e11(new xio.ErrorContentImpl(ii2)))
  def errorCompat12[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out],
    u: xio.XError12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12], P, Out] =
    u.either.fold(ii1 => errorCompat11(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, ii1), ii2 => e12(new xio.ErrorContentImpl(ii2)))
  def errorCompat13[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out],
    u: xio.XError13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13], P, Out] =
    u.either.fold(ii1 => errorCompat12(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, ii1), ii2 => e13(new xio.ErrorContentImpl(ii2)))
  def errorCompat14[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out],
    u: xio.XError14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14], P, Out] =
    u.either.fold(ii1 => errorCompat13(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, ii1), ii2 => e14(new xio.ErrorContentImpl(ii2)))
  def errorCompat15[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    E15,
    Input15 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out],
    u: xio.XError15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15], P, Out] =
    u.either.fold(ii1 => errorCompat14(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, ii1), ii2 => e15(new xio.ErrorContentImpl(ii2)))
  def errorCompat16[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    E15,
    Input15 <: xio.nat.has.Nat,
    E16,
    Input16 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e2: xio.ErrorContent[E2, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e3: xio.ErrorContent[E3, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e4: xio.ErrorContent[E4, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e5: xio.ErrorContent[E5, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e6: xio.ErrorContent[E6, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e7: xio.ErrorContent[E7, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e8: xio.ErrorContent[E8, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e9: xio.ErrorContent[E9, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e10: xio.ErrorContent[E10, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e11: xio.ErrorContent[E11, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e12: xio.ErrorContent[E12, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e13: xio.ErrorContent[E13, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e14: xio.ErrorContent[E14, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e15: xio.ErrorContent[E15, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    e16: xio.ErrorContent[E16, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16],
      P,
      Out
    ],
    u: xio.XError16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16], P, Out] =
    u.either.fold(ii1 => errorCompat15(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, ii1), ii2 => e16(new xio.ErrorContentImpl(ii2)))
  def errorCompat17[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    E15,
    Input15 <: xio.nat.has.Nat,
    E16,
    Input16 <: xio.nat.has.Nat,
    E17,
    Input17 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e2: xio.ErrorContent[E2, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e3: xio.ErrorContent[E3, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e4: xio.ErrorContent[E4, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e5: xio.ErrorContent[E5, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e6: xio.ErrorContent[E6, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e7: xio.ErrorContent[E7, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e8: xio.ErrorContent[E8, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e9: xio.ErrorContent[E9, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e10: xio.ErrorContent[E10, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e11: xio.ErrorContent[E11, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e12: xio.ErrorContent[E12, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e13: xio.ErrorContent[E13, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e14: xio.ErrorContent[E14, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e15: xio.ErrorContent[E15, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e16: xio.ErrorContent[E16, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    e17: xio.ErrorContent[E17, P] => xio.XIO[
      Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
        Input9
      ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
      P,
      Out
    ],
    u: xio.XError17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]
  ): xio.XIO[
    Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[Input8]#InnerPlus[
      Input9
    ]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[Input17],
    P,
    Out
  ] = u.either.fold(ii1 => errorCompat16(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, ii1), ii2 => e17(new xio.ErrorContentImpl(ii2)))
  def errorCompat18[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    E15,
    Input15 <: xio.nat.has.Nat,
    E16,
    Input16 <: xio.nat.has.Nat,
    E17,
    Input17 <: xio.nat.has.Nat,
    E18,
    Input18 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18], P, Out],
    u: xio.XError18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
    Input17
  ]#InnerPlus[Input18], P, Out] =
    u.either.fold(ii1 => errorCompat17(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, ii1), ii2 => e18(new xio.ErrorContentImpl(ii2)))
  def errorCompat19[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    E15,
    Input15 <: xio.nat.has.Nat,
    E16,
    Input16 <: xio.nat.has.Nat,
    E17,
    Input17 <: xio.nat.has.Nat,
    E18,
    Input18 <: xio.nat.has.Nat,
    E19,
    Input19 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19], P, Out],
    u: xio.XError19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
    Input17
  ]#InnerPlus[Input18]#InnerPlus[Input19], P, Out] =
    u.either.fold(ii1 => errorCompat18(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, ii1), ii2 => e19(new xio.ErrorContentImpl(ii2)))
  def errorCompat20[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    E15,
    Input15 <: xio.nat.has.Nat,
    E16,
    Input16 <: xio.nat.has.Nat,
    E17,
    Input17 <: xio.nat.has.Nat,
    E18,
    Input18 <: xio.nat.has.Nat,
    E19,
    Input19 <: xio.nat.has.Nat,
    E20,
    Input20 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out],
    u: xio.XError20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
    Input17
  ]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20], P, Out] =
    u.either
      .fold(ii1 => errorCompat19(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, ii1), ii2 => e20(new xio.ErrorContentImpl(ii2)))
  def errorCompat21[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    E15,
    Input15 <: xio.nat.has.Nat,
    E16,
    Input16 <: xio.nat.has.Nat,
    E17,
    Input17 <: xio.nat.has.Nat,
    E18,
    Input18 <: xio.nat.has.Nat,
    E19,
    Input19 <: xio.nat.has.Nat,
    E20,
    Input20 <: xio.nat.has.Nat,
    E21,
    Input21 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    e21: xio.ErrorContent[E21, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out],
    u: xio.XError21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
    Input17
  ]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21], P, Out] =
    u.either.fold(
      ii1 => errorCompat20(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, ii1),
      ii2 => e21(new xio.ErrorContentImpl(ii2))
    )
  def errorCompat22[
    P <: xio.nat.error.NatEither,
    E1,
    Input1 <: xio.nat.has.Nat,
    E2,
    Input2 <: xio.nat.has.Nat,
    E3,
    Input3 <: xio.nat.has.Nat,
    E4,
    Input4 <: xio.nat.has.Nat,
    E5,
    Input5 <: xio.nat.has.Nat,
    E6,
    Input6 <: xio.nat.has.Nat,
    E7,
    Input7 <: xio.nat.has.Nat,
    E8,
    Input8 <: xio.nat.has.Nat,
    E9,
    Input9 <: xio.nat.has.Nat,
    E10,
    Input10 <: xio.nat.has.Nat,
    E11,
    Input11 <: xio.nat.has.Nat,
    E12,
    Input12 <: xio.nat.has.Nat,
    E13,
    Input13 <: xio.nat.has.Nat,
    E14,
    Input14 <: xio.nat.has.Nat,
    E15,
    Input15 <: xio.nat.has.Nat,
    E16,
    Input16 <: xio.nat.has.Nat,
    E17,
    Input17 <: xio.nat.has.Nat,
    E18,
    Input18 <: xio.nat.has.Nat,
    E19,
    Input19 <: xio.nat.has.Nat,
    E20,
    Input20 <: xio.nat.has.Nat,
    E21,
    Input21 <: xio.nat.has.Nat,
    E22,
    Input22 <: xio.nat.has.Nat,
    Input <: xio.nat.has.Nat,
    Out
  ](
    e1: xio.ErrorContent[E1, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e2: xio.ErrorContent[E2, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e3: xio.ErrorContent[E3, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e4: xio.ErrorContent[E4, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e5: xio.ErrorContent[E5, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e6: xio.ErrorContent[E6, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e7: xio.ErrorContent[E7, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e8: xio.ErrorContent[E8, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e9: xio.ErrorContent[E9, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e10: xio.ErrorContent[E10, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e11: xio.ErrorContent[E11, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e12: xio.ErrorContent[E12, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e13: xio.ErrorContent[E13, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e14: xio.ErrorContent[E14, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e15: xio.ErrorContent[E15, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e16: xio.ErrorContent[E16, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e17: xio.ErrorContent[E17, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e18: xio.ErrorContent[E18, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e19: xio.ErrorContent[E19, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e20: xio.ErrorContent[E20, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e21: xio.ErrorContent[E21, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    e22: xio.ErrorContent[E22, P] => xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[
      Input7
    ]#InnerPlus[Input8]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[
      Input16
    ]#InnerPlus[Input17]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out],
    u: xio.XError22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22]
  ): xio.XIO[Input#InnerPlus[Input1]#InnerPlus[Input2]#InnerPlus[Input3]#InnerPlus[Input4]#InnerPlus[Input5]#InnerPlus[Input6]#InnerPlus[Input7]#InnerPlus[
    Input8
  ]#InnerPlus[Input9]#InnerPlus[Input10]#InnerPlus[Input11]#InnerPlus[Input12]#InnerPlus[Input13]#InnerPlus[Input14]#InnerPlus[Input15]#InnerPlus[Input16]#InnerPlus[
    Input17
  ]#InnerPlus[Input18]#InnerPlus[Input19]#InnerPlus[Input20]#InnerPlus[Input21]#InnerPlus[Input22], P, Out] =
    u.either.fold(
      ii1 => errorCompat21(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, ii1),
      ii2 => e22(new xio.ErrorContentImpl(ii2))
    )
}
