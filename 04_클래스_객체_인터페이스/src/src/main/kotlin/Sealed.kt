/**
 * sealed
 *
 * 상위 클래스에 sealed 변경자를 붙이면 그 상위 클래스를 상속한 하위 클래스 정의를 제한할 수 있다.
 * sealed 클래스의 하위 클래스를 정의할 때는 반드시 상위 클래스 안에 중첩시켜야 한다.
 *
 * 별도의 open 변경자를 붙이지 않아도 기본으로 open 이다.
 */

// sealed 적용 전
interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown Expression")
    }

// sealed 적용 후
sealed class Exprs {
    class Nums(val value: Int): Exprs()
    class Sums(val left: Exprs, val right: Exprs): Exprs()
}

// when 식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 필요 없다.
fun evals(e: Exprs): Int =
    when (e) {
        is Exprs.Nums -> e.value
        is Exprs.Sums -> evals(e.right) + evals(e.left)
    }