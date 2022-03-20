class Expression {

    /**
     * 본문이 중괄호로 둘러싸인 함수를 '블록이 본문인 함수' 라고 하며
     * 등호와 식으로 이루어진 함수를 '식이 본문인 함수' 라고 한다.
     */

    // 식(expression)이 본문인 함수
    fun max(a: Int, b: Int): Int = if (a > b) a else b

}