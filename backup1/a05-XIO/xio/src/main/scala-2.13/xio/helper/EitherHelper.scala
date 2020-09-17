package xio.helper
object EitherHelper {
  def getRight[L, R](either: Either[L, R]): R = either.getOrElse(throw new NoSuchElementException("Either.right.get on Left"))
}
