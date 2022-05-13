package ps

class TargetNumber {
    fun solution(numbers: IntArray, target: Int): Int {
        return targetNumberRecursive(target, 0, numbers, 0)
    }

    private fun targetNumberRecursive(target: Int, sum: Int, numbers: IntArray, index: Int): Int {
        if (target == sum && numbers.size == index)
            return 1
        if (index >= numbers.size)
            return 0
        return targetNumberRecursive(target, sum + numbers[index], numbers, index + 1) +
                targetNumberRecursive(target, sum - numbers[index], numbers, index + 1)
    }
}