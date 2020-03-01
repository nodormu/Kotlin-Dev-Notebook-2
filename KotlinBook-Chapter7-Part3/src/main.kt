/*Chapter 7, Part 3 -- data class Movie  in book*/

fun main(){
    var c1 = movieClass.Movie("Black Panther", "2018")
    var m1 = c1
    var m2 = movieClass.Movie("Jurassic World", "2015")
    var m3 = movieClass.Movie("Jurassic World", "2015")
    var m4 = m1.copy()
    var m5 = m1.copy()
    var m6 = m2
    var s1 = songClass("In a Forest", "The Cure")
    //var s2 = songClass("Wild Horses", "The Rolling Stones")
    var s3 = songClass("Love Cats", "The Cure")

    println("Does m2 == m3? ${m2 == m3}")
    println("Does s1 == s3? ${s1 == s3}\n")

    println("Does m1 == m4? ${m1 == m4}")
    println("Does c1 == m4? ${c1 == m4}\n")

    println("2 ways below in code for same output. See code for details.")
    val b = c1 == m1
    println("Does c1 == m1? ${ b }")
    println("Does c1 == m1? ${c1 == m1}\n")

    println("Does m1 === m5? ${m1 === m5}\n")

    if(m2 == m3) println("Does m3 == m6 after setting m2 = m3? ${m3 == m6}") else println("Her code sucks.")
}