package xio

import xio.nat.{NatEitherFirst, NatEitherSetter}

object Test1 {
  type Ei1 = NatEitherFirst.Type[Item2]#Next[Item3]#Next[Item4]

  def main(arr: Array[String]): Unit = {
    println(NatEitherSetter.set[Ei1](new Item2)) // First(Item2) :: success :: success
    println(NatEitherSetter.set[Ei1](new Item3)) // Right(Item3) :: success
    println(NatEitherSetter.set[Ei1](new Item4)) // Right(Item4)
  }

}
