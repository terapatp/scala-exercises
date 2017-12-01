object Exercise4 {
  def gcd(list: List[Int]): Int = list match {
    case Nil => 0
    case x :: xs => gcd(x, gcd(xs))
  }

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
