import java.util.*

fun main(args: Array<String>) {
    val numeros: IntArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val numeros2 = Array(10, { i -> i })
    println(Arrays.toString(numeros))
    println(Arrays.toString(numeros2))

    //---------------------------
    val list = mutableListOf<Int>()
    println("list.isEmpty() is ${list.isEmpty()}") // true

    list.addAll(listOf(1, 2, 3))
    println(list) // [1, 2, 3]

    list += listOf(4, 5)
    println(list) // [1, 2, 3, 4, 5]

    val numbers: IntArray = intArrayOf(11,12,13,14,15)
    val onelist = mutableListOf<String>()

    for (item in numbers) {
        onelist.add(item.toString())
    }
    println(onelist)

    val numberDivisibleBy7 = Array(100) { i -> i } //LAMBDA
    val addNumberDivisibleBy7: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) {
        addNumberDivisibleBy7.add(i)
    }
    println(addNumberDivisibleBy7)
}