fun main(){
//    val person1 = Person("Person1")
//    val person2 = Person("Person2")
    val persons = arrayOf(Person("Person1"), Person("Person2"))

    val pickPerson = persons.random()

    println("Hi, welcome my name is $pickPerson")
}