package xio.logging

import xio.nat.error.NatEither
import xio._
import xio.helper.XIOHelper
import zio._
import zio.logging._

object xlog {

  def apply(level: LogLevel)(line: => String): XIO[Logging, XError0, Unit] = XIO.fromZIO(log.apply(level)(line))

  val context: XIO[Logging, XError0, LogContext] = XIO.fromZIO(Logging.context)

  def debug(line: => String): XIO[Logging, XError0, Unit] = XIO.fromZIO(log.debug(line))

  def error(line: => String): XIO[Logging, XError0, Unit] = XIO.fromZIO(log.error(line))

  def error(line: => String, cause: Cause[Any]): XIO[Logging, XError0, Unit] = XIO.fromZIO(log.error(line, cause = cause))

  def info(line: => String): XIO[Logging, XError0, Unit] = XIO.fromZIO(log.info(line))

  def locally[R <: Logging, E <: NatEither, A1](fn: LogContext => LogContext)(zio: XIO[R, E, A1]): XIO[Logging with R, E, A1] = XIO.fromZIO(log.locally(fn)(zio.zio))

  def locallyM[R <: Logging, E <: NatEither, A1](fn: LogContext => XIO[R, XError0, LogContext])(zio: XIO[R, E, A1]): XIO[Logging with R, E, A1] =
    XIO.fromZIO(log.locallyM(s => XIOHelper.simpleNoErrorZIO(fn(s)))(zio.zio))

  def throwable(line: => String, t: Throwable): XIO[Logging, XError0, Unit] = XIO.fromZIO(log.throwable(line, t))

  def trace(line: => String): XIO[Logging, XError0, Unit] = XIO.fromZIO(log.trace(line))

  def warn(line: => String): XIO[Logging, XError0, Unit] = XIO.fromZIO(log.warn(line))

}
