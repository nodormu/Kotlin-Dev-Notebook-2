/*Chapter 8, part 1 -- nulls and exceptions: safe and sound*/
/*Intro of nulls, null pointers and elvis operators*/

fun main(){

    var w: wolfclass1? = wolfclass1()
    val x : Int? = w?.hunger /*Means the Int? can handle a null, but if w is null, it won't call the value of variable hunger in wolfclass1().*/
    val y : Int = w?.hunger ?: -1 /*Use the Elvis operator `?:` to set y to the value of hunger from wolfclass1 if w is not null. If w is null, it sets y to -1*/
    val wolfclass2 = wolfclass2()

    if (w !=null) {
        w.eat()
    }
    //w?.eat() /* This is the exact same thing as the above if statement, but much safer to use, as the compiler may or may not compile, especially if it doesn't keep up with whether or not w is null.*/

    println("The value of x is $x")
    println("The value of y is $y")

    wolfclass2.wolf?.hunger = 8  /*Calls class wolfclass2, then calls wolf IF wolf function is not null, then calls var hunger setting it equal to 8*/
    println("The output value of expression `wolfclass2?.wolf?.hunger` is ${wolfclass2.wolf?.hunger}")

    val wolfArray : Array<String?> = arrayOf("wolfcub1 ", "wolfcub2", null) /* This had to be added since null is a member of the array*/
    println("The next line of code is the output of the 2 array members while leaving out the null value in the array in array index position [2]")
    for (item : String? in wolfArray) { /*means it can take a null value instead of a string*/
        item?.let { print(it) } /*If item(array index memeber) is not null, let item print to screen.*/
    }
    println("\nThe next line of code outputs the first letter of each member of the array, as long as the index position is NOT null.")
    for (item : String? in wolfArray) {
        item?.let { print(it[0]) }
    }

    println("\n") /*for neatness*/
    wolfclass2().getAlphaWolf()?.let { it.eat() }

    /* Try out different combinations of uncommenting and commenting out different lines to compare output differences*/
    w = null /*Comment out w = null, and it will output 10 to screen when you println(z). You don't want null outputs, unless testing.*/
    /*but using this along 2 below lines will help you understand how to THROW EXCEPTIONS FOR TESTING and IDENTIFY them when they happen on accident.*/
    val z : Int = w!!.hunger  /* This will ALWAYS throw a NullPointException IF w is null, otherwise, println(z) outputs 10. This is greatly used for THROWING exceptions during testing.*/
    //var z : Int? = w?.hunger /* Use this and it will output 'null' to the screen instead of the NullPointException error, UNLESS you comment out w = null, then it will output 10 to screen.*/
    println (z)
}