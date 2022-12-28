fun main() {
    fun List<Int>.filterMethod(): List<Int> {
        return this.filter { value ->
            value < 5
        }
    }

    fun List<*>.print() {
        this.forEach {
            println(it)
        }
    }

    val list1 = listOf(3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    list1
        .filterMethod()
        .print()

}