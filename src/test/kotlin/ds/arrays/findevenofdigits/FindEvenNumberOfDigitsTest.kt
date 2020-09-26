package ds.arrays.findevenofdigits

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FindEvenNumberOfDigitsTest {

    @Test
    fun `find numbers with even digits`() {
        val nums = intArrayOf(12, 345, 2, 6, 7896)
        FindEvenNumberOfDigits.findNumbers(nums) shouldBe 2
    }
}