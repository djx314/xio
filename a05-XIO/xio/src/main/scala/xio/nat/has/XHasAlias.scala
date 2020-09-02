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
  case class XHasTuple1[T1](_1: T1)             extends xio.nat.has.NatPositive[xio.nat.has.NatZero, T1](tail = xio.nat.has.NatZero, head = _1)
  case class XHasTuple2[T1, T2](_1: T1, _2: T2) extends nat.has.NatPositive[XHas1[T1], T2](tail = XHasTuple1(_1), head = _2)
  object XHasTuple2 {
    def fromTuple[T1, T2](i: (T1, T2)): XHasTuple2[T1, T2] =
      XHasTuple2(_1 = i._1, _2 = i._2)
  }
  object XHasToTuple2 {
    def apply[T1, T2](n: XHas2[T1, T2]): XHasTuple2[T1, T2] =
      XHasTuple2(_1 = n.tail.head, _2 = n.head)
  }
  case class XHasTuple3[T1, T2, T3](_1: T1, _2: T2, _3: T3) extends nat.has.NatPositive[XHas2[T1, T2], T3](tail = XHasTuple2(_1, _2), head = _3)
  object XHasTuple3 {
    def fromTuple[T1, T2, T3](i: (T1, T2, T3)): XHasTuple3[T1, T2, T3] =
      XHasTuple3(_1 = i._1, _2 = i._2, _3 = i._3)
  }
  object XHasToTuple3 {
    def apply[T1, T2, T3](n: XHas3[T1, T2, T3]): XHasTuple3[T1, T2, T3] =
      XHasTuple3(_1 = n.tail.tail.head, _2 = n.tail.head, _3 = n.head)
  }
  case class XHasTuple4[T1, T2, T3, T4](_1: T1, _2: T2, _3: T3, _4: T4) extends nat.has.NatPositive[XHas3[T1, T2, T3], T4](tail = XHasTuple3(_1, _2, _3), head = _4)
  object XHasTuple4 {
    def fromTuple[T1, T2, T3, T4](i: (T1, T2, T3, T4)): XHasTuple4[T1, T2, T3, T4] =
      XHasTuple4(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4)
  }
  object XHasToTuple4 {
    def apply[T1, T2, T3, T4](n: XHas4[T1, T2, T3, T4]): XHasTuple4[T1, T2, T3, T4] =
      XHasTuple4(_1 = n.tail.tail.tail.head, _2 = n.tail.tail.head, _3 = n.tail.head, _4 = n.head)
  }
  case class XHasTuple5[T1, T2, T3, T4, T5](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5)
      extends nat.has.NatPositive[XHas4[T1, T2, T3, T4], T5](tail = XHasTuple4(_1, _2, _3, _4), head = _5)
  object XHasTuple5 {
    def fromTuple[T1, T2, T3, T4, T5](i: (T1, T2, T3, T4, T5)): XHasTuple5[T1, T2, T3, T4, T5] =
      XHasTuple5(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5)
  }
  object XHasToTuple5 {
    def apply[T1, T2, T3, T4, T5](n: XHas5[T1, T2, T3, T4, T5]): XHasTuple5[T1, T2, T3, T4, T5] =
      XHasTuple5(_1 = n.tail.tail.tail.tail.head, _2 = n.tail.tail.tail.head, _3 = n.tail.tail.head, _4 = n.tail.head, _5 = n.head)
  }
  case class XHasTuple6[T1, T2, T3, T4, T5, T6](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6)
      extends nat.has.NatPositive[XHas5[T1, T2, T3, T4, T5], T6](tail = XHasTuple5(_1, _2, _3, _4, _5), head = _6)
  object XHasTuple6 {
    def fromTuple[T1, T2, T3, T4, T5, T6](i: (T1, T2, T3, T4, T5, T6)): XHasTuple6[T1, T2, T3, T4, T5, T6] =
      XHasTuple6(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6)
  }
  object XHasToTuple6 {
    def apply[T1, T2, T3, T4, T5, T6](n: XHas6[T1, T2, T3, T4, T5, T6]): XHasTuple6[T1, T2, T3, T4, T5, T6] =
      XHasTuple6(_1 = n.tail.tail.tail.tail.tail.head, _2 = n.tail.tail.tail.tail.head, _3 = n.tail.tail.tail.head, _4 = n.tail.tail.head, _5 = n.tail.head, _6 = n.head)
  }
  case class XHasTuple7[T1, T2, T3, T4, T5, T6, T7](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7)
      extends nat.has.NatPositive[XHas6[T1, T2, T3, T4, T5, T6], T7](tail = XHasTuple6(_1, _2, _3, _4, _5, _6), head = _7)
  object XHasTuple7 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7](i: (T1, T2, T3, T4, T5, T6, T7)): XHasTuple7[T1, T2, T3, T4, T5, T6, T7] =
      XHasTuple7(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7)
  }
  object XHasToTuple7 {
    def apply[T1, T2, T3, T4, T5, T6, T7](n: XHas7[T1, T2, T3, T4, T5, T6, T7]): XHasTuple7[T1, T2, T3, T4, T5, T6, T7] =
      XHasTuple7(
        _1 = n.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.head,
        _5 = n.tail.tail.head,
        _6 = n.tail.head,
        _7 = n.head
      )
  }
  case class XHasTuple8[T1, T2, T3, T4, T5, T6, T7, T8](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8)
      extends nat.has.NatPositive[XHas7[T1, T2, T3, T4, T5, T6, T7], T8](tail = XHasTuple7(_1, _2, _3, _4, _5, _6, _7), head = _8)
  object XHasTuple8 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8](i: (T1, T2, T3, T4, T5, T6, T7, T8)): XHasTuple8[T1, T2, T3, T4, T5, T6, T7, T8] =
      XHasTuple8(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8)
  }
  object XHasToTuple8 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8](n: XHas8[T1, T2, T3, T4, T5, T6, T7, T8]): XHasTuple8[T1, T2, T3, T4, T5, T6, T7, T8] =
      XHasTuple8(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.head,
        _6 = n.tail.tail.head,
        _7 = n.tail.head,
        _8 = n.head
      )
  }
  case class XHasTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9)
      extends nat.has.NatPositive[XHas8[T1, T2, T3, T4, T5, T6, T7, T8], T9](tail = XHasTuple8(_1, _2, _3, _4, _5, _6, _7, _8), head = _9)
  object XHasTuple9 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9](i: (T1, T2, T3, T4, T5, T6, T7, T8, T9)): XHasTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
      XHasTuple9(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9)
  }
  object XHasToTuple9 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](n: XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9]): XHasTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
      XHasTuple9(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.head,
        _7 = n.tail.tail.head,
        _8 = n.tail.head,
        _9 = n.head
      )
  }
  case class XHasTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10)
      extends nat.has.NatPositive[XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10](tail = XHasTuple9(_1, _2, _3, _4, _5, _6, _7, _8, _9), head = _10)
  object XHasTuple10 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10)): XHasTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
      XHasTuple10(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9, _10 = i._10)
  }
  object XHasToTuple10 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](n: XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]): XHasTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
      XHasTuple10(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.head,
        _8 = n.tail.tail.head,
        _9 = n.tail.head,
        _10 = n.head
      )
  }
  case class XHasTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11)
      extends nat.has.NatPositive[XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11](tail = XHasTuple10(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10), head = _11)
  object XHasTuple11 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11)
    ): XHasTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
      XHasTuple11(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9, _10 = i._10, _11 = i._11)
  }
  object XHasToTuple11 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
      n: XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
    ): XHasTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
      XHasTuple11(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.head,
        _9 = n.tail.tail.head,
        _10 = n.tail.head,
        _11 = n.head
      )
  }
  case class XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
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
    _12: T12
  ) extends nat.has.NatPositive[XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12](tail = XHasTuple11(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11), head = _12)
  object XHasTuple12 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12)
    ): XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
      XHasTuple12(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9, _10 = i._10, _11 = i._11, _12 = i._12)
  }
  object XHasToTuple12 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
      n: XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
    ): XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
      XHasTuple12(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.head,
        _10 = n.tail.tail.head,
        _11 = n.tail.head,
        _12 = n.head
      )
  }
  case class XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
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
  ) extends nat.has.NatPositive[XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13](
        tail = XHasTuple12(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12),
        head = _13
      )
  object XHasTuple13 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13)
    ): XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(_1 = i._1, _2 = i._2, _3 = i._3, _4 = i._4, _5 = i._5, _6 = i._6, _7 = i._7, _8 = i._8, _9 = i._9, _10 = i._10, _11 = i._11, _12 = i._12, _13 = i._13)
  }
  object XHasToTuple13 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
      n: XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
    ): XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.head,
        _11 = n.tail.tail.head,
        _12 = n.tail.head,
        _13 = n.head
      )
  }
  case class XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
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
  ) extends nat.has.NatPositive[XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14](
        tail = XHasTuple13(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13),
        head = _14
      )
  object XHasTuple14 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14)
    ): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(
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
  object XHasToTuple14 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
      n: XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
    ): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.head,
        _12 = n.tail.tail.head,
        _13 = n.tail.head,
        _14 = n.head
      )
  }
  case class XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
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
  ) extends nat.has.NatPositive[XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15](
        tail = XHasTuple14(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14),
        head = _15
      )
  object XHasTuple15 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15)
    ): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(
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
  object XHasToTuple15 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
      n: XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    ): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.tail.head,
        _12 = n.tail.tail.tail.head,
        _13 = n.tail.tail.head,
        _14 = n.tail.head,
        _15 = n.head
      )
  }
  case class XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
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
  ) extends nat.has.NatPositive[XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16](
        tail = XHasTuple15(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15),
        head = _16
      )
  object XHasTuple16 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16)
    ): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(
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
  object XHasToTuple16 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
      n: XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.tail.tail.head,
        _12 = n.tail.tail.tail.tail.head,
        _13 = n.tail.tail.tail.head,
        _14 = n.tail.tail.head,
        _15 = n.tail.head,
        _16 = n.head
      )
  }
  case class XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
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
  ) extends nat.has.NatPositive[XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17](
        tail = XHasTuple16(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16),
        head = _17
      )
  object XHasTuple17 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17)
    ): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(
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
  object XHasToTuple17 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
      n: XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.tail.tail.tail.head,
        _12 = n.tail.tail.tail.tail.tail.head,
        _13 = n.tail.tail.tail.tail.head,
        _14 = n.tail.tail.tail.head,
        _15 = n.tail.tail.head,
        _16 = n.tail.head,
        _17 = n.head
      )
  }
  case class XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
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
  ) extends nat.has.NatPositive[XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18](
        tail = XHasTuple17(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17),
        head = _18
      )
  object XHasTuple18 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18)
    ): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(
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
  object XHasToTuple18 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
      n: XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _12 = n.tail.tail.tail.tail.tail.tail.head,
        _13 = n.tail.tail.tail.tail.tail.head,
        _14 = n.tail.tail.tail.tail.head,
        _15 = n.tail.tail.tail.head,
        _16 = n.tail.tail.head,
        _17 = n.tail.head,
        _18 = n.head
      )
  }
  case class XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
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
  ) extends nat.has.NatPositive[XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19](
        tail = XHasTuple18(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18),
        head = _19
      )
  object XHasTuple19 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19)
    ): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(
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
  object XHasToTuple19 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
      n: XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _12 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _13 = n.tail.tail.tail.tail.tail.tail.head,
        _14 = n.tail.tail.tail.tail.tail.head,
        _15 = n.tail.tail.tail.tail.head,
        _16 = n.tail.tail.tail.head,
        _17 = n.tail.tail.head,
        _18 = n.tail.head,
        _19 = n.head
      )
  }
  case class XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
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
  ) extends nat.has.NatPositive[XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20](
        tail = XHasTuple19(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19),
        head = _20
      )
  object XHasTuple20 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20)
    ): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(
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
  object XHasToTuple20 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
      n: XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _12 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _13 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _14 = n.tail.tail.tail.tail.tail.tail.head,
        _15 = n.tail.tail.tail.tail.tail.head,
        _16 = n.tail.tail.tail.tail.head,
        _17 = n.tail.tail.tail.head,
        _18 = n.tail.tail.head,
        _19 = n.tail.head,
        _20 = n.head
      )
  }
  case class XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
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
  ) extends nat.has.NatPositive[XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21](
        tail = XHasTuple20(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20),
        head = _21
      )
  object XHasTuple21 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21)
    ): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(
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
  object XHasToTuple21 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
      n: XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _12 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _13 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _14 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _15 = n.tail.tail.tail.tail.tail.tail.head,
        _16 = n.tail.tail.tail.tail.tail.head,
        _17 = n.tail.tail.tail.tail.head,
        _18 = n.tail.tail.tail.head,
        _19 = n.tail.tail.head,
        _20 = n.tail.head,
        _21 = n.head
      )
  }
  case class XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
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
  ) extends nat.has.NatPositive[XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22](
        tail = XHasTuple21(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21),
        head = _22
      )
  object XHasTuple22 {
    def fromTuple[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
      i: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22)
    ): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(
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
  object XHasToTuple22 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
      n: XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(
        _1 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _2 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _3 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _4 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _5 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _6 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _7 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _8 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _9 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _10 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _11 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _12 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _13 = n.tail.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _14 = n.tail.tail.tail.tail.tail.tail.tail.tail.head,
        _15 = n.tail.tail.tail.tail.tail.tail.tail.head,
        _16 = n.tail.tail.tail.tail.tail.tail.head,
        _17 = n.tail.tail.tail.tail.tail.head,
        _18 = n.tail.tail.tail.tail.head,
        _19 = n.tail.tail.tail.head,
        _20 = n.tail.tail.head,
        _21 = n.tail.head,
        _22 = n.head
      )
  }
}
