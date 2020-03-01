/*Chapter 5-Part 1, Subclasses and superclasses, along with inheritance to save time rewriting code*/
/*Inheritance will allow you to keep things that are consistent in one file, and just make your alterations in each file that inherits the inherit worthy file*/
/*Always start with information hierarchy flow charts, specifically, top->down*/
/* To make a class, a superclass, you must declare the class, the variables, and the functions as open but only IF you want to override them in another class, for more specific outcomes.*/
/* number of parameters must match between the superclass and what you are overriding in the inherited classes.*/
fun main(){
    println("The following output is attempt to call inherited class variables from the wolf and the hippo.")
    println("The sleep function in the animalssuperclass is the only function that is not inherited by any of the inherited classes, or sub-superclasses such as canine.")

    /*superclass related main code*/
    val a = animalssuperclass()

    /*wolf related main code*/
    val w = wolfinheritclass()
    println("Below is output for call functions for parameters pertaining specifically to the wolf, but ONLY if inherited.")
    println(w.food)
    println(w.habitat)
    println(w.image)
    w.makeNoise()
    println("Below is the output of the same ${w.nameofanimal} data, but in a text format, using an if statement to deal with var hungerrating.")
    println("The ${w.nameofanimal} lives in the ${w.habitat} and eats a lot of small wildlife like ${w.food}.")
    println("See this file for a picture of a ${w.nameofanimal}:  ${w.image}.")
    println("The ${w.nameofanimal} is ${if (w.hungerrating < 20) "hungry, and will likely eat some ${w.food} and ${a.sleep()}" else "not very hungry."}")
    w.roam()
    println("\n")

    /*hippo related main code*/
    val h = hippoinheritclass()
    println("Below is output for call functions for parameters pertaining specifically to the hippo, but only if inherited.")
    println(h.food)
    println(h.habitat)
    println(h.image)
    println("Below is the output fo the same hippo data, but in a text format, using a while statement to deal with the var hungerrating.")
    println(h.food)
    println(h.habitat)
    println(h.image)
    println("Below is the output of the same ${h.nameofanimal} data, but in a text format, using an if statement to deal with var hungerrating.")
    println("The ${h.nameofanimal} lives in the ${h.habitat} and eats a lot of small wildlife like ${h.food}.")
    println("See this file for a picture of a ${h.nameofanimal}:  ${h.image}.")
    println("The ${h.nameofanimal} is ${if (h.hungerrating < 20) "hungry, and will likely eat some ${h.food}." else "not very hungry."}")
    h.roam()
    println("\n")
}