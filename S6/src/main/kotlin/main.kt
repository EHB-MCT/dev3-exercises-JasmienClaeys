import java.sql.*
import java.util.*

fun  main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] =  credentials.databasePassword

    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.databaseHost +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    println("Choose your destination city: Brussel or Denderleeuw or Ternat")
    val search = readLine()

    val statement = connection.prepareStatement("SELECT * FROM S6_trains " +
            "INNER JOIN S6_rides ON S6_trains.id = S6_rides.train_id " +
            "WHERE departure_city = ?")
    // The result of your query will be a type ResultSet
    // But since the library is based on Java, we get a type from Java
    statement.setString(1, search)
    // search verwijst naar de variabele: readline van de user en deze info "beveiligd" ingeven
    val result = statement.executeQuery()
    while(result.next()) {
        val city1 = result.getString("departure_city")
        val time = result.getString("departure")
        println(city1)
        println(time) 
    }



    //SELECT * FROM trains
}