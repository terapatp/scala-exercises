import org.scalatest.FunSuite

class Exercise5Test extends FunSuite {
  test("Test timer") {
    Exercise5.time(Exercise4.gcd(7, 14) == 7)
  }
}
