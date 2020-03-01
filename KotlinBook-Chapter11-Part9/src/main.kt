/* Chapter 11, Part 9 */
/* Grocery list, page 493*/


data class Grocery (val name: String, val category: String, val unit: String, val unitPrice: Double)

fun search (list: List<Grocery>, criteria: (g: Grocery) -> Boolean) {
    for (l in list) {
        if (criteria(l)) {println(l.name)}
    }
}

fun main() {
    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0),
                                        Grocery("Mushrooms", "Vegetable", "lb", 4.0),
                                        Grocery("Bagels", "Bakery", "Pack", 1.5),
                                        Grocery("Olive Oil", "Pantry", "Bottle", 6.0),
                                        Grocery("Ice Cream", "Frozen", "Pack", 3.0))
    println("Expensive ingredients:")
    search(groceries) {i: Grocery -> i.unitPrice > 5}
    println("All Vegetables:")
    search(groceries) {i: Grocery -> i.category == "Vegetable"}
    println("All Packs:")
    search(groceries) {i: Grocery -> i.unit == "Pack"}
}