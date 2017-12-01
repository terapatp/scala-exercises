import org.scalatest.FunSuite

class Exercise7Test extends FunSuite {
  test("Test convert a list of strings to a list of all the characters in all the strings") {
    assert(Exercise7.convertStringToChar(List("Cat", "Car")) == List[Char]('C', 'a', 't', 'r'))
  }
}
