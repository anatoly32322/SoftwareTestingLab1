package test.task1

import junit.framework.TestCase.assertEquals
import org.junit.Test
import main.Task1.Task1
import kotlin.math.sin

class Task1 {
    val eps = 0.0001

    @Test
    fun testResult1() {
        val expected = sin(3.14)
        assertEquals(expected, Task1.sin(3.14), eps)
    }

    @Test
    fun testResult2() {
        val expected = sin(0.0)
        assertEquals(expected, Task1.sin(0.0), eps)
    }

    @Test
    fun testResult3() {
        val expected = sin(-3.14)
        assertEquals(expected, Task1.sin(-3.14), eps)
    }

    @Test
    fun testResult4() {
        val expected = sin(6.28)
        assertEquals(expected, Task1.sin(6.28), eps)
    }

    @Test
    fun testResult5() {
        val expected = sin(-6.28)
        assertEquals(expected, Task1.sin(-6.28), eps)
    }
}