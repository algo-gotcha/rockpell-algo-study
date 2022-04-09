import kotlin.test.Test
import kotlin.test.assertEquals

class BinaryTreeTest {

    @Test
    fun `노드 3개 추가`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 24, 4224)
        val expectedList = mutableListOf(24, 42, 4224)

        for (data in initDataList) {
            tree.add(data)
        }

        val actualList = tree.inorderPrint()
        assertEquals(expectedList, actualList)
        assertEquals(3, tree.size)
    }

    @Test
    fun `노드 5개 추가`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 24, 4224, 16, 27)
        val expectedList = mutableListOf(16, 24, 27, 42, 4224)

        for (data in initDataList) {
            tree.add(data)
        }

        val actualList = tree.inorderPrint()
        assertEquals(expectedList, actualList)
        assertEquals(5, tree.size)
    }

    @Test
    fun `노드 3개 추가, 같은 값을 가진 노드 2개`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 24, 24)
        val expectedList = mutableListOf(24, 42)

        for (data in initDataList) {
            tree.add(data)
        }

        val actualList = tree.inorderPrint()
        assertEquals(expectedList, actualList)
        assertEquals(2, tree.size)
    }
}
