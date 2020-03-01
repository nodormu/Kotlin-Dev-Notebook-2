/*Chapter 5 part 3*/
/*Boolean superclass/class example*/
/*Both subclasses override the superclass, but only with in specs of their class.*/

/*Begin superclasses*/
open class Monster () {
    open fun frighten () : Boolean {
        println("Aargh!")
        return true
    }
}
/*End superclasses*/

/*Begin inherited subclasses for above superclasses*/
class Vampire : Monster () {
    override fun frighten () : Boolean {
        println("I eat a lot of garlic, so back off.")
        return false
    }
}

class Dragon : Monster () {
    override fun frighten () : Boolean {
        println("Fire in the hole!")
        return false
    }
}
/*End inherited subclasses for above superclasses*/
