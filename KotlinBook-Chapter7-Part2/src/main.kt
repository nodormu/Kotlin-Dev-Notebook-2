import javax.print.DocFlavor

/*Chapter 7 Part 2. This is the author's data class recipe project, with corrections as required.*/
/*Only had to alter her code a little, when putting data class in it's own class file.*/
fun main() {
    val r1 = classy.Recipe("Thai Curry", "Tofu")
    val r2 = classy.Recipe("Thai Curry", "Tofu")
    val r3 =
        r1.copy(title = "Chicken Bhuna") /* title = is the same thing as title:. I'm wondering if title = is going to be deprecated soon 2/18/2020*/
    var r4 = classy.Recipe("Spaghetti Bolognese", "beef", false)
    var r5 = classy.Recipe("Spaghetti Bolognese", "tofu")
    val m1 = Mushroom(6, false)
    val m2 = Mushroom(true)

    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: $r1")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}") /* This does not produce the deprecation issues since it's not an INT OBJECT IDENTITY COMPARISON as in Chapter 7 Part 1 code*/
    println("r1 == r3? ${r1 == r3}\n")

    val array = arrayOf(r1, r2, r3, r4, r5)
    for (element in array) { /* I've seen where the book mostly uses the word 'item' instead of 'x', but this is a general variable created ONLY for the loop, and can be anything except reserved words*/
        println(element)
    }

    val (title, mainIngredient, vegetarian, difficulty) = r1
    println("\nThe title of what parameters are assigned to r1 at this point are still the same $title and yes... it is $vegetarian, this is a vegetarian dish, with the main ingredient being $mainIngredient and the prep difficulty being $difficulty")
    println("We could pick any of the parameters, in any order, or just one:  $difficulty\n")

    println("m1 size is ${m1.size} and isPoisonous is ${m1.isPoisonous}")
    println("m2 size is ${m2.size} and isPoisonous is ${m2.isPoisonous}\n")

    print(addNumbersclass().addNumbers1(2, 5)); print(" is the correct output of:  println(addNumbersclass().addNumbers1(2, 5))\n")
    print(addNumbersclass().addNumbers2(1.6, 7.3)); print(" is the correct output of:  println(addNumbersclass().addNumbers1(1.6, 7.3))\n\n")

    println("The next line is just hello world output for designating a class and function as being available to be called from a java code, for cross compiling, while keeping variables private to avoid conflicts.")
    overloadforjava().textoutput()
}