package ps

import java.awt.Point
import java.util.*

class PS7576 {
    private val xDirection = intArrayOf(-1, 1, 0, 0)
    private val yDirection = intArrayOf(0, 0, -1, 1)

    fun solution(width: Int, height: Int, tomato: Array<IntArray>): Int {
        var maxValue = 1
        val queue: Queue<Point> = LinkedList()
        val visited = Array(height) { Array(width) { false } }

        for (y: Int in 0 until height) {
            for (x: Int in 0 until width) {
                if (tomato[y][x] == 1) {
                    queue.add(Point(x, y))
                    visited[y][x] = true
                }
            }
        }

        while (!queue.isEmpty()) {
            val point = queue.poll()

            for (i: Int in 0..3) {
                val x = point.x + xDirection[i]
                val y = point.y + yDirection[i]

                if (x >= width || x < 0 || y >= height || y < 0)
                    continue
                if (tomato[y][x] == 0 && !visited[y][x]) {
                    queue.add(Point(x, y))
                    visited[y][x] = true
                    tomato[y][x] = tomato[point.y][point.x] + 1

                    if (maxValue <= tomato[y][x])
                        maxValue = tomato[y][x]
                }
            }
        }
        if (isExistZero(tomato = tomato))
            return -1
        return maxValue - 1
    }

    private fun isExistZero(tomato: Array<IntArray>): Boolean {
        for (array: IntArray in tomato) {
            for (value: Int in array) {
                if (value == 0)
                    return true
            }
        }
        return false
    }
}

fun main() {
    val ps = PS7576()
    val firstInput = readLine()?.split(" ")
    val width = firstInput?.get(0)?.toInt()!!
    val height = firstInput[1].toInt()
    val tomato = Array(height) {
        readLine()?.split(" ")?.map { it.toInt() }?.toIntArray()!!
    }

    println(ps.solution(width = width, height = height, tomato = tomato))
}