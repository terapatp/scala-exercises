import org.scalatest.FunSuite

class Exercise11Test extends FunSuite {

  test("Test get not null item") {
    assert(Exercise11.getNotNullItem(None, None, Option("x")) == "x")
    assert(Exercise11.getNotNullItem(Option("y"), None, Option("x")) == "y")
    assert(Exercise11.getNotNullItem(None, None, None) == None)
  }
}
