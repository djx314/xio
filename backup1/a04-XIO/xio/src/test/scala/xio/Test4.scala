package xio

object Test4 {

  def main(arr: Array[String]): Unit = {
    val bb = XHas._5(new Item1, new Item2, new Item3, new Item4, new Item4)
    println(bb.get[Item2])
    println(bb.get[Item3])
    println(bb.get[Item4])
  }

}
