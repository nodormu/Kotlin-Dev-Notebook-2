/*KotlinBook-Chapter6-Part 1, Abstract Classes, as, is, this, and INTERFACES*/
/*This project is setup to see how much you can condense the location of superclasses and any related or unrelated sub-classes.*/

/* Interfaces placed at top level, above superclasses, since everything below it is inheriting the roam function*/
/* The reason roam was added as an interface, because apparently vehicles are not animals, but also roam, <facepalm>... whatever, just an example*/
interface Roamable { /*Adding abstract to the beginning of this per the book, the IDE says it's an unnecessary declaration, and her mention of 'concrete' as an option doesn't work at all*/
    //abstract var velocity : Int /*If I set this, then I have to set a velocity for all inherited classes, not just the new Vehicle class. Also, the getter/setter would not even be used and value would be determined in inherited class(es).*/
    var velocity : Int
        get () = 20
        set(value) {
            println("This line will never print in the context of the code as it currently stands.")
        }

    fun roam() /*Adding abstract to the beginning of this per the book, the IDE says it's an unnecessary declaration, and her mention of 'concrete' as an option doesn't work at all*/
}
/*End top level Interfaces for related inheritted superclasses and related subclasses in this file.*/


/*abstract SuperClasses section starts here*/
abstract class animalssuperclass : Roamable /*(/*open val nameofanimal : String = "", open val food : String = "", open val image: String = "", open val habitat : String = ""*/)*/ { /*Properties were put in constructor instead of defined below, which means arguments must match in override*/

    abstract val nameofanimal: String
    abstract val food : String /*This is how it was done in the book*/
    abstract val image : String /*This is how it was done in the book.*/
    abstract val habitat : String /*This is how it was done in the book.*/

    abstract var hungerrating : Int  /*Since it's abstract, you don't have to set = to something, you can just set type, but you have to at least set a type. val can NOT have a setter*/

    abstract fun makeNoise() : String /*{ /*Since there is no return function, you could possibly leave the declaration of type string off of this, depending on inherited usage.*/
        return """making noise."""
    }*/
    abstract fun eat() : String /*{  /*Since there is no return function, you could possibly leave the declaration of type string off of this, depending on inherited usage.*/
        println("The Animal is eating.")
    }*/
    /* Also note that I changed the abstract function to an abstract override function due to adding roam as an interface function*/
    abstract override fun roam() /* {   /*I removed ': String' specific return type to show that it also needs to be removed from inherited class objects */
        println("The Animal is roaming.")
    }*/
    abstract fun sleep() : String /* {  /*Since there is no return function, you could possibly leave the declaration of type string off of this, depending on inherited usage.*/
        return """get some sleep."""
    }*/
}
/*abstract SuperClasses section ends here*/


/*Inheriting abstract Superclasses section stars here*/
abstract class caninesuperclass : animalssuperclass(){  /*Removed ': Sting' from animalssuperclass() since it was removed from abstract roam function*/
    override fun roam() {
        return println("Now, the canine is roaming, as it's lost from the pack.")  /*I toString() was removed since : String was not a specified return type on abstract or override version of roam function*/
    }
}
/*Inheriting abstract Superclasses section ends here*/


/*Inheriting sub-classes section starts here*/
class wolfinheritclass(override val nameofanimal: String = "wolf", override val food: String = "rabbits", override val image : String = "src/wolf.jpg", override val habitat : String = "forest") : caninesuperclass () {

//    override val nameofanimal : String = "wolf"
//    override val food: String
//        get() = "rabbits"
//    override val image: String
//        get() = "src/wolf.jpg"
//    override val habitat: String
//        get() = "forest"
    override var hungerrating = 10 /*val can NOT have setter*/

    override fun makeNoise(): String {  /*This is different than part 1, as I used string literals, in order to be able to return the string to a midsentence println or print function output to the command line.*/
        return """Hooooowwwwwwlll!"""
    }
    override fun eat(): String {
        return println("The $nameofanimal is eating $food.").toString()
    }
    override fun sleep() : String {
        return """go to sleep in an area that is at least somewhat sheltered, perhaps a brush or thicket"""
    }
}

class hippoinheritclass : animalssuperclass() {

    override val nameofanimal: String
        get() = "Hippopotamus"
    override val food: String
        get() = "grass"
    override val image: String
        get() = "src/hippo.jpg"
    override val habitat: String
        get() = "water"
    override var hungerrating /* val can NOT have setter. Notice the difference in out this has a getter and setter, where as the wolfinheritclass override for hungerrating does NOT*/
        get() = 10
        set(value) = Unit /*Having this getter/setter will compile, but if you do it at the command line, instead of in IDE, you will get warning that value is never used*/

    override fun makeNoise(): String {
        return """Grunt! Grunt!"""
    }
    override fun eat () :String {
        return println ("The $nameofanimal is eating $food.").toString()
    }
    override fun roam() { /*I removed ': String' from the end of the roam function type declaration since it was removed from abstract roam function*/
        println("The $nameofanimal is roaming.")
    }
    override fun sleep() : String {
        return """go to sleep in a herd for protection"""
    }
}

class Vet {  /* New Class added on this project. It only inherits from animalsuperclass, but the test code in main.kt initializes which animal class the makeNoise output comes from.*/

    fun giveShot(animalssuperclass: animalssuperclass): String { /* Not sure why it has to be specified twice. NEED TO FIND OUT*/
        return animalssuperclass.makeNoise()
    }
    fun giveShottoWolf(wolfinheritclass: wolfinheritclass): String { /* Not sure why it has to be specified twice. NEED TO FIND OUT*/
        return wolfinheritclass.makeNoise()
    }
    fun giveShottoHippo(hippoinheritclass: hippoinheritclass): String { /* Not sure why it has to be specified twice. NEED TO FIND OUT*/
        return hippoinheritclass.makeNoise()
    }
}
/*inheriting sub-classes section end here*/

/*Other classes, that only inherit from the Interface, rather than the Animal tree of classes above*/
class Vehicle : Roamable {
    override var velocity: Int = 40 /*Overrides value of 20 set in interface*/
    override fun roam() {
        println("I know vehicles don't roam, but for the sake of this overridden interface function, we will say that the vehicle is roaming. I don't know, maybe it has an A.I.?")
    }
}
/*End other classes that only inherit from the Interface section at the top level of this file.*/