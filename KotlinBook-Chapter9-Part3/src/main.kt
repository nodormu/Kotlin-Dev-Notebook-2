/* Chapter 9 - part 3, page 404 */
fun main() {
    val mList = mutableListOf ("Football", "Baseball", "Basketball")

    println("NOTE1:  Each candidate is meant to be run separately. When you run the entire code base, your outputs will be different than her code in the book.")
    println("NOTE2:  You could make each of these candidates a separate class in a class file of it's own for organizational purposes," + "\nthen call each to get the output to run together and compile as her output does in the book.")
    println("NOTE3:  Also notice how in the above text coding, I used a plus to adjoin two text lines in the same println statement," + "\nwhich means you can insert expressions inbetween text strings in the same println statement.")
    println("==================================================================================================================================================")

    println ("\nBelow is line output of 1rst candidate.")
    println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    mList.sort()
    println(mList)
    println("Explanation:  mList is a mutableList of the 3 members outputted to screen above, but not before sorting them in their natural order, which in this case is alphabetical.")
    println("NOTE: Natural Order will NOT always be alphabetical order, especially if you have a listOf terms under a single index position entry. as in Chapter 9, Part 0 - list testing.")

    println ("\nBelow is line output of 2nd candidate.")
    println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap[x.toString()] = item /*This works too:  mMap.put(x.toString()*/
    }
    println(mMap.values)

    println ("\nBelow is line output of 3rd candidate.")
    println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    mList.addAll(mList.toSet())
    mList.reverse()
    val set = mList.toSet()
    println(set)

    println ("\nBelow is line output of 4th candidate.")
    println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    mList.sort()
    mList.reverse()
    println(mList)
}