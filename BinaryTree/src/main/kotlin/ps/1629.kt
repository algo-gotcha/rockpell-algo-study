package ps

class PS1629 {
    fun solution(num: Long, exponent: Long, mod: Long): Long {
        if (exponent == 1L)
            return num % mod
        val value = solution(num, exponent / 2, mod)
        val value2 = value * value % mod

        if (exponent % 2 == 1L)
            return num * value2 % mod
        return value2
    }
}

fun main() {
    val ps = PS1629()
    val inputs = readLine()?.split(" ")?.map { it.toLong() }

    inputs?.let {
        val (a, b, c) = it

        println(ps.solution(a, b, c))
    }
}