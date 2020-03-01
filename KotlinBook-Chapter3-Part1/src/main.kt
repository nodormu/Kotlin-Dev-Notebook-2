/*Chapter 3, functions, getting out of Main*/
/*Her code is fucking outdated and does not work, so the below is the only thing that does work from it.*/
/* This main does work, uncomment the different lines, and review how the numbers change */
/* The doSomething function was HEAVILY altered, as her code sucks, and doesn't explain anything, so I made it worthwhile and changed some things*/
/* At least her more in depth for loop is informative*/

fun main () {
    var x = 0
    var y = 20
    for (outer in 1..3) {
        for (inner in 4 downTo 2) {
            x += 6
            //x--
            //y = x + y
            //y = 7
            //x = x + y
            /*x = x + y
            y = x -7*/
            /*x = y
            y++*/
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")
    println("Below code is output of function doSomething. See code for details of arguments passed to function for processing.")
    doSomething(45, 1) /* These arguments in the parenthesis are passed to the function for processing.*/
    println("Below code is output of function timesThree. See code for details of arguments passed to function for processing.")
    timesRandomNumber(45.0) /*Int value would be without decimal, as double would be with decimal*/
    println("Below code is output of function maxValue, but you must answer the next question first as it requires a user input of an Integer.")
    println("Type in how much you paid for the item to the nearest whole number.")
    val userInput = readLine()
    if (userInput != null) {
        maxValue(25, userInput.toInt())
    }
}

fun doSomething (m: Int, i: Int) : Int? { /*'?' was added so I could return null.*/
    if (i > 0) {
        var h = 0
        //var x = 1 /* If the above declaration is 1 as on this line, then the else statement will output*/
        var z = m /*I had to set this because you can NOT increment m, as it is a static argument passed from the function call in the main*/
        if (h < i) {
            //println("$m is still greater than $i")
            //h = h.plus(1)
            h += 1   /* Above statement is the same as this one. Try substituting it out*/
            z += 1   /* Since I set z = m, I can increment z*/
            println("$h which is the object referenced by x was incremented from 0 to 1 since h < i.")
            println("$z which is the object referenced by z was incremented from 45 to 46 since h < i. You can't increment m, as it's the argument being passed.")
        } else println("h value is now $h")
    }
    return null
}

fun timesRandomNumber(a: Double) {
    val b = a * Math.random()  /*Math.random() generates a random number between 0 and 1, so if set Math.random.toInt(), the answer will always be 0.0*/
    return (println(b)) /* function has to return something, but you don't have to output it to the screen. println(b) was added instead of return b, so I can see that there is output.*/
    //return null /* In order for this to compile, you need Unit? at the end of (a: Double):Unit? because Unit determines that nothing is returned, even though the value is still processed*/
}

fun maxValue(maxxer: Int, userInput: Int) { /*In order to assign the function with a type of Int, you have to return the Int value, rather than the println output.*/
    while ( userInput < maxxer) {
        var itemvalue = userInput
        if (maxxer >= itemvalue) {
            return println("You will get your entire purchase price of $$itemvalue as a refund.")
            //return itemvalue
        }
    }
/*    var WTF : Int = userInput - maxxer */
    var WTF : Int = userInput - maxxer
    if (userInput == 25) {
        return println ("You will get your entire purchase price of $$userInput back")

    } else run {
        return println("I'm sorry for the inconvenience, but $maxxer is the maximum refund amount you can get on this purchase even though you paid $$WTF more for it.")
    }
    //return maxxer
}