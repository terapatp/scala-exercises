import Exercise1.ArrayQueue

package object Exercise2 {

  trait Stackable[T] {
    def push(elem: T)

    def pop: Option[T]
  }

  class ReverseStringStack(capacity: Int) extends ArrayQueue[String](capacity) with Stackable[String] {
    override def push(elem: String): Unit = {
      super.put(elem.reverse)
    }

    override def pop: Option[String] = {
      if (isEmpty) return None

      val result = queue(rear)
      size = size - 1

      if (rear - 1 < 0)
        rear = capacity - 1
      else
        rear = rear - 1

      Option(result)
    }
  }

}