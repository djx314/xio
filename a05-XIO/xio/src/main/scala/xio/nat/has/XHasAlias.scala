package xio
trait XHasAlias {
  type XHas0                                                               = nat.has.NatZero
  type XHas1[T1]                                                           = nat.has.NatPositive[nat.has.NatZero, T1]
  type XHas2[T1, T2]                                                       = nat.has.NatPositive[XHas1[T1], T2]
  type XHas3[T1, T2, T3]                                                   = nat.has.NatPositive[XHas2[T1, T2], T3]
  type XHas4[T1, T2, T3, T4]                                               = nat.has.NatPositive[XHas3[T1, T2, T3], T4]
  type XHas5[T1, T2, T3, T4, T5]                                           = nat.has.NatPositive[XHas4[T1, T2, T3, T4], T5]
  type XHas6[T1, T2, T3, T4, T5, T6]                                       = nat.has.NatPositive[XHas5[T1, T2, T3, T4, T5], T6]
  type XHas7[T1, T2, T3, T4, T5, T6, T7]                                   = nat.has.NatPositive[XHas6[T1, T2, T3, T4, T5, T6], T7]
  type XHas8[T1, T2, T3, T4, T5, T6, T7, T8]                               = nat.has.NatPositive[XHas7[T1, T2, T3, T4, T5, T6, T7], T8]
  type XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9]                           = nat.has.NatPositive[XHas8[T1, T2, T3, T4, T5, T6, T7, T8], T9]
  type XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]                     = nat.has.NatPositive[XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10]
  type XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]                = nat.has.NatPositive[XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11]
  type XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]           = nat.has.NatPositive[XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12]
  type XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]      = nat.has.NatPositive[XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13]
  type XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = nat.has.NatPositive[XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14]
  type XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    nat.has.NatPositive[XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15]
  type XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    nat.has.NatPositive[XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16]
  type XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    nat.has.NatPositive[XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17]
  type XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    nat.has.NatPositive[XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18]
  type XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    nat.has.NatPositive[XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19]
  type XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    nat.has.NatPositive[XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20]
  type XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    nat.has.NatPositive[XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21]
  type XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    nat.has.NatPositive[XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22]
  val XHas0: XHas0                                                                 = nat.has.NatZero
  def XHas1[T1](t1: T1): XHas1[T1]                                                 = new nat.has.NatPositive(nat.has.NatZero, t1)
  def XHas2[T1, T2](t1: T1, t2: T2): XHas2[T1, T2]                                 = new nat.has.NatPositive(tail = XHas1(t1: T1), head = t2)
  def XHas3[T1, T2, T3](t1: T1, t2: T2, t3: T3): XHas3[T1, T2, T3]                 = new nat.has.NatPositive(tail = XHas2(t1: T1, t2: T2), head = t3)
  def XHas4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): XHas4[T1, T2, T3, T4] = new nat.has.NatPositive(tail = XHas3(t1: T1, t2: T2, t3: T3), head = t4)
  def XHas5[T1, T2, T3, T4, T5](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): XHas5[T1, T2, T3, T4, T5] =
    new nat.has.NatPositive(tail = XHas4(t1: T1, t2: T2, t3: T3, t4: T4), head = t5)
  def XHas6[T1, T2, T3, T4, T5, T6](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): XHas6[T1, T2, T3, T4, T5, T6] =
    new nat.has.NatPositive(tail = XHas5(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5), head = t6)
  def XHas7[T1, T2, T3, T4, T5, T6, T7](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): XHas7[T1, T2, T3, T4, T5, T6, T7] =
    new nat.has.NatPositive(tail = XHas6(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6), head = t7)
  def XHas8[T1, T2, T3, T4, T5, T6, T7, T8](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8): XHas8[T1, T2, T3, T4, T5, T6, T7, T8] =
    new nat.has.NatPositive(tail = XHas7(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7), head = t8)
  def XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9): XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    new nat.has.NatPositive(tail = XHas8(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8), head = t9)
  def XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10)
    : XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    new nat.has.NatPositive(tail = XHas9(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9), head = t10)
  def XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11)
    : XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    new nat.has.NatPositive(tail = XHas10(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10), head = t11)
  def XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12)
    : XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    new nat.has.NatPositive(tail = XHas11(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11), head = t12)
  def XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13
  ): XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    new nat.has.NatPositive(tail = XHas12(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12), head = t13)
  def XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14
  ): XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    new nat.has.NatPositive(tail = XHas13(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13), head = t14)
  def XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15
  ): XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    new nat.has.NatPositive(
      tail = XHas14(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14),
      head = t15
    )
  def XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16
  ): XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    new nat.has.NatPositive(
      tail = XHas15(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15),
      head = t16
    )
  def XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17
  ): XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    new nat.has.NatPositive(
      tail = XHas16(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16),
      head = t17
    )
  def XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18
  ): XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    new nat.has.NatPositive(
      tail =
        XHas17(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17),
      head = t18
    )
  def XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19
  ): XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    new nat.has.NatPositive(
      tail = XHas18(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6,
        t7: T7,
        t8: T8,
        t9: T9,
        t10: T10,
        t11: T11,
        t12: T12,
        t13: T13,
        t14: T14,
        t15: T15,
        t16: T16,
        t17: T17,
        t18: T18
      ),
      head = t19
    )
  def XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20
  ): XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    new nat.has.NatPositive(
      tail = XHas19(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6,
        t7: T7,
        t8: T8,
        t9: T9,
        t10: T10,
        t11: T11,
        t12: T12,
        t13: T13,
        t14: T14,
        t15: T15,
        t16: T16,
        t17: T17,
        t18: T18,
        t19: T19
      ),
      head = t20
    )
  def XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20,
    t21: T21
  ): XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    new nat.has.NatPositive(
      tail = XHas20(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6,
        t7: T7,
        t8: T8,
        t9: T9,
        t10: T10,
        t11: T11,
        t12: T12,
        t13: T13,
        t14: T14,
        t15: T15,
        t16: T16,
        t17: T17,
        t18: T18,
        t19: T19,
        t20: T20
      ),
      head = t21
    )
  def XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20,
    t21: T21,
    t22: T22
  ): XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    new nat.has.NatPositive(
      tail = XHas21(
        t1: T1,
        t2: T2,
        t3: T3,
        t4: T4,
        t5: T5,
        t6: T6,
        t7: T7,
        t8: T8,
        t9: T9,
        t10: T10,
        t11: T11,
        t12: T12,
        t13: T13,
        t14: T14,
        t15: T15,
        t16: T16,
        t17: T17,
        t18: T18,
        t19: T19,
        t20: T20,
        t21: T21
      ),
      head = t22
    )
}
