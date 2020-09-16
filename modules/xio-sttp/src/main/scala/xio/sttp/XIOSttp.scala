package sttp.client.asynchttpclient

import sttp.client.SttpBackendOptions
import org.asynchttpclient.BoundRequestBuilder
import _root_.xio._
import _root_.zio._

package object xio {

  type SttpClient = XHas1[sttp.client.asynchttpclient.zio.SttpClient.Service]

  object AsyncHttpClientZioBackend {
    def layer(
      options: SttpBackendOptions = SttpBackendOptions.Default,
      customizeRequest: BoundRequestBuilder => BoundRequestBuilder = identity
    ): XLayer[XHas0, XError1[Throwable], SttpClient] = {
      val fun = ZLayer.fromFunctionMany { s: XHas0 =>
        s: Any
      }
      val layer = sttp.client.asynchttpclient.zio.AsyncHttpClientZioBackend.layer(options, customizeRequest)
      val fun2  = fun >>> layer
      val fun3  = fun2.mapError(i => XError1(i)).map(i => XHas1(i.get))
      XLayer.fromZLayer(fun3)
    }
  }
}
