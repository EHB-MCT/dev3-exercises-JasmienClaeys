fun main (){
    println("Welcome player, ready to deceive others or to be deceived")

    challengeone()
}

fun challengeOne(){
    val answer = setOf("your age", "age", "Your age", "Age")

    println("Solve the following riddle and see if you'll become the next mole...")
    println("The riddle: What always goes up, but never comes down?")

    val userAnswer = readLine()

    if(answer.contains(userAnswer)){
        println("You win the first round. Up to the second")
        challengeTwo()
    }else {
        println("You lose. Better luck next time")
    }
}

fun rollDice(){
    val numbers = setOf(1, 2, 3, 4, 5, 6)
    val computerChoice = numbers.random()
}

fun challengeTwo(computerChoice){
    println("For the second challenge you need to pick a number between 1-6. Make a choice: Low(1-3) or High(4-6):")

    val userChoice = readLine()
    println("Your choice: $userChoice")
    println("Computer choice: $computerChoice")

    if(userChoice == "low"){
        if(computerChoice == "1", "2", "3"){
            println("You win the 2nd challenge")
        }else{
            println("You lost this round. Game over. Time to go home.")
        }
    }

    if (userChoice == "high"){
        if(computerChoice == "4", "5", "6"){
            println("You win the 2nd challenge")
        }else{
            println("You lost this round. Game over. Time to go home.")
        }
    }
}