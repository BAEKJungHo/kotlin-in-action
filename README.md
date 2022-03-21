# Kotlin In Action

- [Docs](https://kotlinlang.org/docs/home.html)
- [Slack](https://kotlinlang.slack.com)
  - https://kotlinslackin.herokuapp.com 에서 초대 받을 수 있음
- [Stack Overflow](https://stackoverflow.com/questions/tagged/kotlin)
- [Kotlin Reddit](https://www.reddit.com/r/Kotlin)
- [Facebook](www.facebook.com/groups/kotlinkr/)
- [Korea Slack](https://kotlinkr.slack.com/)
  - https://kotlinkr.herokuapp.com 에서 초대 받을 수 있음

## 코틀린의 철학

__코틀린은 간결하고 실용적이며, 자바 코드와의 상호 운용성(Interoperability) 을 중시한다.__

```kotlin
fun createCollections() {
    val set = hashSetOf(1, 8, 53)
    val list = arrayListOf(1, 8, 53)
    var map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    // javaClass 는 자바의 getClass() 에 해당하는 코틀린 코드이다.
    println(set.javaClass) // class java.util.HashSet

    /*
    코틀린은 자신만의 컬렉션 기능을 제공하지 않는다.
    따라서, 자바 개발자가 기존 자바 컬렉션을 활용할 수 있다.
    따로 컬렉션을 제공하지 않는 이유는 자바와의 상호 작용성 때문이다.
    코틀린에서 자바 함수를 호출할 때 자바와 코틀린 컬렉션을 서로 변환할 필요가 없다.
    여기서 코틀린의 철학을 엿볼 수 있다.
    */
}
```
