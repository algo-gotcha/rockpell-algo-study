package ps

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PS5014Test {
    @Test
    fun test1() {
        val ps = PS5014()

        assertEquals(6, ps.solution(10, 1, 10, 2, 1))
    }

    @Test
    fun test2() {
        val ps = PS5014()

        assertEquals(-1, ps.solution(100, 2, 1, 1, 0))
    }

    @Test
    fun test3() {
        val ps = PS5014()

        assertEquals(0, ps.solution(10, 2, 2, 1, 1))
    }

    @Test
    fun test4() {
        val ps = PS5014()

        assertEquals(4, ps.solution(13, 3, 7, 3, 1))
    }

    @Test
    fun test5() {
        val ps = PS5014()

        assertEquals(-1, ps.solution(3, 2, 1, 0, 0))
    }

    @Test
    fun test6() {
        val ps = PS5014()

        assertEquals(10, ps.solution(100, 3, 5, 20, 2))
    }

    @Test
    fun test7() {
        val ps = PS5014()

        assertEquals(1, ps.solution(1000000, 1000000, 999979, 10, 21))
    }

    @Test
    fun test8() {
        val ps = PS5014()

        assertEquals(1, ps.solution(1000000, 999990, 1000000, 10, 21))
    }

    @Test
    fun test9() {
        val ps = PS5014()

        assertEquals(1, ps.solution(100, 70, 49, 10, 21))
    }

    @Test
    fun test10() {
        val ps = PS5014()

        assertEquals(1, ps.solution(2, 2, 1, 0, 1))
    }

}
