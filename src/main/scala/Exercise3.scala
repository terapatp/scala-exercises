object Exercise3 {

  implicit class CompareWithPrecision(value: Double) {
    def ~=(comp: Double)(implicit precision: Precision = Precision(0.1)) = {
      math.abs(value - comp) < precision.value
    }
  }

  case class Precision(value: Double)

}
