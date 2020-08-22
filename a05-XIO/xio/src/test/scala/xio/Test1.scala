package xio

import xio.nat.error.NatEitherSetter

object Test1 {
  type Ei1 = XError#_5[Item2, Item3, Item3, Item4, Item5]
  type Ei2 = XError#_5[Item3, Item4, Item4, Item3, Item3]

  def main(arr: Array[String]): Unit = {
    val setter = new NatEitherSetter.NatEitherApply[Ei1]
    println(setter(new Item2)) // First(Item2) :: success :: success :: success :: success
    println(setter(new Item3)) // Right(Item3) :: success :: success
    println(setter(new Item4)) // Right(Item4) :: success

    val item3Either = setter(new Item3)
    val item4Either = setter(new Item4)
  }

}
