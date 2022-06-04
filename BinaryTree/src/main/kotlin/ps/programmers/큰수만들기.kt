package ps.programmers

import java.util.*

class 큰수만들기 {
    fun solution(number: String, k: Int): String {
        val stack: Stack<Char> = Stack()
        var leftCount = k

        for (value: Char in number) {
            while (!stack.empty() && stack.peek() < value && leftCount > 0) {
                stack.pop()
                leftCount--
            }
            stack.push(value)
        }
        if (!stack.empty() && leftCount > 0)
            stack.pop()
        return stack.toArray().joinToString("")
    }
}

fun main() {
    val ps = 큰수만들기()

    println(ps.solution("1924", 2))
    println(ps.solution("1231234", 3))
    println(ps.solution("4177252841", 4))
    println(ps.solution("413", 2))
    println(ps.solution("41", 1))
}