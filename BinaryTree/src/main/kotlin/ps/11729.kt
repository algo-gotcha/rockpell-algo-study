package ps

import java.io.BufferedWriter
import java.io.OutputStreamWriter

class PS11729(private val bw: BufferedWriter) {
    fun solution(a: Int, b: Int, n: Int) {
        if (n == 1) {
            bw.write("$a $b\n")
            return
        }
        solution(a, 6 - a - b, n - 1)
        bw.write("$a $b\n")
        solution(6 - a - b, b, n - 1)
    }

    fun print() {
        bw.flush()
        bw.close()
    }
}

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()?.toInt() ?: 0

    bw.write("${(1 shl n) - 1}\n")
    val ps = PS11729(bw)
    ps.solution(1, 3, n)
    ps.print()
}