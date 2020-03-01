/*KotlinBook-Chapter6-Part 1, Abstract Classes, as, is, this, and interfaces*/
/*This project is setup to see how much you can condense the location of superclasses and any related or unrelated sub-classes.*/
/*I use string literals in this version to get the outputs to appear in the middle of println statements if needed, or even if not, it will print the text*/
/*If you use string literals, then you MUST have a println statement before the call function in order to get output to the command line*/
fun main() {
    println("The following output is attempt to call inherited class variables from the wolf and the hippo.")
    println("The sleep function in the animalssuperclass is the only function that is not inherited by any of the inherited classes, or sub-superclasses such as canine.")

    /*variables associated with all animals, but from classes that are not a subclass of any of the animals*/
    val vet = Vet()

    /*wolf related main code*/
    val w = wolfinheritclass()
    println("Below is output for call functions for parameters pertaining specifically to the wolf, but ONLY if inherited.")
    println(w.food)
    println(w.habitat)
    println(w.image)
    w.eat()
    println(w.makeNoise())
    println("The ${w.nameofanimal} lives in the ${w.habitat} and eats a lot of small wildlife like ${w.food}.")
    println("See this file for a picture of a ${w.nameofanimal}:  ${w.image}.")
    println("The ${w.nameofanimal} is ${if (w.hungerrating > 20) "hungry, and will likely eat some ${w.food} and ${w.sleep()}" else "not very hungry."} Listen to the ${w.nameofanimal}... ''${w.makeNoise()}''.")
    w.roam()
    println("When the ${w.nameofanimal} gets a shot by the vet, it makes the sound... ${vet.giveShot(w)}") /* Test code for class Vet()*/
    println("The ${w.nameofanimal} got a shot from the vet. It made the sound... ${vet.giveShottoWolf(w)}") /* Additional test code for class Vet()*/
    println("\n")

    /*hippo related main code*/
    val h = hippoinheritclass()
    println("Below is output for call functions for parameters pertaining specifically to the hippo, but only if inherited.")
    println(h.food)
    println(h.habitat)
    println(h.image)
    h.eat()
    println(h.makeNoise())
    println("The ${h.nameofanimal} lives in the ${h.habitat} and eats a lot of small wildlife like ${h.food}.")
    println("See this file for a picture of a ${h.nameofanimal}:  ${h.image}.")
    println("The ${h.nameofanimal} is ${if (h.hungerrating < 20) "hungry, and will likely eat some ${h.food} and ${h.sleep()}." else "not very hungry."} Listen to the ${h.nameofanimal}... ''${h.makeNoise()}''.")
    h.roam()
    println("When the ${h.nameofanimal} gets a shot by the vet, it makes the sound... ${vet.giveShot(h)}") /*Test code for class Vet()*/
    println("The ${h.nameofanimal} got a shot from the vet. It made the sound... ${vet.giveShottoHippo(h)}") /* Additional test code for class Vet()*/
    println("\n")

    /*Vehicle Class and Interface code*/
    val v = Vehicle()
    v.roam()
    println("I have overridden the original velocity value of 20 with ${v.velocity}\n")

    /*array of animals/classes in classes.kt file using a for loop and item*/
    println("Both of the below for loop outputs describe polymorphism, but only if everything is defined/inherited in the class or subclass required from the array member.")
    println("For loop output 1:")
    /*Notice how the output is the same as a println statement, but will only output roam function.*/
    val animals: Array<Roamable> = arrayOf(
        h,
        w,
        v
    ) /*these were declared for earlier portions of the main, but you could use the class names as well*/
    for (item: Roamable in animals) {
        item.roam() /*You can only get roam to work here. See next example for getting roam and the remaining subclass values to compile.*/
        println(item.velocity) /*This is also apart of the romeable interface, and will output*/
    }

    println("\n") /*Just to keep things neat on output.*/

    /* See how this version will use the roam function AND the other values in the subclasses*/
    println("For loop output 2:")
    val animals2 = arrayOf(
        hippoinheritclass(),
        wolfinheritclass()
    ) /*These were declared as variables h and w earlier in this main.kt, but you can use class names as well*/
    for (wtf in animals2) { /* Notice how I substituted 'item' for 'wtf'. 'item' is not hard coded syntax and can be ANY word, that's NOT a reserved word*/
        wtf.roam() /* Notice how I substituted 'item' for 'wtf'. 'item' is not hard coded syntax and can be ANY word, that's NOT a reserved word*/
        wtf.eat() /* Notice how I substituted 'item' for 'wtf'. 'item' is not hard coded syntax and can be ANY word, that's NOT a reserved word*/
        wtf.habitat /* Notice how I substituted 'item' for 'wtf'. 'item' is not hard coded syntax and can be ANY word, that's NOT a reserved word*/
        wtf.image /* Notice how I substituted 'item' for 'wtf'. 'item' is not hard coded syntax and can be ANY word, that's NOT a reserved word*/
    }
    println("Review the animals2 for loop and you'll see how item is not required syntax and could be any word.\n")
    /*end array of animals/classes in classes.kt file using a for loop and item*/

    /*How to use the 'IS' operator section starts here.*/

    println("This code output implements the 'IS' operator in an if statement nested inside a for loop. You'll see that the vehicle is included in the array, but the for/if does not have a condition for it.")
    val animals3 = arrayOf(h, w, v)
    for (item2 in animals3) {
        if (item2 is Roamable) {  /*Change only the if statement reference to item 2 to animalssuperclass, and it will exclude the vehicle(v)*/
//Change animals3 and both item2 references above to animalssuperclass, and the next four commented out lines will compile, but of course exclude vehicle(v)
//            println(item2.nameofanimal)
//            item2.eat()
//            println("The ${item2.nameofanimal} lives in the ${item2.habitat}, and makes this sound... ${item2.makeNoise()}. You can see a picture of the ${item2.nameofanimal} here:  ${item2.image}")
//            println("The ${item2.nameofanimal} is ${if (item2.hungerrating < 20) "hungry, and will likely eat some ${item2.food} and ${item2.sleep()}" else "not very hungry."}.")
            item2.roam()
        }
    }
    println("Be sure to review the 'IS' operator code so you can see commented out options for different types of output.\n")

    println("Here is one more short 'IS' example to show usage with &&.")
    /* notice this example uses both roamable and animalssuperclass*/
    for (item3 in animals) {
        if (item3 is animalssuperclass && h.hungerrating > 5 && w.hungerrating >= 10) {
            println("The ${item3.nameofanimal} will likely eat some ${item3.food} and ${item3.sleep()}.\n")
        }
    }
    println("Here is an example of an 'IS' usage with ||. Pardon the idiocy of it.")
    if (v.velocity <= 39 || h.hungerrating >= 10) {
        println ("The animals ate the driver because he wasn't paying attention.\n")
    } else {
        println ("The animals can't keep up due to him cruising at ${v.velocity}\n")
    }

    /*End How to use the 'IS' operator section*/

    /*How to use the 'WHEN' statement section STARTS here*/
    println("Below code is output of 2 different when statements in liu of existing Ints.")
    when (v.velocity) {
        20 -> println("The vehicle's speed is ${v.velocity}.")
        40 -> println("The vehicle's speed is ${v.velocity}.")
    }
    when (v.velocity) {
        0 -> println("The animals ate the driver.")
        40 -> println("The driver out drove the animals.")
    }
    /*How to use the 'WHEN' statement section ENDS here*/

    /*How to use the 'AS' statement section STARTS here*/
    println("Below is code output for 'AS' code example section.")
    println("Please find a better 'AS' code example as the books is complete shit, and does not work in any aspect.")
    /*How to use the 'AS' statement section ENDS here*/
}