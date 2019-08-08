import org.scalatest.FunSuite

class Exercise5Test extends FunSuite {
  //There are no assertions in this test - how can you be sure that time measured properly and block output is not modified?
  test("Test timer") {
    val result = Exercise4.gcd(7, 14)
    val startTime = System.currentTimeMillis()

    assert(
      Exercise5.time({
        Thread.sleep(100)
        Exercise4.gcd(7, 14)
      }) == result)

    assert(System.currentTimeMillis() - startTime >= 100)
  }
}
