package xio.logging

import xio.nat.error.NatEither
import xio.nat.has.{Nat, NatFinder}
import xio._
import zio._
import zio.logging._

object xlog {

  type XLogging = XHas1[Logger[String]]

  def apply(level: LogLevel)(line: => String): XIO[XLogging, XError0, Unit] =
    XIO.fromZIO(
      log
        .apply(level)(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l._1)
        }))

  val context: XIO[XLogging, XError0, LogContext] = XIO.fromZIO(Logging.context.provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
    Has(l._1)
  }))

  def debug(line: => String): XIO[XLogging, XError0, Unit] =
    XIO.fromZIO(
      log
        .debug(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l._1)
        }))

  def error(line: => String): XIO[XLogging, XError0, Unit] =
    XIO.fromZIO(
      log
        .error(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l._1)
        }))

  def error(line: => String, cause: Cause[Any]): XIO[XLogging, XError0, Unit] =
    XIO.fromZIO(
      log
        .error(line, cause = cause)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l._1)
        }))

  def info(line: => String): XIO[XLogging, XError0, Unit] =
    XIO.fromZIO(
      log
        .info(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l._1)
        }))

  def locally[R <: Nat, E <: NatEither, A1](fn: LogContext => LogContext)(zio: XIO[R, E, A1])(implicit n: NatFinder[R, Logger[String]]): XIO[R, E, A1] =
    XIOHelper.simpleFlatMap(XIOHelper.simpleFromFunction[E](n.to))(nn => XIO.fromZIO(nn.locally(fn)(zio.zio)))

  def locallyM[R <: Nat, E <: NatEither, A1](fn: LogContext => XIO[R, XError0, LogContext])(zio: XIO[R, E, A1])(implicit n: NatFinder[R, Logger[String]]): XIO[R, E, A1] =
    XIOHelper.simpleFlatMap(XIOHelper.simpleFromFunction[E](n.to))(nn => XIO.fromZIO(nn.locallyM(p => fn(p).noErrorZIO)(zio.zio)))

  def throwable(line: => String, t: Throwable): XIO[XLogging, XError0, Unit] =
    XIO.fromZIO(
      log
        .throwable(line, t)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l._1)
        }))

  def trace(line: => String): XIO[XLogging, XError0, Unit] =
    XIO.fromZIO(
      log
        .trace(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l._1)
        }))

  def warn(line: => String): XIO[XLogging, XError0, Unit] =
    XIO.fromZIO(
      log
        .warn(line)
        .provideLayer(ZLayer.fromFunctionMany { l: XLogging =>
          Has(l._1)
        }))

}
