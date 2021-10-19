class Teacher(protected val name: String): ChatPartner  {
    override fun introduce(){
        println("Hi, I'm $name")
    }

    override fun talk(){
        funFact()
    }

    fun funFact(){
        println("Did you know that Kotlin was named after an island")
    }
}