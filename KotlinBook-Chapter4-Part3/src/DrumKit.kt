/* Chapter 4 Part 3, Code Magnets */

class DrumKit (var hasHighHat: Boolean, var hasSnare: Boolean) {

    fun playHighHat() {
        if (hasHighHat) {
            println("ding da ding ding da ding ding ding")
        }
    }

    fun playSnare() {
        if (hasSnare) {
            println("<808 snare sound here>")
        }
    }
}
