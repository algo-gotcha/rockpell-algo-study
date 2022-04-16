data class Node<Int>(var data: Int) {
    var left: Node<Int>? = null
    var right: Node<Int>? = null

    fun isLeafNode(): Boolean {
        return left == null && right == null
    }

    fun isFullChild(): Boolean {
        return left != null && right != null
    }
}