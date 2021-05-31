import java.util.*

fun main(args: Array<String>) {
    println("Oi, ${args[0]}!")
    println("--------------------------------")
    feedTheFish()
    println("--------------------------------")
    eagerExample()
    println("--------------------------------")
    // repeat (function from standard library
    repeat(2) {
        println("A fish is swimming")
    }
    println("--------------------------------")
    // call dirty processor
    dirtyProcessor()
    println("--------------------------------")
//    println(shouldChangeWater("Sunday"))
//    println(shouldChangeWater2("Monday"))
//    println(canAddFish(10.0, listOf(3, 3, 3)))
//    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
//    println(canAddFish(9.0, listOf(1, 1, 3), 3))
//    println(canAddFish(10.0, listOf(), 7, true))

}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic", "plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' } //hold new list
    println(eager)

    // apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList()) //turn the sequence back to the list

    // apply map lazily
    val lazyMap = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("map: $it")
        it
    }
    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {

    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot -> true
        isDirty -> true
        isSunday -> true
        else -> false
    }
}

//Another whay - Simple way of doing change water - with function
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater2(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

var dirty = 20
val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty) { dirty -> dirty + 50 }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater(day = "Monday")

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
}

/*fun fishFood(day: String): String {
    var food = "fasting"

    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wenesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}*/

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wenesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tusday", "Wenesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}