/* Appencices A -- Drum Machine project */
/* Uses Co-routines. Go to build.gradle, and add this to dependencies:implementation "org.jetbrains.kolinx:kotlinx-coroutines-core:1.0.1" */
/* Imports 2 other Java libraries */
import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun playBeats(beats: String, file: String){
    val parts= beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay (140 * part.length + 1L)
            if (beats.length >= count) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream (File (file) )
    clip.open(audioInputStream)
    clip.start()
}

suspend fun main(){
    runBlocking {
        this.launch { playBeats("x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---", "/home/moyom/KotlinBook-IntelliJ-Projects/Drum-N-Bass/src/main/resources/TR-808-Kick-MinTone-MaxDecay.wav") }
        this.launch { playBeats("--x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x-", "/home/moyom/KotlinBook-IntelliJ-Projects/Drum-N-Bass/src/main/resources/TR-808-HiHats-OpenAcc-MaxDecay.wav") }
        this.launch { playBeats("--x---x----x-------x---x---x-------x-x-----x-x---x-----x---x----", "/home/moyom/KotlinBook-IntelliJ-Projects/Drum-N-Bass/src/main/resources/TR-808-Clap-Acc2.wav") }
        this.launch { playBeats("----x-x-----x--x---x-----x---x-----x--x--------x---x-----x------", "/home/moyom/KotlinBook-IntelliJ-Projects/Drum-N-Bass/src/main/resources/TR-808Rimshot-Accent.wav")}
        this.launch { playBeats("---x--------x----x-----x--x-----x---x--------x------x--------x--", "/home/moyom/KotlinBook-IntelliJ-Projects/Drum-N-Bass/src/main/resources/TR-808-Snare-MidTone-MaxSnap.wav")}
    }
}