/*Chapter 5-Part 2, Subclasses and superclasses, along with inheritance to save time rewriting code*/
/*This project is setup to see how much you can condense the location of superclasses and any related or unrelated sub-classes.*/
/*I use string literals in this version to get the outputs to appear in the middle of println statements if needed, or even if not, it will print the text*/
/*If you use string literals, then you MUST have a println statement before the call function in order to get output to the command line*/
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
    println(w.makeNoise())
    println("Below is the output of the same ${w.nameofanimal} data, but in a text format, using an if statement to deal with var hungerrating.")
    println("The ${w.nameofanimal} lives in the ${w.habitat} and eats a lot of small wildlife like ${w.food}.")
    println("See this file for a picture of a ${w.nameofanimal}:  ${w.image}.")
    println("The ${w.nameofanimal} is ${if (w.hungerrating < 20) "hungry, and will likely eat some ${w.food} and ${a.sleep()}" else "not very hungry."} and listen to the ${w.nameofanimal} ${w.makeNoise()}")
    w.roam()
    println("\n")

    /*hippo related main code*/
    val h = hippoinheritclass()
    println("Below is output for call functions for parameters pertaining specifically to the hippo, but only if inherited.")
    println(h.food)
    println(h.habitat)
    println(h.image)
    println(h.makeNoise())
    println("Below is the output of the same ${h.nameofanimal} data, but in a text format, using an if statement to deal with var hungerrating.")
    println("The ${h.nameofanimal} lives in the ${h.habitat} and eats a lot of small wildlife like ${h.food}.")
    println("See this file for a picture of a ${h.nameofanimal}:  ${h.image}.")
    println("The ${h.nameofanimal} is ${if (h.hungerrating < 20) "hungry, and will likely eat some ${h.food} and ${a.sleep()}." else "not very hungry."} and listen to the ${h.nameofanimal} ${h.makeNoise()}")
    h.roam()
    println("\n")
}