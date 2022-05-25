package ps

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PS7576Test {

    @Test
    fun test1() {
        val ps = PS7576()
        val tomato = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 1)
        )

        assertEquals(8, ps.solution(width = 6, height = 4, tomato = tomato))
    }

    @Test
    fun test2() {
        val ps = PS7576()
        val tomato = arrayOf(
            intArrayOf(0, -1, 0, 0, 0, 0),
            intArrayOf(-1, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 1)
        )

        assertEquals(-1, ps.solution(width = 6, height = 4, tomato = tomato))

    }

    @Test
    fun test3() {
        val ps = PS7576()
        val tomato = arrayOf(
            intArrayOf(-1, 1, 0, 0, 0),
            intArrayOf(0, -1, -1, -1, 0),
            intArrayOf(0, -1, -1, -1, 0),
            intArrayOf(0, -1, -1, -1, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )

        assertEquals(14, ps.solution(width = 5, height = 5, tomato = tomato))
    }

    @Test
    fun test4() {
        val ps = PS7576()
        val tomato = arrayOf(
            intArrayOf(1, -1),
            intArrayOf(-1, 1),
        )

        assertEquals(0, ps.solution(width = 2, height = 2, tomato = tomato))
    }
}