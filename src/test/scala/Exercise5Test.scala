import org.scalatest.FunSuite

class Exercise5Test extends FunSuite {
  //There are no assertions in this test - how can you be sure that time measured properly and block output is not modified?
  test("Test timer") {
    Exercise5.time(Exercise4.gcd(7, 14) == 7)
  }
}
