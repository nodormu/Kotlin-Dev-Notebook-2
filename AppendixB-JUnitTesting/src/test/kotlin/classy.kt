/* Appendix B -- JUnit Testing */
/* page 554 */

import org.jetbrains.annotations.TestOnly
import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.Test

class Totaller (var total: Int = 0) {
    fun add(num: Int): Int {
        total += num
        return total
    }
}

class TotallerTest {
    @TestOnly
    fun shouldBeAbleToAdd3And4 () {
        val totaltest = Totaller()

        assertEquals(3, totaltest.add(3))
        assertEquals(7, totaltest.add(4))
        assertEquals(7, totaltest.total)
    }
}