package xio.logging

import xio.nat.error.NatEither
import xio.nat.has.{Nat, NatFinder, NatPositive, NatToTag}
import xio.{XError, XHas, XIO, XIOHelper, XLayer}
import zio._
import zio.logging._

object xlog {

  type XLogging = XHas#_1[Logger[String]]

  def apply(level: LogLevel)(line: => String): XIO[XLogging, XError#_0, Unit] =
    XIO.fromZIO(
      log
        .apply(level)(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l.head)
        }))

  val context: XIO[XLogging, XError#_0, LogContext] = XIO.fromZIO(Logging.context.provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
    Has(l.head)
  }))

  def debug(line: => String): XIO[XLogging, XError#_0, Unit] =
    XIO.fromZIO(
      log
        .debug(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l.head)
        }))

  def error(line: => String): XIO[XLogging, XError#_0, Unit] =
    XIO.fromZIO(
      log
        .error(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l.head)
        }))

  def error(line: => String, cause: Cause[Any]): XIO[XLogging, XError#_0, Unit] =
    XIO.fromZIO(
      log
        .error(line, cause = cause)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l.head)
        }))

  def info(line: => String): XIO[XLogging, XError#_0, Unit] =
    XIO.fromZIO(
      log
        .info(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l.head)
        }))

  def locally[R <: Nat, E <: NatEither, A1](fn: LogContext => LogContext)(zio: XIO[R, E, A1])(implicit n: NatFinder[R, Logger[String]]): XIO[R, E, A1] =
    XIOHelper.scalax_simpleFlatMap(XIO.fromFunction[E](identity[R]))(nn => XIO.fromZIO(n.to(nn).locally(fn)(zio.zio)))

  def locallyM[R <: Nat, E <: NatEither, A1](fn: LogContext => XIO[R, XError#_0, LogContext])(zio: XIO[R, E, A1])(
    implicit n: NatFinder[R, Logger[String]]): XIO[R, E, A1] =
    XIOHelper.scalax_simpleFlatMap(XIO.fromFunction[E](identity[R]))(nn => XIO.fromZIO(n.to(nn).locallyM(p => fn(p).noErrorZIO)(zio.zio)))

  def throwable(line: => String, t: Throwable): XIO[XLogging, XError#_0, Unit] =
    XIO.fromZIO(
      log
        .throwable(line, t)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l.head)
        }))

  def trace(line: => String): XIO[XLogging, XError#_0, Unit] =
    XIO.fromZIO(
      log
        .trace(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l.head)
        }))

  def warn(line: => String): XIO[XLogging, XError#_0, Unit] =
    XIO.fromZIO(
      log
        .warn(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l.head)
        }))

}
