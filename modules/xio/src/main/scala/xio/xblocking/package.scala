package xio

import zio.{Has, ZLayer}
import zio.blocking.Blocking

package object xblocking {

  def effectBlocking[A](effect: => A): XIO[XHas1[Blocking.Service], XError1[Throwable], A] =
    XIO.fromZIO(
      zio.blocking
        .effectBlocking(effect)
        .provideLayer(ZLayer.fromFunctionMany { i: XHas1[Blocking.Service] =>
          Has(i._0.get)
        })
        .mapError(i => XError1(i))
    )

}
