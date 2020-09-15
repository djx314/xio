package xio

import xio.nat.NatZero

object Test3 {

  def main(arr: Array[String]): Unit = {
    val bb = NatZero.next(new Item1).next(new Item2).next(new Item3).next(new Item4).next(new Item4)
    println(bb.get[Item2])
    println(bb.get[Item3])
    println(bb.get[Item4])
  }

}
