package object Numeric {

  implicit object DoubleNumeric extends Numeric[Double] {
    def average(x: Double, y: Double): Double = (x + y) / 2.0

    def sort(seq: Seq[Double]): Seq[Double] = seq.sorted

    def toDouble(value: Double): Double = value
  }

  implicit object IntNumeric extends Numeric[Int] {
    def average(x: Int, y: Int): Double = (x + y) / 2.0

    def sort(seq: Seq[Int]): Seq[Int] = seq.sorted

    def toDouble(value: Int): Double = value.toDouble
  }
}

abstract class Numeric[A] {
  def average(x: A, y: A): Double

  def sort(seq: Seq[A]): Seq[A]

  def toDouble(value: A): Double

  def findMedian(seq: Seq[A]): Double = {
    var sortedSeq = sort(seq)
    if (seq.size % 2 == 0)
      average(sortedSeq(seq.size / 2), sortedSeq(seq.size / 2 - 1))
    else
      toDouble(sortedSeq(seq.size / 2))
  }
}

package object SeqWrapper {

  implicit class SeqWrapper[A](seq: Seq[A]) {
    def median()(implicit m: Numeric[A]): Double = m.findMedian(seq)
  }
}
