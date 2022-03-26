class ParameterHasName {
}

// Default Parameters
fun <T> joinToString2(
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

fun use() {
    // 코틀린에서는 매개변수가 많을 때, 각 매개변수의 하는 역할을 메서드 시그니처를 보지 않더라도 알 수 있도록 해준다.
    // joinToString(collection, separator = " ", prefix = " ", postfix = ".")
}

// joinToString 에 @JvmOverloads 를 붙이면 다음과 같은 오버로딩한 함수가 만들어진다.
/** 자바
 * String joinToString(Collection<T> collection, String separator, String prefix, String postfix);
 * String joinToString(Collection<T> collection, String separator, String prefix);
 * String joinToString(Collection<T> collection, String separator);
 * String joinToString(Collection<T> collection,);
 */