import Exercise1.ArrayQueue

package object Exercise2 {

  trait Stackable[String] {
    def put(elem: String)
  }

  class ReverseString(capacity: Int) extends ArrayQueue[String](capacity) with Stackable[String] {
    override def put(input: String) = {
      super.put(input.reverse)
    }
  }

}