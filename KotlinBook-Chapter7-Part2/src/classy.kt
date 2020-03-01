class classy (){
    data class Recipe (val title: String, val mainIngredient: String, val isVegetarian: Boolean = true, val difficulty: String = "Easy") /* We set a default value for difficulty*/
}

class Mushroom (val size: Int, val isPoisonous: Boolean) {
    constructor (isPoisonous_param: Boolean) : this(0, isPoisonous_param) { /*Has default parameter of 0 for size*/
        println("this is the secondary constructor. There was no code specified, it just said //Code that runs when the secondary constructor is called")
    }
}
class addNumbersclass () {
    fun addNumbers1 (a: Int, b: Int) : Int {
        return a + b
    }
    fun addNumbers2 (a: Double, b: Double): Double {
        return a + b
    }
}
open class overloadforjava @JvmOverloads internal constructor () {
    private var hello = "hello"
    private var world = "java"
    @JvmOverloads open fun textoutput () {
        /*hello and momma are being evaluated to see if they match the var assignments for true false output, otherwise without 'the == <text>' then it just outputs 'hello java'*/
        print(message = this.hello == "hello"); print(" "); print(message = this.world == "momma"); print("\n")
        print(hello == "hello"); print(" "); print(world == "momma"); print("\n") /*'this.' is redundant and 'message =' and have been removed, but also to left in above code to show functionality*/
        print(hello); print(" "); print(world); print("\n") /*Does the same output as below code, just a different way to code it.*/
        println("${hello} ${world}")
    }
}