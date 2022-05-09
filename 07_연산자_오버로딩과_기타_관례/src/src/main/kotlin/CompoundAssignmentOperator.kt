/**
 * # 복합 대입 연산자
 * += 는 plus 와 plusAssign 양쪽으로 컴파일 할 수 있다.
 * a += b -> a = a.plus(b) or a.plusAssign(b)
 * 따라서, plus 와 plusAssign 연산을 동시에 정의하지 않아야 한다.
 *
 * 변경이 불가능한 경우라면 plus, 혹은 변경 가능한 클래스를 설계한다면(Ex. 빌더) plushAssign
 */
operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

fun use2() {
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0]) // 42
}