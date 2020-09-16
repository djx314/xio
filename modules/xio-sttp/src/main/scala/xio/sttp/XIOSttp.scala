package sttp.client.asynchttpclient

import sttp.client.{Request, Response, SttpBackendOptions}
import org.asynchttpclient.BoundRequestBuilder
import _root_.xio._
import _root_.zio._
import sttp.client.ws.{WebSocket, WebSocketResponse}

package object xio {

  type SttpClient = XHas1[sttp.client.asynchttpclient.zio.SttpClient.Service]

  object SttpClient {
    def send[T](request: Request[T, stream.Stream[Throwable, Byte]]): XIO[SttpClient, XError1[Throwable], Response[T]] = {
      val zio1 = sttp.client.asynchttpclient.zio.SttpClient.send(request)
      val fun = ZLayer.fromFunctionMany { s: SttpClient =>
        Has(s._0.get)
      }
      val zio2 = zio1.provideLayer(fun)
      val zio3 = zio2.mapError(i => XError1(i))
      XIO.fromZIO(zio3)
    }

    def openWebsocket[T, WS_RESULT](
      request: Request[T, Nothing]
    ): XIO[SttpClient, XError1[Throwable], WebSocketResponse[WebSocket[Task]]] = {
      val zio1 = sttp.client.asynchttpclient.zio.SttpClient.openWebsocket(request)
      val fun = ZLayer.fromFunctionMany { s: SttpClient =>
        Has(s._0.get)
      }
      val zio2 = zio1.provideLayer(fun)
      val zio3 = zio2.mapError(i => XError1(i))
      XIO.fromZIO(zio3)
    }
  }

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
