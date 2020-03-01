/*KotlinBook-Chapter6-Part 2, Abstract Classes, inherited subclass and nested if else statements*/
/*Coffee maker abstract class and nested if else statement*/
/*This is the pool party mini exercise in the chapter*/
/*Change the overridden true/false values to see different outcomes*/
/*Also notice the difference in returning a literal string, versus returning a println statement, and how the unit tests are done in the main*/

abstract class appliance () {

    abstract val pluggedIn : Boolean
    abstract val color: String
    abstract val coffeeLeft: Boolean

    abstract fun consumerPower() : String
}
/*end top level abstract superclass section*/

/*Inheriting classes section*/
class coffeeMaker : appliance() {

    override val color : String = "chrome"
    override val pluggedIn : Boolean = true

    override val coffeeLeft : Boolean = false

    override fun consumerPower() : String {
        return """Consuming Power."""
    }

    fun fillWithWater () {
        println ("Fill with water.")
    }

    fun makeCoffee () {
        println ("Make the coffee.")
    }
}
/*End Inheriting classes section*/