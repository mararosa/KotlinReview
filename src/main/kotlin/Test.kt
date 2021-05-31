
import java.util.*

fun dayOfWeek(){
    println(" What day is it today?")
    println("-----------")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Hoje é Domingo"
        2 -> "Hoje é Segunda"
        3 -> "Hoje é Terça"
        4 -> "Hoje é Quarta"
        5 -> "Hoje é Quinta"
        6 -> "Hoje é Sexta"
        else -> "Hoje é Sabado"
    })
}

fun main(args: Array<String>) {
//    dayOfWeek()
//
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    val temperature = 10
//    val isHot = if (temperature > 50) true else false //Value of if expression
//    println(isHot)
//
//    val message = "You are ${ if (temperature > 50) "fried" else "safe"} fish"
//    println(message)

    gamePlay(rollDice2(22))

}

fun canAddMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecoration: Boolean = true): Boolean{
    return (tankSize * if (hasDecoration) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

val rollDice = { side: Int -> if (side == 0)  0 else Random().nextInt(side) + 1}
val rollDice2: (Int) -> Int = { side ->
    if (side == 0) 0
    else Random().nextInt(side) + 1
}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}