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

__Effective Java. 상속을 위한 설계와 문서를 갖추거나, 그럴 수 없다면 상속을 금지하라__

코틀린은 위 철학을 따른다.

`취약한 기반 클래스(frgile base class)` 라는 문제는 하위 클래스가 기반 클래스에 대해 가졌던 가정이 기반 클래스를 변경함으로써 깨져버린 경우에 발생한다.

코틀린에서는 상속을 허용하려면 클래스 앞에 `open` 변경자를 붙여야 한다. 그와 더불어 오버라이드를 허용하고 싶은 메서드나 프로퍼티에 대해서도 `open` 을 붙여야 한다.

즉, `open` 변경자는 잘못된 상속으로 인해 취약한 기반 클래스가 되는 것을 막기 위해 만들어졌다고 볼 수 있다.
