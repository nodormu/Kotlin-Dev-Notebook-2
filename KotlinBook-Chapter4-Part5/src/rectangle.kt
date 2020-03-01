/* Chapter 4, part 5. Pool Puzzle page 177*/
/* Fortunately this code works*/
/* Excellent get code example */
class rectangle (var width:Int, var height:Int) {
    val isSquare: Boolean
        get() = (width == height)
    val area: Int
        get() = (width * height)
}