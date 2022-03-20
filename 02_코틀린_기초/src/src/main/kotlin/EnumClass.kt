// 코틀린에서 enum 은 soft keyword 라고 부른다.
// enum 은 class 앞에 있을 때는 특별한 의미를 지니지만, 다른 곳에서는 이름에 사용할 수 있다.
// 반면, class 는 키워드 이므로 klass 처럼 다른 이름으로 사용해야 한다.
enum class ColorEnum {
    RED, ORANGE, BLUE, YELLOW, BLACK
}

enum class Color(
    val r: Int, val g: Int, val b: Int // 상수의 프로퍼티 정의
) {
    RED(255, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    fun rgb() = (r * 256  + g) * 256 + b
}

fun getMnemonic(color: Color) = when (color) {
    Color.RED -> "Richard"
    Color.GREEN -> "Dope"
    Color.YELLOW -> "New"
}

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
}

// when 의 분기 조건에 여러 다른 객체 사용하기
// when 식의 인자로 아무 객체나 사용할 수 있다. when 은 이렇게 인자로 받은 객체가 각 분기 조건에 있는 객체와 같은지 테스트한다.
fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> "ORANGE"
    else -> throw Exception("Dirty Color")
}

// when 의 대상을 변수에 포획
/*
fun Request.getBody() = when(val response = executeRequest()) {
    is Success -> response.body
    is HttpError -> throw HttpException(response.status)
}
 */