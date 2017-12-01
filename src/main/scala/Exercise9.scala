
abstract class IntTree

case object EmptyTree extends IntTree

case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

class BinarySearchTree {
  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case n: Node =>
      if (v < n.elem) contains(n.left, v)
      else if (v > n.elem) contains(n.right, v)
      else true
  }

  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => new Node(v, EmptyTree, EmptyTree)
    case n: Node =>
      if (v < n.elem) new Node(n.elem, insert(n.left, v), n.right)
      else if (v > n.elem) new Node(n.elem, n.left, insert(n.right, v))
      else t
  }
}
