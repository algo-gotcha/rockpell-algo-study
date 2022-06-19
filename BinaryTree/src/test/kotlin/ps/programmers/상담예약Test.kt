package ps.programmers

import org.junit.jupiter.api.Test

internal class 상담예약Test {
    @Test
    fun ex1() {
        val booked = arrayOf(arrayOf("09:10", "lee"))
        val unbooked = arrayOf(arrayOf("09:00", "kim"), arrayOf("09:05", "bae"))

        val ps = 상담예약()
        assert(arrayOf("kim", "lee", "bae") contentEquals ps.solution(booked = booked, unbooked = unbooked))
    }

    @Test
    fun ex2() {
        val booked = arrayOf(arrayOf("09:55", "hae"), arrayOf("10:05", "jee"))
        val unbooked = arrayOf(arrayOf("10:04", "hee"), arrayOf("14:07", "eom"))

        val ps = 상담예약()
        assert(arrayOf("hae", "jee", "hee", "eom") contentEquals ps.solution(booked = booked, unbooked = unbooked))
    }

    @Test
    fun ex3() {
        val booked = arrayOf(arrayOf("09:00", "ycha"), arrayOf("09:13", "chlim"))
        val unbooked = arrayOf(arrayOf("08:50", "jy"), arrayOf("09:01", "sooyoon"))

        val ps = 상담예약()
        assert(arrayOf("jy", "ycha", "sooyoon", "chlim") contentEquals ps.solution(booked = booked, unbooked = unbooked))
    }
}