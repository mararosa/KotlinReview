
fun main(args: Array<String>) {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(curries)

    println(spices.filter { it[0] == 'c' && it[it.length - 1] == 'e' })
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })

    println(spices.take(3).filter { it.startsWith('c') })
}