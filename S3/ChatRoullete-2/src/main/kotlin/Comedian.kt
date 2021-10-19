class Comedian(protected val name: String): ChatPartner{
    override fun introduce(){
        println("Hi, I'm $name")
    }

    override fun talk(){
        tellJoke()
    }

    fun tellJoke(){
        println("toooooo early")
    }
}