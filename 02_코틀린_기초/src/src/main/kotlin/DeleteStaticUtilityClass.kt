// 정적인 유틸리티 클래스 없애기 : 최상위 함수와 프로퍼티 111p
// ParameterHasName.kt 에 선언한 joinToString 을 최상위 함수로 선언할 수 있다.

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

// 컴파일러는 이 파일을 컴파일 할 때 새로운 클래스를 정의한다.
// 함수를 자바 등의 다른 JVM 언어로 호출하고 싶다면 코드가 어떻게 컴파일 되는지 알아야 한다.
/** 컴파일 결과 */
/*
public class JoinKt {
    public static String joinToString(...) { ... }
}
*/

/**
 * 최상위 함수로 선언한 경우, static 메서드 형식으로 컴파일이 된다.
 */

/** 파일에 대응하는 클래스의 이름 변경하기 */
// 코틀린 최상위 함수가 포함되는 클래스의 이름을 바꾸고 싶다면 파일에 @JvmName 어노테이션을 추가해야 한다.
// @JvmName 어노테이션은 파일의 맨 앞, 패키지 이름 선언 이전에 위치해야 한다.

/*
@file: JvmName("StringFunctions")

package strings

fun joinToString(...) : String { ... }
 */

// 자바에서 아래와 같이 호출 할 수 있다.

/*
import strings.StringFunctions;
StringFunctions.joinToString(...);
*/

/** 최상위 프로퍼티 */
// 어떤 데이터를 클래스 밖에 위치시켜야 하는 경우는 흔하지는 않지만, 그래도 가끔 유용할 때가 있다.
// 예를 들어 어떤 연산을 수행한 횟수를 지정하는 var 프로퍼티
// 이런 프로퍼티의 값은 정적 필드에 저장된다.

var opCount = 0

fun performOpertion() {
    opCount++
    // ...
}

fun reportOperationCount() {
    println("...")
}

// 최상위 프로퍼티를 활용해 코드에 상수를 추가하기
// val 은 getter, var 은 getter, setter 생성
val UNIX_LINE_SEPARATOR = "\n"

// 하지만 상수에 getter, setter 가 생긴다면 부자연스럽다.
// const 변경자를 추가해서 public static final 필드로 컴파일하게 만들 수 있다. (단, 원시 타입과 String 타입의 프로퍼티만 가능하다.)
const val UNIX_LINE_SEPARATOR_CONSTANAT = "\n"

/*
# 컴파일된 자바 코드
public static final String UNIX_LINE_SEPARATOR_CONSTANAT = "\n"
*/