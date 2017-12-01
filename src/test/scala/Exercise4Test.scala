import org.scalatest.FunSuite

class Exercise4Test extends FunSuite {
  test("Test with 2 integer") {
    assert(Exercise4.gcd(7, 14) == 7)
    assert(Exercise4.gcd(54, 24) == 6)
    assert(Exercise4.gcd(48, 180) == 12)
  }

  test("test with list of Integer") {
    assert(Exercise4.gcd(List(7, 14, 21, 28, 35)) == 7)
    assert(Exercise4.gcd(List(48, 180, 720)) == 12)
  }
}
