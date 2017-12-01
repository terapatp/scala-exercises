import org.scalatest.FunSuite

class Exercise12Test extends FunSuite {
  test("Test multiply all the numbers in the list with their corresponding value in the map") {
    assert(Exercise12.multiplyListByMap(List(1, 2, 3, 4), Map(1 -> 3, 3 -> 5)) == List(3, 15))
    assert(Exercise12.multiplyListByMap(List(), Map(1 -> 3, 3 -> 5)) == List())
    assert(Exercise12.multiplyListByMap(List(4, 5), Map(1 -> 3, 3 -> 5)) == List())
    assert(Exercise12.multiplyListByMap(List(5, 2, 3, 4), Map(1 -> 3, 3 -> 5, 5 -> 15)) == List(15, 75))
  }
}
