import Exercise13.MaxRetry
import org.scalatest.FunSuite

class Exercise13Test extends FunSuite {

  test("Test retry with default") {
    var count = 0;

    Exercise13.retry(
      {
        count = count + 1;
        throw new Exception("for test")
      })

    assert(count == 3)
  }

  test("Test retry 5 times") {
    var count = 0;

    Exercise13.retry(
      {
        count = count + 1;
        throw new Exception("for test")
      })(MaxRetry(5))

    assert(count == 5)
  }
}


