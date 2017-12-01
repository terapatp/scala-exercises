object Exercise11 {

  def getNotNullItem(x: Option[Any] = None, y: Option[Any] = None, z: Option[Any] = None): Any = {
    x.getOrElse(y.getOrElse(z.getOrElse(None)))
  }
}
