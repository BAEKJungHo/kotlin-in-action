package utils

// val (number, name) = 1 to "one"

fun test() {
    val collection = listOf("A", "B", "C")
    for ((index, element) in collection.withIndex()) {
        println("$index: $element")
    }
}