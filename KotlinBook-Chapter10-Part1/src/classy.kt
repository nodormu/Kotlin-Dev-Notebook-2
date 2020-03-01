/*Chapter 10 - Generics*/
/*Instead of overriding functions in the built in libraries for things like (Immutable) Sets, you could define your own base class*/
/*This is an advanced feature of any kind of programming language, because you are creating your own packages and/or libraries*/
/*Think about it relation to the boost libraries for C++. They add additional built in functionality to C++ so you don't have to re-invent the wheel in a lot of cases*/
/*Java libraries are the same way. There are tons of them, to keep you having to re-invent the wheel.*/
/*These libraries will HAVE to be imported/associated in some manner or fashion, but having them installed such as with the boost libraries,*/
/*               they are available for compiler as long as compiler options are set to use the libraries... i.e. -> when configuring and compiling bitcoin source code to compile with boost options.*/
/*I'm not going into heavy didactic analysis and creation, just mainly covering/correcting her examples, and defining their codebase structure with println statement section headers in the output.*/
/*Mutable Lists are INTERFACES, not CLASSES, but in order to "fit" an Interface under a class, you have to break down what makes it an interface in to it's <E> (Element) and <T> <Type> parts.*/
/*I'm using the term "fit" loosely.*/

/*While typing the below code, I noticed the IDE made almost no suggestions, it's because these are generics, rather than predefined functions, classes, or interfaces.*/
/* This includes almost ZERO code highlighting since there is not existing <E>, <T> or variables. We are defining EVERYTHING here generically*/

/*Simply put, the classy.kt files is generic description of how to "fit" a mutable list into a class, but since an Interface can not be put in a class, you have to break down the elements of the Interface*/
/*into mutable lists, so you can use them in a class, but mutable lists are NOT classes*/


/* Retailer Interface which is top level starts here*/
interface Retailer<out T> { /*Note the addition of the `out` reserved generic word on page 431*/
    fun sell(): T
}
/*Retailer Interface which is top level ends here*/

/*abstract and inherited classes section starts here*/

abstract class Pet(var name: String)

class Cat(name: String): Pet(name)

class Dog(name: String): Pet(name)

class Fish(name: String): Pet(name)

class Contest<T: Pet> (var vet: Vet<T>) {  /*Vet<T> is the generic covariant constructor, but until the class Vet is added below this class definition, doesn't serve much of a function.*/
    /*Placing `in` here:  Vet<in T> makes this INvariant.*/
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
        /*Notice that the IDE does NOT suggest using the indexing method, it's because we are defining everything as generics, rather than predefined interfaces, classes or interfaces*/
    }

    fun getWinners(): MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val highscore = scores.values.max()
        for ((t, score) in scores) {
            if (score == highscore) winners.add(t)
        }
        return winners
    }
}
/*This code is for the additions to the Contest class above*/
class Vet<in T: Pet> { /* No () constructor with parameters here. `in` was added per page 439 to 440*/
    /*Placing `in T` is an example of Contravariance. Without the `in`, it would be Covariance. See line 36 for more info.*/
    fun treat(t:T) {
        println("Treat Pet ${t.name}")
    }
}

/*Pet Owner class below is associated with busted pool party and pet owner code with broken .add to mutableList code*/
class PetOwner<T:Pet>(t:T) {
    val pets = mutableListOf(t)

    fun add(t: T) {
        pets.add(t)
    }

    fun remove(t: T) {
        pets.remove(t)
    }
}
/* Below 3 Retailer Classes are associated with the top level Interface*/
class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}
class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell Dog")
        return Dog ("")
    }
}
class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish ("")
    }
}
/*abstract and inherited classes section ends here*/