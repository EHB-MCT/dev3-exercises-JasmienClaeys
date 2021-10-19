fun main(){
    println("Player 1, what's your name?")
    val person1 = readLine()
    val name1 = Person("$person1")

    println("Player 2, what's your name?")
    val person2 = readLine()
    val name2 = Person("$person2")

    val person3 = Person("Hector")
    val person4 = Person("Ella")
//    val persons = arrayOf(person3.name, person4.name)
    val persons = arrayOf(name1.name, name2.name)

    val pickPerson = persons.random()

    println("Hi there my name is $pickPerson")
//    Person.introduce(pickPerson)
}