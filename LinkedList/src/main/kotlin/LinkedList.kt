class LinkedList<E> {
    private var head: Node<E>? = null
    private var tail: Node<E>? = null
    var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun toArray(): MutableList<E> {
        var nowNode = head
        val arr = mutableListOf<E>()

        while (nowNode != null) {
            arr.add(nowNode.data)
            nowNode = nowNode.next
        }
        return arr
    }

    fun push(data: E) {
        val newNode = Node(data)

        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            newNode.prev = tail
            tail!!.next = newNode
            tail = newNode
        }
        size++
    }

    fun pop(): E? {
        val data = tail?.data

        tail?.prev?.next = null
        tail = tail?.prev
        size--
        return data
    }

    fun remove(data: E) {
        var now = head ?: return

        while (true) {
            if (now.data == data) {
                val prevNode = now.prev

                if (prevNode != null)
                    prevNode.next = now.next
                else
                    head = now.next
                size--
                return
            }
            now = now.next!!
        }
    }

    fun get(index: Int): Node<E>? {
        var nowNode = head

        for (i in 0 until size) {
            if (i == index)
                return nowNode
            nowNode = nowNode!!.next
        }
        return null
    }
}