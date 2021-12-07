fun main(){
    println("Hoeveel woorden wil je oefenen?")
    val amountOfWords = readLine()!!.toInt()
    println("In welke taal wil je oefenen? Tsjechisch of West-Vlaams?")
    val chooseLanguage = readLine()!!

    val duolingo = Duolingo(amountOfWords, chooseLanguage)
    duolingo.play()
}