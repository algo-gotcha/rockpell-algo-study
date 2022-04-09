class BinaryTree {
    private var root: Node<Int>? = null
    private var listForPrint = mutableListOf<Int>()
    var size = 0

    fun push(data: Int) {
        val newNode = Node(data)

        if (root == null) {
            root = newNode
        } else {
            pushRecursive(root!!, newNode)
        }
    }

    private fun pushRecursive(parentNode: Node<Int>, newNode: Node<Int>) {
        if (parentNode.data > newNode.data) {
            if (parentNode.left == null)
                parentNode.left = newNode
            else
                pushRecursive(parentNode.left!!, newNode)
        } else {
            if (parentNode.right == null)
                parentNode.right = newNode
            else
                pushRecursive(parentNode.right!!, newNode)
        }
    }

    fun inorderPrint(): MutableList<Int> {
        listForPrint.clear()
        root?.let { inorderTraverse(it) };
        return listForPrint
    }

    private fun inorderTraverse(nowNode: Node<Int>) {
        nowNode.left?.let { inorderTraverse(it) }
        listForPrint.add(nowNode.data)
        nowNode.right?.let { inorderTraverse(it) }
    }
}

