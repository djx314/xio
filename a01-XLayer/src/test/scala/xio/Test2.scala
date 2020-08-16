package xio

import xio.nat.NatZero

object Test2 {
  def main(arr: Array[String]): Unit = {
    type Items1 = (Item1, Item2, Item3)
    type Items2 = (Item1, Item2, Item3, Item4, Item5)

    val i1: XIO[NatZero#Next[Item1]#Next[Item2]#Next[Item3], Items1]                            = n => (n.tail.tail.head, n.tail.head, n.head)
    val f2: Items1 => XIO[NatZero#Next[Item4]#Next[Item5], (Item1, Item2, Item3, Item4, Item5)] = i => param => (i._1, i._2, i._3, param.tail.head, param.head)
    val i2                                                                                      = i1.flatMap(f2)
    val i3: XIO[NatZero#Next[Item1]#Next[Item2]#Next[Item3]#Next[Item4]#Next[Item5], Items2]    = i2
    println(i3.in(NatZero.next(new Item1).next(new Item2).next(new Item3).next(new Item4).next(new Item5))) // (Item1,Item2,Item3,Item4,Item5)
  }
}
