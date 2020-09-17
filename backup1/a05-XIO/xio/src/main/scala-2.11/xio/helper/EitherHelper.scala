package xio.helper
object EitherHelper {
  def getRight[L, R](either: Either[L, R]): R = either.right.get
}
