/* Chapter 9 part 1:  collections: Get organized */
/* collections are more flexible arrays */
/* List == when sequence matters */
/* Set == when uniqueness matters */
/* Map == when finding something matters. A map has a key value pair. It allows duplicate values, but NOT duplicate keys. */
/* Collections are immutable by default, so you can't change them, unless you make them mutable purposely */
/* You can println entries, keys, values and size of a map to check and verify your data */
data class Recipe (var name: String) /*Defaults as a Global Data Class entry for storing the name of each Recipe, a var of type string called `name`.*/

fun main(){
    println("\nThis section of code deals with the Mutable List, can be altered, and allows for duplicates.")
    println("============================================================================================")
    println("Explanation:  A duplicate item was purposely added to the mutableList to be handled for duplicate checking by the mutableSet in the next section.")
    val mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original:  $mShoppingList")
    //println("mShoppingList currently has a size of ${mShoppingList.size} and an index position range between ${mShoppingList.indices}")
    val extraShopping = listOf ("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll (extraShopping)
    println("mShoppingList original with listOf items added: $mShoppingList")
    //println("mShoppingList currently has a size of ${mShoppingList.size} and an index position range between ${mShoppingList.indices}")
    if (mShoppingList.contains("Tea")) {
        mShoppingList[mShoppingList.indexOf("Tea")] = "Coffee"   /* mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee") */
    }

    println("\nThis section of code deals with the sorting of the Mutable List.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    println("\nThis section of code deals with the MuteableSet, which can be altered, but does NOT allow duplicates without a series of overrides or data class implementation.")
    println("==================================================================================================================================================================")
    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk") /*This Set is immutable, and has 3 individual entries that are added under 3 separate index positions in the MutableSet.*/
    mShoppingSet.addAll(moreShopping) /*This is where the entries of the immutable Set in the above line is added to the mutable Set.*/
    println("Explanation of above output:  The mutableList was passed to the mutableSet in order to check for duplicates then had a new member added to the SET below.")
    println("\nYou can see the difference as the mutableSet and mutableList are compared below.")
    println("mShoppingSet with member added: $mShoppingSet")
    //println("mShoppingSet currently has a size of ${mShoppingSet.size} and an index position range between ${mShoppingSet.indices}")
    println("mShoppingList (which is still reversed):  $mShoppingList")
    //println("mShoppingList currently has a size of ${mShoppingList.size} and an index position range between ${mShoppingList.indices}")

    println("\nThis Section of code deals with the Mutable Map and the default public global data class storage for Recipe of type String.")
    println("=============================================================================================================================")
    /*r1 thru r5 are your immutable values for your data class entries' storage*/
    val r1 = Recipe ("Chicken Soup")  /*Chicken Soup is an ENTRY in the data class Recipe*/
    val r2 = Recipe ("Quinoa Salad") /*Quinoa Salad is an ENTRY in the data class Recipe*/
    val r3 = Recipe ("Thai Curry") /*Thai Curry is an ENTRY in the data class Recipe*/
    val r4 = Recipe ("Jambalaya") /*Jambalya is an ENTRY in the data class Recipe*/
    val r5 = Recipe ("Sausage Rolls") /*Sausage Rolls in an ENTRY in the data class Recipe*/
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3) /*Recipe1, 2 and 3 are your keys, which are paired with their respective values in the data class.*/
    println("mRecipeMap original")
    println("~~~~~~~~~~~~~~~~~~~")
    for (item1 in mRecipeMap)
        println(item1)
    //println("mRecipeMap currently has a size of ${mRecipeMap.size}.")
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5) /*Recipe4 and 5 are your keys, which are paired with their respective values in the data class.*/
    mRecipeMap.putAll(recipesToAdd)
    println("\nmRecipeMap updated")
    println("~~~~~~~~~~~~~~~~~~")
    for (item2 in mRecipeMap)
        println(item2)
    println("\nThis output below, is the result of an if statement that prints to screen, the value of the key it is paired with. More Sanity Checks further down.")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }
    println("\n\nSANITY CHECKS: Make sure all of the Mutable maps':  keys, values, the entries in the data class Recipe, and the size of the map all jive.")
    println("--------------------------------------------------------------------------------------------------------------------------------------------")
    println("mRecipeMap currently has a size of ${mRecipeMap.size} stored in the data class Recipe, with these entries referenced by var name of type String:")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    for (item3 in mRecipeMap.entries)
        println(item3)
    println("\nand these values:  (Reminder:  values and keys are paired together.)")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    for (item4 in mRecipeMap.values)
        println(item4)
    println("\nand these keys:   (Reminder:  values and keys and paired together. Keys can be any kind of object, but their can only be one key, while you can have multiple values.)")
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    for (item5 in mRecipeMap.keys)
        println(item5)
}