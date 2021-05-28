fun main(args: Array<String>) {
    //println("You fortune is: ${getFortuneCookie()}")
    runFortuneUntilFindTheSelectOne()
}

fun getFortuneCookie(bday: Int): String {
    val fortunes = listOf(
        "This is no coincidence. Give the fluffy pooch food",
        "We don't stop going to school when we graduate.",
        "Don't cry because it's over. Smile because it happened.",
        "Stay hungry. Stay foolish.",
        "Take it easy",
        "Kid, you'll move mountains."
    )
    //return fortunes[bday.rem(fortunes.size)]
    //val fortuneMessageTakeByArrayIndex = inputBirthday % fortunes.size
    //return fortunes[fortuneMessageTakeByArrayIndex]

    /////Use when statement
    return when (bday) {
        in 1..7 -> fortunes[3]
        in 12..15 -> fortunes[1]
        else -> fortunes[bday.rem(fortunes.size)]
    }
    /*
    val index = when (bday) {
        in 1..7 -> 4
        in 17..30 -> 3
        else -> bday.rem(fortunes.size)
    }
    return fortunes[index]
     */
}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    val inputBirthday = readLine()?.toIntOrNull() ?: 1
    return inputBirthday
}

fun runFortuneUntilFindTheSelectOne() {
    var fortune: String = ""
   while (!fortune.contains("Take it easy")) {
        fortune = getFortuneCookie(getBirthday())
        println("You fortune is: ${fortune}")
    }
}