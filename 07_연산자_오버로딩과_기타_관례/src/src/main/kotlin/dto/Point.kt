package dto

data class Point(
    val x: Int,
    val y: Int,
) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    /**
     * === (식별자 비교 연산자, identity equals) 를 사용해 equals 의 파라미터가 수신 객체와 같은지 비교한다.
     * equals 를 구현할 때는 === 를 사용해 자기 자신과의 비교를 최적화 하는 경우가 많다.
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true // 최적화: 파라미터가 this 와 같은 객체인지 살펴본다.
        if (other !is Point) return false // 파라미터 타입을 검사한다.
        return other.x == x && other.y == y
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }
}