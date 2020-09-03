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
  val XHas0: XHas0                                                                                 = nat.has.NatZero
  def XHas1[T1](t1: T1): XHas1[T1]                                                                 = new nat.has.NatPositive(nat.has.NatZero, t1)
  def XHas2[T1, T2](_1: T1, _2: T2): XHas2[T1, T2]                                                 = new nat.has.NatPositive(tail = XHas1(_1), head = _2)
  def XHas3[T1, T2, T3](_1: T1, _2: T2, _3: T3): XHas3[T1, T2, T3]                                 = new nat.has.NatPositive(tail = XHas2(_1, _2), head = _3)
  def XHas4[T1, T2, T3, T4](_1: T1, _2: T2, _3: T3, _4: T4): XHas4[T1, T2, T3, T4]                 = new nat.has.NatPositive(tail = XHas3(_1, _2, _3), head = _4)
  def XHas5[T1, T2, T3, T4, T5](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5): XHas5[T1, T2, T3, T4, T5] = new nat.has.NatPositive(tail = XHas4(_1, _2, _3, _4), head = _5)
  def XHas6[T1, T2, T3, T4, T5, T6](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6): XHas6[T1, T2, T3, T4, T5, T6] =
    new nat.has.NatPositive(tail = XHas5(_1, _2, _3, _4, _5), head = _6)
  def XHas7[T1, T2, T3, T4, T5, T6, T7](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7): XHas7[T1, T2, T3, T4, T5, T6, T7] =
    new nat.has.NatPositive(tail = XHas6(_1, _2, _3, _4, _5, _6), head = _7)
  def XHas8[T1, T2, T3, T4, T5, T6, T7, T8](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8): XHas8[T1, T2, T3, T4, T5, T6, T7, T8] =
    new nat.has.NatPositive(tail = XHas7(_1, _2, _3, _4, _5, _6, _7), head = _8)
  def XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9): XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    new nat.has.NatPositive(tail = XHas8(_1, _2, _3, _4, _5, _6, _7, _8), head = _9)
  def XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10)
    : XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = new nat.has.NatPositive(tail = XHas9(_1, _2, _3, _4, _5, _6, _7, _8, _9), head = _10)
  def XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11)
    : XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = new nat.has.NatPositive(tail = XHas10(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10), head = _11)
  def XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7, _8: T8, _9: T9, _10: T10, _11: T11, _12: T12)
    : XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = new nat.has.NatPositive(tail = XHas11(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11), head = _12)
  def XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
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
    new nat.has.NatPositive(tail = XHas12(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12), head = _13)
  def XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
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
    new nat.has.NatPositive(tail = XHas13(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13), head = _14)
  def XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
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
    new nat.has.NatPositive(tail = XHas14(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14), head = _15)
  def XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
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
    new nat.has.NatPositive(tail = XHas15(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15), head = _16)
  def XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
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
    new nat.has.NatPositive(tail = XHas16(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16), head = _17)
  def XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
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
    new nat.has.NatPositive(tail = XHas17(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17), head = _18)
  def XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
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
    new nat.has.NatPositive(tail = XHas18(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18), head = _19)
  def XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
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
    new nat.has.NatPositive(tail = XHas19(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19), head = _20)
  def XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
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
    new nat.has.NatPositive(tail = XHas20(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20), head = _21)
  def XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
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
    new nat.has.NatPositive(tail = XHas21(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21), head = _22)
  case class XHasTuple1[T1](has: XHas1[T1]) {
    def _1: T1                            = has.head
    def replace_1[T](i: T): XHasTuple1[T] = XHasTuple1(XHas1(i))
  }
  case class XHasTuple2[T1, T2](has: XHas2[T1, T2]) {
    def _1: T1                                = XHasTuple1(has.tail)._1
    def _2: T2                                = has.head
    def replace_1[T](i: T): XHasTuple2[T, T2] = XHasTuple2(new xio.nat.has.NatPositive(XHasTuple1(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple2[T1, T] = XHasTuple2(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple3[T1, T2, T3](has: XHas3[T1, T2, T3]) {
    def _1: T1                                    = XHasTuple2(has.tail)._1
    def _2: T2                                    = XHasTuple2(has.tail)._2
    def _3: T3                                    = has.head
    def replace_1[T](i: T): XHasTuple3[T, T2, T3] = XHasTuple3(new xio.nat.has.NatPositive(XHasTuple2(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple3[T1, T, T3] = XHasTuple3(new xio.nat.has.NatPositive(XHasTuple2(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple3[T1, T2, T] = XHasTuple3(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple4[T1, T2, T3, T4](has: XHas4[T1, T2, T3, T4]) {
    def _1: T1                                        = XHasTuple3(has.tail)._1
    def _2: T2                                        = XHasTuple3(has.tail)._2
    def _3: T3                                        = XHasTuple3(has.tail)._3
    def _4: T4                                        = has.head
    def replace_1[T](i: T): XHasTuple4[T, T2, T3, T4] = XHasTuple4(new xio.nat.has.NatPositive(XHasTuple3(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple4[T1, T, T3, T4] = XHasTuple4(new xio.nat.has.NatPositive(XHasTuple3(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple4[T1, T2, T, T4] = XHasTuple4(new xio.nat.has.NatPositive(XHasTuple3(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple4[T1, T2, T3, T] = XHasTuple4(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple5[T1, T2, T3, T4, T5](has: XHas5[T1, T2, T3, T4, T5]) {
    def _1: T1                                            = XHasTuple4(has.tail)._1
    def _2: T2                                            = XHasTuple4(has.tail)._2
    def _3: T3                                            = XHasTuple4(has.tail)._3
    def _4: T4                                            = XHasTuple4(has.tail)._4
    def _5: T5                                            = has.head
    def replace_1[T](i: T): XHasTuple5[T, T2, T3, T4, T5] = XHasTuple5(new xio.nat.has.NatPositive(XHasTuple4(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple5[T1, T, T3, T4, T5] = XHasTuple5(new xio.nat.has.NatPositive(XHasTuple4(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple5[T1, T2, T, T4, T5] = XHasTuple5(new xio.nat.has.NatPositive(XHasTuple4(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple5[T1, T2, T3, T, T5] = XHasTuple5(new xio.nat.has.NatPositive(XHasTuple4(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple5[T1, T2, T3, T4, T] = XHasTuple5(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple6[T1, T2, T3, T4, T5, T6](has: XHas6[T1, T2, T3, T4, T5, T6]) {
    def _1: T1                                                = XHasTuple5(has.tail)._1
    def _2: T2                                                = XHasTuple5(has.tail)._2
    def _3: T3                                                = XHasTuple5(has.tail)._3
    def _4: T4                                                = XHasTuple5(has.tail)._4
    def _5: T5                                                = XHasTuple5(has.tail)._5
    def _6: T6                                                = has.head
    def replace_1[T](i: T): XHasTuple6[T, T2, T3, T4, T5, T6] = XHasTuple6(new xio.nat.has.NatPositive(XHasTuple5(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple6[T1, T, T3, T4, T5, T6] = XHasTuple6(new xio.nat.has.NatPositive(XHasTuple5(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple6[T1, T2, T, T4, T5, T6] = XHasTuple6(new xio.nat.has.NatPositive(XHasTuple5(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple6[T1, T2, T3, T, T5, T6] = XHasTuple6(new xio.nat.has.NatPositive(XHasTuple5(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple6[T1, T2, T3, T4, T, T6] = XHasTuple6(new xio.nat.has.NatPositive(XHasTuple5(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple6[T1, T2, T3, T4, T5, T] = XHasTuple6(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple7[T1, T2, T3, T4, T5, T6, T7](has: XHas7[T1, T2, T3, T4, T5, T6, T7]) {
    def _1: T1                                                    = XHasTuple6(has.tail)._1
    def _2: T2                                                    = XHasTuple6(has.tail)._2
    def _3: T3                                                    = XHasTuple6(has.tail)._3
    def _4: T4                                                    = XHasTuple6(has.tail)._4
    def _5: T5                                                    = XHasTuple6(has.tail)._5
    def _6: T6                                                    = XHasTuple6(has.tail)._6
    def _7: T7                                                    = has.head
    def replace_1[T](i: T): XHasTuple7[T, T2, T3, T4, T5, T6, T7] = XHasTuple7(new xio.nat.has.NatPositive(XHasTuple6(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple7[T1, T, T3, T4, T5, T6, T7] = XHasTuple7(new xio.nat.has.NatPositive(XHasTuple6(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple7[T1, T2, T, T4, T5, T6, T7] = XHasTuple7(new xio.nat.has.NatPositive(XHasTuple6(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple7[T1, T2, T3, T, T5, T6, T7] = XHasTuple7(new xio.nat.has.NatPositive(XHasTuple6(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple7[T1, T2, T3, T4, T, T6, T7] = XHasTuple7(new xio.nat.has.NatPositive(XHasTuple6(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple7[T1, T2, T3, T4, T5, T, T7] = XHasTuple7(new xio.nat.has.NatPositive(XHasTuple6(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple7[T1, T2, T3, T4, T5, T6, T] = XHasTuple7(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple8[T1, T2, T3, T4, T5, T6, T7, T8](has: XHas8[T1, T2, T3, T4, T5, T6, T7, T8]) {
    def _1: T1                                                        = XHasTuple7(has.tail)._1
    def _2: T2                                                        = XHasTuple7(has.tail)._2
    def _3: T3                                                        = XHasTuple7(has.tail)._3
    def _4: T4                                                        = XHasTuple7(has.tail)._4
    def _5: T5                                                        = XHasTuple7(has.tail)._5
    def _6: T6                                                        = XHasTuple7(has.tail)._6
    def _7: T7                                                        = XHasTuple7(has.tail)._7
    def _8: T8                                                        = has.head
    def replace_1[T](i: T): XHasTuple8[T, T2, T3, T4, T5, T6, T7, T8] = XHasTuple8(new xio.nat.has.NatPositive(XHasTuple7(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple8[T1, T, T3, T4, T5, T6, T7, T8] = XHasTuple8(new xio.nat.has.NatPositive(XHasTuple7(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple8[T1, T2, T, T4, T5, T6, T7, T8] = XHasTuple8(new xio.nat.has.NatPositive(XHasTuple7(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple8[T1, T2, T3, T, T5, T6, T7, T8] = XHasTuple8(new xio.nat.has.NatPositive(XHasTuple7(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple8[T1, T2, T3, T4, T, T6, T7, T8] = XHasTuple8(new xio.nat.has.NatPositive(XHasTuple7(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple8[T1, T2, T3, T4, T5, T, T7, T8] = XHasTuple8(new xio.nat.has.NatPositive(XHasTuple7(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple8[T1, T2, T3, T4, T5, T6, T, T8] = XHasTuple8(new xio.nat.has.NatPositive(XHasTuple7(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple8[T1, T2, T3, T4, T5, T6, T7, T] = XHasTuple8(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9](has: XHas9[T1, T2, T3, T4, T5, T6, T7, T8, T9]) {
    def _1: T1                                                            = XHasTuple8(has.tail)._1
    def _2: T2                                                            = XHasTuple8(has.tail)._2
    def _3: T3                                                            = XHasTuple8(has.tail)._3
    def _4: T4                                                            = XHasTuple8(has.tail)._4
    def _5: T5                                                            = XHasTuple8(has.tail)._5
    def _6: T6                                                            = XHasTuple8(has.tail)._6
    def _7: T7                                                            = XHasTuple8(has.tail)._7
    def _8: T8                                                            = XHasTuple8(has.tail)._8
    def _9: T9                                                            = has.head
    def replace_1[T](i: T): XHasTuple9[T, T2, T3, T4, T5, T6, T7, T8, T9] = XHasTuple9(new xio.nat.has.NatPositive(XHasTuple8(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple9[T1, T, T3, T4, T5, T6, T7, T8, T9] = XHasTuple9(new xio.nat.has.NatPositive(XHasTuple8(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple9[T1, T2, T, T4, T5, T6, T7, T8, T9] = XHasTuple9(new xio.nat.has.NatPositive(XHasTuple8(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple9[T1, T2, T3, T, T5, T6, T7, T8, T9] = XHasTuple9(new xio.nat.has.NatPositive(XHasTuple8(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple9[T1, T2, T3, T4, T, T6, T7, T8, T9] = XHasTuple9(new xio.nat.has.NatPositive(XHasTuple8(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple9[T1, T2, T3, T4, T5, T, T7, T8, T9] = XHasTuple9(new xio.nat.has.NatPositive(XHasTuple8(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple9[T1, T2, T3, T4, T5, T6, T, T8, T9] = XHasTuple9(new xio.nat.has.NatPositive(XHasTuple8(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple9[T1, T2, T3, T4, T5, T6, T7, T, T9] = XHasTuple9(new xio.nat.has.NatPositive(XHasTuple8(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T] = XHasTuple9(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](has: XHas10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]) {
    def _1: T1   = XHasTuple9(has.tail)._1
    def _2: T2   = XHasTuple9(has.tail)._2
    def _3: T3   = XHasTuple9(has.tail)._3
    def _4: T4   = XHasTuple9(has.tail)._4
    def _5: T5   = XHasTuple9(has.tail)._5
    def _6: T6   = XHasTuple9(has.tail)._6
    def _7: T7   = XHasTuple9(has.tail)._7
    def _8: T8   = XHasTuple9(has.tail)._8
    def _9: T9   = XHasTuple9(has.tail)._9
    def _10: T10 = has.head
    def replace_1[T](i: T): XHasTuple10[T, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple10[T1, T, T3, T4, T5, T6, T7, T8, T9, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple10[T1, T2, T, T4, T5, T6, T7, T8, T9, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple10[T1, T2, T3, T, T5, T6, T7, T8, T9, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple10[T1, T2, T3, T4, T, T6, T7, T8, T9, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple10[T1, T2, T3, T4, T5, T, T7, T8, T9, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple10[T1, T2, T3, T4, T5, T6, T, T8, T9, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple10[T1, T2, T3, T4, T5, T6, T7, T, T9, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T, T10] =
      XHasTuple10(new xio.nat.has.NatPositive(XHasTuple9(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T] = XHasTuple10(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](has: XHas11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]) {
    def _1: T1   = XHasTuple10(has.tail)._1
    def _2: T2   = XHasTuple10(has.tail)._2
    def _3: T3   = XHasTuple10(has.tail)._3
    def _4: T4   = XHasTuple10(has.tail)._4
    def _5: T5   = XHasTuple10(has.tail)._5
    def _6: T6   = XHasTuple10(has.tail)._6
    def _7: T7   = XHasTuple10(has.tail)._7
    def _8: T8   = XHasTuple10(has.tail)._8
    def _9: T9   = XHasTuple10(has.tail)._9
    def _10: T10 = XHasTuple10(has.tail)._10
    def _11: T11 = has.head
    def replace_1[T](i: T): XHasTuple11[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple11[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple11[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple11[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple11[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple11[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple11[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple11[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11] =
      XHasTuple11(new xio.nat.has.NatPositive(XHasTuple10(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T] = XHasTuple11(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](has: XHas12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]) {
    def _1: T1   = XHasTuple11(has.tail)._1
    def _2: T2   = XHasTuple11(has.tail)._2
    def _3: T3   = XHasTuple11(has.tail)._3
    def _4: T4   = XHasTuple11(has.tail)._4
    def _5: T5   = XHasTuple11(has.tail)._5
    def _6: T6   = XHasTuple11(has.tail)._6
    def _7: T7   = XHasTuple11(has.tail)._7
    def _8: T8   = XHasTuple11(has.tail)._8
    def _9: T9   = XHasTuple11(has.tail)._9
    def _10: T10 = XHasTuple11(has.tail)._10
    def _11: T11 = XHasTuple11(has.tail)._11
    def _12: T12 = has.head
    def replace_1[T](i: T): XHasTuple12[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple12[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple12[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple12[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple12[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple12[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple12[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12] =
      XHasTuple12(new xio.nat.has.NatPositive(XHasTuple11(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T] = XHasTuple12(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](has: XHas13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]) {
    def _1: T1   = XHasTuple12(has.tail)._1
    def _2: T2   = XHasTuple12(has.tail)._2
    def _3: T3   = XHasTuple12(has.tail)._3
    def _4: T4   = XHasTuple12(has.tail)._4
    def _5: T5   = XHasTuple12(has.tail)._5
    def _6: T6   = XHasTuple12(has.tail)._6
    def _7: T7   = XHasTuple12(has.tail)._7
    def _8: T8   = XHasTuple12(has.tail)._8
    def _9: T9   = XHasTuple12(has.tail)._9
    def _10: T10 = XHasTuple12(has.tail)._10
    def _11: T11 = XHasTuple12(has.tail)._11
    def _12: T12 = XHasTuple12(has.tail)._12
    def _13: T13 = has.head
    def replace_1[T](i: T): XHasTuple13[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple13[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple13[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple13[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple13[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple13[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple13[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13] =
      XHasTuple13(new xio.nat.has.NatPositive(XHasTuple12(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T] = XHasTuple13(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](has: XHas14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]) {
    def _1: T1   = XHasTuple13(has.tail)._1
    def _2: T2   = XHasTuple13(has.tail)._2
    def _3: T3   = XHasTuple13(has.tail)._3
    def _4: T4   = XHasTuple13(has.tail)._4
    def _5: T5   = XHasTuple13(has.tail)._5
    def _6: T6   = XHasTuple13(has.tail)._6
    def _7: T7   = XHasTuple13(has.tail)._7
    def _8: T8   = XHasTuple13(has.tail)._8
    def _9: T9   = XHasTuple13(has.tail)._9
    def _10: T10 = XHasTuple13(has.tail)._10
    def _11: T11 = XHasTuple13(has.tail)._11
    def _12: T12 = XHasTuple13(has.tail)._12
    def _13: T13 = XHasTuple13(has.tail)._13
    def _14: T14 = has.head
    def replace_1[T](i: T): XHasTuple14[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple14[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple14[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple14[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple14[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14] =
      XHasTuple14(new xio.nat.has.NatPositive(XHasTuple13(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T] = XHasTuple14(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    has: XHas15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  ) {
    def _1: T1   = XHasTuple14(has.tail)._1
    def _2: T2   = XHasTuple14(has.tail)._2
    def _3: T3   = XHasTuple14(has.tail)._3
    def _4: T4   = XHasTuple14(has.tail)._4
    def _5: T5   = XHasTuple14(has.tail)._5
    def _6: T6   = XHasTuple14(has.tail)._6
    def _7: T7   = XHasTuple14(has.tail)._7
    def _8: T8   = XHasTuple14(has.tail)._8
    def _9: T9   = XHasTuple14(has.tail)._9
    def _10: T10 = XHasTuple14(has.tail)._10
    def _11: T11 = XHasTuple14(has.tail)._11
    def _12: T12 = XHasTuple14(has.tail)._12
    def _13: T13 = XHasTuple14(has.tail)._13
    def _14: T14 = XHasTuple14(has.tail)._14
    def _15: T15 = has.head
    def replace_1[T](i: T): XHasTuple15[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple15[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple15[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple15[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple15[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15] =
      XHasTuple15(new xio.nat.has.NatPositive(XHasTuple14(has.tail).replace_14(i).has, has.head))
    def replace_15[T](i: T): XHasTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T] = XHasTuple15(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    has: XHas16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  ) {
    def _1: T1   = XHasTuple15(has.tail)._1
    def _2: T2   = XHasTuple15(has.tail)._2
    def _3: T3   = XHasTuple15(has.tail)._3
    def _4: T4   = XHasTuple15(has.tail)._4
    def _5: T5   = XHasTuple15(has.tail)._5
    def _6: T6   = XHasTuple15(has.tail)._6
    def _7: T7   = XHasTuple15(has.tail)._7
    def _8: T8   = XHasTuple15(has.tail)._8
    def _9: T9   = XHasTuple15(has.tail)._9
    def _10: T10 = XHasTuple15(has.tail)._10
    def _11: T11 = XHasTuple15(has.tail)._11
    def _12: T12 = XHasTuple15(has.tail)._12
    def _13: T13 = XHasTuple15(has.tail)._13
    def _14: T14 = XHasTuple15(has.tail)._14
    def _15: T15 = XHasTuple15(has.tail)._15
    def _16: T16 = has.head
    def replace_1[T](i: T): XHasTuple16[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple16[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple16[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple16[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple16[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_14(i).has, has.head))
    def replace_15[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16] =
      XHasTuple16(new xio.nat.has.NatPositive(XHasTuple15(has.tail).replace_15(i).has, has.head))
    def replace_16[T](i: T): XHasTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T] = XHasTuple16(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    has: XHas17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ) {
    def _1: T1   = XHasTuple16(has.tail)._1
    def _2: T2   = XHasTuple16(has.tail)._2
    def _3: T3   = XHasTuple16(has.tail)._3
    def _4: T4   = XHasTuple16(has.tail)._4
    def _5: T5   = XHasTuple16(has.tail)._5
    def _6: T6   = XHasTuple16(has.tail)._6
    def _7: T7   = XHasTuple16(has.tail)._7
    def _8: T8   = XHasTuple16(has.tail)._8
    def _9: T9   = XHasTuple16(has.tail)._9
    def _10: T10 = XHasTuple16(has.tail)._10
    def _11: T11 = XHasTuple16(has.tail)._11
    def _12: T12 = XHasTuple16(has.tail)._12
    def _13: T13 = XHasTuple16(has.tail)._13
    def _14: T14 = XHasTuple16(has.tail)._14
    def _15: T15 = XHasTuple16(has.tail)._15
    def _16: T16 = XHasTuple16(has.tail)._16
    def _17: T17 = has.head
    def replace_1[T](i: T): XHasTuple17[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple17[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple17[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple17[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple17[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_14(i).has, has.head))
    def replace_15[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_15(i).has, has.head))
    def replace_16[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17] =
      XHasTuple17(new xio.nat.has.NatPositive(XHasTuple16(has.tail).replace_16(i).has, has.head))
    def replace_17[T](i: T): XHasTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T] = XHasTuple17(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    has: XHas18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ) {
    def _1: T1   = XHasTuple17(has.tail)._1
    def _2: T2   = XHasTuple17(has.tail)._2
    def _3: T3   = XHasTuple17(has.tail)._3
    def _4: T4   = XHasTuple17(has.tail)._4
    def _5: T5   = XHasTuple17(has.tail)._5
    def _6: T6   = XHasTuple17(has.tail)._6
    def _7: T7   = XHasTuple17(has.tail)._7
    def _8: T8   = XHasTuple17(has.tail)._8
    def _9: T9   = XHasTuple17(has.tail)._9
    def _10: T10 = XHasTuple17(has.tail)._10
    def _11: T11 = XHasTuple17(has.tail)._11
    def _12: T12 = XHasTuple17(has.tail)._12
    def _13: T13 = XHasTuple17(has.tail)._13
    def _14: T14 = XHasTuple17(has.tail)._14
    def _15: T15 = XHasTuple17(has.tail)._15
    def _16: T16 = XHasTuple17(has.tail)._16
    def _17: T17 = XHasTuple17(has.tail)._17
    def _18: T18 = has.head
    def replace_1[T](i: T): XHasTuple18[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple18[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple18[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple18[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple18[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_14(i).has, has.head))
    def replace_15[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_15(i).has, has.head))
    def replace_16[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_16(i).has, has.head))
    def replace_17[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18] =
      XHasTuple18(new xio.nat.has.NatPositive(XHasTuple17(has.tail).replace_17(i).has, has.head))
    def replace_18[T](i: T): XHasTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T] =
      XHasTuple18(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    has: XHas19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ) {
    def _1: T1   = XHasTuple18(has.tail)._1
    def _2: T2   = XHasTuple18(has.tail)._2
    def _3: T3   = XHasTuple18(has.tail)._3
    def _4: T4   = XHasTuple18(has.tail)._4
    def _5: T5   = XHasTuple18(has.tail)._5
    def _6: T6   = XHasTuple18(has.tail)._6
    def _7: T7   = XHasTuple18(has.tail)._7
    def _8: T8   = XHasTuple18(has.tail)._8
    def _9: T9   = XHasTuple18(has.tail)._9
    def _10: T10 = XHasTuple18(has.tail)._10
    def _11: T11 = XHasTuple18(has.tail)._11
    def _12: T12 = XHasTuple18(has.tail)._12
    def _13: T13 = XHasTuple18(has.tail)._13
    def _14: T14 = XHasTuple18(has.tail)._14
    def _15: T15 = XHasTuple18(has.tail)._15
    def _16: T16 = XHasTuple18(has.tail)._16
    def _17: T17 = XHasTuple18(has.tail)._17
    def _18: T18 = XHasTuple18(has.tail)._18
    def _19: T19 = has.head
    def replace_1[T](i: T): XHasTuple19[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple19[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple19[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple19[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple19[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_14(i).has, has.head))
    def replace_15[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_15(i).has, has.head))
    def replace_16[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_16(i).has, has.head))
    def replace_17[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_17(i).has, has.head))
    def replace_18[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T, T19] =
      XHasTuple19(new xio.nat.has.NatPositive(XHasTuple18(has.tail).replace_18(i).has, has.head))
    def replace_19[T](i: T): XHasTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T] =
      XHasTuple19(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    has: XHas20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ) {
    def _1: T1   = XHasTuple19(has.tail)._1
    def _2: T2   = XHasTuple19(has.tail)._2
    def _3: T3   = XHasTuple19(has.tail)._3
    def _4: T4   = XHasTuple19(has.tail)._4
    def _5: T5   = XHasTuple19(has.tail)._5
    def _6: T6   = XHasTuple19(has.tail)._6
    def _7: T7   = XHasTuple19(has.tail)._7
    def _8: T8   = XHasTuple19(has.tail)._8
    def _9: T9   = XHasTuple19(has.tail)._9
    def _10: T10 = XHasTuple19(has.tail)._10
    def _11: T11 = XHasTuple19(has.tail)._11
    def _12: T12 = XHasTuple19(has.tail)._12
    def _13: T13 = XHasTuple19(has.tail)._13
    def _14: T14 = XHasTuple19(has.tail)._14
    def _15: T15 = XHasTuple19(has.tail)._15
    def _16: T16 = XHasTuple19(has.tail)._16
    def _17: T17 = XHasTuple19(has.tail)._17
    def _18: T18 = XHasTuple19(has.tail)._18
    def _19: T19 = XHasTuple19(has.tail)._19
    def _20: T20 = has.head
    def replace_1[T](i: T): XHasTuple20[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple20[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple20[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple20[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple20[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_14(i).has, has.head))
    def replace_15[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_15(i).has, has.head))
    def replace_16[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_16(i).has, has.head))
    def replace_17[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_17(i).has, has.head))
    def replace_18[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T, T19, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_18(i).has, has.head))
    def replace_19[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T, T20] =
      XHasTuple20(new xio.nat.has.NatPositive(XHasTuple19(has.tail).replace_19(i).has, has.head))
    def replace_20[T](i: T): XHasTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T] =
      XHasTuple20(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    has: XHas21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ) {
    def _1: T1   = XHasTuple20(has.tail)._1
    def _2: T2   = XHasTuple20(has.tail)._2
    def _3: T3   = XHasTuple20(has.tail)._3
    def _4: T4   = XHasTuple20(has.tail)._4
    def _5: T5   = XHasTuple20(has.tail)._5
    def _6: T6   = XHasTuple20(has.tail)._6
    def _7: T7   = XHasTuple20(has.tail)._7
    def _8: T8   = XHasTuple20(has.tail)._8
    def _9: T9   = XHasTuple20(has.tail)._9
    def _10: T10 = XHasTuple20(has.tail)._10
    def _11: T11 = XHasTuple20(has.tail)._11
    def _12: T12 = XHasTuple20(has.tail)._12
    def _13: T13 = XHasTuple20(has.tail)._13
    def _14: T14 = XHasTuple20(has.tail)._14
    def _15: T15 = XHasTuple20(has.tail)._15
    def _16: T16 = XHasTuple20(has.tail)._16
    def _17: T17 = XHasTuple20(has.tail)._17
    def _18: T18 = XHasTuple20(has.tail)._18
    def _19: T19 = XHasTuple20(has.tail)._19
    def _20: T20 = XHasTuple20(has.tail)._20
    def _21: T21 = has.head
    def replace_1[T](i: T): XHasTuple21[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple21[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple21[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple21[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple21[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_14(i).has, has.head))
    def replace_15[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_15(i).has, has.head))
    def replace_16[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_16(i).has, has.head))
    def replace_17[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_17(i).has, has.head))
    def replace_18[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T, T19, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_18(i).has, has.head))
    def replace_19[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T, T20, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_19(i).has, has.head))
    def replace_20[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T, T21] =
      XHasTuple21(new xio.nat.has.NatPositive(XHasTuple20(has.tail).replace_20(i).has, has.head))
    def replace_21[T](i: T): XHasTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T] =
      XHasTuple21(new xio.nat.has.NatPositive(has.tail, i))
  }
  case class XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    has: XHas22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ) {
    def _1: T1   = XHasTuple21(has.tail)._1
    def _2: T2   = XHasTuple21(has.tail)._2
    def _3: T3   = XHasTuple21(has.tail)._3
    def _4: T4   = XHasTuple21(has.tail)._4
    def _5: T5   = XHasTuple21(has.tail)._5
    def _6: T6   = XHasTuple21(has.tail)._6
    def _7: T7   = XHasTuple21(has.tail)._7
    def _8: T8   = XHasTuple21(has.tail)._8
    def _9: T9   = XHasTuple21(has.tail)._9
    def _10: T10 = XHasTuple21(has.tail)._10
    def _11: T11 = XHasTuple21(has.tail)._11
    def _12: T12 = XHasTuple21(has.tail)._12
    def _13: T13 = XHasTuple21(has.tail)._13
    def _14: T14 = XHasTuple21(has.tail)._14
    def _15: T15 = XHasTuple21(has.tail)._15
    def _16: T16 = XHasTuple21(has.tail)._16
    def _17: T17 = XHasTuple21(has.tail)._17
    def _18: T18 = XHasTuple21(has.tail)._18
    def _19: T19 = XHasTuple21(has.tail)._19
    def _20: T20 = XHasTuple21(has.tail)._20
    def _21: T21 = XHasTuple21(has.tail)._21
    def _22: T22 = has.head
    def replace_1[T](i: T): XHasTuple22[T, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_1(i).has, has.head))
    def replace_2[T](i: T): XHasTuple22[T1, T, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_2(i).has, has.head))
    def replace_3[T](i: T): XHasTuple22[T1, T2, T, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_3(i).has, has.head))
    def replace_4[T](i: T): XHasTuple22[T1, T2, T3, T, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_4(i).has, has.head))
    def replace_5[T](i: T): XHasTuple22[T1, T2, T3, T4, T, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_5(i).has, has.head))
    def replace_6[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_6(i).has, has.head))
    def replace_7[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_7(i).has, has.head))
    def replace_8[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_8(i).has, has.head))
    def replace_9[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_9(i).has, has.head))
    def replace_10[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_10(i).has, has.head))
    def replace_11[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_11(i).has, has.head))
    def replace_12[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_12(i).has, has.head))
    def replace_13[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_13(i).has, has.head))
    def replace_14[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T, T15, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_14(i).has, has.head))
    def replace_15[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T, T16, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_15(i).has, has.head))
    def replace_16[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T, T17, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_16(i).has, has.head))
    def replace_17[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T, T18, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_17(i).has, has.head))
    def replace_18[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T, T19, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_18(i).has, has.head))
    def replace_19[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T, T20, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_19(i).has, has.head))
    def replace_20[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T, T21, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_20(i).has, has.head))
    def replace_21[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T, T22] =
      XHasTuple22(new xio.nat.has.NatPositive(XHasTuple21(has.tail).replace_21(i).has, has.head))
    def replace_22[T](i: T): XHasTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T] =
      XHasTuple22(new xio.nat.has.NatPositive(has.tail, i))
  }
}
