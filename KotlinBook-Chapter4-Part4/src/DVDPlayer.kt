/*Chapter 4, part 4, page 166 -- fix the broken code, but yes... most of her code in the book is fucking broken and outdated*/
class DVDPlayer (var hasRecorder2: Boolean) {

    fun recordDVD() {
        if (hasRecorder2) {  /* This is better than hasRecorder2 == true, but serves same purpose.*/
            println ("DVD is burning/recording live.")
        }
    }
    fun playDVD() {  /*This function was missing from her code entirely*/
        if (!hasRecorder2) { /*!hasRecorder2 is better than hasRecorder2 == false, but serves same purpose.*/
            println ("DVD is playing.")
        }
    }
}