package xio

import zio.ZIO
import zio.blocking.Blocking

package object xblocking {

  def effectBlocking[A](effect: => A): ZIO[Blocking, XError1[Throwable], A] = zio.blocking.effectBlocking(effect).startError

}
