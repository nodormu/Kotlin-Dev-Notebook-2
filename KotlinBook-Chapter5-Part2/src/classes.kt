/*Chapter 5-Part 2, Subclasses and superclasses, along with inheritance to save time rewriting code*/
/*This project is setup to see how much you can condense the location of superclasses and any related or unrelated sub-classes.*/

/*SuperClasses section starts here*/
open class animalssuperclass(open val nameofanimal : String = "", open val food : String = "", open val image: String = "", open val habitat : String = "") { /*Properties were put in constructor instead of defined below, which means arguments must match in override*/

    //open val food = "" /*This is how it was done in the book, but I opted for putting it in the constructor properties of the class above*/
    //open val image = "" /*This is how it was done in the book, but I opted for putting it in the constructor properties of the class above*/
    //open val habitat = "" /*This is how it was done in the book, but I opted for putting it in the constructor properties of the class above*/

    var hungerrating : Int = 10 // Additional  variable. Done as in book, since it was explcitly defined.

    open fun makeNoise() : String {
        return """making noise."""
    }
    open fun eat() {
        println("The Animal is eating.")
    }
    open fun roam() {
        println("The Animal is roaming.")
    }
    open fun sleep() : String {
        return """get some sleep."""
    }
}
/*SuperClasses section ends here*/


/*Inheriting Superclasses section stars here*/
open class caninesuperclass() : animalssuperclass() {
    override fun roam() {
        println("Now, the canine is roaming, as it's lost from the pack.")
    }
}
/*Inheriting Superclasses section ends here*/


/*Inheriting sub-classes section starts here*/
class hippoinheritclass(override val nameofanimal: String = "Hippopotamus", override val food: String = "grass", override val image: String = "src/hippo.jpg", override val habitat: String = "water") : animalssuperclass() {

    override fun makeNoise(): String {
        return """Grunt! Grunt!"""
    }
    override fun eat () {
        println ("The ${nameofanimal} is eating $food.")
    }
}

class wolfinheritclass(override val nameofanimal: String = "wolf", override val food: String = "rabbits", override val image : String = "src/wolf.jpg", override val habitat : String = "forest") : caninesuperclass () {
    override fun makeNoise(): String {  /*This is different than part 1, as I used string literals, in order to be able to return the string to a midsentence println or print function output to the command line.*/
        return """Hooooowwwwwwlll!"""
    }
    override fun eat(){
        println("The ${nameofanimal} is eating $food.")
    }
}
/*inheriting sub-classes section starts here*/