// to 는 중위 호출(infix call) 이라는 특별한 방식으로 to 라는 메서드를 호출한 것이다.
val map = mapOf(1 to "one",  7 to "seven")

/*
1.to("one") // to 메서드를 일반적인 방식으로 호출
1 to one // to 메서드를 중위 호출 방식으로 호출
*/

/** infix 변경자를 사용하여 중위 호출을 사용하도록 할 수 있다. */
infix fun Any.to(other: Any) = Pair(this, other)

/** Destructuring Declaration */
// val (number, name) = 1 to "one"

/*
    for ((index, element) in collection.withIndex()) {
        println("$index: $element")
    }
*/