/* Chapter 4, Part 1 -- Classes */
//class dog (name : String, weight : Int, breed : String) /*alternate version of class declaration properties*/
class dog (name_param: String, weight_param: Int, breed_param: String) {

    var activites = "Walks" /*Adding an additional parameter to the class properties*/
    //val weightInKgs: Double = weight_param / 2.2 /*Uncomment this line, and comment out 12, then look how the IDE auto corrects your code in main.kt.*/

    val name = name_param.toString().toUpperCase()  /* Comment out this line to use the alternate string properties declaration that doesn't use <word>_param */
    var weight = weight_param /* Comment out this line to use the alternate string declaration */
    val breed = breed_param.toUpperCase() /* Comment out this line to use the alternate string declaration */

    private val kgconvert: Double =  0.45359237
    val weightInKgs: Double = (weight * kgconvert) /*Notice the difference between this line, and the line 6. Only one or the other needs to be commented out*/

    init { /*This init code will print when new dogs have been created, whether it's MyDog or HerDog as an array, or newdogs as an array of many dogs, declared in the main.*/
        print("Dog $name has been created.\n")
    }

    fun barkV1(): String {  /* Since we did not specify a type for the function, println works.*/
        return (if (weight < 20) "Yip!" else "Woof!").toString()
    }
    fun barkV2():Any { /*Since we DID specify a type for the function, you have to return something of that type*/
        return println (if (weight < 20) "Yip!" else "Woof!")
    }
    fun barkV3(): Unit? {
        return null
    }
}