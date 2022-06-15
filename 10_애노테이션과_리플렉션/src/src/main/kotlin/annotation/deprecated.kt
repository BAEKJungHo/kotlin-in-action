package annotation

/**
 * remove 함수 선언이 있다면, remove 를 호출하는 코드에 대해 경고 메시지를 표시해줄 뿐 아니라, 자동으로 그 코드를
 * 새로운 API 버전에 맞는 코드로 바꿔주는 퀵 픽스(quick fix)도 제시해 준다.
 */
@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {}