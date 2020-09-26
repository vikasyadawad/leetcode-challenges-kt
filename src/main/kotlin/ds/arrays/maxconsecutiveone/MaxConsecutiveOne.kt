package ds.arrays.maxconsecutiveone

import kotlin.math.max

object MaxConsecutiveOne {
    fun solutionOne(nums: IntArray): Int? {
        var maxCount = 0
        var count = 0
        nums.forEach {
            if (it == 1) count++
            else {
                maxCount = Math.max(maxCount, count)
                count = 0
            }
        }
        return Math.max(maxCount, count)
    }

    fun solutionTwo(nums: IntArray): Int {
        var maxOnes = 0
        var maxHere = 0
        nums.forEach {
            maxHere = if (it == 0) 0 else maxHere + 1
            maxOnes = max(maxOnes, maxHere)
        }

        return maxOnes
    }
}