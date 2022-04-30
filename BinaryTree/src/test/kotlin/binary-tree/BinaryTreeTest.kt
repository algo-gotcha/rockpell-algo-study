import binary_tree.BinaryTree
import kotlin.test.Test
import kotlin.test.assertEquals

class BinaryTreeTest {

    @Test
    fun `(add) 노드 3개 추가`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 24, 4224)
        val expectedList = mutableListOf(24, 42, 4224)

        for (data in initDataList) {
            tree.add(data)
        }

        assertEquals(expectedList, tree.inorderPrint())
        assertEquals(3, tree.size)
    }

    @Test
    fun `(add) 노드 5개 추가`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 24, 4224, 16, 27)
        val expectedList = mutableListOf(16, 24, 27, 42, 4224)

        for (data in initDataList) {
            tree.add(data)
        }

        assertEquals(expectedList, tree.inorderPrint())
        assertEquals(5, tree.size)
    }

    @Test
    fun `(add) 노드 3개 추가, 같은 값을 가진 노드 2개`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 24, 24)
        val expectedList = mutableListOf(24, 42)

        for (data in initDataList) {
            tree.add(data)
        }

        assertEquals(expectedList, tree.inorderPrint())
        assertEquals(2, tree.size)
    }

    @Test
    fun `(remove) 노드 3개, 가장 왼쪽 리프 노드 제거`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(24, 42, 16)
        val expectedList = mutableListOf(24, 42)

        for (data in initDataList) {
            tree.add(data)
        }

        tree.remove(16)

        assertEquals(expectedList, tree.inorderPrint())
        assertEquals(2, tree.size)
    }

    @Test
    fun `(remove) 노드 3개, 자식 1개를 가진 노드 제거`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 34, 12)
        val expectedList = mutableListOf(12, 42)

        for (data in initDataList) {
            tree.add(data)
        }

        tree.remove(34)

        assertEquals(expectedList, tree.inorderPrint())
        assertEquals(2, tree.size)
    }

    @Test
    fun `(remove) 노드 4개, 자식 2개를 가진 노드 제거 - 루트 왼쪽 노드`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 34, 12, 37)
        val expectedList = mutableListOf(12, 37, 42)

        for (data in initDataList) {
            tree.add(data)
        }

        tree.remove(34)

        assertEquals(expectedList, tree.inorderPrint())
        assertEquals(3, tree.size)
    }

    @Test
    fun `(remove) 노드 4개, 자식 2개를 가진 노드 제거 - 루트 오른쪽 노드`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(12, 34, 42, 37)
        val expectedList = mutableListOf(12, 37, 42)

        for (data in initDataList) {
            tree.add(data)
        }

        tree.remove(34)

        assertEquals(expectedList, tree.inorderPrint())
        assertEquals(3, tree.size)
    }

    @Test
    fun `(remove) 노드 4개, 자식 2개를 가진 노드 제거 - 루트 노드`() {
        val tree = BinaryTree()
        val initDataList = mutableListOf(42, 34, 48, 45)
        val expectedList = mutableListOf(34, 45, 48)

        for (data in initDataList) {
            tree.add(data)
        }

        tree.remove(42)

        assertEquals(expectedList, tree.inorderPrint())
        assertEquals(3, tree.size)
    }
}
