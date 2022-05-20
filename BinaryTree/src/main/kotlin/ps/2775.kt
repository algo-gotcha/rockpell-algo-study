package ps

class PS2775 {
    fun createApartment(): Array<IntArray> {
        val topFloor = 15
        val lastNumber = 15

        val apartment = Array(topFloor) { IntArray(lastNumber) }

        apartment[0].forEachIndexed { i, _ -> apartment[0][i] = i }

        for (i: Int in 1 until topFloor) {
            for (j: Int in 0 until lastNumber) {
                if (j > 0) {
                    apartment[i][j] = apartment[i][j - 1] + apartment[i - 1][j]
                } else {
                    apartment[i][j] = apartment[i - 1][j]
                }
            }
        }
        return apartment
    }

    fun solution(apartment: Array<IntArray>, floor: Int, number: Int): Int {
        return apartment[floor][number]
    }
}

fun main() {
    val ps = PS2775()
    val apartment = ps.createApartment()

    val input = readLine()?.toInt() ?: 0

    for (i: Int in 0 until input) {
        val k = readLine()?.toInt() ?: 0
        val n = readLine()?.toInt() ?: 0

        println(ps.solution(apartment, k, n))
    }
}