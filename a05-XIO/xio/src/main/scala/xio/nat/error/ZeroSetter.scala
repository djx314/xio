package xio.nat.error

import xio.XError

trait ZeroSetter[N <: XError] {
  def tag(k: XErrorZero): N
}

object ZeroSetter {
  implicit val zeroNat: ZeroSetter[XErrorZero] = new ZeroSetter[XErrorZero] {
    override def tag(k: XErrorZero): XErrorZero = k
  }
  implicit def positiveNat[N <: XError, Head](implicit n: ZeroSetter[N]): ZeroSetter[XErrorPositive[N, Head]] =
    new ZeroSetter[XErrorPositive[N, Head]] {
      override def tag(k: XErrorZero): XErrorPositive[N, Head] = new XErrorPositive(either = Left(n.tag(k)))
    }
}
