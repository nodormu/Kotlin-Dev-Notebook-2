/* Chapter 11, Part 5 */
/* lambdas that feed other lambdas and functions*/
/* Invoke the lambda in a function, and update lambdas project in Part 6*/

fun main(){
    fun convert(x: Double, converter: (Double) -> Double) : Double {
        val result = converter (x)
        println("$x is converted to $result")
        return result
    }
    convert (20.0, { c: Double -> c * 1.8 + 32}) /* Lambda does not have to be in parenthesis:  convert (x: 20.5) { c: Double -> c * 1.8 + 32} */
}
