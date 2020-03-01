/* Chapter 9 List testing Part 0 - List testing */
/* This covers lists, muteable lists, Sets and their overrides/options when you need duplicate values in a set, and lastly muteableSets*/
/* Maps and Muteable Maps are covered in Chapter 9 - Part 1 with their own code.*/

fun main () {
    val shopping1 = listOf("Tea", "Eggs", "Milk")
    /* or an example of above code could be done the same as below. IDE will recommend combining the 2 as in first example. */
    val shopping2 : List<String> = listOf ("Pasta", "Meat", "Mushrooms")
    /*once you've created the list, access them using get*/
    println("First item in both shopping list 1 and 2.")
    println("-----------------------------------------")
    if (shopping1.isNotEmpty() && shopping2.isNotEmpty())
        println("First item in shopping1 is:  ${shopping1[0]}\nFirst item in shopping2 is:  ${shopping2[0]}") /* shopping#.get(0) will compile, but IDE recommends using index syntax instead.*/
    println("Note:  'shopping1.size > 0' is the same thing as 'shopping1.isNotEmpty()'")
    println("\nShopping list 1")
    println("-----------------")
    for (list1 in shopping1)
        println(list1)
    println("\nShopping list 2")
    println("-----------------")
    for (list2 in shopping2)
        println(list2)
    println("\nPrint out index position of an item, i.e. based on contents of the indexed position, i.e. Milk.")
    println("-------------------------------------------------------------------------------------------------")
    if (shopping1.contains("Milk"))
        println(shopping1.indexOf("Milk")) /* "Milk" can also be a string literal aka """Milk""" */
    println("\nNow lets create a mutable list and output to screen.")
    println("------------------------------------------------------")
    val mShopping = mutableListOf("Onions", "Peppers", "Garlic")
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow add:  Tomatoes   to the mutable list, and output updated list.")
    println("--------------------------------------------------------------------")
    mShopping.add("Tomatoes") /* add an item to the mutable list*/
    for (list3 in mShopping)
        println (list3) /*print mutable list again to show that the new item was added*/
    println("\nNow remove:  Tomatoes from the mutable list using an if statement and mShopping.remove, and output list to screen.")
    println("--------------------------------------------------------------------------------------------------------------------")
        if (mShopping.contains("Tomatoes")) {
            mShopping.remove("Tomatoes")
        }
        for (list3 in mShopping)
            println (list3)  /*print mutable list*/
    println("\nNow remove item:  Garlic from the mutable list using mShopping.removeAt and output list to screen.")
    println("---------------------------------------------------------------------------------------------------")
    mShopping.removeAt(2)
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow replace Onions in the mutable list with Tomatoes using mShopping.set, and an 'if' statement, because we want to pretend we don't know if the list is empty or not.")
    println("------------------------------------------------------------------------------------------------------------------------------------------------------_---------------")
    if (mShopping.size > 0) {
        mShopping[0] = "Tomatoes"  /*The IDE will also compile the following...  `mShopping.set(0, "Tomatoes"`, but recommends using `[<index #>] = "<text>"`*/
    }
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow let's re add Garlic, along with Oregano, Basil, Salt, and Black Pepper to the mutable list, and output to screen, but so it outputs the whole list one line at a time using only 2 lines of code.")
    println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    val addnew = "Garlic\nOregano\nBasil\nSalt\nBlack Pepper" /*`addnew : String =` is not needed, just `addnew =`. Both will compile though as of kotlin > 1.3 on 2/19/2020.*/
    mShopping.add(addnew)
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow let's use the `.sort()` function to change the order, and output to screen.")
    println("-------------------------------------------------------------------------------")
    mShopping.sort()
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nReverse `.sort()`ed listed, and output to screen.")
    println("--------------------------------------------------")
    mShopping.reverse()
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNotice how the order from the `.sort()` came out. It's based on the number of index positions.")
    println("-----------------------------------------------------------------------------------------------")
    println("Output the total size of the array to screen on the next line.")
    println(mShopping.size)
    println("The reason it is ${mShopping.size} is because the list of additional items (val addnew) all went under a single index position, in this case, index [2]")
    println("Remove the additional items from index [2], and re add them, one at a time, so they populate individual index positions in the mutable list.")
    mShopping.remove(addnew) /* `mShopping.removeAt(index: 2)` also works, but removes based on index position number.*/
    mShopping.add("Garlic")
    mShopping.add("Oregano")
    mShopping.add("Basil")
    mShopping.add("Salt")
    mShopping.add("Black Pepper")
    println("\nNow the mutable list contains ${mShopping.size} items with index positions numbering ${mShopping.indices}. Output list to screen.")
    println("--------------------------------------------------------------------------------------------------------------------------------")
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow if you reverse the order, using the `.reverse()` function, you will see the output completely reverse and this is PERMANENT.")
    println("--------------------------------------------------------------------------------------------------------------------------------")
    mShopping.reverse()
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow if we just `println(mShopping.reversed())`, rather than for loop mShopping to screen, you'll see that the reversed() is temporary for that particular output usage, when you run for loop again.")
    println(mShopping.reversed())
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow let's add an additional list to a single index position. We will add (addnew), even though it duplicates entries, and note how the list is permanently in reverse.")
    println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    mShopping.add(addnew)
    println("Now the mutable list contains ${mShopping.size} items with index positions numbering ${mShopping.indices}. Output list to screen. Note:  the list `addnew` is also a single item.\n")
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow let's use the `removeAll()` command to remove the `addnew` list instead of by variable or index position. Output to screen with for loop to verify it's empty.")
    println("`mShopping.clear()` also empties mShopping to its size of 0")
    mShopping.removeAll(mShopping)
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("You can see there is no output, but check the size and note the difference.")
    println("Size of mShopping mutable list is ${mShopping.size} and index positions number ${mShopping.indices}.")
    println("\nNow re-add the entire list individually, as well as the duplicated portion of the list (addnew), under its single index position number as before, and print to screen.\n")
    mShopping.add("Tomatoes")
    mShopping.add("Peppers")
    mShopping.add("Garlic")
    mShopping.add("Oregano")
    mShopping.add("Basil")
    mShopping.add("Salt")
    mShopping.add("Black Pepper")
    mShopping.add(addnew)
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nKeep in mind, that the list was not deleted, just all members. Your code can become inefficient if you forget about empty mutable lists, and you can end up with memory leaks.")
    println("Now let's use the `.retainAll` function to retain only the original list, without the (addnew) listOf under a single index position number, and output to screen.\n")
    mShopping.retainAll(listOf("Tomatoes", "Peppers", "Garlic", "Oregano", "Basil", "Salt", "Black Pepper"))
    for (list3 in mShopping)
        println (list3)  /*print mutable list*/
    println("\nNow let's check mutable list's size and index range to verify.")
    println("The mutable list:  mShopping now has ${mShopping.size} items with index positions numbering ${mShopping.indices}.")
    println("\nSometimes it's good to make a copy of a list to an immutable list or a mutable list, depending on the purpose of your copy.")
    println("------------------------------------------------------------------------------------------------------------------")
    println("Now let's make a copy into an immutable list, which is the default list, and output it to screen for verification.")
    println("Adding `.toList()` at the end of the mutable list name being copied, is what makes it a default immutable list again. This is necessary because you are copying from a mutable list.\n")
    val mShoppingCopy = mShopping.toList()
    for (list3 in mShoppingCopy)
        println (list3)  /*print default immutable list that was copied from mshopping mutable list.*/
    println("\nVerifying mShoppingCopy gives us a size of ${mShoppingCopy.size} items and index positions numbering ${mShoppingCopy.indices}.")
    println("Now let's print a reversed copy of the mShoppingCopy defaulted immutable list, but not with a for loop.")
    println("${mShoppingCopy.reversed()}")
    println("\nNow let's print mShoppingCopy with a for loop. See how the `.reversed` status is NOT permanent.")
    for (list3 in mShoppingCopy)
        println (list3)  /*print default immutable list that was copied from mshopping mutable list.*/
    println("\nIn this next section, we will deal with lists, that do NOT allow duplicates based on their index position member contents.")
    println("This is called a `Set`. As an example, if the contents of [0] are identical to [1] in the same `Set`, it will not be allowed.")
    println("----------------------------------------------------------------------------------------------------------------------------")
    println("Let's create a new set, with 4 friends in the set, which represents positions 0..3 for the indexes. Then let's create a second set, with one duplicated")
    println("Output both to the screen, then verify size and index count of each one. From here, forward, we won't use for loops, just println outputs.")
    val friendSet = setOf("Ashley", "Eric", "Fin Ju", "Jubei")
    val friendSetWithDupe = setOf("Ashley", "Eric", "Fin Ju", "Jubei", "Eric")
    println("Here is the output of friendSet:  ${(friendSet)}    friendSet size is ${friendSet.size} and it's index count is from ${friendSet.indices}")
    println("Here is the output of friendSetWithDupe:  $friendSetWithDupe      friendSetWithDupe size is ${friendSetWithDupe.size} and it's index count is from ${friendSetWithDupe.indices}")
    println("You can see that friendSetWithDupe, which had `Eric` as the 5th member in the set, and would have been index position 4 if this were a default list or mutable list, instead of set.")
    println("There is NO get or indexing get equivalent in Sets. SETS ARE IMMUTABLE. For loops will get you through the set as well.")
    println("Since a Set uses hash values of objects to compare for finding duplicates, if you want a duplicate, you'll have to create a data class, override hashcode and .equals() operator, or just make it a MuteableSet.")
    println("If you truly must have duplicates in a Set, then you should probably look into data classes or muteable sets, as a lengthy amount of overrides will get messy to track quickly.")

    println("\nHere are 4 override examples for Sets, in which only one of them gives you ONE SET with ONE ITEM. The classyoverrides.kt file has the classes for this section of main code below.")
    println("First override Set Example == It produces ONE SET with ONE ITEM, and follows the rules of the hashCode and equals() operator.")
    println("-----------------------------------------------------------------------------------------------------------------------------")
    val classysets1 = setOf(Duck1(), Duck1(17))
    println(classysets1)
    println("\nSecond override Set Example == It produces a Set with two items. The class breaks the hashCode() and equals() operator rules\nas equals() always returns false, even if it's used to compare an object with itself")
    println("------------------------------------------------------------------------------------------------------------------------------")
    val classysets2 = setOf(Duck2(), Duck2()) /* It doesn't matter whether you override the size here or not, the output is identical, including the member output. Compare with Duck4, classysets4.*/
    println(classysets2)
    println("\nThird override Set Example == It follows the rules and produces one set, but produces the Set with two items.")
    println("----------------------------------------------------------------------------------------------------------------")
    val classysets3: Set<Duck3.Duckdataclass> = setOf(Duck3.Duckdataclass(), Duck3.Duckdataclass(17)) /*Overriding size here, because default parameter in class is 18*/
    println(classysets3)
    println("\nFourth override Set Example == The produces a Set with two items. The class breaks the rules as hashCode() returns a random number.\nThe rules say that equal objects should have the same hash code.")
    println("------------------------------------------------------------------------------------------------------------------------------------")
    val classysets4 = setOf(Duck4(), Duck4(17)) /*IMPORTANT, Notice that when you override the default identically, it still outputs a set with two items, but their list members are a little different.*/
    println(classysets4)
}