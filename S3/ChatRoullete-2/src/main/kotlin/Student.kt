class Student(protected val name: String):ChatPartner {
    override fun introduce(){
        println("Hi, I'm $name")
    }

    override fun talk(){
        gossip()
    }

    fun gossip(){
        println("No gossip yet")
    }
}