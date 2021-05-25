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
    dayOfWeek()
}