/*Chapter 7 - Part 1, Data Structures, the == (.equals()) operator, storing information, default parameters, the Any class/superclass, and hashcode*/
class classy(){

    fun wolf(): Any { /*If you change this to string, or change the below literal to a println, then the above related main code would also need their type declaration changed, i.e. String, Unit*/
    return ("""This text will be converted into a hashcode.""")
    }
    /*Below is 2 ways to show data classes, as with classes, you can put your variable declaration in the class parameters or in the body, depending on what your required approach is for program scope.*/
    //data class Person(val name: String) {
    //    var age: Int = 0
    //}
    /*Alternative way for above data class. Comment out above 3 lines, and comment below to see the differences in the way it is treated by the same calls in the main.*/
    data class Person(val name: String, var age: Int = 0)

    data class User(val name: String = "", val age: Int = 0)
}