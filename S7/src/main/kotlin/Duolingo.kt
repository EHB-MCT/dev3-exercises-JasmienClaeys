class Duolingo (var roundSize: Int = 5, var language: String, var difficulty: String){
    var words = mutableListOf<Word>(
        CzechWord("Matka", "Moeder"),
        CzechWord("Otec", "Vader"),
        CzechWord("Dobrý den", "Goedendag"),
        CzechWord("Dobrou noc", "Welterusten"),
        CzechWord("Děkuji", "Bedankt"),
        CzechWord("Prosím", "Graag gedaan"),
        CzechWord("Ahoj", "Hallo"),
        CzechWord("Na shledanou", "Tot ziens"),
        CzechWord("Dobré ráno", "Goedemorgen"),
        CzechWord("Dobrý večer", "Goedenavond"),

        WestFlemishWord("Stutte", "Boterham"),
        WestFlemishWord("Taloore", "Bord"),
        WestFlemishWord("Frezen", "Aardbeien"),
        WestFlemishWord("Charletang", "Bedrieger"),
        WestFlemishWord("Beire", "Super"),
        WestFlemishWord("Ges", "Gras"),
        WestFlemishWord("Gekapt", "Gehakt"),
        WestFlemishWord("Klutters", "Klein geld"),
        WestFlemishWord("Kattekop", "Meervoudig stopcontact"),
        WestFlemishWord("Kastaar", "Durver")
    )

    init {
        if(difficulty == "Easy") {
            words = words.filter { it.language == language }.toMutableList()
        }
    }

    fun play() {
        //words.shuffle()
        //val fiveWords = words.take(5).toMutableSet()

        //fiveWords.forEach{
            //println("Wat betekent " + it.original + " in het Nederlands?")

            //val userInput = readLine()
            //if(userInput == it.translated) {
                //println("Correct! " + it.original + " vertaald uit het " + it.language + " betekent " + it.translated)
                //currentWords.remove(selectedWord)
                //remove werkt door toMutableSet()
                //println("Nog zoveel woorden te gaan.")
           // }else{
                //println("Fout... " + it.original + " vertaald uit het " + it.language + " betekent " + it.translated)
              // println("Nog zoveel woorden te gaan.")

                // terug in fiveWords array zetten
            //}
       //}

        val currentWords = words.shuffled().take(roundSize).toMutableSet()
        println(currentWords.count())

        while (currentWords.isNotEmpty()) {
            val selectedWord = currentWords.random()
            println("Wat is de vertaling van ${selectedWord.original}")
            val userAnswer = readLine()

            if(selectedWord.translated == userAnswer) {
                println("Correct! ${selectedWord.original} vertaald uit het ${selectedWord.language} betekent ${selectedWord.translated}")
                currentWords.remove(selectedWord)
            }else{
                println("Jammer, maar het is fout... ${selectedWord.original} vertaald uit het ${selectedWord.language} betekent ${selectedWord.translated}")
            }
            println("Aantal woorden: ${currentWords.count()}")
        }
    }
}