class Chatbot (val name: String): ChatPartner {
    override fun introduce(){
        println("Hi, I'm clippy")
    }

    override fun talk() {
        println("Did you know trees are green")
    }
}