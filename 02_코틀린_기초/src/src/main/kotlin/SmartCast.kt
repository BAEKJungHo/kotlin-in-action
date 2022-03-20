interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr


fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.right) + eval(e.left)
    else -> throw IllegalArgumentException("Unknown expression")
}

// if 와 when 의 분기에서 블록 사용
// 블록의 마지막 문장이 분기의 결과 값을 나타낸다.
// 블록의 마지막 식이 블록의 결과라는 규칙은 블록이 값을 만들어내야 하는 경우 항상 성립한다.
fun evalWithLogging(e: Expr): Int = when (e) {
    is Num -> {
        println("num : ${e.value}")
        e.value
    }
    is Sum -> {
        val left = evalWithLogging(e.left)
        val right = evalWithLogging(e.right)
        println("sum: ${left} + ${right}")
        left + right
    }
    else -> throw IllegalArgumentException("Unknown expression")
}