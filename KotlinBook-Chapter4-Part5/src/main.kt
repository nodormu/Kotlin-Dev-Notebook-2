/* Chapter 4, part 5. Pool Puzzle page 177*/
/* Fortunately this code works*/
/* Excellent get code example */
/* The code needs to produce the following output
Rectangle 0 has area 15. It is not square.
Rectangle 1 has area 36. It is a square.
Rectangle 2 has area 63. It is not a square.
Rectangle 3 has area 96. It is not a square.
 */
fun main() {
    val r = arrayOf(rectangle(1, 1), rectangle (1, 1), rectangle(1,1), rectangle(1,1))
    for (x in 0..3) { /* 0..3 is a for loop for 4 specified iterations*/
        r[x].width = (x+1)*3 /* x is the iteration number, also used in the equation */
        r[x].height = (x+5) /* x is the iteration number, also used in the equation */
        print ("Rectangle $x has area of ${r[x].area}.")
        println (" It is${if (r[x].isSquare) " " else " not "}a square.")
    }
}