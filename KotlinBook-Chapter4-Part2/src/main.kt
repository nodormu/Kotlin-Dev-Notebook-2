/* Chapter 4, Part 2 -- Classes */
/*Constructor definition presented. Constructor contains code needed, before you initialize and object.*/
/* A CONSTRUCTOR runs when you instantiate an object. It's used to define properties and initialize them.*/

fun main(){
    val songOne = SongsClass ("Shhh... Peaceful","Miles Davis")
    val songTwo = SongsClass ("Alabama", "John Coltrane")
    val songThree = SongsClass ("Nardis", "Bill Evans")
    songOne.play()
    songOne.stop()
    songTwo.play()
    songTwo.stop()
    songThree.play()
    songThree.stop()
}