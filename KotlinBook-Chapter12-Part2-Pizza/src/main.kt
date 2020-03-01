/* Chapter 12, Part 2 -- Pizza */
/* Page 509 */
/* example involving ints, is a separate "thing" entirely from the pizza. There is no interaction between the ints and pizza */
/* Further example of minBy, maxBy, sum, sumBy, sumByDouble */
/* Use of `!!.` operator vs `if (<term> != null)`, and how it compares with the `?.` safe call operator */


data class Pizza (val name: String, val pricePerSlice: Double, val quantity: Int)

fun main (){
    val ints = listOf(1, 2, 3, 4, 5)
    val pizzas = listOf(Pizza("Buffalo Chicken", 4.5, 4),
                                   Pizza("Meat lovers", 4.0, 1),
                                   Pizza("Hawaiian", 3.0, 2),
                                   Pizza("Supreme", 3.5, 2),
                                   Pizza("Cheese", 1.5, 6))

    val minInt = ints.minBy {it.toDouble()}
    val minInt2 = ints.minBy { int: Int -> int}
    val sumInts = ints.sum()
    val sumInts2 = ints.sumBy {it}
    val sumInts3 = ints.sumByDouble { int: Int -> int.toDouble()} /* Is `{ int: Int -> int.toDouble()}` the same as `{Int::toDouble}` ... maybe, not sure.*/

    println("minInt:  $minInt")
    println("minInt2: $minInt2")
    println("sumInts: $sumInts")
    println("sumInts2:  $sumInts2")
    println("sumInts3: $sumInts3")

    val lowPrice = pizzas.minBy {(it.pricePerSlice)}
    val highPrice = pizzas.maxBy {(it.pricePerSlice)}
    val highQuantity = pizzas.maxBy (Pizza::quantity)
    val highQuantity3 = pizzas.maxBy { it.quantity }
    val totalPrice = pizzas.sumByDouble { it.pricePerSlice * it.quantity }
    val totalPrice2 = pizzas.sumByDouble { it.pricePerSlice * it.quantity }

    //Below is my unmodified code, which outputs the whole line of the list defined by the data class
    println("\nlowPrice: $lowPrice")
    println("highPrice: $highPrice")
    if (highQuantity != null) println("highQuantity: $highQuantity") /* optional, you could just do println("highQuantity: $highQuantity") */
    println("highQuantity3: $highQuantity3")
    println("totalPrice: $$totalPrice")
    println("totalPrice2: $$totalPrice2")


    //Below is my modified code to exclude data from the list defined by the data class

    println("\nlowPrice: ${lowPrice!!.name} $${lowPrice.pricePerSlice}") /* `!!` is the same as a `if (<term> != null)` statement */
    println("highPrice: ${highPrice?.name} $${highPrice!!.pricePerSlice}")
    if (highQuantity != null) {
        println("highQuantity: ${highQuantity.name} ${highQuantity.quantity}")    /* `!!` is the same as a `if (<term> != null)` statement */
    }
    println("highQuantity3: ${highQuantity3!!.name} ${highQuantity3.quantity}")
    println("totalPrice: $$totalPrice")
    println("totalPrice2: $$totalPrice2")
}