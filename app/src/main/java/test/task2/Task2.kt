package test.task2

import org.junit.Test
import main.Task2.Task2
import org.junit.Assert.assertArrayEquals

class Task2 {
    @Test
    fun testResult1() {
        val defaultArray = arrayOf(1, 3, 2, 4, 0)
        val expected = arrayOf(0, 1, 2, 3, 4)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }

    @Test
    fun testResult2() {
        val defaultArray = arrayOf(0, 0, 0, 0, 0)
        val expected = arrayOf(0, 0, 0, 0, 0)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }

    @Test
    fun testResult3() {
        val defaultArray = arrayOf(10, 54, 23, 76, 90)
        val expected = arrayOf(10, 23, 54, 76, 90)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }

    @Test
    fun testResult4() {
        val defaultArray = arrayOf(5, 4, 3, 2, 1, 0)
        val expected = arrayOf(0, 1, 2, 3, 4, 5)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }
}