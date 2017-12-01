import org.scalatest.FunSuite

class Exercise14Test extends FunSuite {
  test("Test Vector") {
    val lazyCal = new Exercise14(Vector(2, 2, 2, 2, 4, 4))
    assert(lazyCal.y == 16)
    assert(lazyCal.z == 4.0)
  }
}
