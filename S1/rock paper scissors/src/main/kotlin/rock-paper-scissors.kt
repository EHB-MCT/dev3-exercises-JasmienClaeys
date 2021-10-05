fun main() {
    val options = arrayOf("rock", "paper", "scissors")
    val computerChoice = options.random()

    print("rock, paper, scissors?")

    val userChoice = readLine()
    println("Computer choice: $computerChoice")
    println("Your choice: $userChoice")

    if (computerChoice == userChoice) {
        println("it's a draw")
    } else {
        if(userChoice == "paper"){
            if (computerChoice == "rock") {
                println("you win")
            }
            if(computerChoice == "scissors") {
                println("you lose")
            }
            if(computerChoice == "lizard") {
                println("you lose")
            }
            if(computerChoice == "spock") {
                println("you win")
            }
        }

        if(userChoice == "rock"){
            if (computerChoice == "paper") {
                println("you lose")
            }
            if(computerChoice == "scissors") {
                println("you win")
            }
            
        }

        if(userChoice == "scissors"){
            if (computerChoice == "rock") {
                println("you lose")
            }
            if(computerChoice == "paper") {
                println("you win")
            }
        }
    }
}