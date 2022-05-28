package ps

import java.lang.Integer.min

class PS1018 {
    private val size = 8

    fun solution(width: Int, height: Int, board: Array<String>): Int {
        val answerList = mutableListOf<Int>()

        for (y: Int in 0..height - size) {
            for (x: Int in 0..width - size) {
                answerList.add(checkBoard(board = board, startX = x, startY = y))
            }
        }
        return answerList.minOrNull()!!
    }

    private fun checkBoard(board: Array<String>, startX: Int, startY: Int): Int {
        val color = arrayOf('W', 'B')
        var count = 0
        var count2 = 0

        for (y: Int in 0 until size) {
            for (x: Int in 0 until size) {
                if (color[(y + x) % 2] != board[y + startY][x + startX])
                    count++
                else
                    count2++
            }
        }
        return min(count, count2)
    }
}

fun main() {
    val ps = PS1018()
    val firstInput = readLine()?.split(" ")?.map { it.toInt() }!!
    val height = firstInput[0]
    val width = firstInput[1]
    val board = Array(height) { readLine()!! }

    println(ps.solution(width, height, board = board))
}