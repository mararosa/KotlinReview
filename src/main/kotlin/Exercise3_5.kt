fun main(args: Array<String>) {
    val timeMessage = if (args[0].toInt() < 12) "Good Morning, Kotlin" else "Good night, Kotlin."
    println(timeMessage)

    //or

    println(if (args[0].toInt() <12) "Hello Kotlin" else "Bye Kotlin")
}