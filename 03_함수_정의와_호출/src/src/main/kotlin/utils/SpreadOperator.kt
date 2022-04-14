package utils

fun printList(args: Array<String>) {
    val list = listOf("args : ", *args)
    println(list)
}