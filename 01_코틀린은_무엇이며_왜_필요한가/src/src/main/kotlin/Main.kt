/** Data class */
data class Person(
    val name: String,
    val age: Int? = null // null 이 될 수 있는 Int? 와 디폴트 값 null
)

/** 최상위 함수 */
fun main(args: Array<String>) {
    // 이름 붙은 파라미터
    val persons = listOf(Person("JungHo"), Person("Dope", age = 29))

    // 람다식과 엘비스 연산자
    // it 이라는 이름을 쓰면 별도의 파라미터 이름을 정의하지 않아도 된다.
    val oldest = persons.maxByOrNull { it.age?: 0 }

    println("Oldest : $oldest") // 문자열 템플릿
    // 결과 : Oldest : Person(name=Dope, age=29) -> toString() 자동 생성

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}