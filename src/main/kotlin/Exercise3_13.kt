fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad", "rainy",0))
    print("How do you feel today?")
    println(whatShouldIDoToday(readLine()!!))
}

fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun isVeryHot(temperature: Int) = temperature > 35
fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
            isHappySunny(mood, weather) -> "Go for a walk"
            isVeryHot(temperature) -> "Go swimming"
            isSadRainyCold(mood, weather, temperature) -> "Stay in bed"
            else -> "Stay home and read a book"
        }
}