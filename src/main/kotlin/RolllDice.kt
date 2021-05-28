import java.util.*

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

}