/*Chapter 4, part 4, page 166 -- fix the broken code, but yes... most of her code in the book is fucking broken and outdated*/
class TapeDeck (var hasRecorder1: Boolean) { /* var hasrecorder was set to false as an additional variable, where as class properties were never set, but now it's in the class properties and set to Boolean*/

    fun recordingTape() {
        if (hasRecorder1) { /* This is better than hasRecorder1 == true, but serves same purpose.*/
            println ("Tape recording is live.")
        }
    }
    fun playTape() {
        if (!hasRecorder1) /*!hasRecorder1 is better than hasRecorder1 == false, but serves same purpose.*/
            println ("Tape is playing")
    }
}