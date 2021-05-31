import java.util.*
import kotlin.random.Random.Default.nextInt

fun main(args: Array<String>) {

    val rollDice = { Random().nextInt(12) + 1 }

    val rollDice2 = { sides: Int -> Random().nextInt(sides) + 1 }

    val rollDice3 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    val rollDice4: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }


//    val randomValues = List(10) { Random.nextInt(0, 100) }
//// prints new sequence every time
//    println(randomValues)
//
//    val nextValues = List(10) { Random.nextInt(0, 100) }
//    println(nextValues)
//    println("randomValues != nextValues is ${randomValues != nextValues}") // true
}
