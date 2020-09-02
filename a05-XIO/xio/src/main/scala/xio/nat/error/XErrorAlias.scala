package xio
trait XErrorAlias {
  type XError0                                                          = nat.error.NatEitherZero
  type XError1[T1]                                                      = nat.error.NatEitherPositive[nat.error.NatEitherZero, T1]
  type XError2[T1, T2]                                                  = nat.error.NatEitherPositive[XError1[T1], T2]
  type XError3[T1, T2, T3]                                              = nat.error.NatEitherPositive[XError2[T1, T2], T3]
  type XError4[T1, T2, T3, T4]                                          = nat.error.NatEitherPositive[XError3[T1, T2, T3], T4]
  type XError5[T1, T2, T3, T4, T5]                                      = nat.error.NatEitherPositive[XError4[T1, T2, T3, T4], T5]
  type XError6[T1, T2, T3, T4, T5, T6]                                  = nat.error.NatEitherPositive[XError5[T1, T2, T3, T4, T5], T6]
  type XError7[T1, T2, T3, T4, T5, T6, T7]                              = nat.error.NatEitherPositive[XError6[T1, T2, T3, T4, T5, T6], T7]
  type XError8[T1, T2, T3, T4, T5, T6, T7, T8]                          = nat.error.NatEitherPositive[XError7[T1, T2, T3, T4, T5, T6, T7], T8]
  type XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9]                      = nat.error.NatEitherPositive[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T9]
  type XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]                = nat.error.NatEitherPositive[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10]
  type XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]           = nat.error.NatEitherPositive[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11]
  type XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]      = nat.error.NatEitherPositive[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12]
  type XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = nat.error.NatEitherPositive[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13]
  type XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    nat.error.NatEitherPositive[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14]
  type XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    nat.error.NatEitherPositive[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15]
  type XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    nat.error.NatEitherPositive[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16]
  type XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    nat.error.NatEitherPositive[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17]
  type XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    nat.error.NatEitherPositive[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18]
  type XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    nat.error.NatEitherPositive[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19]
  type XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    nat.error.NatEitherPositive[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20]
  type XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    nat.error.NatEitherPositive[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21]
  type XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    nat.error.NatEitherPositive[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T22]
  class XError1Setter {
    def apply[T1](i1: T1): XError1[T1] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError1[T1], T1]]
      setter.put(i1)
    }
  }
  object XError1 extends XError1Setter
  class XError2Setter[T1, T2] {
    def set1(i1: T1): XError2[T1, T2] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError2[T1, T2], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError2[T1, T2] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError2[T1, T2], T2]]
      setter.put(i2)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError2[T1, T2], T]): XError2[T1, T2] = n.put(ii)
  }
  object XError2 {
    def apply[T1, T2]: XError2Setter[T1, T2] = new XError2Setter[T1, T2]
  }
  class XError3Setter[T1, T2, T3] {
    def set1(i1: T1): XError3[T1, T2, T3] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError3[T1, T2, T3], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError3[T1, T2, T3] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError3[T1, T2, T3], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError3[T1, T2, T3] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError3[T1, T2, T3], T3]]
      setter.put(i3)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError3[T1, T2, T3], T]): XError3[T1, T2, T3] = n.put(ii)
  }
  object XError3 {
    def apply[T1, T2, T3]: XError3Setter[T1, T2, T3] = new XError3Setter[T1, T2, T3]
  }
  class XError4Setter[T1, T2, T3, T4] {
    def set1(i1: T1): XError4[T1, T2, T3, T4] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError4[T1, T2, T3, T4], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError4[T1, T2, T3, T4] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError4[T1, T2, T3, T4], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError4[T1, T2, T3, T4] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError4[T1, T2, T3, T4], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError4[T1, T2, T3, T4] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError4[T1, T2, T3, T4], T4]]
      setter.put(i4)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError4[T1, T2, T3, T4], T]): XError4[T1, T2, T3, T4] = n.put(ii)
  }
  object XError4 {
    def apply[T1, T2, T3, T4]: XError4Setter[T1, T2, T3, T4] = new XError4Setter[T1, T2, T3, T4]
  }
  class XError5Setter[T1, T2, T3, T4, T5] {
    def set1(i1: T1): XError5[T1, T2, T3, T4, T5] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError5[T1, T2, T3, T4, T5], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError5[T1, T2, T3, T4, T5] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError5[T1, T2, T3, T4, T5], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError5[T1, T2, T3, T4, T5] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError5[T1, T2, T3, T4, T5], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError5[T1, T2, T3, T4, T5] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError5[T1, T2, T3, T4, T5], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError5[T1, T2, T3, T4, T5] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError5[T1, T2, T3, T4, T5], T5]]
      setter.put(i5)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError5[T1, T2, T3, T4, T5], T]): XError5[T1, T2, T3, T4, T5] = n.put(ii)
  }
  object XError5 {
    def apply[T1, T2, T3, T4, T5]: XError5Setter[T1, T2, T3, T4, T5] = new XError5Setter[T1, T2, T3, T4, T5]
  }
  class XError6Setter[T1, T2, T3, T4, T5, T6] {
    def set1(i1: T1): XError6[T1, T2, T3, T4, T5, T6] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError6[T1, T2, T3, T4, T5, T6], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError6[T1, T2, T3, T4, T5, T6] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError6[T1, T2, T3, T4, T5, T6], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError6[T1, T2, T3, T4, T5, T6] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError6[T1, T2, T3, T4, T5, T6], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError6[T1, T2, T3, T4, T5, T6] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError6[T1, T2, T3, T4, T5, T6], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError6[T1, T2, T3, T4, T5, T6] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError6[T1, T2, T3, T4, T5, T6], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError6[T1, T2, T3, T4, T5, T6] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError6[T1, T2, T3, T4, T5, T6], T6]]
      setter.put(i6)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError6[T1, T2, T3, T4, T5, T6], T]): XError6[T1, T2, T3, T4, T5, T6] = n.put(ii)
  }
  object XError6 {
    def apply[T1, T2, T3, T4, T5, T6]: XError6Setter[T1, T2, T3, T4, T5, T6] = new XError6Setter[T1, T2, T3, T4, T5, T6]
  }
  class XError7Setter[T1, T2, T3, T4, T5, T6, T7] {
    def set1(i1: T1): XError7[T1, T2, T3, T4, T5, T6, T7] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError7[T1, T2, T3, T4, T5, T6, T7], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError7[T1, T2, T3, T4, T5, T6, T7] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError7[T1, T2, T3, T4, T5, T6, T7], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError7[T1, T2, T3, T4, T5, T6, T7] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError7[T1, T2, T3, T4, T5, T6, T7], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError7[T1, T2, T3, T4, T5, T6, T7] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError7[T1, T2, T3, T4, T5, T6, T7], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError7[T1, T2, T3, T4, T5, T6, T7] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError7[T1, T2, T3, T4, T5, T6, T7], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError7[T1, T2, T3, T4, T5, T6, T7] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError7[T1, T2, T3, T4, T5, T6, T7], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError7[T1, T2, T3, T4, T5, T6, T7] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError7[T1, T2, T3, T4, T5, T6, T7], T7]]
      setter.put(i7)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError7[T1, T2, T3, T4, T5, T6, T7], T]): XError7[T1, T2, T3, T4, T5, T6, T7] = n.put(ii)
  }
  object XError7 {
    def apply[T1, T2, T3, T4, T5, T6, T7]: XError7Setter[T1, T2, T3, T4, T5, T6, T7] = new XError7Setter[T1, T2, T3, T4, T5, T6, T7]
  }
  class XError8Setter[T1, T2, T3, T4, T5, T6, T7, T8] {
    def set1(i1: T1): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T8]]
      setter.put(i8)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError8[T1, T2, T3, T4, T5, T6, T7, T8], T]): XError8[T1, T2, T3, T4, T5, T6, T7, T8] = n.put(ii)
  }
  object XError8 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8]: XError8Setter[T1, T2, T3, T4, T5, T6, T7, T8] = new XError8Setter[T1, T2, T3, T4, T5, T6, T7, T8]
  }
  class XError9Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9] {
    def set1(i1: T1): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T9]]
      setter.put(i9)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T]): XError9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = n.put(ii)
  }
  object XError9 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9]: XError9Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9] = new XError9Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9]
  }
  class XError10Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] {
    def set1(i1: T1): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T10]]
      setter.put(i10)
    }
    def apply[T](ii: T)(implicit n: nat.error.NatEitherSetter[XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T]): XError10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
      n.put(ii)
  }
  object XError10 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]: XError10Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
      new XError10Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  }
  class XError11Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] {
    def set1(i1: T1): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T11]]
      setter.put(i11)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T]
    ): XError11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = n.put(ii)
  }
  object XError11 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]: XError11Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
      new XError11Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  }
  class XError12Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] {
    def set1(i1: T1): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T12]]
      setter.put(i12)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T]
    ): XError12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = n.put(ii)
  }
  object XError12 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]: XError12Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
      new XError12Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
  }
  class XError13Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] {
    def set1(i1: T1): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T13]]
      setter.put(i13)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T]
    ): XError13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = n.put(ii)
  }
  object XError13 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]: XError13Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
      new XError13Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
  }
  class XError14Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
    def set1(i1: T1): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T14]]
      setter.put(i14)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T]
    ): XError14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = n.put(ii)
  }
  object XError14 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]: XError14Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
      new XError14Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  }
  class XError15Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
    def set1(i1: T1): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T14]]
      setter.put(i14)
    }
    def set15(i15: T15): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T15]]
      setter.put(i15)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T]
    ): XError15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = n.put(ii)
  }
  object XError15 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]: XError15Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
      new XError15Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  }
  class XError16Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
    def set1(i1: T1): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T14]]
      setter.put(i14)
    }
    def set15(i15: T15): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T15]]
      setter.put(i15)
    }
    def set16(i16: T16): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T16]]
      setter.put(i16)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T]
    ): XError16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = n.put(ii)
  }
  object XError16 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
      : XError16Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
      new XError16Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  }
  class XError17Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
    def set1(i1: T1): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T14]]
      setter.put(i14)
    }
    def set15(i15: T15): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T15]]
      setter.put(i15)
    }
    def set16(i16: T16): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T16]]
      setter.put(i16)
    }
    def set17(i17: T17): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T17]]
      setter.put(i17)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T]
    ): XError17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = n.put(ii)
  }
  object XError17 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
      : XError17Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
      new XError17Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  }
  class XError18Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
    def set1(i1: T1): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T14]]
      setter.put(i14)
    }
    def set15(i15: T15): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T15]]
      setter.put(i15)
    }
    def set16(i16: T16): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T16]]
      setter.put(i16)
    }
    def set17(i17: T17): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T17]]
      setter.put(i17)
    }
    def set18(i18: T18): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T18]]
      setter.put(i18)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T]
    ): XError18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = n.put(ii)
  }
  object XError18 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
      : XError18Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
      new XError18Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  }
  class XError19Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
    def set1(i1: T1): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T14]]
      setter.put(i14)
    }
    def set15(i15: T15): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T15]]
      setter.put(i15)
    }
    def set16(i16: T16): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T16]]
      setter.put(i16)
    }
    def set17(i17: T17): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T17]]
      setter.put(i17)
    }
    def set18(i18: T18): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T18]]
      setter.put(i18)
    }
    def set19(i19: T19): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T19]]
      setter.put(i19)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T]
    ): XError19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = n.put(ii)
  }
  object XError19 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
      : XError19Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
      new XError19Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  }
  class XError20Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
    def set1(i1: T1): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T14]]
      setter.put(i14)
    }
    def set15(i15: T15): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T15]]
      setter.put(i15)
    }
    def set16(i16: T16): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T16]]
      setter.put(i16)
    }
    def set17(i17: T17): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T17]]
      setter.put(i17)
    }
    def set18(i18: T18): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T18]]
      setter.put(i18)
    }
    def set19(i19: T19): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T19]]
      setter.put(i19)
    }
    def set20(i20: T20): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T20]]
      setter.put(i20)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T]
    ): XError20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = n.put(ii)
  }
  object XError20 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
      : XError20Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
      new XError20Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  }
  class XError21Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
    def set1(i1: T1): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T14]]
      setter.put(i14)
    }
    def set15(i15: T15): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T15]]
      setter.put(i15)
    }
    def set16(i16: T16): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T16]]
      setter.put(i16)
    }
    def set17(i17: T17): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T17]]
      setter.put(i17)
    }
    def set18(i18: T18): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T18]]
      setter.put(i18)
    }
    def set19(i19: T19): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T19]]
      setter.put(i19)
    }
    def set20(i20: T20): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T20]]
      setter.put(i20)
    }
    def set21(i21: T21): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = {
      val setter = implicitly[nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T21]]
      setter.put(i21)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], T]
    ): XError21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = n.put(ii)
  }
  object XError21 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
      : XError21Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
      new XError21Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  }
  class XError22Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
    def set1(i1: T1): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T1]]
      setter.put(i1)
    }
    def set2(i2: T2): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T2]]
      setter.put(i2)
    }
    def set3(i3: T3): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T3]]
      setter.put(i3)
    }
    def set4(i4: T4): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T4]]
      setter.put(i4)
    }
    def set5(i5: T5): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T5]]
      setter.put(i5)
    }
    def set6(i6: T6): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T6]]
      setter.put(i6)
    }
    def set7(i7: T7): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T7]]
      setter.put(i7)
    }
    def set8(i8: T8): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T8]]
      setter.put(i8)
    }
    def set9(i9: T9): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T9]]
      setter.put(i9)
    }
    def set10(i10: T10): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T10]]
      setter.put(i10)
    }
    def set11(i11: T11): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T11]]
      setter.put(i11)
    }
    def set12(i12: T12): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T12]]
      setter.put(i12)
    }
    def set13(i13: T13): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T13]]
      setter.put(i13)
    }
    def set14(i14: T14): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T14]]
      setter.put(i14)
    }
    def set15(i15: T15): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T15]]
      setter.put(i15)
    }
    def set16(i16: T16): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T16]]
      setter.put(i16)
    }
    def set17(i17: T17): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T17]]
      setter.put(i17)
    }
    def set18(i18: T18): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T18]]
      setter.put(i18)
    }
    def set19(i19: T19): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T19]]
      setter.put(i19)
    }
    def set20(i20: T20): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T20]]
      setter.put(i20)
    }
    def set21(i21: T21): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T21]]
      setter.put(i21)
    }
    def set22(i22: T22): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = {
      val setter =
        implicitly[nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T22]]
      setter.put(i22)
    }
    def apply[T](ii: T)(implicit
      n: nat.error.NatEitherSetter[XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T]
    ): XError22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = n.put(ii)
  }
  object XError22 {
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
      : XError22Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
      new XError22Setter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  }
}
