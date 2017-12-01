import Exercise2.ReverseString
import org.scalatest.FlatSpec

class Exercise2Test extends FlatSpec {

  "A ReverseString queue" should "pop values in last-in-first-out order" in {
    val queue = new ReverseString(6)
    queue.put("Not")
    queue.put("Stack")
    assert(queue.get.getOrElse() == "toN")
    assert(queue.get.getOrElse() == "kcatS")
  }

  it should "return None if get from an empty queue" in {
    val emptyQueue = new ReverseString(5)
    assert(emptyQueue.get === None)
  }

  it should "throw IllegalArgumentException if queue is full" in {
    val queue = new ReverseString(1)
    queue.put("Not")
    assertThrows[IllegalArgumentException] { // Result type: Assertion
      queue.put("Full")
    }
  }
}