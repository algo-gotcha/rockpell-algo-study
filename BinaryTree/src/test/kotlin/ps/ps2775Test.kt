package ps

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PS2775Test {

    @Test
    fun solution() {
        val ps = PS2775()
        val apartment = ps.createApartment()

        assertEquals(1, ps.solution(apartment, 1, 1))
        assertEquals(3, ps.solution(apartment, 1, 2))
        assertEquals(6, ps.solution(apartment, 1, 3))
        assertEquals(105, ps.solution(apartment, 1, 14))
        assertEquals(15, ps.solution(apartment, 1, 5))
        assertEquals(10, ps.solution(apartment, 1, 4))
        assertEquals(10, ps.solution(apartment, 2, 3))
        assertEquals(20, ps.solution(apartment, 2, 4))
        assertEquals(35, ps.solution(apartment, 3, 4))
        assertEquals(70, ps.solution(apartment, 3, 5))
    }
}

// 1 5 15 35 70
// 1 4 10 20 35
// 1 3 6 10 15 21 28 36 45
// 1 2 3  4  5  6  7  8  9