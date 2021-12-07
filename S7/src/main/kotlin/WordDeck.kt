class WordDeck {
    val originalWords = mutableListOf<Word>(
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

    var words = originalWords

    fun filterByLanguage (language: String) {
        words = words.filter { it.language == language }.toMutableList()
    }

    fun reset() {
        words = originalWords
    }
}