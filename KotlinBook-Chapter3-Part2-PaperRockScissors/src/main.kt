import kotlin.math.roundToInt

val options = arrayOf ("Rock", "Paper", "Scissors")
val gameChoice= getGameChoice(options)
val userChoice= getUserChoice(options)

fun main() {
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) : String {
    optionsParam[(Math.random().toInt() * optionsParam.size)]
    return gameChoice
}

fun getUserChoice(optionsParam: Array<String>) : String {
    var isValidChoice = false
    var userChoice = ""
    //Loop until the user enters a valid choice
    while (!isValidChoice) {
        //Ask the user for their choice
        print("Please enter on of the following:")
        for (item in optionsParam) print (" $item")
        println(".")
        //Read the user output
        val userInput = readLine()
        //Validate the user input
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    //Figure out the result
    val result: String
    if (userChoice == gameChoice) {
        result = "Tie! Go again."
    } else if ((userChoice == "Rock" && gameChoice == "Scissors") || (userChoice == "Paper" && gameChoice == "Rock") || (userChoice == "Scissors" && gameChoice == "Paper"))
            result = "You Win!"
    else result = "You are a loser."
    //Print the result
    println("You chose $userChoice. I chose $gameChoice. $result")
}