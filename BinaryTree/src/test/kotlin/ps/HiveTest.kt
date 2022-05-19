package ps

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HiveTest {

    @Test
    fun solution() {
        val hive = Hive()

        assertEquals(3, hive.solution(13))
        assertEquals(5, hive.solution(58))
        assertEquals(5, hive.solution(59))
        assertEquals(5, hive.solution(60))
        assertEquals(1, hive.solution(1))
        assertEquals(2, hive.solution(3))
        assertEquals(2, hive.solution(6))
        assertEquals(5, hive.solution(38))
        assertEquals(5, hive.solution(39))
    }
}