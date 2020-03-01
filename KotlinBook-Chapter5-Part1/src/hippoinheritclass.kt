/*Chapter 5-Part 1, Subclasses and superclasses, along with inheritance to save time rewriting code*/
/*Inheritance will allow you to keep things that are consistent in one file, and just make your alterations in each file that inherits the inherit worthy file*/
/*Always start with information hierarchy flow charts, specifically, top->down*/
/* To make a class, a superclass, you must declare the class, the variables, and the functions as open but only IF you want to override them in another class, for more specific outcomes.*/
/* number of parameters must match between the superclass and what you are overriding in the inherited classes.*/
class hippoinheritclass(override val nameofanimal: String = "Hippopotamus", override val food: String = "grass", override val image: String = "src/hippo.jpg", override val habitat: String = "water") : animalssuperclass() {

    override fun makeNoise() {
        println ("Grunt! Grunt!")
    }
    override fun eat () {
        println ("The ${nameofanimal} is eating $food.")
    }
}