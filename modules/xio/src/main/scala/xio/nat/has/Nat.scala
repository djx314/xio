package xio.nat.has

import a10.{自然数容器, 自然数容器I, 自然数对, 自然数标记, 自然数标记零, 非正整数自然数对}

trait Nat {
  type InnerPlus[I <: Nat] <: Nat
  type Plus[I <: Nat] = InnerPlus[I]
  type 消去标记[T <: 自然数标记] <: 自然数对

  def innerPlus[I <: Nat](i: I): InnerPlus[I]
  def plus[I <: Nat](i: I): Plus[I] = innerPlus(i)
  def 消去标记[T <: 自然数标记](item: T): 消去标记[T]

  type _0 <: 自然数容器
  def _0: _0
  type _1 <: 自然数容器
  def _1: _1
  type _2 <: 自然数容器
  def _2: _2
  type _3 <: 自然数容器
  def _3: _3
  type _4 <: 自然数容器
  def _4: _4
  type _5 <: 自然数容器
  def _5: _5
  type _6 <: 自然数容器
  def _6: _6
  type _7 <: 自然数容器
  def _7: _7
  type _8 <: 自然数容器
  def _8: _8
  type _9 <: 自然数容器
  def _9: _9
}

class NatZero extends Nat {
  self =>
  override type InnerPlus[I <: Nat] = I
  // override type Plus[I <: Nat]      = I#InnerPlus[NatZero]
  override type 消去标记[T <: 自然数标记] = 非正整数自然数对[T]

  override def innerPlus[I <: Nat](i: I): I = i
  // override def plus[I <: Nat](i: I): I#InnerPlus[NatZero] = i.innerPlus(self)
  override def 消去标记[T <: 自然数标记](item: T): 非正整数自然数对[T] = new 非正整数自然数对(负数部分 = item, 正数部分 = self)

  override type _0 = 自然数容器I[NatZero, 自然数标记零]
  override def _0: _0 = 自然数容器I(self, 自然数标记零.value)
  override type _1 = 自然数容器I[NatZero, 自然数容器I.Tag_1]
  override def _1: _1 = 自然数容器I(self, 自然数容器I.tag_1)
  override type _2 = 自然数容器I[NatZero, 自然数容器I.Tag_2]
  override def _2: _2 = 自然数容器I(self, 自然数容器I.tag_2)
  override type _3 = 自然数容器I[NatZero, 自然数容器I.Tag_3]
  override def _3: _3 = 自然数容器I(self, 自然数容器I.tag_3)
  override type _4 = 自然数容器I[NatZero, 自然数容器I.Tag_4]
  override def _4: _4 = 自然数容器I(self, 自然数容器I.tag_4)
  override type _5 = 自然数容器I[NatZero, 自然数容器I.Tag_5]
  override def _5: _5 = 自然数容器I(self, 自然数容器I.tag_5)
  override type _6 = 自然数容器I[NatZero, 自然数容器I.Tag_6]
  override def _6: _6 = 自然数容器I(self, 自然数容器I.tag_6)
  override type _7 = 自然数容器I[NatZero, 自然数容器I.Tag_7]
  override def _7: _7 = 自然数容器I(self, 自然数容器I.tag_7)
  override type _8 = 自然数容器I[NatZero, 自然数容器I.Tag_8]
  override def _8: _8 = 自然数容器I(self, 自然数容器I.tag_8)
  override type _9 = 自然数容器I[NatZero, 自然数容器I.Tag_9]
  override def _9: _9 = 自然数容器I(self, 自然数容器I.tag_9)

  override def toString: String = "NatZero"
}

object NatZero extends NatZero

class NatPositive[Tail <: Nat, Head](val tail: Tail, val head: Head) extends Nat {
  self =>
  override type InnerPlus[I <: Nat] = NatPositive[Tail#InnerPlus[I], Head]
  // override type Plus[I <: Nat]      = I#InnerPlus[NatPositive[Tail, Head]]
  override type 消去标记[T <: 自然数标记] = T#自然数消去[Tail, Head]

  override def innerPlus[I <: Nat](i: I): NatPositive[Tail#InnerPlus[I], Head] = new NatPositive(tail.innerPlus(i), head)
  // override def plus[I <: Nat](i: I): I#InnerPlus[NatPositive[Tail, Head]]      = i.innerPlus(self)
  override def 消去标记[T <: 自然数标记](item: T): T#自然数消去[Tail, Head]                  = item.自然数消去(tail, head)
  def get[P](implicit headerFunctor: NatFinder[NatPositive[Tail, Head], P]): P = headerFunctor.to(self)

  override type _0 = 自然数容器I[NatPositive[Tail, Head], 自然数标记零]
  override def _0: _0 = 自然数容器I(self, 自然数标记零.value)
  override type _1 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_1]
  override def _1: _1 = 自然数容器I(self, 自然数容器I.tag_1)
  override type _2 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_2]
  override def _2: _2 = 自然数容器I(self, 自然数容器I.tag_2)
  override type _3 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_3]
  override def _3: _3 = 自然数容器I(self, 自然数容器I.tag_3)
  override type _4 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_4]
  override def _4: _4 = 自然数容器I(self, 自然数容器I.tag_4)
  override type _5 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_5]
  override def _5: _5 = 自然数容器I(self, 自然数容器I.tag_5)
  override type _6 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_6]
  override def _6: _6 = 自然数容器I(self, 自然数容器I.tag_6)
  override type _7 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_7]
  override def _7: _7 = 自然数容器I(self, 自然数容器I.tag_7)
  override type _8 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_8]
  override def _8: _8 = 自然数容器I(self, 自然数容器I.tag_8)
  override type _9 = 自然数容器I[NatPositive[Tail, Head], 自然数容器I.Tag_9]
  override def _9: _9 = 自然数容器I(self, 自然数容器I.tag_9)

  override def toString: String = s"${tail} :: ${head}"
}
