object Exercise12 {
  def multiplyListByMap(input: List[Int], multiplier: Map[Int, Double]): List[Double] = {
    multiplier.filterKeys(x => input.contains(x)).map(e => e._1 * e._2).toList
  }
}

