package xio

import xio.nat.NatZero
import xio.nat.subduction.{AboveNatPositive, AboveNatZero}

object Test1 {

  def main(arr: Array[String]): Unit = {
    val bb =
      NatZero.next(new Item1).next(new Item2).next(new Item3).next(new Item4).next(new Item5).消融1[AboveNatPositive[AboveNatPositive[AboveNatPositive[AboveNatZero]]]]
    println(bb)
  }

}
