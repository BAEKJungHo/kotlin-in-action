import createRandomRectangle // 이름으로 함수 임포트하기

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    println(createRandomRectangle().isSquare)
}