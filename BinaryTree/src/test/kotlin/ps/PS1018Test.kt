package ps

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PS1018Test {

    @Test
    fun test1() {
        val ps = PS1018()
        val board = arrayOf(
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBBBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW"
        )
        assertEquals(1, ps.solution(8, 8, board = board))
    }

    @Test
    fun test1_1() {
        val ps = PS1018()
        val board = arrayOf(
            "WBWBWBWB",
            "BBBWBWBW",
            "WBWBWBWB",
            "BWBBBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW"
        )
        assertEquals(2, ps.solution(8, 8, board = board))
    }

    @Test
    fun test2() {
        val ps = PS1018()
        val board = arrayOf(
            "BBBBBBBBWBWBW",
            "BBBBBBBBBWBWB",
            "BBBBBBBBWBWBW",
            "BBBBBBBBBWBWB",
            "BBBBBBBBWBWBW",
            "BBBBBBBBBWBWB",
            "BBBBBBBBWBWBW",
            "BBBBBBBBBWBWB",
            "WWWWWWWWWWBWB",
            "WWWWWWWWWWBWB"
        )
        assertEquals(12, ps.solution(13, 10, board = board))
    }

    @Test
    fun test3() {
        val ps = PS1018()
        val board = arrayOf(
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB"
        )
        assertEquals(0, ps.solution(8, 8, board = board))
    }

    @Test
    fun test4() {
        val ps = PS1018()
        val board = arrayOf(
            "BBBBBBBBBBBBBBBBBBBBBBB",
            "BBBBBBBBBBBBBBBBBBBBBBB",
            "BBBBBBBBBBBBBBBBBBBBBBB",
            "BBBBBBBBBBBBBBBBBBBBBBB",
            "BBBBBBBBBBBBBBBBBBBBBBB",
            "BBBBBBBBBBBBBBBBBBBBBBB",
            "BBBBBBBBBBBBBBBBBBBBBBB",
            "BBBBBBBBBBBBBBBBBBBBBBB",
            "BBBBBBBBBBBBBBBBBBBBBBW",
        )
        assertEquals(31, ps.solution(23, 9, board = board))
    }

    @Test
    fun test6() {
        val ps = PS1018()
        val board = arrayOf(
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBBBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWWWB",
            "BWBWBWBW"
        )
        assertEquals(2, ps.solution(8, 8, board = board))
    }

    @Test
    fun test7() {
        val ps = PS1018()
        val board = arrayOf(
            "BWWBWWBWWBWW",
            "BWWBWBBWWBWW",
            "WBWWBWBBWWBW",
            "BWWBWBBWWBWW",
            "WBWWBWBBWWBW",
            "BWWBWBBWWBWW",
            "WBWWBWBBWWBW",
            "BWWBWBWWWBWW",
            "WBWWBWBBWWBW",
            "BWWBWBBWWBWW",
            "WBWWBWBBWWBW"
        )
        assertEquals(15, ps.solution(12, 11, board = board))
    }
}