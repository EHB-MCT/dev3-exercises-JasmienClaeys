fun main (){
    println("Welcome player, ready to deceive others or to be deceived")

    challengeOne()
}

fun challengeOne(){
    val answer = setOf("your age", "age", "Your age", "Age")

    println("Solve the following riddle and see if you'll become the next mole...")
    println("The riddle: What always goes up, but never comes down?")

    val userAnswer = readLine()

    if(answer.contains(userAnswer)){
        println("You win! Welcome mole")
    }else{
        println("You lose. Better luck next time")
    }
}