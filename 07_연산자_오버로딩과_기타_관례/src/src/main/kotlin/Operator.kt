/**
 * # 오버로딩 가능한 이항 산술 연산자
 * a * b = times
 * a / b = div
 * a % b = mod
 * a + b = plus
 * a - b = minus
 *
 * 코틀린 연산자는 자동 교환 법칙(commutativity)을 지원하지 않는다.
 * 즉, a op b != b op a 라는 말이다.
 *
 * 따라서, p * 1.5 외에 1.5 * p 라고도 쓸 수 있어야 한다면 추가로 operator 를 만들어 줘야 한다.
 */
data class Point(
    val x: Int,
    val y: Int,
) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

// 연산자를 확장 함수로 정의하기
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

// 두 피연산자의 타입이 다른 연산자 정의하기
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

// 어떤 문자를 여러 번 반복해서 문자열을 만들어내는 연산자
operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun use() {
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    println(p1 + p2) // plus 연산자 호출됨

    println('a' * 3) // aaa
}
