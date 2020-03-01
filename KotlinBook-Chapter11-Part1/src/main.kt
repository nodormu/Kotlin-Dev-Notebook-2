/*Chapter 11 - Part 1, lambdas and higher-order functions*/
/*Treating Code like data*/
/* This section is not in the book. I'm just experimenting with lambdas */
import kotlin.math.absoluteValue

fun main(){
    println("Below code output is from a simple lambda expression with some simple usage possibilities")
    println("=========================================================================================")
    val addInts = { x: Int, y: Int -> x + y } /* you don't have to assign anything if you don't want to, so `-> x + y` could be left off. */
    val result = addInts.invoke(6,7)
    val xtext1 = {"Hello Lambda"}
    val result2 = xtext1.invoke()
    val xtext2 = { s:String -> "Hi There! from any random text, it still outputs just this."}
    val result3 = xtext2.invoke("Jabba the Hut. It doesn't matter what the hell this is, it's not gonna print this.")
    val intToString = { z: Int -> "Hello String from any random Int, or even a variable that contains an Int, like result. Regardless, it still prints just this."}
    val result4 = intToString.invoke(result)
    val intANDstring = {n: Int -> "The value is $n"}
    val itstheshit : (Int, Int) -> Int /*itsshit is initialized with it's variables and mathematical treatment in the code body. The reason I had to type it is because the IDE is not a psychic. It can only suggest stuff based on what it has already been told.*/

    println("\nSimple math outputs manipulation of val result, and the last is just calling addInts.invoke in the println, and passing off 2 numbers")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println(result)
    println(result+result)
    println(result.plus(result)) /* Same ass addition above */
    println((result-1)/2)
    println(result/2.toDouble())
    println(result-result)
    println(result.minus(result)) /*Same as above subtraction */
    println(result*result)
    println(result.div(2))
    println(result.inv())  /*fun inv(): Int inverts the bits in the value of result*/
    println(result+result/result*result+result) /*reads left to right, not order of operations*/
    println(result.rem(other = 2)) /* 13 / 2, and outputs remainder */
    println(addInts.invoke(5,45))

    println("\nsimple outputs of val result using .compareTo:Int")
    println(".compareTo outputs a 0 if they are equal, a -1 if its less than the original value, and a 1 it's more than the original value.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println(result.compareTo(result)) /* result = result, so output is 0 */
    println(result.compareTo(result+1)) /* result < result+1, so output is -1 */
    println(result.compareTo(result-1)) /* result > result-1, so output is 1 */
    println(result.compareTo(other = 1)) /* result > 1 so output is 1 */
    println(result.compareTo(other = -1)) /* result > -1 so output is 1 */
    println(result.compareTo(other = 34)) /* result < 34 so output is -1 */

    println("\nsimple output of val result using kotlin.math.absoluteValue package.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println(result.absoluteValue) /* required import kotlin.math.absoluteValue. Importing kotlin.math won't work. */

    println("\nsimple output of val result using .dec() and .inc() operator.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println(result.dec()) /* decremented value of 13 by subtracting 1 */
    println(result.inc()) /* increments value to 14 by adding 1 */

    println("\nsimple outputs of val result using .downTo operator. Not sure how to get step 2.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println(result.downTo(5))
    println(result.downTo(2))
    println(result.rangeTo(other = result)) /* not sure of usage, it just puts whatever number you set other = #, or variable with a number. Output is like this:  13..14 or 13..2*/

    println("\nBelow is output of lambda code using Strings.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println(xtext1)
    println(result2)
    println(xtext2) /*I'm not sure why this compiles yet*/
    println(result3) /*I'm not sure why this compiles yet*/
    println(intToString)
    println(result4)
    println(intToString.invoke(345978))
    println(xtext1.invoke())
    println(xtext2.invoke("This will never output, only what is in the lambda will output."))

    println("\nBelow are outputs of intANDtext")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println(intANDstring.invoke(4))

    println("\nBelow is the output of itsshit lamda variable. Notice the difference in how this one is being called/spelled/etc.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    itstheshit = { p, q-> p + q} /*The reason it suggested the Ints, and I didn't have to type them, is because I had to type them initialy to define them, then initialization could autosuggest*/
    println(itstheshit.invoke(4,234))

    println("\nBelow is are outputs of lambda code using a readline input from the keyboard. Follow prompted instructions.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println("Please enter a word, phrase or sentence. It doesn't matter what you type, only what is in the lambda will output.")
    println(readLine()?.let { xtext2.invoke(it) })
    println("Enter a number a press enter repetitively till you don't have to enter anymore numbers. It will add all the numbers.")
    println(addInts.invoke(readLine()!!.toInt(), readLine()!!.toInt()))
    println("Please type a number and press enter.")
    println(intANDstring.invoke(readLine()!!.toInt()))
}