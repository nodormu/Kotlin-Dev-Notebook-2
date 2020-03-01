/* Chapter 11, Part 4 */
/* lambdas that feed other lambdas and functions*/

fun main(){
    //var lambda1: (Double) -> Int
    var lambda2: (Int) -> Double = { it + 7.1}
    var lambda3: (Int) -> Int = { (it * 3) - 4 }
    var lambda4: (Double) -> Unit = { println("Hello Lambda") }
    var lambda5 = {x: Double -> x + 75}
    
    println("Pass 5 to lambda2. Output is: ${lambda2.invoke(5)}")
    println("Pass 5 to lambda3. Output is: ${lambda3.invoke(5)}")
    print("Pass 5.5 to lambda4. Output is: "); lambda4.invoke(5.5)
    println("Pass 5.5 to lambda5. Output is: ${lambda5.invoke(5.5)}")
}
