package ps

var isEnd = false
var answer = -1

fun solution(n: Int) {
    dfs(n, 0, 5, 0)
    dfs(n, 0, 3, 0)
}

fun dfs(n: Int, sum: Int, plusValue: Int, count: Int) {
    if (isEnd || n < sum)
        return
    if (n == sum) {
        isEnd = true
        answer = count
    }
    dfs(n, sum + plusValue, 5, count + 1)
    dfs(n, sum + plusValue, 3, count + 1)
}

fun main() {
    val input = readLine()?.toInt() ?: 0

    solution(input)
    print(answer)
}
