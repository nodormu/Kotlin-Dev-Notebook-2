/*Chapter 8, part 1 -- nulls and exceptions: safe and sound*/
/*Intro of nulls, null pointers and elvis operators*/

class wolfclass1 () {
    var hunger = 10
    val food = "rabbits"

    fun eat() {
        println("The Wolf is eating $food.")
    }
}

class wolfclass2 () {
    var wolf: wolfclass1? = wolfclass1()

    fun wolffunction() {
        wolf?.eat()
    }
    fun getAlphaWolf() : wolfclass1? {
        return wolfclass1()
    }
}