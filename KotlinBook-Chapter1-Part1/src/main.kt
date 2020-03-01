/*Kotlin Book, page 58 and 61 based on IPad paging.*/
/*This code covers a lot of topics that will go further in depth as the Chapter moves on.*/
/* The main does NOT require an else statement, while exercise 3 does otherwise it will loop*/
/* Keep in mind that all of these numerical values are Int's, because by default. We didn't specify short, long, etc.*/

fun main() { /*This is the intro code.*/
    println ("Fred Flinstone always says what...")
    var x = 1  /*Set as var, so it can be replaced/updated, as val can NOT be*/
    while (x < 3) {
        print (if (x == 1) "Yab" else " Dab") /*'==' is because it's a mathematical expression, not setting a reference for a variable val or var*/
        print ("ba")
        x += 1
    }
    if (x == 3) {  /*'==' is because it's a mathematical expression, not setting a reference for a variable val or var*/
        println(" Do. Solution is on page 68.")
    }
    println("Exercise 1 answer on page 63")
    exercise1()
    println ("Exercise 2 answer on page 63")
    exercise2()
    println ("Exercise 3 answer on page 63")
    exercise3()
    println ("Exercise 4 answer on page 66. It's really about plugging in the commented out mathematical expressions and see the Int outputs each commented out line(s) produces.")
    exercise4()
}

fun exercise1 () {
    var y = 1
    while (y < 10) {
        y += 1  /* Same thing as y = y + 1. It's an overload operator. More on this topic later on.*/
        if (y > 3) {
            println ("'y' is greater than 3, but less than 10.")
        }
    }
}

fun exercise2 () {
    var z = 10
    while (z > 1) {
        z -= 1  /* Same thing as z = z + 1. It's an overload operator. More on this topic later on.*/
        if (z > 1) println ("'z' is greater than 1, but less than 10.")
    }
}

fun exercise3 () {
    var a = 10
    while (a > 1) {
        a -= 1  /* Same thing as a = a + 1. It's an overload operator. More on this topic later on.*/
        println (if (a < 3) "'a' is smaller than 3." else "'a' is bigger than 3, but not bigger than 10.'") /*Else statement required, otherwise it will loop*/
    }
}

fun exercise4 () {
    var b = 0
    var c = 0
    while (b < 5) {
        //c = b.minus(c)  /* this is the same thing as c = b - c. Comment this line out, and uncomment one or more of the others to see difference in numerical output.*/
        //c = c + b
        //c = c + 3
        /*
        b = b + 2
        c = c + b
        */
        /*
            if (c < 5) {
            b = b + 1
            if (c < 3) b = b - 1
        }
        c = c + 3
        */
        print("$b$c ")
        b += 1
    }
}