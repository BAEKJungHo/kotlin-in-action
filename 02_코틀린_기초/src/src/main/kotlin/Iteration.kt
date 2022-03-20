import java.util.TreeMap

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun run() {
    // 역방향 수열 : 100 downTo 1 -> 100 부터 1까지
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
}

// 맵에 대한 이터레이션
fun mapIteration() {
    val binaryReps = TreeMap<Char, String>() // 키에 대해 정렬하기 위해 TreeMap 을 사용한다.
    for (c in 'A' .. 'F') {
        val binary = Integer.toBinaryString(c.toInt()) // 아스키코드를 2진 표현으로 바꾼다.
        binaryReps[c] = binary
    }

    // 맵의 키와 값을 각 두 변수에 대입한다.
    // letter 에는 key 가 들어가고 binary 에는 2진 표현이 들어간다.
    // 코틀린은 get, put 을 사용하는 대신 map[key] 나 map[key] = value 를 사용해 값을 가져오고 설정할 수 있다.
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

// 컬렉션 이터레이션
fun collectionIteration() {
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) { // 인덱스와 함께 컬렉션을 이터레이션 한다.
        println("$index: $element")
    }

    // 0: 10, 1: 11, 2: 1001
}

// in 으로 컬렉션이나 범위의 원소 검사
fun isLetter(c: Char) = c in 'a' .. 'z' || c in 'A' .. 'Z'
fun isNotDigit(c: Char) = c !in '0' .. '9'

fun recognize(c: Char) = when (c) {
    in '0' .. '9' -> "It's a digit!"
    else -> "I don't know"
}

// println("Kotlin" in setOf("Java", "Scala"))
