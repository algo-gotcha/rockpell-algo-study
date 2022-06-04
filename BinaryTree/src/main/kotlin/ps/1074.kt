package ps

class PS1074 {
    fun solution(n: Int, r: Int, c: Int): Int {
        if (n == 0) return 0;

        val half = 1 shl (n - 1)

        if (r < half && c < half)
            return solution(n - 1, r, c)
        if (r < half && c >= half)
            return half * half + solution(n - 1, r, c - half)
        if (r >= half && c < half)
            return 2 * half * half + solution(n - 1, r - half, c)
        return 3 * half * half + solution(n - 1, r - half, c - half);
    }
}

fun main() {
    val ps = PS1074()
    val input = readLine()?.split(" ")?.map { it.toInt() }

    input?.let {
        val (n, r, c) = input
        println(ps.solution(n, r, c))
    }
}