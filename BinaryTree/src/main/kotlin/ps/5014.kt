package ps

import java.util.*

class PS5014 {
    fun solution(maxFloor: Int, nowFloor: Int, targetFloor: Int, up: Int, down: Int): Int {
        val visited = IntArray(maxFloor + 1)
        val queue: Queue<Int> = LinkedList()
        val direction = arrayOf(up, -down)

        if (nowFloor == targetFloor)
            return 0

        visited[nowFloor] = 1
        queue.add(nowFloor)
        while (!queue.isEmpty()) {
            val now = queue.poll()

            if (now == targetFloor)
                return visited[now] - 1

            for (value: Int in direction) {
                if (now + value < 1 || now + value > maxFloor)
                    continue
                if (visited[now + value] > 0)
                    continue
                visited[now + value] += visited[now] + 1
                queue.add(now + value)
            }
        }
        return -1
    }
}

fun main() {
    val input = readLine()?.split(" ")?.map { it.toInt() }
    val ps = PS5014()

    input?.let {
        val result = ps.solution(input[0], input[1], input[2], input[3], input[4])
        if (result == -1) {
            println("use the stairs")
        } else {
            println(result)
        }
    }
}