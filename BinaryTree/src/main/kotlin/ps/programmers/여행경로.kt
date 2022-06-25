package ps.programmers

class 여행경로 {
    var answer: Array<String>? = null
    var maxCount = 0
    var isEnd = false

    fun solution(tickets: Array<Array<String>>): Array<String> {
        val map = mutableMapOf<String, MutableList<String>>()
        val visited = mutableMapOf<String, MutableList<Boolean>>()

        for (ticket: Array<String> in tickets) {
            if (map.containsKey(ticket[0])) {
                map[ticket[0]]?.add(ticket[1])
            } else {
                map[ticket[0]] = mutableListOf(ticket[1])
            }
        }

        for (key: String in map.keys) {
            map[key]?.sort()
            visited[key] = MutableList(map[key]?.size ?: 0) { false }
            maxCount += map[key]?.size ?: 0
        }

        answer = Array(maxCount + 1) { "" }

        dfs(map = map, visited = visited, startKey = "ICN", count = 0)

        return answer!!
    }

    fun dfs(
        map: MutableMap<String, MutableList<String>>,
        visited: MutableMap<String, MutableList<Boolean>>,
        startKey: String,
        count: Int
    ) {
        if (isEnd)
            return

        answer?.set(count, startKey)

        if (count == maxCount) {
            isEnd = true
        }

        if (map.containsKey(startKey)) {
            for (i: Int in 0 until map.get(startKey)!!.size) {
                if (!visited.get(startKey)?.get(i)!!) // 방문 안한 경우
                {
                    visited.get(startKey)?.set(i, true)
                    dfs(map, visited, map.get(startKey)!![i], count + 1)
                    visited.get(startKey)!!.set(i, false)
                }
            }
        }
    }
}