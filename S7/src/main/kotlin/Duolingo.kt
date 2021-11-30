class Duolingo (roundSize: String, language: String){
    val words = mutableListOf<Word>(
        Word("Matka", "Moeder", "Tsjechisch"),
        Word("Otec", "Vader", "Tsjechisch"),
        Word("Dobrý den", "Goedendag", "Tsjechisch"),
        Word("Dobrou noc", "Welterusten", "Tsjechisch"),
        Word("Děkuji", "Bedankt", "Tsjechisch"),
        Word("Prosím", "Graag gedaan", "Tsjechisch"),
        Word("Ahoj", "Hallo", "Tsjechisch"),
        Word("Na shledanou", "Tot ziens", "Tsjechisch"),
        Word("Dobré ráno", "Goedemorgen", "Tsjechisch"),
        Word("Dobrý večer", "Goedenavond", "Tsjechisch"),

        Word("Stutte", "Boterham", "West-Vlaams"),
        Word("Taloore", "Bord", "West-Vlaams"),
        Word("Frezen", "Aardbeien", "West-Vlaams"),
        Word("Charletang", "Bedrieger", "West-Vlaams"),
        Word("Beire", "Super", "West-Vlaams"),
        Word("Ges", "Gras", "West-Vlaams"),
        Word("Gekapt", "Gehakt", "West-Vlaams"),
        Word("Klutters", "Klein geld", "West-Vlaams"),
        Word("Kattekop", "Meervoudig stopcontact", "West-Vlaams"),
        Word("Kastaar", "Durver", "West-Vlaams")
    )

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

        val currentWords = words.shuffled().take(5).toMutableSet()
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
            println("Aantal worden nog te gaan: ${currentWords.count()}")
        }



    }


}