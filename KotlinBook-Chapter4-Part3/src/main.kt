/* Chapter 4 Part 3, Code Magnets */
/* 8 Step sequencer DrumKit*/

fun main(){
    val step1 = DrumKit (true, true)
    val step2 = DrumKit (true, false)
    val step3 = DrumKit (false, true)
    val step4 = DrumKit (false, false)
    val step5 = DrumKit (true, false)
    val step6 = DrumKit (true, false)
    val step7 = DrumKit (false, true)
    val step8 = DrumKit (true, false)
    step1.playHighHat()
    step1.playSnare()
    step2.playHighHat()
    step2.playSnare()
    step3.playHighHat()
    step3.playSnare()
    step4.playHighHat()
    step4.playSnare()
    step5.playHighHat()
    step5.playSnare()
    step6.playHighHat()
    step6.playSnare()
    step7.playHighHat()
    step7.playSnare()
    step8.playHighHat()
    step8.playSnare()
}