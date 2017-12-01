object Exercise13 {
  case class MaxRetry(value: Int)

  def retry[T](fn: => T)(implicit maxRetry: MaxRetry = MaxRetry(3)): util.Try[T] = {
    util.Try {
      fn
    } match {
      case x: util.Success[T] => x
      case _ if maxRetry.value > 1 => retry(fn)(MaxRetry(maxRetry.value - 1))
      case fn => fn
    }
  }
}
