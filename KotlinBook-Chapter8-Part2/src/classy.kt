/* Chapter 8, part 2 */
/* Test code skeleton*/

import java.lang.Exception /*This is for the Exception() part of BadException, otherwise this test skeleton won't work.*/

class BadException : Exception() {
    fun riskyCode (test: String) {
        println("Start risky code")

        if ( test == "Yes") {
            throw BadException()
        }
        println("End risky code")
    }
}