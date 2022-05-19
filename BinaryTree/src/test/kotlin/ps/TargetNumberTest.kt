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

    fun func1(n: Int): Long {
        var sum = 0L

        for (i: Int in 3..n) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i
            }
        }
        return sum
    }

    @Test
    fun `test`() {
        assertEquals(60, func1(16))
        assertEquals(278812814, func1(34567))
        assertEquals(178254968, func1(27639))
    }
}