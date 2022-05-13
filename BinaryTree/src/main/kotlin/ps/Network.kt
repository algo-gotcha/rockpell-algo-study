package ps

class Network {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val visited = Array(n) { false }
        var answer = 0

        for (i: Int in 0 until n) {
            if (!visited[i]) {
                answer++
                dfs(computers, visited, i)
            }
        }
        return answer
    }

    private fun dfs(computers: Array<IntArray>, visited: Array<Boolean>, index: Int) {
        visited[index] = true
        for (i: Int in computers.indices) {
            if (!visited[i] && computers[index][i] == 1) {
                dfs(computers, visited, i)
            }
        }
    }
}