/* Chapter 11, part 3*/
/*Candidates, page 468*/

fun main(){
    val x = 20
    val y = 2.3

    println("Below is code output for candidate 1.")
    val lam1 = {x: Int -> x}
    println("val lam1: (Int)->Int = {x: Int -> x}")
    println(lam1(x + 6))

    println("\nBelow is code output for candidate 2.")
    val lam2: (Double) -> Double = { (it * 2) +5 }
    println (lam2(y))

    println("\nBelow is code output for candidate 3.")
    val lam3: (Double, Double) -> Unit
    lam3 = { x, y -> println (x + y) }
    lam3.invoke(y, y)

    println("\nBelow is code output for candidate 4.")
    var lam4 = { y: Int -> (y/2.toDouble()) }
    println(lam4(x))
    lam4 = { it + 6.3 }
    print(lam4(7))
}