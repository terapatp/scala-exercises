package object Exercise1 {
  class ArrayQueue[T: Manifest](capacity: Int) extends GenericQueue[T] {
    var queue = new Array[T](capacity)
    var front: Int = 0
    var rear: Int = -1
    var size: Int = 0

    override def put(elem: T): Unit = {

      if (isFull) {
        throw new IllegalArgumentException("Queue is full")
      }

      rear = (rear + 1) % capacity
      queue(rear) = elem
      size = size + 1
    }

    override def get: Option[T] = {
      if (isEmpty) return None

      val result = queue(front)
      size = size - 1
      front = (front + 1) % capacity

      Option(result)
    }

    override def isEmpty: Boolean = {
      size == 0
    }

    override def isFull: Boolean = {
      size == capacity
    }
  }

  trait GenericQueue[T] {
    def put(elem: T)

    def get: Option[T]

    def isEmpty: Boolean

    def isFull: Boolean
  }
}