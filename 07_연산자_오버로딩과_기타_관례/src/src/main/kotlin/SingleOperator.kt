import dto.Point

/**
 * # 단항 연산자
 */

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}