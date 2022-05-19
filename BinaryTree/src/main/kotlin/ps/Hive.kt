package ps

class Hive {
    fun solution(n: Int): Int {
        val unit = 6
        var count = 0
        var plusValue = 0
        var i = 1

        if (n == 1)
            return 1

        while (i < n) {
            i += plusValue
            plusValue += unit
            count++
        }
        return count
    }
}

fun main() {
    val input = readLine()?.toInt() ?: 0
    val hive = Hive()

    print(hive.solution(input))
}