package ps

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class NetworkTest {

    @Test
    fun solution() {
        val n = 3
        val computers = arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))
        val network = Network()

        val actual = network.solution(n, computers)

        assertEquals(2, actual)
    }
}