package xio.nat

trait NatEitherMapper[I <: NatEither, Source, Target] {
  type O <: NatEither
  def map(n: I, cv: Source => Target): O
}

object NatEitherMapper extends NatEitherMapperImplicit1 {
  self =>

  type Aux[I <: NatEither, OI <: NatEither, Source, Target] = NatEitherMapper[I, Source, Target] { type O = OI }

  def map[N <: NatEither, NN <: NatEither, P1, P2](n: N, cv: P1 => P2)(implicit nm: NatEitherMapper.Aux[N, NN, P1, P2]): NN = nm.map(n, cv)

  implicit def mapperImplicit1[I1, I2]: NatEitherMapper.Aux[NatEitherFirst[I1], NatEitherFirst[I2], I1, I2] =
    new NatEitherMapper[NatEitherFirst[I1], I1, I2] {
      override type O = NatEitherFirst[I2]
      override def map(n: NatEitherFirst[I1], cv: I1 => I2): NatEitherFirst[I2] = new NatEitherFirst(cv(n.one))
    }

  implicit def mapperImplicit2[I1, I2, II <: NatEither, OO <: NatEither](
    implicit iImplicit: NatEitherMapper.Aux[II, OO, I1, I2]): NatEitherMapper.Aux[NatEitherPositive[II, I1], NatEitherPositive[OO, I2], I1, I2] =
    new NatEitherMapper[NatEitherPositive[II, I1], I1, I2] {
      override type O = NatEitherPositive[OO, I2]
      override def map(n: NatEitherPositive[II, I1], cv: I1 => I2): NatEitherPositive[OO, I2] =
        n.either.fold(pre => new NatEitherPositive(Left(iImplicit.map(pre, cv))), data => new NatEitherPositive(Right(cv(data))))
    }
}

trait NatEitherMapperImplicit1 {
  implicit def mapperImplicit3[I1, II1, I2]: NatEitherMapper.Aux[NatEitherFirst[I1], NatEitherFirst[I1], II1, I2] =
    new NatEitherMapper[NatEitherFirst[I1], II1, I2] {
      override type O = NatEitherFirst[I1]
      override def map(n: NatEitherFirst[I1], cv: II1 => I2): NatEitherFirst[I1] = new NatEitherFirst(n.one)
    }

  implicit def mapperImplicit4[I1, II1, I2, II <: NatEither, OO <: NatEither](
    implicit
    iImplicit: NatEitherMapper.Aux[II, OO, II1, I2]): NatEitherMapper.Aux[NatEitherPositive[II, I1], NatEitherPositive[OO, I1], II1, I2] =
    new NatEitherMapper[NatEitherPositive[II, I1], II1, I2] {
      override type O = NatEitherPositive[OO, I1]
      override def map(n: NatEitherPositive[II, I1], cv: II1 => I2): NatEitherPositive[OO, I1] =
        n.either.fold(pre => new NatEitherPositive(Left(iImplicit.map(pre, cv))), data => new NatEitherPositive(Right(data)))
    }
}
