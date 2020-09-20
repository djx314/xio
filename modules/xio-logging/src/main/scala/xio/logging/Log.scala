package xio.logging

import xio.nat.error.NatEither
import xio._
import zio._
import zio.logging._

object xlog {

  def apply(level: LogLevel)(line: => String): XIO[Logging, XError0, Unit] = log.apply(level)(line).startError

  val context: XIO[Logging, XError0, LogContext] = Logging.context.startError

  def debug(line: => String): XIO[Logging, XError0, Unit] = log.debug(line).startError

  def error(line: => String): XIO[Logging, XError0, Unit] = log.error(line).startError

  def error(line: => String, cause: Cause[Any]): XIO[Logging, XError0, Unit] = log.error(line, cause = cause).startError

  def info(line: => String): XIO[Logging, XError0, Unit] = log.info(line).startError

  def locally[R <: Logging, E <: NatEither, A1](fn: LogContext => LogContext)(zio: XIO[R, E, A1]): XIO[Logging with R, E, A1] = log.locally(fn)(zio)

  def locallyM[R <: Logging, E <: NatEither, A1](fn: LogContext => XIO[R, XError0, LogContext])(zio: XIO[R, E, A1]): XIO[Logging with R, E, A1] =
    log.locallyM(s => fn(s).endError)(zio)

  def throwable(line: => String, t: Throwable): XIO[Logging, XError0, Unit] = log.throwable(line, t).startError

  def trace(line: => String): XIO[Logging, XError0, Unit] = log.trace(line).startError

  def warn(line: => String): XIO[Logging, XError0, Unit] = log.warn(line).startError

}
