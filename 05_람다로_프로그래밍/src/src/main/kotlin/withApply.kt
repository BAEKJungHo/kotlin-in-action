
/** with and apply */

// with
// 어떤 객체의 이름을 반복하지 않고도 그 객체에 대해 다양한 연산을 수행할 수 있게 해준다.
// with 은 수신객체와 람다를 받는다.
// with(stringBuilder, { ... }) 처럼 쓸 수 있지만 가독성이 더 나빠진다.

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) { // 메서드를 호출하려는 수신 객체를 지정한다.
        for (letter in 'A'..'Z') {
            this.append(letter) // this 를 명시해서 앞에서 지정한 수신 객체의 메서드를 호출한다. this 를 생략할 수도 있다.
        }
        append("Now I know the alphabet!") // this 를 생략하고 메서드를 호출한다.
        this.toString() // 람다에서 값을 반환한다.
    }
}

// apply
// with 과 거의 유사하다. 유일한 차이란 apply 는 항상 자신에게 전달된 객체를 반환한다는 점 뿐이다.

fun alphabetUsingApply() = StringBuilder().apply {
    for (letter in 'A' .. 'Z') {
        append(letter)
    }
    append("I know the alphabet!")
}.toString()

// buildString = StringBuilder 객체를 만드는 일과 toString 을 호출해주는 일을 알아서 해주는 표준 라이브러리이다.
fun alphabetUsingBuildString() = buildString {
    for (letter in 'A' .. 'Z') {
        append(letter)
    }
    append("I know the alphabet!")
}