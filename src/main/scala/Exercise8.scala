trait IntSet {
  def incl(x: Int): IntSet

  def contains(x: Int): Boolean

  def union(x: IntSet): IntSet

  def intersect(x: IntSet): IntSet

  def excl(x: Int): IntSet

  def isEmpty: Boolean
}


class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  override def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  override def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

  override def union(x: IntSet): IntSet = {
    if (x.isEmpty) this
    else {
      var result: IntSet = x

      if (!left.isEmpty) result = result.union(left)
      if (!right.isEmpty) result = result.union(right)
      if (!x.contains(elem)) result = result.incl(elem)

      result
    }
  }

  override def intersect(x: IntSet): IntSet = {
    if (x.isEmpty) new EmptySet
    else {
      var result: IntSet = new EmptySet
      if (x.contains(elem)) result = result.incl(elem)
      if (!left.isEmpty) result = result.union(x.intersect(left))
      if (!right.isEmpty) result = result.union(x.intersect(right))

      result
    }
  }

  override def excl(x: Int): IntSet = {
    if (!contains(x)) this
    else if (x < elem) new NonEmptySet(elem, left excl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right excl x)
    else {
      if (!left.isEmpty && !right.isEmpty) {
        left.union(right)
      } else if (!left.isEmpty) {
        left
      } else if (!right.isEmpty) {
        right
      } else {
        new EmptySet
      }
    }
  }

  override def isEmpty: Boolean = false

  override def toString: String = {
    var result = ""
    if (!left.isEmpty) {
      result = result + left.toString
    }

    result = result + elem

    if (!right.isEmpty) {
      result = result + right.toString
    }

    result
  }
}

class EmptySet extends IntSet {
  override def contains(x: Int): Boolean = false

  override def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)

  override def union(x: IntSet): IntSet = x

  override def intersect(x: IntSet): IntSet = this

  override def excl(x: Int): IntSet = this

  override def toString: String = ""

  override def isEmpty: Boolean = true
}