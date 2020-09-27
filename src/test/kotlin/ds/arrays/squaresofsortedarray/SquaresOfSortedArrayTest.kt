package ds.arrays.squaresofsortedarray

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SquaresOfSortedArrayTest {

    @Test
    fun solution_one() {
        SquaresOfSortedArray.solution_one(intArrayOf(-4,-1,0,3,10)) shouldBe intArrayOf(0,1,9,16,100)
        SquaresOfSortedArray.solution_one(intArrayOf(-7,-3,2,3,11)) shouldBe intArrayOf(4,9,9,49,121)
    }
}