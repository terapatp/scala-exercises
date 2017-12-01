import Exercise2.ReverseStringStack
import org.scalatest.FlatSpec

class Exercise2Test extends FlatSpec {

  "A ReverseString Stack" should "pop values in last-in-first-out order" in {
    val queue = new ReverseStringStack(6)
    queue.push("Not")
    queue.push("Stack")

    assert(queue.pop.getOrElse() == "kcatS")
    assert(queue.pop.getOrElse() == "toN")


    queue.push("Not2")
    queue.push("Stack2")

    queue.push("Not3")
    queue.push("Stack3")

    queue.push("Not4")
    queue.push("Stack4")

    assert(queue.pop.getOrElse() == "4kcatS")
    assert(queue.pop.getOrElse() == "4toN")
    assert(queue.pop.getOrElse() == "3kcatS")
    assert(queue.pop.getOrElse() == "3toN")
    assert(queue.pop.getOrElse() == "2kcatS")
    assert(queue.pop.getOrElse() == "2toN")
  }

  it should "return None if get from an empty queue" in {
    val emptyQueue = new ReverseStringStack(5)
    assert(emptyQueue.pop === None)
  }

  it should "throw IllegalArgumentException if queue is full" in {
    val queue = new ReverseStringStack(1)
    queue.push("Not")
    assertThrows[IllegalArgumentException] { // Result type: Assertion
      queue.push("Full")
    }
  }
}