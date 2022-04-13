@file:JvmName("StringFunctions") // 클래스 이름을 지정
package utils

/** 최상위 함수 */
/** 자바에서는 파일명.메서드명으로 호출 Ex. CollectionUtils.joinToString */

/**
 * @JvmOverloads -> 파라미터 개수가 1개인 것 부터 4개인 것 까지 오버로딩한 함수가 만들어진다.
 */
@JvmOverloads
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    // this 는 T 타입의 수신객체
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/**
 * 최상위 프로퍼티
 *
 */
var operationCount = 0