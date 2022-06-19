package ps.programmers

import java.time.LocalDateTime
import java.util.*

class 상담예약 {
    data class Book(val time: LocalDateTime, val name: String)

    fun solution(booked: Array<Array<String>>, unbooked: Array<Array<String>>): Array<String> {
        val bookedQueue: Queue<Book> = createQueue(arrays = booked)
        val unbookedQueue: Queue<Book> = createQueue(arrays = unbooked)
        val resultList = mutableListOf<String>()
        var startTime = min(bookedQueue.peek().time, unbookedQueue.peek().time)

        while (!bookedQueue.isEmpty() && !unbookedQueue.isEmpty()) {
            val bookedTime = bookedQueue.peek().time
            val unbookedTime = unbookedQueue.peek().time

            if (bookedTime <= startTime) {
                resultList.add(bookedQueue.poll().name)
            } else if (unbookedTime <= startTime) {
                val it = unbookedQueue.poll()
                resultList.add(it.name)
                startTime = it.time.plusMinutes(10)
            } else {
                if (bookedTime >= unbookedTime) {
                    resultList.add(bookedQueue.poll().name)
                } else {
                    resultList.add(unbookedQueue.poll().name)
                }
            }
            startTime = startTime.plusMinutes(1)
        }
        while (!bookedQueue.isEmpty()) {
            resultList.add(bookedQueue.poll().name)
        }
        while (!unbookedQueue.isEmpty()) {
            resultList.add(unbookedQueue.poll().name)
        }
        return resultList.toTypedArray()
    }

    private fun createQueue(arrays: Array<Array<String>>): Queue<Book> {
        val queue: Queue<Book> = LinkedList()

        for (item: Array<String> in arrays) {
            val time = LocalDateTime.parse("2022-06-11T${item[0]}")
            queue.add(Book(time = time, name = item[1]))
        }
        return queue
    }

    private fun min(d1: LocalDateTime, d2: LocalDateTime): LocalDateTime {
        if (d1 < d2)
            return d1
        else
            return d2
    }
}

fun main() {
    val booked = arrayOf(arrayOf("09:10", "lee"))
    val unbooked = arrayOf(arrayOf("09:00", "kim"), arrayOf("09:05", "bae"))

    val ps = 상담예약()
    println(ps.solution(booked = booked, unbooked = unbooked))
}