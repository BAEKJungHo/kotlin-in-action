class StringTemplate {

    fun stringTemplate() {
        val name = "Kotlin"
        // 문자열과 혼합해서 사용하는 경우 $ 를 사용하여 변수의 값을 문자열과 같이 출력할 수 있다.
        println("Hello $name")
        println(name)

        // 한글을 문자열 템플릿에서 사용할 때 { } 를 꼭 붙이자. 한글이 아니더라도 중괄호를 쓰는 습관을 들이자.
        println("${name}님 반가워요")

        // unresolved reference
        // println("$name님 반가워요")
    }
}