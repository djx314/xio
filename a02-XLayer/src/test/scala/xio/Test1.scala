package xio

import xio.nat.NatZero

object Test1 {

  def main(arr: Array[String]): Unit = {
    val bb = NatZero.next(new Item1).next(new Item2).next(new Item3).next(new Item4).next(new Item5)
    println(bb) // NatZero :: Item1 :: Item2 :: Item3 :: Item4 :: Item5
  }

}
