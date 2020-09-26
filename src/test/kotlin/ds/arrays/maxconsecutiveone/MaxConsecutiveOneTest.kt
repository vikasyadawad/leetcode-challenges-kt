package ds.arrays.maxconsecutiveone

import io.kotest.matchers.shouldBe

import org.junit.jupiter.api.Test

class MaxConsecutiveOneTest {

    @Test
    fun `find Max Consecutive Ones solution 1`() {
        val ints: IntArray = intArrayOf(1,1,0,1,1,1)
        MaxConsecutiveOne.solutionOne(ints) shouldBe 3
    }

    @Test
    fun `find Max Consecutive Ones solutoion 2`() {
        val ints: IntArray = intArrayOf(1,1,0,1,1,1)
        MaxConsecutiveOne.solutionTwo(ints) shouldBe 3
    }
}