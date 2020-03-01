/*Chapter 10 - Generics*/
/*Instead of overriding functions in the built in libraries for things like (Immutable) Sets, you could define your own base class*/
/*This is an advanced feature of any kind of programming language, because you are creating your own packages and/or libraries*/
/*Think about it relation to the boost libraries for C++. They add additional built in functionality to C++ so you don't have to re-invent the wheel in a lot of cases*/
/*Java libraries are the same way. There are tons of them, to keep you having to re-invent the wheel.*/
/*These libraries will HAVE to be imported/associated in some manner or fashion, but having them installed such as with the boost libraries,*/
/*               they are available for compiler as long as compiler options are set to use the libraries... i.e. -> when configuring and compiling bitcoin source code to compile with boost options.*/
/*Mutable Lists are INTERFACES, not CLASSES, but in order to "fit" an Interface under a class, you have to break down what makes it an interface in to it's <E> (Element) and <T> <Type> parts.*/
/*I'm using the term "fit" loosely.*/
/*Simply put, the classy.kt files is generic description of how to "fit" a mutable list into a class, but since an Interface can not be put in a class, you have to break down the elements of the Interface*/
/*into mutable lists, so you can use them in a class, but mutable lists are NOT classes*/
/*IMPORTANT: review implementations of contravariance and covariance*/


fun main() {
    /*Common variables established for entire project, and are also used in pool party exercise in part 2*/
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")
    val fishGoldy = Fish ("Goldy")
    val dogFido = Dog ("Fido")
    val dogJorge = Dog ("Jorge")

    /* I have to establish the Vet variables here, because they are ALSO used in the Contest portion of the code*/
    val catVet = Vet<Cat>()
    val dogVet = Vet<Dog>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    println("\nBelow is the code output for the Pet CONTEST portion.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    val catContest = Contest<Cat>(catVet) /*Hold a cat contest, cat's only. Added catVet for Vet code below starting on line 53*/
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet) /*Added petVet for code below starting on line 61*/
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<Fish>(fishVet)
    fishContest.addScore(fishFinny, 50)
    fishContest.addScore(fishGoldy, 45)
    val topFish = fishContest.getWinners().first()
    println("Fish contest winner is ${topFish.name}")

    val dogContest = Contest<Dog>(dogVet)
    dogContest.addScore(dogFido, 50)
    dogContest.addScore(dogJorge, 45)
    val topDog = dogContest.getWinners().first()
    println("Dog contest winner is ${topDog.name}")

    println("\n\nBelow is the code output for the Pet OWNER portion from the pool party,\nin which the .add owner to mutable list is broken, and recoded just so the damn thing compiles.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    val catOwner=  fishFinny
    PetOwner(fishFinny)  /*Her code in the book says to use catOwner.add(catKatsu), but that doesn't work, so I got away from Cat entirely, and used fish as owner to figure out correct code*/
    /*Note that her .add to mutableList operator usage in the example in her book does NOT compile, because a cat is not a Pet Owner, it's a pet.*/
    println("The owner of ${catFuzz.name} is ${catOwner.name}.")
    println("Explanation:  Her .add code is fucked up in the book, and does not add the PetOwner to the mutableList of PetOwners because it's animal,\nso I just manually assigned the Fish as the owner so the code would compile.")

    println("\n\nBelow is the code output for the RETAILER portion")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val fishRetailer: Retailer<Fish> = FishRetailer()

    dogRetailer.sell()
    catRetailer.sell()
    fishRetailer.sell()

    println("\n\nBelow is code output but for Pet VET portion")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    /*variables have to established with global variables*/

    catVet.treat(Cat(catFuzz.name))
    petVet.treat(Cat(catKatsu.name))
    petVet.treat(Fish(fishFinny.name))
    fishVet.treat(Fish(fishFinny.name))
}