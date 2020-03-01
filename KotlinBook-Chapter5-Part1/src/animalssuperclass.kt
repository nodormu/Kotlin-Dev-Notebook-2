/*Chapter 5-Part 1, Subclasses and superclasses, along with inheritance to save time rewriting code*/
/*Inheritance will allow you to keep things that are consistent in one file, and just make your alterations in each file that inherits the inherit worthy file*/
/*Always start with information hierarchy flow charts, specifically, top->down*/
/* To make a class, a superclass, you must declare the class, the variables, and the functions as open but only IF you want to override them in another class, for more specific outcomes.*/
/* number of parameters must match between the superclass and what you are overriding in the inherited classes.*/
open class animalssuperclass(open val nameofanimal : String = "", open val food : String = "", open val image: String = "", open val habitat : String = "") { /*Properties were put in constructor instead of defined below, which means arguments must match in override*/

    //open val food = "" /*This is how it was done in the book, but I opted for putting it in the constructor properties of the class above*/
    //open val image = "" /*This is how it was done in the book, but I opted for putting it in the constructor properties of the class above*/
    //open val habitat = "" /*This is how it was done in the book, but I opted for putting it in the constructor properties of the class above*/

    var hungerrating : Int = 10 // Additional  variable. Done as in book, since it was explcitly defined.

    open fun makeNoise() {
        println("The animal is making noise.")
    }
    open fun eat() {
        println("The Animal is eating.")
    }
    open fun roam() {
        println("The Animal is roaming.")
    }
    fun sleep() : String {
        return """get some sleep."""
    }
}