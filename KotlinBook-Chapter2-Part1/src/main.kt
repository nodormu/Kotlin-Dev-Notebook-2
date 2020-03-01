/*Kotlin Book, Chapter 2, Part 1*/
/*var and val differences
var is a replaceable reference variable
val is read only and can not be replaced
*/
/*four basic numerical data types:
byte = 8 bits = -128 to 127 (looks like MIDI values)
Short = 16 bits = -32768 to 32767
Int = 32 bits = -2147483648 to 2147483647
Long = 64 bits = -big f'n number to (big f'n number - 1)
Example1 for explicit declaration: var smallNum: Short
Example2 for explicit declaration: var tinyNum: Byte
Example3 for explicit declaration: var z: Short = 6
*/
/*Converting a numerical value from one of the above types to another.
Example 1:
var x = 5
var z: Long = x.toLong()   ---uses the dot(.) operator to convert the int object value of 5 in x to a Long value for z.
*/
/*Uses binary and hex types, but NOT octal
Example binary:  x = 0b10
Example hex:  y = 0xAB
*/
/*Floating point at 32 bits and Doubles at 64 bits (decimal values). For floating point (32 bits), you can attach a lower case or capital F to the end of it, otherwise it's a double.
Example Floating point Int (32 bits):  var x = 123.645f  ...or... var x = 123.645F
Example Double Int (64 bits):  var x = 123.645
*/
/*Char variables are used for single characters. Chars are LETTERS, not numbers.
Example:  var letter = 'D'    ---Note the single quotes
*/
/*String variables are used for letters/numbers/symbols longer than 1 character, but are a string, not a number, not a character.
Example 1:  var name = "Fido"  ---Note the Double quotes
Example 2:  var name2: String = "Fido"  ---The compiler knows it's a string, but this works too. The IDE will tell you it's not needed
Example 3:  var name3: String? = null   ---In order to assign a null value, you MUST have the type and the (?) operator to specify a null is involved with the string.
More on Nulls later.
*/
/* Arrays:  var myArray = arrayOf(1,2,3)
You can also assign a group of strings to an array of TYPE String.*/
fun main(){
    println("Below prints our String array.")
    var x:String = ("This is a string")
    var y:String = ("This is also a string")
    var z:String = ("This is another string")
    var myArray : Array<String> = arrayOf(x, y, z)
    println("${myArray[0]}"); println("${myArray[1]}"); println("${myArray[2]}")
    println("Below prints out the chararray function")
    chararray()
    println("Below is output for the booleanarray function")
    booleanarray()
    println("Below is output for the reassign an array member code.")
    reassignarray()
    println("Below is the LordoftheRings hobbit code.")
    LordOftheRings()
    println("Below is output of Avenger roster number/members.")
    superheroes()
    println("Below is output of fruit function.")
    fruit()
    println("Below is output of converttypes function which converts an Int to Long and then performs math.")
    converttypes()
    println("Below is output for printSum function.")
    val g:Int = 7
    val h:Int = 8
    printSum(g,h)
    println("Below is the output for function max, which uses a return.")
}
/* You can also assign a group of Chars to an array of TYPE Char. I used val instead of var. You just can't change values since it's read only.*/
fun chararray(){
    val firstletter = 'A'
    val secondletter = 'B'
    val thirdletter = 'C'
    val myArray: Array<Char> = arrayOf(firstletter, secondletter, thirdletter)
    print("${myArray[0]}"); print("${myArray[1]}"); print("${myArray[2]} \n")
}
/*You can also assign a group of Booleans (true/false) to an Array of type boolean*/
fun booleanarray(){
    val ispunk = true
    val issquare = false
    val myArray: Array<Boolean> = arrayOf(ispunk, issquare)
    println ("'val ispunk' is read-only, and is always ${myArray[0]}")
    println ("'val issquare' is read-only and is always ${myArray[1]}")
}
/*var is typically used if we need to reassign an array with new stuff, but you can reassign members of the array with a val declaration as such*/
fun reassignarray() {
    val j = 2
    val k = 3
    val l = 4
    val myArray = arrayOf(j, k, l)
    println ("${myArray[0]} ${myArray[1]} ${myArray[2]}")
    println ("Now let's change a member of the array [0], but it has to be of the same type, which in this case is default of Int.")
    myArray[0] = 6
    println ("${myArray[0]} ${myArray[1]} ${myArray[2]}")
}
/*Example code from page 96*/
fun LordOftheRings() {
    val hobbits = arrayOf("Frodo", "Sam", "Pippin")
    var w = 0

    while (w < 3) {  /* We could have set a higher number. Compiler would have worked, but thrown an out of bounds error. Lower number would have left some of the array members out.*/
        println ("${hobbits[w]} is a good hobbit name.")
        w += 1
    }
}
fun superheroes() {
    val avengers = arrayOf("Black Widow", "Thor", "Spider Man", "Captain America", "Iron Man", "Hulk", "Hawkeye", "Falcon", "Bucky")
    var avengerarrayindex = 0
    var notarrayindex = 1

    while (avengerarrayindex < 9) {
        println ("Avenger primary roster member number $notarrayindex is ${avengers[avengerarrayindex]}")
        avengerarrayindex += 1
        notarrayindex += 1
    }
}
/*Example code from page 97*/
fun fruit() {
    val index = arrayOf(1,3,4,2,0)
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    var m = 0
    var n : Int
    while (m < 5) {
        n = index[m]
        println ("Fruit = The index number of ${fruit[n]} in array fruit is ${index[m]}")
        m += 1 /*Allows while iteration to go to next index position in fruit array, but outputs based on the member in index array*/
    }
}
/*One more example for converting types*/
fun converttypes () {
    var r = 5
    var t: Long = r.toLong() /*uses the dot(.) operator to convert the int object value of 5 in x to a Long value for z*/
//    var s : Long = (r.toLong().times(t))  /*Just a different method for multiplication*/
    var s : Long = (r.toLong() * t)
    println("r.toLong() times t = $s")
}
/*Example of addition function with a result returned.*/
fun printSum(int1: Int, int2: Int){
    val result = int1 + int2
    println (result)
}