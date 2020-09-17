package sttp.client.asynchttpclient

import sttp.client.{Request, Response}
import _root_.xio._
import _root_.zio._
import sttp.client.ws.{WebSocket, WebSocketResponse}

package object xio {

  type SttpClient = sttp.client.asynchttpclient.zio.SttpClient

  object SttpClient {
    def send[T](request: Request[T, stream.Stream[Throwable, Byte]]): XIO[SttpClient, XError1[Throwable], Response[T]] = {
      val zio1 = sttp.client.asynchttpclient.zio.SttpClient.send(request)
      val zio3 = zio1.mapError(i => XError1(i))
      XIO.fromZIO(zio3)
    }

    def openWebsocket[T, WS_RESULT](
      request: Request[T, Nothing]
    ): XIO[SttpClient, XError1[Throwable], WebSocketResponse[WebSocket[Task]]] = {
      val zio1 = sttp.client.asynchttpclient.zio.SttpClient.openWebsocket(request)
      val zio3 = zio1.mapError(i => XError1(i))
      XIO.fromZIO(zio3)
    }
  }

}
