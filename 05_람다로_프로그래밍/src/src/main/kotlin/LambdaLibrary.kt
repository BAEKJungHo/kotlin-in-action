import java.awt.Button

data class Person(
    val age: Int
)


val people = listOf(Person(10), Person(20))

fun test() {
    // 람다 호출 비용은 아무 부가 비용이 들지 않는다. 프로그램의 기본 구성 요소와 비슷한 성능을 낸다.
    people.maxByOrNull { it.age }
}

// 현재 영역에 있는 변수에 접근
fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

// 람다 안에서 바깥 함수의 로컬 변수 변경하기
/**
 * 코틀린에서는 자바와 달리 람다에서 람다 밖 함수에 있는 파이널이 아닌 변수에 접근할 수 있고, 그 변수를 변경할 수도 있다.
 */
fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    val serverErrors = 0
    responses.forEach {
        clientErrors++
//        serverErrors++  // val 은 변경 불가능
    }
}

// 람다를 이벤트 핸들러나 다른 비동기적으로 실행되는 코드로 활용하는 경우
// 함수 호출이 끝난 다음에 로컬 변수가 변경될 수도 있다.
fun tryAsycnWithLambda(button: Button): Int {
    var clicks = 0
    button.addActionListener { clicks++ }
    return clicks
}