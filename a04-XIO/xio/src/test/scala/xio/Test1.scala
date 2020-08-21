package xio

import xio.nat.error.{NatEitherMapper, NatEitherSetter}

object Test1 {
  type Ei1 = XError#_5[Item2, Item3, Item3, Item4, Item5]
  type Ei2 = XError#_5[Item3, Item4, Item4, Item3, Item3]

  def main(arr: Array[String]): Unit = {
    println(NatEitherSetter.set[Ei1](new Item2)) // First(Item2) :: success :: success :: success :: success
    println(NatEitherSetter.set[Ei1](new Item3)) // Right(Item3) :: success :: success
    println(NatEitherSetter.set[Ei1](new Item4)) // Right(Item4) :: success

    val item3Either = NatEitherSetter.set[Ei1](new Item3)
    val item4Either = NatEitherSetter.set[Ei1](new Item4)
    println(NatEitherMapper.map(item3Either, { i: Item3 => new Item5 })) // Right(Item5) :: success :: success
    println(NatEitherMapper.map(item4Either, { i: Item3 => new Item5 })) // Right(Item4) :: success
  }

}
