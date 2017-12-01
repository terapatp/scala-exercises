import org.scalatest.FunSuite

class Exercise9Test extends FunSuite {
  test("Test EmptyTree") {
    assert(EmptyTree.toString == "EmptyTree")
  }

  test("Test Node") {
    assert(new Node(1, EmptyTree, EmptyTree).toString == "Node(1,EmptyTree,EmptyTree)")
  }

  test("Test insert") {
    var bst = new BinarySearchTree();
    var tree = bst.insert(EmptyTree, 2)
    assert(tree.toString == "Node(2,EmptyTree,EmptyTree)")

    tree = bst.insert(tree, 1)
    assert(tree.toString == "Node(2,Node(1,EmptyTree,EmptyTree),EmptyTree)")

    tree = bst.insert(tree, 3)
    assert(tree.toString == "Node(2,Node(1,EmptyTree,EmptyTree),Node(3,EmptyTree,EmptyTree))")

    tree = bst.insert(tree, 6)
    assert(tree.toString == "Node(2,Node(1,EmptyTree,EmptyTree),Node(3,EmptyTree,Node(6,EmptyTree,EmptyTree)))")
  }

  test("Test insert duplicate") {
    var bst = new BinarySearchTree();
    var tree = bst.insert(EmptyTree, 2)
    assert(tree.toString == "Node(2,EmptyTree,EmptyTree)")

    tree = bst.insert(tree, 2)
    assert(tree.toString == "Node(2,EmptyTree,EmptyTree)")

  }
}