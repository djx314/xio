package xio

import xio.nat.NatZero

object Test2 {
  type Items2 = (Item1, Item1, Item2, Item1, Item3)

  def main(arr: Array[String]): Unit = {
    val i1 = for {
      n2 <- XIO.identity[NatZero#Next[Item1]#Next[Item1]#Next[Item2]]
      n3 <- XIO.identity[NatZero#Next[Item1]#Next[Item3]]
    } yield (n2.tail.tail.head, n2.tail.head, n2.head, n3.tail.head, n3.head)

    val i2: XIO[NatZero#Next[Item1]#Next[Item1]#Next[Item2]#Next[Item1]#Next[Item3], Items2] = i1
    println(i2.in(NatZero.next(new Item1).next(new Item1).next(new Item2).next(new Item1).next(new Item3))) // (Item1,Item1,Item2,Item1,Item3)

    val i3: XIO[NatZero#Next[Item1]#Next[Item2]#Next[Item3], Items2] = i1
    println(i3.in(NatZero.next(new Item1).next(new Item2).next(new Item3))) // (Item1,Item1,Item2,Item1,Item3)

    val i4: XIO[NatZero#Next[Item2]#Next[Item3]#Next[Item1], Items2] = for {
      n2 <- XIO.identity[NatZero#Next[Item1]#Next[Item3]#Next[Item1]]
      n3 <- XIO.identity[NatZero#Next[Item1]#Next[Item2]]
    } yield (n2.tail.tail.head, n2.head, n3.head, n3.tail.head, n2.tail.head)
    println(i4.in(NatZero.next(new Item2).next(new Item3).next(new Item1))) // (Item1,Item1,Item2,Item1,Item3)
  }
}
