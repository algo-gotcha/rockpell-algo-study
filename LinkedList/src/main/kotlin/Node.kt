data class Node<E>(val data: E) {
    var prev: Node<E>? = null;
    var next: Node<E>? = null;
}