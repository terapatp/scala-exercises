import org.scalatest.FunSuite

class Exercise8Test extends FunSuite {
  test("Test EmptySet") {
    assert(new EmptySet().toString == "")
  }

  test("Test NonEmptySet") {
    assert(new NonEmptySet(1, new EmptySet, new EmptySet).toString == "1")
  }

  test("Test include") {
    var set: IntSet = new EmptySet().incl(2).incl(1).incl(3)
    assert(set.toString == "123")
  }

  test("Test contain") {
    var set: IntSet = new EmptySet().incl(2).incl(1).incl(3)
    assert(set.contains(1))
    assert(set.contains(0) == false)

    set = set.incl(4).incl(5)

    assert(set.contains(4))
    assert(set.contains(5))

    assert(set.contains(7) == false)
  }

  test("Test include duplicate number") {
    val set: IntSet = new EmptySet().incl(2).incl(1).incl(1).incl(3).incl(6).incl(4).incl(5).incl(6)
    assert(set.toString == "123456")
  }

  test("Test exclude") {
    val set: IntSet = new EmptySet().incl(3).incl(2).incl(1).incl(1).incl(6).incl(4).incl(5).incl(6).incl(3).incl(1).incl(1)
    assert(set.excl(7).toString == "123456")
    assert(set.excl(1).toString == "23456")
    assert(set.excl(2).toString == "13456")
    assert(set.excl(3).toString == "12456")
    assert(set.excl(4).toString == "12356")
    assert(set.excl(5).toString == "12346")
    assert(set.excl(6).toString == "12345")
    assert(set.excl(3).excl(4).excl(6).toString == "125")
    assert(set.excl(1).excl(4).excl(6).toString == "235")
    assert(set.excl(1).excl(4).excl(6).excl(6).toString == "235")
    assert(set.excl(1).excl(4).excl(6).excl(2).excl(3).toString == "5")
    assert(set.excl(1).excl(4).excl(6).excl(2).excl(3).excl(5).toString == "")
  }

  test("Test union") {
    val set1: IntSet = new EmptySet().incl(2).incl(1).incl(1).incl(3)
    val set2: IntSet = new EmptySet().incl(6).incl(4).incl(5).incl(6)
    val result = set1.union(set2)
    assert(result.toString == "123456")
  }

  test("Test union with duplicate number") {
    val set1: IntSet = new EmptySet().incl(2).incl(1).incl(3)
    val set2: IntSet = new EmptySet().incl(4).incl(5).incl(1).incl(6)
    val result = set1.union(set2)
    assert(result.toString == "123456")
  }

  test("Test intersect") {
    val set1: IntSet = new EmptySet().incl(3).incl(2).incl(1).incl(1).incl(5).incl(4).incl(6)
    val set2: IntSet = new EmptySet().incl(4).incl(5).incl(6).incl(1).incl(6)

    val result1 = set2.intersect(set1)
    assert(result1.toString == "1456")

    val result4 = set2.intersect(set1)
    assert(result4.toString == "1456")

    val result2 = set1.intersect(new EmptySet)
    assert(result2.toString == "")

    val result3 = new EmptySet().intersect(new EmptySet)
    assert(result3.toString == "")
  }
}
