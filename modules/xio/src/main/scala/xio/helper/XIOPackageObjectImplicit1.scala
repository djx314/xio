package xio.helper

import zio.{CanFail, ZIO}

trait XIOPackageObjectImplicit1 {
  implicit class XIOStartErrorImplicitClass3[-I, L, +R](private val inner: ZIO[I, L, R]) {
    def startError(implicit i: CanFail[L]): xio.XIO[I, xio.XError1[L], R] = new xio.XIO(inner.mapError(s => xio.XError1(s)))
  }
}
