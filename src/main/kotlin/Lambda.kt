fun main(args: Array<String>) {

    { println("Olar") }()
    val swim = { println("swim \n") }
    swim()

    var dirty = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    waterFilter(dirty)

    val list = listOf(1, 2, 3)
    list.filter {
        it == 2 //takes a lambada and uses it to filter a list
    }

//    val ints = listOf(1, 2, 3, 4, 5)
//    println(ints)
//    var lista = filtrar(ints, ::numerosPares)
//    println("Pares: $lista")
//    lista = filtrar(ints, ::numerosMaiorQueTres)
//    println("Maior que 3: $lista")

    //USANDO LAMBDA
//    var lista2 = ints.filtrar { it % 2 == 0 }
//    println(ints)
//    lista2 = ints.filtrar { it > 3 }
//    println(lista2)

}

//fun filtrar(list: List<Int>, filtro: (Int) -> (Boolean)): List<Int> {
//    val newList = arrayListOf<Int>()
//    for (item in list) {
//        if(filtro(item)) {
//            newList.add(item)
//        }
//    }
//    return newList
//}

//USANDO LAMBDA
fun List<Int>.filtrar(filtro: (Int) -> (Boolean)): List<Int> {
    val newList = arrayListOf<Int>()
    for (item in this) {
        if (filtro(item)) {
            newList.add(item)
        }
    }
    return newList
}

fun numerosPares(numero: Int) = numero % 2 == 0
fun numerosMaiorQueTres(numero: Int) = numero > 3

