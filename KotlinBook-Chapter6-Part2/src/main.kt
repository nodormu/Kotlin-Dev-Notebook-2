/*KotlinBook-Chapter6-Part 2, Abstract Classes, inherited subclass and nested if else statements*/
/*Coffee maker abstract class and nested if else statement*/
/*This is the pool party mini exercise in the chapter*/
/*Change the overridden true/false values to see different outcomes*/
/*Also notice the difference in returning a literal string, versus returning a println statement, and how the unit tests are done in the main*/

fun main () {
    val x = coffeeMaker()

    if (x.coffeeLeft == false) {
        if (x.pluggedIn == true) {
            println(x.consumerPower())
            x.fillWithWater()
            x.makeCoffee()
        } else {
            println("Go plug in the coffee maker, and get it going.")
        }
    } else {
        println("There is plenty of coffee left. Help yourself.")
    }
}