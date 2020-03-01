/*Chapter 12, Part 1 -- Grocery List first time*/
/*Page 505*/
/* Introduces higher order functions:  minBy, maxBy, sumBy */
/* Use of `!!.` operator vs `if (<term> != null)`, and how it compares with the `?.` safe call operator */

data class Grocery (val name: String,
                    val category: String,
                    val unit: String,
                    val unitPrice: Double,
                    val quantity: Int)

fun main (){
    val groceries = listOf (Grocery("Tomatoes", "Vegetable","lb", 3.0, 3),
                                         Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
                                         Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
                                         Grocery("Olive Oil", "Pantry", "Bottle", 6.0, 1),
                                         Grocery("Ice Cream", "Frozen", "Pack", 3.0, 2))
    //highest and lowest Unit Price, which can be a null value
    val highestUnitPrice = groceries.maxBy { it.unitPrice } /* groceries -> unitPrice */
    println ("highestUnitPrice: $highestUnitPrice")
    val lowestQuantity = groceries.minBy { it.quantity }
    println("LowestQuantity: $lowestQuantity")

    //Quantity total sum, Total Price, which is NEVER a null value
    val sumQuantity = groceries.sumBy { it.quantity }
    println("sumQuantity: $sumQuantity")
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")

    //ABC ordering, lowest alpha, highest alpha, both by name, which can be a null value.
    val minABC = groceries.minBy { it.name }
    println("LowestABC whole damn entry: $minABC")
    println("LowestABC: ${minABC!!.name}") /* using minABC!!.name which is a non-null instead of minABC allows me to pull just the name of the item from the data class, instead of the whole entry. */
    val maxABC = groceries.maxBy { it.name }
    println("HighestABC: ${maxABC?.name}") /* using minABC!!.name which is safe call operator instead of minABC allows me to pull the same info output limitations as minABC!!.name, but only in this case.*/
}