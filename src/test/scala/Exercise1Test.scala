import Exercise1.ArrayQueue
import org.scalatest.FlatSpec

class Exercise1Test extends FlatSpec {

  "Queue" should "pop values in first-in-first-out order" in {
    val queue = new ArrayQueue[Int](5)
    queue.put(1)
    queue.put(2)
    assert(queue.get.getOrElse() === 1)
    assert(queue.get.getOrElse() === 2)
    queue.put(3)
    assert(queue.get.getOrElse() === 3)

    queue.put(4)
    queue.put(5)
    queue.put(6)
    queue.put(7)
    assert(queue.get.getOrElse() === 4)
    assert(queue.get.getOrElse() === 5)
    assert(queue.get.getOrElse() === 6)
    assert(queue.get.getOrElse() === 7)
  }

  it should "return None if get from an empty queue" in {
    val emptyQueue = new ArrayQueue[String](5)
    assert(emptyQueue.get === None)
  }

  it should "throw IllegalArgumentException if queue is full" in {
    val queue = new ArrayQueue[String](1)
    queue.put("Not")
    assertThrows[IllegalArgumentException] { // Result type: Assertion
      queue.put("Full")
    }
  }
}