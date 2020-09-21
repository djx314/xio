package sttp.client.asynchttpclient

import sttp.client.{Request, Response}
import _root_.xio._
import _root_.zio._
import sttp.client.ws.{WebSocket, WebSocketResponse}

package object xio {

  object SttpClient {
    def send[T](request: Request[T, stream.Stream[Throwable, Byte]]): XIO[sttp.client.asynchttpclient.zio.SttpClient, XError1[Throwable], Response[T]] =
      sttp.client.asynchttpclient.zio.SttpClient.send(request).startError

    def openWebsocket[T, WS_RESULT](
      request: Request[T, Nothing]
    ): XIO[sttp.client.asynchttpclient.zio.SttpClient, XError1[Throwable], WebSocketResponse[WebSocket[Task]]] =
      sttp.client.asynchttpclient.zio.SttpClient.openWebsocket(request).startError
  }

}
