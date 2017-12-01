import org.scalatest.FunSuite

class Exercise5Test extends FunSuite {
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
