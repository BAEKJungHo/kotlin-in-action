/**
 * val : immutable -> 자바의 final 변수
 * 기본적으로 val 로 선언하고 꼭 필요할 때만 var 로 바꾸는 것이 좋다.
 * 변경 불가능한 참조와 변경 불가능한 객체를 부수 효과가 없는 함수와 조합해 사용하면 코드가 함수형 코드에 가까워진다.
 *
 * var : mutable
 */

class Variable(
    val age: Int,
    val phone: String,
    var address: String
) {

}