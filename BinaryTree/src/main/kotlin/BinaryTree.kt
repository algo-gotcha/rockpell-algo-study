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

    fun remove(data: Int): Node<Int>? {
        val removed = removeRecursive(root, null, data)

        if (removed != null)
            size--
        return removed
    }

    private fun searchMinNode(node: Node<Int>): Node<Int> {
        if (node.left == null)
            return node
        else
            return searchMinNode(node.left!!)
    }

    private fun removeRecursive(now: Node<Int>?, parent: Node<Int>?, data: Int): Node<Int>? {
        var removed: Node<Int>?

        if (now == null)
            return null

        if (now.data > data)
            removed = removeRecursive(now.left, now, data)
        else if (now.data < data)
            removed = removeRecursive(now.right, now, data)
        else {
            removed = now

            if (now.isLeafNode()) {
                if (parent?.left == now)
                    parent.left = null
                else
                    parent?.right = null
            } else {
                if (now.isFullChild()) {
                    val minNode = searchMinNode(now.right!!)
                    removed = removeRecursive(now, null, minNode.data)
                    now.data = minNode.data
                } else {
                    val temp: Node<Int>?

                    if (now.left != null)
                        temp = now.left
                    else
                        temp = now.right

                    if (parent!!.left == now)
                        parent.left = temp
                    else
                        parent.right = temp
                }
            }
        }
        return removed
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
