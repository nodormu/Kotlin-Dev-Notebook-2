/*Chapter 4, part 4, page 166 -- fix the broken code, but yes... most of her code in the book is fucking broken and outdated*/
fun main () {
    val t = TapeDeck (false) /* This line added as attempt to fix her broken ass code*/
    val d = DVDPlayer (false)

    //t.hasRecorder = true /*Removed this line from her code in the book*/
    t.playTape()
    t.recordingTape()

    d.playDVD()
    d.recordDVD()
}