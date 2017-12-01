import org.scalatest.FunSuite

class Exercise6Test extends FunSuite {
  test("Test find longest word") {
    assert(Exercise6.longestWord("Test find longest word") == "longest")
  }

  test("Test most common word") {
    assert(Exercise6.mostCommonWord("Test most common word word word") == "word")
  }

  test("Test most common letter") {
    assert(Exercise6.mostCommonLetter("Test most common letter letter letter") == 't')
  }

  test("Test create a map from letter to a set of words it appears in") {
    assert(Exercise6.createMapLetterToWord("Cat Car") == Map('C' -> List("Cat", "Car"), 'a' -> List("Cat", "Car"), 'r' -> List("Car"), 't' -> List("Cat")))

  }

}