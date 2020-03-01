/*Chapter 11 - Part 2, lambdas and higher-order functions*/
/*Treating Code like data*/
/*Lamda project update, remove (comment out) initial code, page 477*/

fun main(){
//    var addFive = { x: Int -> x + 5}
//    println("Pass 6 to addFive: ${addFive(6)}")

//    val addInts = { x: Int, y: Int -> x + y}
//    val result = addInts.invoke(6, 7)
//    println("Pass 6 and 7 to addInts: $result")

//    val intLambda: (Int, Int) -> Int = { x, y -> x * y}
//    println("Pass 10 and 11 to intLambda:  ${intLambda(10,11)}")

//    val addSeven: (Int) -> Int = { it + 7}
//    println ("Pass 12 to addSeven:  ${addSeven(12)}")

//    val myLambda: () -> Unit = {println ("Hi!")}
//    myLambda()

    /*All above code can be removed for the code below this*/
    fun convert(x: Double, converter: (Double) -> Double) : Double {
        val result = converter (x)
        println("$x is converted to $result")
        return result
    }
    fun convertFive (converter: (Int) -> Double) : Double {
        val result = converter(5)
        println("5 is converted to $result")
        return result
    }
    convert (20.0) { c: Double -> c * 1.8 + 32} /* Lambda does not have to be in parenthesis:  convert (x: 20.5) { c: Double -> c * 1.8 + 32} */
    convertFive { it * 1.8 + 32 }
}