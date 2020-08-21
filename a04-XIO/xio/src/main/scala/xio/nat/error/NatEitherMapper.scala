package xio.nat.error

import xio.XError

trait NatEitherMapper[I <: XError, Source, Target] {
  type O <: XError
  def map(n: I, cv: Source => Target): O
}

object NatEitherMapper extends NatEitherMapperImplicit1 {
  self =>

  type Aux[I <: XError, OI <: XError, Source, Target] = NatEitherMapper[I, Source, Target] { type O = OI }

  def map[N <: XError, NN <: XError, P1, P2](n: N, cv: P1 => P2)(implicit nm: NatEitherMapper.Aux[N, NN, P1, P2]): NN = nm.map(n, cv)

  implicit def mapperImplicit1[I1, I2]: NatEitherMapper.Aux[XErrorFirst[I1], XErrorFirst[I2], I1, I2] =
    new NatEitherMapper[XErrorFirst[I1], I1, I2] {
      override type O = XErrorFirst[I2]
      override def map(n: XErrorFirst[I1], cv: I1 => I2): XErrorFirst[I2] = new XErrorFirst(cv(n.one))
    }

  implicit def mapperImplicit2[I1, I2, II <: XError, OO <: XError](implicit
    iImplicit: NatEitherMapper.Aux[II, OO, I1, I2]
  ): NatEitherMapper.Aux[XErrorPositive[II, I1], XErrorPositive[OO, I2], I1, I2] =
    new NatEitherMapper[XErrorPositive[II, I1], I1, I2] {
      override type O = XErrorPositive[OO, I2]
      override def map(n: XErrorPositive[II, I1], cv: I1 => I2): XErrorPositive[OO, I2] =
        n.either.fold(pre => new XErrorPositive(Left(iImplicit.map(pre, cv))), data => new XErrorPositive(Right(cv(data))))
    }
}

trait NatEitherMapperImplicit1 {
  implicit def mapperImplicit3[I1, II1, I2]: NatEitherMapper.Aux[XErrorFirst[I1], XErrorFirst[I1], II1, I2] =
    new NatEitherMapper[XErrorFirst[I1], II1, I2] {
      override type O = XErrorFirst[I1]
      override def map(n: XErrorFirst[I1], cv: II1 => I2): XErrorFirst[I1] = new XErrorFirst(n.one)
    }

  implicit def mapperImplicit4[I1, II1, I2, II <: XError, OO <: XError](implicit
    iImplicit: NatEitherMapper.Aux[II, OO, II1, I2]
  ): NatEitherMapper.Aux[XErrorPositive[II, I1], XErrorPositive[OO, I1], II1, I2] =
    new NatEitherMapper[XErrorPositive[II, I1], II1, I2] {
      override type O = XErrorPositive[OO, I1]
      override def map(n: XErrorPositive[II, I1], cv: II1 => I2): XErrorPositive[OO, I1] =
        n.either.fold(pre => new XErrorPositive(Left(iImplicit.map(pre, cv))), data => new XErrorPositive(Right(data)))
    }
}
