package xio
trait XError {
    type _0 = nat.error.NatEitherZero
        type _1[  T1 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1] 
        type _2[  T1   ,  T2 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2] 
        type _3[  T1   ,  T2   ,  T3 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3] 
        type _4[  T1   ,  T2   ,  T3   ,  T4 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4] 
        type _5[  T1   ,  T2   ,  T3   ,  T4   ,  T5 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5] 
        type _6[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6] 
        type _7[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7] 
        type _8[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8] 
        type _9[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9] 
        type _10[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10] 
        type _11[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11] 
        type _12[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12] 
        type _13[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13] 
        type _14[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14] 
        type _15[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14]  , T15] 
        type _16[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14]  , T15]  , T16] 
        type _17[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14]  , T15]  , T16]  , T17] 
        type _18[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14]  , T15]  , T16]  , T17]  , T18] 
        type _19[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14]  , T15]  , T16]  , T17]  , T18]  , T19] 
        type _20[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19   ,  T20 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14]  , T15]  , T16]  , T17]  , T18]  , T19]  , T20] 
        type _21[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19   ,  T20   ,  T21 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14]  , T15]  , T16]  , T17]  , T18]  , T19]  , T20]  , T21] 
        type _22[  T1   ,  T2   ,  T3   ,  T4   ,  T5   ,  T6   ,  T7   ,  T8   ,  T9   ,  T10   ,  T11   ,  T12   ,  T13   ,  T14   ,  T15   ,  T16   ,  T17   ,  T18   ,  T19   ,  T20   ,  T21   ,  T22 ] =  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherPositive[  nat.error.NatEitherZero  , T1]  , T2]  , T3]  , T4]  , T5]  , T6]  , T7]  , T8]  , T9]  , T10]  , T11]  , T12]  , T13]  , T14]  , T15]  , T16]  , T17]  , T18]  , T19]  , T20]  , T21]  , T22] 
}