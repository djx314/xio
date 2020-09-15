package xio

object Test2 {

  def main(arr: Array[String]): Unit = {
    val bb = XHas._5(new Item1, new Item2, new Item3, new Item4, new Item5)
    println(bb) // NatZero :: Item1 :: Item2 :: Item3 :: Item4 :: Item5
  }

}
