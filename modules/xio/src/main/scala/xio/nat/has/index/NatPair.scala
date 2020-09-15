package a10

import xio.nat.has.{Nat, NatPositive, NatZero}

trait 自然数对 {
  type 负数部分 <: 自然数标记
  type 正数部分 <: Nat
  def 负数部分: 负数部分
  def 正数部分: 正数部分
}

trait 提取正整数自然数对[Pair <: 自然数对, Head] {
  def pii(正整数自然数对: Pair): Head
}

object 提取正整数自然数对 {
  implicit def k[Tail <: Nat, Head]: 提取正整数自然数对[正整数自然数对[Tail, Head], Head] =
    new 提取正整数自然数对[正整数自然数对[Tail, Head], Head] {
      override def pii(正整数自然数对: 正整数自然数对[Tail, Head]): Head = 正整数自然数对.正数部分.head
    }
}

class 正整数自然数对[Tail <: Nat, Head](val 负数部分: 自然数标记零, val 正数部分: NatPositive[Tail, Head]) extends 自然数对 {
  self =>
  override type 负数部分 = 自然数标记零
  override type 正数部分 = NatPositive[Tail, Head]
  type GET           = Head
  def get: GET                  = 正数部分.head
  override def toString: String = s"正整数(负数部分 = ${负数部分}, 正数部分 = ${正数部分})"
}

class 非正整数自然数对[H <: 自然数标记](val 负数部分: H, val 正数部分: NatZero) extends 自然数对 {
  self =>
  override type 负数部分 = H
  override type 正数部分 = NatZero
  override def toString: String = s"非负整数(负数部分 = ${负数部分}, 正数部分 = ${正数部分})"
}
