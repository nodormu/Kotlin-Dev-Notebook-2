/* Chapter 4, Part 1 -- Classes */
/*Pay close attention to the difference in MyDog.barkV1() treatment and definition verses the other 2.*/

fun main(){
    var MyDog = dog("fido", 35, "mixed")
    var HerDog = dog("frieda", 14, "poodle")
    var activityarray = arrayOf("Walks", "Fetching balls", "Frisbee")
    val newdogs = arrayOf(dog("Kelpie", 20, "Westie"), dog("Ripper", 10, "Poodle"))

    /* MyDog examples*/
    println("\nMyDog example output.")
    MyDog.weight = 55 /* This line changes the output of the original argument of 35 that was sent to the function*/
    println("My Dog's name is ${MyDog.name} and weighs ${MyDog.weight} pounds or ${MyDog.weightInKgs} Kilograms.\nMy Dog is a ${MyDog.breed} breed and enjoys ${MyDog.activites}") /*Since we added to above line, the output is different here, plus we added our additional parameter not in the class properties. */
    println (MyDog.name)
    println ("My dog's name is ${MyDog.name}")
    println (MyDog.breed)
    println ("My dog's breed is a ${MyDog.breed}")
    println (MyDog.weight)
    println ("My dog's weight is ${MyDog.weight} pounds or ${MyDog.weightInKgs} Kilograms.")
    println(MyDog.barkV1())
    MyDog.barkV2()
    println(MyDog.barkV3()) /* This is a way to have the command return the null to the command line output.*/

    /*HerDog Examples*/
    println("\nHerDog Example output.")
    println("Her dog's name is ${HerDog.name}.\nHer dog is a ${HerDog.breed} breed and also enjoys ${MyDog.activites}") /*And we added our addtional parameter of activities not in the original class properties*/
    println ("${HerDog.name} weighs ${HerDog.weight} pounds or ${HerDog.weightInKgs} kilograms.")
    for (item in activityarray) println ("Her dog ${HerDog.name} enjoys $item") /*Prints our all 3 members of activity array with FRIEDA in separate sentences on separate lines. NO brackets.*/
    println (HerDog.name)
    println("${HerDog.name} is her dog's name.")
    println(HerDog.barkV1())
    HerDog.barkV2()
    HerDog.barkV3() /*without the println, this function call will NOT output null to the command line output.*/

    /*newdogs examples. Index number MUST be specified because they are locally specified arrays, rather than arguments passed to class, but still representative of that class's properties.*/
    println("\nnewdogs example output.")
    println("The first new dogs name is ${newdogs[0].name}, weighs ${newdogs[0].weight} pounds, and the breed is ${newdogs[0].breed}.")
    println("Listen to ${newdogs[0].name} ${newdogs[0].barkV1()}.")
    println("The second new dogs name is ${newdogs[1].name}, weighs ${newdogs[1].weight} pounds, and the breed is ${newdogs[1].breed}.")
    println("Listen to ${newdogs[1].name} ${newdogs[0].barkV2()}.")
}