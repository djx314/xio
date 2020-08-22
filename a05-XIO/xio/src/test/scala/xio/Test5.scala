package xio

import zio._

object Test5 {

  def main(arr: Array[String]): Unit = {
    val b1                                                      = XIO.fail(new Item3)
    val b2: XIO[XHas#_0, XError#_3[Item2, Item3, Item4], Item5] = b1
    val b3: XIO[XHas#_0, XError#_1[Item5], Item5] = b2
      .mapError[Item3, XError#_2[Item2, Item4]]((item3, call) => call(new Item4))
      .mapError[Item2, XError#_2[Item4, Item5]]((item2, call) => call(new Item5))
      .mapError[Item4, XError#_1[Item5]]((item4, call) => call(new Item5))
    /*
    [error] (run-main-e) zio.FiberFailure: Fiber failed.
    [error] A checked error was not handled.
    [error] Right(Item5)
     */
    println(Runtime.default.unsafeRun(b3.zio.provide(XHas._0)))
  }

}
