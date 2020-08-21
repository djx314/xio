package xio

import xio.nat.{NatEitherContent, NatEitherFirst, NatEitherMapper, NatEitherSetter}

object Test1 {
  type Ei1 = NatEitherFirst[Item2]#Next[Item3]#Next[Item3]#Next[Item4]#Next[Item5]
  type Ei2 = NatEitherFirst[Item3]#Next[Item4]#Next[Item4]#Next[Item3]#Next[Item3]

  def main(arr: Array[String]): Unit = {
    println(NatEitherSetter.set[Ei1](new Item2)) // First(Item2) :: success :: success :: success :: success
    println(NatEitherSetter.set[Ei1](new Item3)) // Right(Item3) :: success :: success
    println(NatEitherSetter.set[Ei1](new Item4)) // Right(Item4) :: success

    val item3Either = NatEitherSetter.set[Ei1](new Item3)
    val item4Either = NatEitherSetter.set[Ei1](new Item4)
    println(NatEitherMapper.map(item3Either, { i: Item3 => new Item5 })) // Right(Item5) :: success :: success
    println(NatEitherMapper.map(item4Either, { i: Item3 => new Item5 })) // Right(Item4) :: success

    val item5Either: NatEitherContent[NatEitherFirst[Item3]#Next[Item4]] = NatEitherContent[Ei2](new Item3)
    println(item5Either.n) // First(Item3) :: success
  }

}
