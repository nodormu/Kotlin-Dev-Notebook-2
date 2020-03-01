/*Chapter 5 part 3*/
/*Boolean superclass/class example*/
/*Both subclasses override the superclass, but only with in specs of their class.*/
fun main(){
    val m = arrayOf (Vampire(), Dragon(), Monster()) /*Command line output will be in the same order as the array, unless you specify an index array to output a different order*/
    for (item in m) {
        item.frighten()
    }
}