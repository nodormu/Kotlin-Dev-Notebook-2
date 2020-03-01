/* Chapter 8, part 2 */
/* Test code skeleton*/
/*import java.lang.Exception will have to be added to the file that has the `Exception()` function in the class/function/etc.*/

fun main () {
    val x: String = "No"
    //val x: String = "Yes" /* Try both yes and no to compare output differences.*/

    try {
        println("Start try")
        BadException().riskyCode(x)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println ("Finally")
    }
    println("End of main")
}