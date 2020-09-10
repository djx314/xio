package xio
trait XHasAlias {
  type XHas0                                                                                                 = nat.has.NatZero
  type XHas1[T1]                                                                                             = nat.has.NatPositive[nat.has.NatZero, T1]
  type XHas2[T1, T2]                                                                                         = nat.has.NatPositive[XHas1[T2], T1]
  type XHasM2[T1 <: nat.has.Nat, T2 <: nat.has.Nat]                                                          = T1#Plus[T2]
  type XHas3[T1, T2, T3]                                                                                     = nat.has.NatPositive[XHas2[T2, T3], T1]
  type XHasM3[T1 <: nat.has.Nat, T2 <: nat.has.Nat, T3 <: nat.has.Nat]                                       = T1#Plus[T2]#Plus[T3]
  type XHas4[T1, T2, T3, T4]                                                                                 = nat.has.NatPositive[XHas3[T2, T3, T4], T1]
  type XHasM4[T1 <: nat.has.Nat, T2 <: nat.has.Nat, T3 <: nat.has.Nat, T4 <: nat.has.Nat]                    = T1#Plus[T2]#Plus[T3]#Plus[T4]
  type XHas5[T1, T2, T3, T4, T5]                                                                             = nat.has.NatPositive[XHas4[T2, T3, T4, T5], T1]
  type XHasM5[T1 <: nat.has.Nat, T2 <: nat.has.Nat, T3 <: nat.has.Nat, T4 <: nat.has.Nat, T5 <: nat.has.Nat] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]
  type XHas6[T1, T2, T3, T4, T5, T6]                                                                         = nat.has.NatPositive[XHas5[T2, T3, T4, T5, T6], T1]
  type XHasM6[T1 <: nat.has.Nat, T2 <: nat.has.Nat, T3 <: nat.has.Nat, T4 <: nat.has.Nat, T5 <: nat.has.Nat, T6 <: nat.has.Nat] =
    T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]
  type XHas7[T1, T2, T3, T4, T5, T6, T7] = nat.has.NatPositive[XHas6[T2, T3, T4, T5, T6, T7], T1]
  type XHasM7[T1 <: nat.has.Nat, T2 <: nat.has.Nat, T3 <: nat.has.Nat, T4 <: nat.has.Nat, T5 <: nat.has.Nat, T6 <: nat.has.Nat, T7 <: nat.has.Nat] =
    T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]
  type XHas8[T1, T2, T3, T4, T5, T6, T7, T8] = nat.has.NatPositive[XHas7[T2, T3, T4, T5, T6, T7, T8], T1]
  type XHasM8[T1 <: nat.has.Nat, T2 <: nat.has.Nat, T3 <: nat.has.Nat, T4 <: nat.has.Nat, T5 <: nat.has.Nat, T6 <: nat.has.Nat, T7 <: nat.has.Nat, T8 <: nat.has.Nat] =
    T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]
  type XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = nat.has.NatPositive[XHas8[T2, T3, T4, T5, T6, T7, T8, T9], T1]
  type XHasM9[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat
  ]                                                    = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]
  type XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = nat.has.NatPositive[XHas9[T2, T3, T4, T5, T6, T7, T8, T9, T10], T1]
  type XHasM10[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat
  ]                                                         = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]
  type XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = nat.has.NatPositive[XHas10[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T1]
  type XHasM11[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat
  ]                                                              = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]
  type XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = nat.has.NatPositive[XHas11[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T1]
  type XHasM12[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat
  ]                                                                   = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]
  type XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = nat.has.NatPositive[XHas12[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T1]
  type XHasM13[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat
  ]                                                                        = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]
  type XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = nat.has.NatPositive[XHas13[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T1]
  type XHasM14[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]
  type XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    nat.has.NatPositive[XHas14[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T1]
  type XHasM15[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat,
    T15 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]#Plus[T15]
  type XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    nat.has.NatPositive[XHas15[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T1]
  type XHasM16[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat,
    T15 <: nat.has.Nat,
    T16 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]#Plus[T15]#Plus[T16]
  type XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    nat.has.NatPositive[XHas16[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T1]
  type XHasM17[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat,
    T15 <: nat.has.Nat,
    T16 <: nat.has.Nat,
    T17 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]#Plus[T15]#Plus[T16]#Plus[T17]
  type XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    nat.has.NatPositive[XHas17[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T1]
  type XHasM18[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat,
    T15 <: nat.has.Nat,
    T16 <: nat.has.Nat,
    T17 <: nat.has.Nat,
    T18 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]#Plus[T15]#Plus[T16]#Plus[T17]#Plus[T18]
  type XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    nat.has.NatPositive[XHas18[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T1]
  type XHasM19[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat,
    T15 <: nat.has.Nat,
    T16 <: nat.has.Nat,
    T17 <: nat.has.Nat,
    T18 <: nat.has.Nat,
    T19 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]#Plus[T15]#Plus[T16]#Plus[T17]#Plus[
    T18
  ]#Plus[T19]
  type XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    nat.has.NatPositive[XHas19[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T1]
  type XHasM20[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat,
    T15 <: nat.has.Nat,
    T16 <: nat.has.Nat,
    T17 <: nat.has.Nat,
    T18 <: nat.has.Nat,
    T19 <: nat.has.Nat,
    T20 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]#Plus[T15]#Plus[T16]#Plus[T17]#Plus[
    T18
  ]#Plus[T19]#Plus[T20]
  type XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    nat.has.NatPositive[XHas20[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T1]
  type XHasM21[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat,
    T15 <: nat.has.Nat,
    T16 <: nat.has.Nat,
    T17 <: nat.has.Nat,
    T18 <: nat.has.Nat,
    T19 <: nat.has.Nat,
    T20 <: nat.has.Nat,
    T21 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]#Plus[T15]#Plus[T16]#Plus[T17]#Plus[
    T18
  ]#Plus[T19]#Plus[T20]#Plus[T21]
  type XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    nat.has.NatPositive[XHas21[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T1]
  type XHasM22[
    T1 <: nat.has.Nat,
    T2 <: nat.has.Nat,
    T3 <: nat.has.Nat,
    T4 <: nat.has.Nat,
    T5 <: nat.has.Nat,
    T6 <: nat.has.Nat,
    T7 <: nat.has.Nat,
    T8 <: nat.has.Nat,
    T9 <: nat.has.Nat,
    T10 <: nat.has.Nat,
    T11 <: nat.has.Nat,
    T12 <: nat.has.Nat,
    T13 <: nat.has.Nat,
    T14 <: nat.has.Nat,
    T15 <: nat.has.Nat,
    T16 <: nat.has.Nat,
    T17 <: nat.has.Nat,
    T18 <: nat.has.Nat,
    T19 <: nat.has.Nat,
    T20 <: nat.has.Nat,
    T21 <: nat.has.Nat,
    T22 <: nat.has.Nat
  ] = T1#Plus[T2]#Plus[T3]#Plus[T4]#Plus[T5]#Plus[T6]#Plus[T7]#Plus[T8]#Plus[T9]#Plus[T10]#Plus[T11]#Plus[T12]#Plus[T13]#Plus[T14]#Plus[T15]#Plus[T16]#Plus[T17]#Plus[
    T18
  ]#Plus[T19]#Plus[T20]#Plus[T21]#Plus[T22]
  val XHas0: XHas0 = nat.has.NatZero
  object XHas1 {
    def apply[T1](t1: T1): XHas1[T1]            = new nat.has.NatPositive(nat.has.NatZero, t1)
    def fromTuple[T1](t: Tuple1[T1]): XHas1[T1] = apply(t._1)
  }
  object XHas2 {
    def apply[T1, T2](_1: T1, _2: T2): XHas2[T1, T2]  = new nat.has.NatPositive(tail = XHas1(_2), head = _1)
    def fromTuple[T1, T2](i: (T1, T2)): XHas2[T1, T2] = apply(_1 = i._1, _2 = i._2)
  }
  object XHas3 {
    def apply[T1, T2, T3](_1: T1, _2: T2, _3: T3): XHas3[T1, T2, T3] = new nat.has.NatPositive(tail = XHas2(_2, _3), head = _1)
    def fromTuple[T1, T2, T3](i: (T1, T2, T3)): XHas3[T1, T2, T3]    = apply(_1 = i._1, _2 = i._2, _3 = i._3)
  }
  object XHas4 {
    def apply[T1, T2, T3, T4](_1: T1, _2: T2, _3: T3, _4: T4): XHas4[T1, T2, T3, T4] = new nat.has.NatPositive(tail = XHas3(_2, _3, _4), head = _1)
    def fromTuple[T1, T2, T3, T4](i: (T1, T2, T3, T4)): XHas4[T1, T2, T3, T4]        = apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4)
  }
  object XHas5 {
    def apply[T1, T2, T3, T4, T5](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5): XHas5[T1, T2, T3, T4, T5] = new nat.has.NatPositive(tail = XHas4(_2, _3, _4, _5), head = _1)
    def fromTuple[T1, T2, T3, T4, T5](i: (T1, T2, T3, T4, T5)): XHas5[T1, T2, T3, T4, T5]            = apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5)
  }
  object XHas6 {
    def apply[T1, T2, T3, T4, T5, T6](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6): XHas6[T1, T2, T3, T4, T5, T6] =
      new nat.has.NatPositive(tail = XHas5(_2, _3, _4, _5, _6), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6](i: (T1, T2, T3, T4, T5, T6)): XHas6[T1, T2, T3, T4, T5, T6] =
      apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6)
  }
  object XHas7 {
    def apply[T1, T2, T3, T4, T5, T6, T7](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7): XHas7[T1, T2, T3, T4, T5, T6, T7] =
      new nat.has.NatPositive(tail = XHas6(_2, _3, _4, _5, _6, _7), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7](i: (T1, T2, T3, T4, T5, T6, T7)): XHas7[T1, T2, T3, T4, T5, T6, T7] =
      apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7)
  }
  object XHas8 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8): XHas8[T1, T2, T3, T4, T5, T6, T7, T8] =
      new nat.has.NatPositive(tail = XHas7(_2, _3, _4, _5, _6, _7, _8), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8](i: (T1, T2, T3, T4, T5, T6, T7, T8)): XHas8[T1, T2, T3, T4, T5, T6, T7, T8] =
      apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8)
  }
  object XHas9 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9): XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
      new nat.has.NatPositive(tail = XHas8(_2, _3, _4, _5, _6, _7, _8, _9), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9](i: (T1, T2, T3, T4, T5, T6, T7, T8, T9)): XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
      apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9)
  }
  object XHas10 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10)
      : XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = new nat.has.NatPositive(tail = XHas9(_2, _3, _4, _5, _6, _7, _8, _9, _10), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10)): XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
      apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9, _10 = i._10)
  }
  object XHas11 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11)
      : XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = new nat.has.NatPositive(tail = XHas10(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)): XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
      apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9, _10 = i._10, _11 = i._11)
  }
  object XHas12 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12)
      : XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = new nat.has.NatPositive(tail = XHas11(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12)
    ): XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
      apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9, _10 = i._10, _11 = i._11, _12 = i._12)
  }
  object XHas13 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13
    ): XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      new nat.has.NatPositive(tail = XHas12(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13)
    ): XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      apply(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9, _10 = i._10, _11 = i._11, _12 = i._12, _13 = i._13)
  }
  object XHas14 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14
    ): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      new nat.has.NatPositive(tail = XHas13(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14)
    ): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14
      )
  }
  object XHas15 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14,
      _15: T15
    ): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      new nat.has.NatPositive(tail = XHas14(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15)
    ): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14,
        _15 = i._15
      )
  }
  object XHas16 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14,
      _15: T15,
      _16: T16
    ): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      new nat.has.NatPositive(tail = XHas15(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16)
    ): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14,
        _15 = i._15,
        _16 = i._16
      )
  }
  object XHas17 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14,
      _15: T15,
      _16: T16,
      _17: T17
    ): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new nat.has.NatPositive(tail = XHas16(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17)
    ): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14,
        _15 = i._15,
        _16 = i._16,
        _17 = i._17
      )
  }
  object XHas18 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14,
      _15: T15,
      _16: T16,
      _17: T17,
      _18: T18
    ): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new nat.has.NatPositive(tail = XHas17(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18)
    ): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14,
        _15 = i._15,
        _16 = i._16,
        _17 = i._17,
        _18 = i._18
      )
  }
  object XHas19 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14,
      _15: T15,
      _16: T16,
      _17: T17,
      _18: T18,
      _19: T19
    ): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new nat.has.NatPositive(tail = XHas18(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19)
    ): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14,
        _15 = i._15,
        _16 = i._16,
        _17 = i._17,
        _18 = i._18,
        _19 = i._19
      )
  }
  object XHas20 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14,
      _15: T15,
      _16: T16,
      _17: T17,
      _18: T18,
      _19: T19,
      _20: T20
    ): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new nat.has.NatPositive(tail = XHas19(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20)
    ): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14,
        _15 = i._15,
        _16 = i._16,
        _17 = i._17,
        _18 = i._18,
        _19 = i._19,
        _20 = i._20
      )
  }
  object XHas21 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14,
      _15: T15,
      _16: T16,
      _17: T17,
      _18: T18,
      _19: T19,
      _20: T20,
      _21: T21
    ): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new nat.has.NatPositive(tail = XHas20(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21)
    ): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14,
        _15 = i._15,
        _16 = i._16,
        _17 = i._17,
        _18 = i._18,
        _19 = i._19,
        _20 = i._20,
        _21 = i._21
      )
  }
  object XHas22 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
      _1: T1,
      _2: T2,
      _3: T3,
      _4: T4,
      _5: T5,
      _6: T6,
      _7: T7,
      _8: T8,
      _9: T9,
      _10: T10,
      _11: T11,
      _12: T12,
      _13: T13,
      _14: T14,
      _15: T15,
      _16: T16,
      _17: T17,
      _18: T18,
      _19: T19,
      _20: T20,
      _21: T21,
      _22: T22
    ): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new nat.has.NatPositive(tail = XHas21(_2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22), head = _1)
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22)
    ): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      apply(
        _1 = i._1,
        _2 = i._2,
        _3 = i._3,
        _4 = i._4,
        _5 = i._5,
        _6 = i._6,
        _7 = i._7,
        _8 = i._8,
        _9 = i._9,
        _10 = i._10,
        _11 = i._11,
        _12 = i._12,
        _13 = i._13,
        _14 = i._14,
        _15 = i._15,
        _16 = i._16,
        _17 = i._17,
        _18 = i._18,
        _19 = i._19,
        _20 = i._20,
        _21 = i._21,
        _22 = i._22
      )
  }
  implicit class XHasTuple1ImplicitClass[T1](private val has: XHas1[T1]) {
    def replace_0[T](i: T): XHas1[T] = XHas1(i)
  }
  implicit class XHasTuple2ImplicitClass[T1, T2](private val has: XHas2[T1, T2]) {
    def replace_0[T](i: T): XHas2[T, T2] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas2[T1, T] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
  }
  implicit class XHasTuple3ImplicitClass[T1, T2, T3](private val has: XHas3[T1, T2, T3]) {
    def replace_0[T](i: T): XHas3[T, T2, T3] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas3[T1, T, T3] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas3[T1, T2, T] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
  }
  implicit class XHasTuple4ImplicitClass[T1, T2, T3, T4](private val has: XHas4[T1, T2, T3, T4]) {
    def replace_0[T](i: T): XHas4[T, T2, T3, T4] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas4[T1, T, T3, T4] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas4[T1, T2, T, T4] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas4[T1, T2, T3, T] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
  }
  implicit class XHasTuple5ImplicitClass[T1, T2, T3, T4, T5](private val has: XHas5[T1, T2, T3, T4, T5]) {
    def replace_0[T](i: T): XHas5[T, T2, T3, T4, T5] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas5[T1, T, T3, T4, T5] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas5[T1, T2, T, T4, T5] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas5[T1, T2, T3, T, T5] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas5[T1, T2, T3, T4, T] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
  }
  implicit class XHasTuple6ImplicitClass[T1, T2, T3, T4, T5, T6](private val has: XHas6[T1, T2, T3, T4, T5, T6]) {
    def replace_0[T](i: T): XHas6[T, T2, T3, T4, T5, T6] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas6[T1, T, T3, T4, T5, T6] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas6[T1, T2, T, T4, T5, T6] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas6[T1, T2, T3, T, T5, T6] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas6[T1, T2, T3, T4, T, T6] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas6[T1, T2, T3, T4, T5, T] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
  }
  implicit class XHasTuple7ImplicitClass[T1, T2, T3, T4, T5, T6, T7](private val has: XHas7[T1, T2, T3, T4, T5, T6, T7]) {
    def replace_0[T](i: T): XHas7[T, T2, T3, T4, T5, T6, T7] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas7[T1, T, T3, T4, T5, T6, T7] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas7[T1, T2, T, T4, T5, T6, T7] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas7[T1, T2, T3, T, T5, T6, T7] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas7[T1, T2, T3, T4, T, T6, T7] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas7[T1, T2, T3, T4, T5, T, T7] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas7[T1, T2, T3, T4, T5, T6, T] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
  }
  implicit class XHasTuple8ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8](private val has: XHas8[T1, T2, T3, T4, T5, T6, T7, T8]) {
    def replace_0[T](i: T): XHas8[T, T2, T3, T4, T5, T6, T7, T8] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas8[T1, T, T3, T4, T5, T6, T7, T8] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas8[T1, T2, T, T4, T5, T6, T7, T8] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas8[T1, T2, T3, T, T5, T6, T7, T8] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas8[T1, T2, T3, T4, T, T6, T7, T8] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas8[T1, T2, T3, T4, T5, T, T7, T8] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas8[T1, T2, T3, T4, T5, T6, T, T8] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas8[T1, T2, T3, T4, T5, T6, T7, T] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
  }
  implicit class XHasTuple9ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9](private val has: XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9]) {
    def replace_0[T](i: T): XHas9[T, T2, T3, T4, T5, T6, T7, T8, T9] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas9[T1, T, T3, T4, T5, T6, T7, T8, T9] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas9[T1, T2, T, T4, T5, T6, T7, T8, T9] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas9[T1, T2, T3, T, T5, T6, T7, T8, T9] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas9[T1, T2, T3, T4, T, T6, T7, T8, T9] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas9[T1, T2, T3, T4, T5, T, T7, T8, T9] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas9[T1, T2, T3, T4, T5, T6, T, T8, T9] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas9[T1, T2, T3, T4, T5, T6, T7, T, T9] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T] = new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
  }
  implicit class XHasTuple10ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](private val has: XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]) {
    def replace_0[T](i: T): XHas10[T, T2, T3, T4, T5, T6, T7, T8, T9, T10] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas10[T1, T, T3, T4, T5, T6, T7, T8, T9, T10] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas10[T1, T2, T, T4, T5, T6, T7, T8, T9, T10] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas10[T1, T2, T3, T, T5, T6, T7, T8, T9, T10] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas10[T1, T2, T3, T4, T, T6, T7, T8, T9, T10] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas10[T1, T2, T3, T4, T5, T, T7, T8, T9, T10] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas10[T1, T2, T3, T4, T5, T6, T, T8, T9, T10] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas10[T1, T2, T3, T4, T5, T6, T7, T, T9, T10] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T, T10] = new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T]  = new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
  }
  implicit class XHasTuple11ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](private val has: XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]) {
    def replace_0[T](i: T): XHas11[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas11[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas11[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas11[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas11[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas11[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas11[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas11[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11] = new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11]  = new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T] = new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
  }
  implicit class XHasTuple12ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](private val has: XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]) {
    def replace_0[T](i: T): XHas12[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas12[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas12[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas12[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas12[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas12[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas12[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas12[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12] = new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12]  = new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12] = new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T] = new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
  }
  implicit class XHasTuple13ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
    private val has: XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
  ) {
    def replace_0[T](i: T): XHas13[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas13[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas13[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas13[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas13[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas13[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas13[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas13[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13]  = new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13] = new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13] = new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T] = new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
  }
  implicit class XHasTuple14ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
    private val has: XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  ) {
    def replace_0[T](i: T): XHas14[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas14[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas14[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas14[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas14[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas14[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas14[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas14[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14]  = new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14] = new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14] = new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T] = new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
  }
  implicit class XHasTuple15ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    private val has: XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  ) {
    def replace_0[T](i: T): XHas15[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas15[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas15[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas15[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas15[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas15[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15]  = new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15] = new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15] = new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
    def replace_14[T](i: T): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T] = new xio.nat.has.NatPositive(has.tail.replace_13(i), has.head)
  }
  implicit class XHasTuple16ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    private val has: XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  ) {
    def replace_0[T](i: T): XHas16[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas16[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas16[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas16[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas16[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas16[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16]  = new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16] = new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
    def replace_14[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16] = new xio.nat.has.NatPositive(has.tail.replace_13(i), has.head)
    def replace_15[T](i: T): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T] = new xio.nat.has.NatPositive(has.tail.replace_14(i), has.head)
  }
  implicit class XHasTuple17ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    private val has: XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ) {
    def replace_0[T](i: T): XHas17[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas17[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas17[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas17[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas17[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas17[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
    def replace_14[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_13(i), has.head)
    def replace_15[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17] =
      new xio.nat.has.NatPositive(has.tail.replace_14(i), has.head)
    def replace_16[T](i: T): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T] =
      new xio.nat.has.NatPositive(has.tail.replace_15(i), has.head)
  }
  implicit class XHasTuple18ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    private val has: XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ) {
    def replace_0[T](i: T): XHas18[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas18[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas18[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas18[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas18[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas18[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
    def replace_14[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_13(i), has.head)
    def replace_15[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_14(i), has.head)
    def replace_16[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18] =
      new xio.nat.has.NatPositive(has.tail.replace_15(i), has.head)
    def replace_17[T](i: T): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T] =
      new xio.nat.has.NatPositive(has.tail.replace_16(i), has.head)
  }
  implicit class XHasTuple19ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    private val has: XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ) {
    def replace_0[T](i: T): XHas19[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas19[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas19[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas19[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas19[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas19[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
    def replace_14[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_13(i), has.head)
    def replace_15[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_14(i), has.head)
    def replace_16[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_15(i), has.head)
    def replace_17[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T, T19] =
      new xio.nat.has.NatPositive(has.tail.replace_16(i), has.head)
    def replace_18[T](i: T): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T] =
      new xio.nat.has.NatPositive(has.tail.replace_17(i), has.head)
  }
  implicit class XHasTuple20ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    private val has: XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ) {
    def replace_0[T](i: T): XHas20[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas20[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas20[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas20[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas20[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas20[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
    def replace_14[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_13(i), has.head)
    def replace_15[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_14(i), has.head)
    def replace_16[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_15(i), has.head)
    def replace_17[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T, T19, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_16(i), has.head)
    def replace_18[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T, T20] =
      new xio.nat.has.NatPositive(has.tail.replace_17(i), has.head)
    def replace_19[T](i: T): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T] =
      new xio.nat.has.NatPositive(has.tail.replace_18(i), has.head)
  }
  implicit class XHasTuple21ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    private val has: XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ) {
    def replace_0[T](i: T): XHas21[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas21[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas21[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas21[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas21[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas21[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
    def replace_14[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_13(i), has.head)
    def replace_15[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_14(i), has.head)
    def replace_16[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_15(i), has.head)
    def replace_17[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T, T19, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_16(i), has.head)
    def replace_18[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T, T20, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_17(i), has.head)
    def replace_19[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T, T21] =
      new xio.nat.has.NatPositive(has.tail.replace_18(i), has.head)
    def replace_20[T](i: T): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T] =
      new xio.nat.has.NatPositive(has.tail.replace_19(i), has.head)
  }
  implicit class XHasTuple22ImplicitClass[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    private val has: XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ) {
    def replace_0[T](i: T): XHas22[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail, i)
    def replace_1[T](i: T): XHas22[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_0(i), has.head)
    def replace_2[T](i: T): XHas22[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_1(i), has.head)
    def replace_3[T](i: T): XHas22[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_2(i), has.head)
    def replace_4[T](i: T): XHas22[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_3(i), has.head)
    def replace_5[T](i: T): XHas22[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_4(i), has.head)
    def replace_6[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_5(i), has.head)
    def replace_7[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_6(i), has.head)
    def replace_8[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_7(i), has.head)
    def replace_9[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_8(i), has.head)
    def replace_10[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_9(i), has.head)
    def replace_11[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_10(i), has.head)
    def replace_12[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_11(i), has.head)
    def replace_13[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_12(i), has.head)
    def replace_14[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_13(i), has.head)
    def replace_15[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_14(i), has.head)
    def replace_16[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_15(i), has.head)
    def replace_17[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T, T19, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_16(i), has.head)
    def replace_18[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T, T20, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_17(i), has.head)
    def replace_19[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T, T21, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_18(i), has.head)
    def replace_20[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T, T22] =
      new xio.nat.has.NatPositive(has.tail.replace_19(i), has.head)
    def replace_21[T](i: T): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T] =
      new xio.nat.has.NatPositive(has.tail.replace_20(i), has.head)
  }
}
