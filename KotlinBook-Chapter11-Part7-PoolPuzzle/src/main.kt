/* Chapter 11, Part 7 */
/* Pool Puzzle */
/* These are nested if statements, one inside the next */
/* Need to come back to this and figure out how to get the number into. Her code is bit broken in the book for this one. */
/* I added the readLine stuff. She doesn't do this. */

fun main() {
    //var decimal = { Double }
    fun getConversionLambda (str: String) : (Double) -> Double {
        if (str == "CentigradeToFahrenheit") {
            return { it * 1.8 + 32 }
        } else if (str == "KgsToPounds") {
            return { it * 2.204623 }
        } else if (str == "PoundsToUSTons") {
            return { it / 2000.0 }
        } else {
            return { it }
        }
    }
    //println("Type a number followed by a decimal, i.e. 20.54, 20.0, 234.624")
    //println(decimal.invoke(readLine()!!.toInt()))
    println("Type one of the following:  CentigradeToFarenheit, KgsToPounds, PoundsTOUSTons")
    getConversionLambda("${(readLine()?.let { getConversionLambda(it) })}")
    //println(readLine()?.let { getConversionLambda(it) })
}


//println("Please enter a word, phrase or sentence. It doesn't matter what you type, only what is in the lambda will output.")
//println(readLine()?.let { xtext2.invoke(it) })
//println("Enter a number a press enter repetitively till you don't have to enter anymore numbers. It will add all the numbers.")
//println(addInts.invoke(readLine()!!.toInt(), readLine()!!.toInt()))
//println("Please type a number and press enter.")
//println(intANDstring.invoke(readLine()!!.toInt()))