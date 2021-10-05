fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val randomNumber = (0..2).random()

    print("Rock, paper, scissors?")

    val answer = readLine()
    println("Your choice: $answer")
    println(options[randomNumber])

    if (answer == "Paper") {

    }
}