/* Chapter 11, part 10*/
/* Pool puzzle, page 497 */
/* I did this a little differently to get it work, granted her code was not doing the Math.random correctly */
import kotlin.math.roundToInt

fun unless (condition:Boolean, code: () -> Unit) {
    if (!condition) {
        code()
    }
}

fun main () {
    val options = arrayOf ("Red", "Amber", "Green")
    var x : Double = (Math.random() * options.size).toInt().toDouble()
    var crossWalk = options[x.roundToInt()]
    if (crossWalk == "Green") {
        println("Walk")
    }
    unless (crossWalk == "Green") {
        println ("Stop!")
    }
    println(x)
}
