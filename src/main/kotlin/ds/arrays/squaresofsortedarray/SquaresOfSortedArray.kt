package ds.arrays.squaresofsortedarray

import kotlin.math.abs

object SquaresOfSortedArray {
    /*
    * Time Complexity: O(n)
    * Space: O(n)
    * */
    fun solution_one(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            if (abs(nums[left]) > nums[right]) {
                answer[right - left] = nums[left] * nums[left]
                left++
            } else {
                answer[right - left] = nums[right] * nums[right]
                right--
            }
        }
        return answer
    }
}