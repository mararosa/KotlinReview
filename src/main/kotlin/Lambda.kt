import java.lang.Math.random

fun main(args: Array<String>) {

    { println("Olar") }()
    val swim = { println("swim \n") }
    swim()

    var dirty = 20
    val waterFilter = { dirty: Int -> dirty / 2}
    waterFilter(dirty)

    val list = listOf(1,2,3)
    list.filter {
        it == 2 //takes a lambada and uses it to filter a list
    }
}

