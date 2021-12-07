fun main(){
//    println("Hoeveel woorden wil je oefenen?")
//    var amountOfWords = readLine()!!.toInt()

    println("In welke taal wil je oefenen? Tsjechisch of West-Vlaams?")
    val chooseLanguage = readLine()!!
    if (chooseLanguage == "Tsjechisch" || chooseLanguage == "West-Vlaams") {
        println("Welke moeilijkheidsgraad wil je? Easy of Hard?")
        val difficulty = readLine()!!

        if (difficulty == "Easy"){
            val amountOfWords = 3
            val duolingo = Duolingo(amountOfWords, chooseLanguage)
            duolingo.play()

        }else if(difficulty == "Hard"){
            val amountOfWords = 6

            val duolingo = Duolingo(amountOfWords, chooseLanguage)
            duolingo.playHard()
        }
    }else {
        throw Exception("Check your spelling")

    }



}