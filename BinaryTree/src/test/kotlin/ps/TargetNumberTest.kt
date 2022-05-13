package ps

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TargetNumberTest {

    @Test
    fun solution() {
        val numbers = intArrayOf(1, 1, 1, 1, 1)
        val target = 3
        val targetNumber = TargetNumber()

        assertEquals(5, targetNumber.solution(numbers, target))
    }

}