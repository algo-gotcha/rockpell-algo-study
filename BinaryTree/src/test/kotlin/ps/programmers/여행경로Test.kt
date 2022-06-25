package ps.programmers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class 여행경로Test {
    @Test
    fun ex1() {
        val ps = 여행경로()
        val tickets = arrayOf(arrayOf("ICN", "JFK"), arrayOf("HND", "IAD"), arrayOf("JFK", "HND"))
        val expectedResult = arrayOf("ICN", "JFK", "HND", "IAD")

        val result = ps.solution(tickets = tickets)

        assertArrayEquals(expectedResult, result)
    }

    @Test
    fun ex2() {
        val ps = 여행경로()
        val tickets = arrayOf(
            arrayOf("ICN", "SFO"),
            arrayOf("ICN", "ATL"),
            arrayOf("SFO", "ATL"),
            arrayOf("ATL", "ICN"),
            arrayOf("ATL", "SFO")
        )
        val expectedResult = arrayOf("ICN", "ATL", "ICN", "SFO", "ATL", "SFO")
        val result = ps.solution(tickets = tickets)

        assertArrayEquals(expectedResult, result)
    }
}