/*Chapter 7 - Part 1, Data Structures, the == (.equals()) operator, storing information, default parameters, the Any class/superclass, and hashcode*/
/* Besides ==, there is also .equals(), as well as semi related built in function called .compareTo*/
/* The author's description of the Any class is NOT as free willed as she describes. She is a bit to liberal and lax in some of code as we have see before.*/
/* As usual, go thru book, fix her broke ass code, and learn from the corrections*/
/* This is helpful:  https://www.tutorialkart.com/kotlin/compare-strings-in-kotlin-example/ as of 2/18/2020 */

fun main (){
    /*== and .equals() section*/
    val w = classy().wolf()
    val y = w
    val x = classy().wolf()
    if (w.equals(y)) println("These are equal and true.") else println("These are not equal and false.")
    if (w == x) println("These are equal and true.") else println("These are not equal and false.")
    if (y == x) println("These are equal and true.") else println("These are not equal and false.")
    if (w === y) println("These are equal and true.") else println("These are not equal and false.")
    println(w.hashCode())
    print(w);print(" ${w.hashCode()}\n")
    print(y);print(" ${y.hashCode()}\n")
    print(x);print(" ${x.hashCode()}\n")

    println("\n") /* for neatness*/

    /* .compare() section using the Int value result() as a determination*/
    var a: String = "apple"
    var b: String = "apple"
    var result = a.compareTo(b)
    if(result==0){ println("Strings '$a' and '$b' are equal.") }
    else if(result < 0){ println("'$a' is less than '$b' lexically.") }
    else println("'$a' is less than '$b' lexically.")

    println("\n") /* for neatness*/

    /* equals() == with Ints*/
    var m : Int = 7
    var n = m++
    if (m.equals(n)) println("These Ints are equal and true.") else println("These Ints are not equal and false.")
    @Suppress("DEPRECATED_IDENTITY_EQUALS")
    if (m === n) println("These Ints are equal and true.") else println("These Ints are not equal and false.")

    println("\n") /*for neatness*/

    /*data classes, copying data, copying and slightly altering data class*/
    val person1 = classy.Person("John")
    val person2 = classy.Person("John")
    person1.age = 10
    person2.age = 20
    println("This is the output of data class person1:  $person1")
    println("This is the output of data class person2:  $person2")

    val jack = classy.User (name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
    println("This is the output of data class User Jack:  $jack")
    println("This is the output of data class User olderJack:  $olderJack")
}