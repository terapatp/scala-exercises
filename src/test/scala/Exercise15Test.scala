import Numeric._
import SeqWrapper._
import org.scalatest.FunSuite

class Exercise15 extends FunSuite {
  test("Test with Int Seq") {
    assert(Seq(3, 5, 10, 11, 19, 1, 14, 16, 17, 20).median() == 12.5)
  }

  test("Test with Double Seq") {
    assert(Seq(3.5, 5.5, 10.5, 11.5, 19.5, 1.5, 14.5, 16.5, 17.5, 20.5).median() == 13.0)
  }
}
