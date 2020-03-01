/* Chapter 4, Part 2 -- Classes */
/* A CONSTRUCTOR runs when you instantiate an object. It's used to define properties and initialize them.*/
class SongsClass (val title : String, val artist : String){

    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}