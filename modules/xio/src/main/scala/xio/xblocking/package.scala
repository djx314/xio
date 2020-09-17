package xio

import zio.blocking.Blocking

package object xblocking {

  def effectBlocking[A](effect: => A): XIO[Blocking, XError1[Throwable], A] = XIO.fromZIO(zio.blocking.effectBlocking(effect).mapError(i => XError1(i)))

}
