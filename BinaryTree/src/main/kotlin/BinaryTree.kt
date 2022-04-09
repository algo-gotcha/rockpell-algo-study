class BinaryTree {
    private var root: Node<Int>? = null
    private var listForPrint = mutableListOf<Int>()
    var size = 0

    fun add(data: Int): Boolean {
        val newNode = Node(data)

        if (root == null) {
            root = newNode
            size++
            return true
        }
        if (addLoop(newNode)) {
            size++
            return true
        }
        return false
    }

    private fun addLoop(newNode: Node<Int>): Boolean {
        var foundNode = root

        while (foundNode != null) {
            if (newNode.data < foundNode.data) {
                if (foundNode.left != null)
                    foundNode = foundNode.left
                else {
                    foundNode.left = newNode
                    return true
                }
            } else if (newNode.data > foundNode.data) {
                if (foundNode.right != null)
                    foundNode = foundNode.right
                else {
                    foundNode.right = newNode
                    return true
                }
            } else {
                foundNode = null
            }
        }
        return false
    }

    fun inorderPrint(): MutableList<Int> {
        listForPrint.clear()
        root?.let { inorderTraverse(it) }
        return listForPrint
    }

    private fun inorderTraverse(nowNode: Node<Int>) {
        nowNode.left?.let { inorderTraverse(it) }
        listForPrint.add(nowNode.data)
        nowNode.right?.let { inorderTraverse(it) }
    }
}
