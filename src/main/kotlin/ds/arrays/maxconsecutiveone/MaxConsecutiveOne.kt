package ds.arrays.maxconsecutiveone

object MaxConsecutiveOne {
    fun findMaxConsecutiveOnes(nums: IntArray): Int? {
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
}