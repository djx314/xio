package xio

import zio._

object Test3 {
  type Items2 = (Item1, Item1, Item2, Item1, Item3)

  def main(arr: Array[String]): Unit = {
    val i1 = for {
      n2 <- XIO.identity[XHas3[Item1, Item1, Item2]]
      n3 <- XIO.identity[XHas2[Item1, Item3]]
    } yield (n2.tail.tail.head, n2.tail.head, n2.head, n3.tail.head, n3.head)

    val i2: XIO[XHas3[Item1, Item1, Item2]#RePlus[XHas2[Item1, Item3]], XError0, Items2] = i1
    println(Runtime.default.unsafeRun(i2.zio.provide(XHas5(new Item1, new Item1, new Item2, new Item1, new Item3)))) // (Item1,Item1,Item2,Item1,Item3)

    val i3: XIO[XHas3[Item1, Item2, Item3], XError0, Items2] = i1
    println(Runtime.default.unsafeRun(i3.zio.provide(XHas3(new Item1, new Item2, new Item3)))) // (Item1,Item1,Item2,Item1,Item3)

    val i4: XIO[XHas3[Item2, Item3, Item1], XError0, Items2] = for {
      n2 <- XIO.identity[XHas3[Item1, Item3, Item1]]
      n3 <- XIO.identity[XHas2[Item1, Item2]]
    } yield (n2.tail.tail.head, n2.head, n3.head, n3.tail.head, n2.tail.head)
    println(Runtime.default.unsafeRun(i4.zio.provide(XHas3(new Item2, new Item3, new Item1)))) // (Item1,Item1,Item2,Item1,Item3)
  }
}
