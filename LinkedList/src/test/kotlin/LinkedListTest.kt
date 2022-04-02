import kotlin.test.Test
import kotlin.test.assertEquals

class LinkedListTest {

    @Test
    fun `(add) int 노드 3개 추가`() {
        val list = LinkedList<Int>()
        val expectedList = mutableListOf(42, 24, 4224)

        list.push(42)
        list.push(24)
        list.push(4224)

        assertEquals(expectedList, list.toArray())
    }

    @Test
    fun `(remove) int 노드 3개 추가, 1번째 노드 제거`() {
        val list = LinkedList<Int>()
        val expectedList = mutableListOf(24, 4224)

        list.push(42)
        list.push(24)
        list.push(4224)

        list.remove(42)

        assertEquals(expectedList, list.toArray())
    }

    @Test
    fun `(remove) int 노드 3개 추가, 2번째 노드 제거`() {
        val list = LinkedList<Int>()
        val expectedList = mutableListOf(42, 4224)

        list.push(42)
        list.push(24)
        list.push(4224)

        list.remove(24)

        assertEquals(expectedList, list.toArray())
    }

    @Test
    fun `(remove) int 노드 3개 추가, 3번째 노드 제거`() {
        val list = LinkedList<Int>()
        val expectedList = mutableListOf(42, 24)

        list.push(42)
        list.push(24)
        list.push(4224)

        list.remove(4224)

        assertEquals(expectedList, list.toArray())
    }

    @Test
    fun `(isEmpty) int 노드 3개 추가, 3개 제거`() {
        val list = LinkedList<Int>()

        list.push(42)
        list.push(24)
        list.push(4224)

        list.remove(4224)
        list.remove(24)
        list.remove(42)

        assertEquals(true, list.isEmpty())
    }

    @Test
    fun `(pop) int 노드 3개 추가, 2개 제거`() {
        val list = LinkedList<Int>()
        val expectedList = mutableListOf(42)

        list.push(42)
        list.push(24)
        list.push(4224)

        assertEquals(4224, list.pop())
        assertEquals(24, list.pop())
        assertEquals(expectedList, list.toArray())
    }
}