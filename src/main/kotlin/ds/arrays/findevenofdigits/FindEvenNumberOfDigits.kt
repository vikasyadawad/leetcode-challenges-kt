package ds.arrays.findevenofdigits

object FindEvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        fun go(num: Int, digits: Int = 1): Int =
            when {
                num / 10 > 0 -> go(num / 10, digits + 1)
                else -> digits
            }
        return nums.filter { go(it) % 2 == 0 }.count()
    }
}