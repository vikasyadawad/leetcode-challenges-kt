package ds.arrays.maxconsecutiveone

import io.kotest.matchers.shouldBe

import org.junit.jupiter.api.Test

class MaxConsecutiveOneTest {

    @Test
    fun `find Max Consecutive Ones`() {
        val ints: IntArray = intArrayOf(1,1,0,1,1,1)
        MaxConsecutiveOne.findMaxConsecutiveOnes(ints) shouldBe 3
    }
}