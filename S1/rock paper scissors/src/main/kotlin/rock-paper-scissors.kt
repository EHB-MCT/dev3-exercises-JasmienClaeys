fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val randomNumber = (0..2).random()

    println(options[randomNumber])


    print("Rock, paper, scissors?")

    val answer = readLine()
    println("Your choice: $answer")

}