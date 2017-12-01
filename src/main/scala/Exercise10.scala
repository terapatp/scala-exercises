object Exercise10 {


  def squareListA(xs: List[Int]): List[Int] = xs match {
    case List() => xs
    case y :: ys => y * y :: squareListA(ys)
  }

  def squareListB(xs: List[Int]): List[Int] = {
    xs map (x => x * x)
  }
}
