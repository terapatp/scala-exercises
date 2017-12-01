import org.scalatest.FunSuite

class Exercise10Test extends FunSuite {
  test("Test square list B") {
    assert(Exercise10.squareListB(List[Int](2, 3, 4)) == List(4, 9, 16))
    assert(Exercise10.squareListB(List(9, 5, 7)) == List[Int](81, 25, 49))
  }

  test("Test square list A") {
    assert(Exercise10.squareListA(List[Int]()) == List())
    assert(List(9, 4, 16) == Exercise10.squareListA(List[Int](3, 2, 4)))
  }
}
