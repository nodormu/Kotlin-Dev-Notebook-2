/*Chapter 11 - Part 2, lambdas and higher-order functions*/
/*Treating Code like data*/
/*Lamda project -- initial code, page 467*/

fun main(){
    var addFive = { x: Int -> x + 5}
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = { x: Int, y: Int -> x + y}
    val result = addInts.invoke(6, 7)
    println("Pass 6 and 7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y}
    println("Pass 10 and 11 to intLambda:  ${intLambda(10,11)}")

    val addSeven: (Int) -> Int = { it + 7}
    println ("Pass 12 to addSeven:  ${addSeven(12)}")

    val myLambda: () -> Unit = {println ("Hi!")}
    myLambda()
}