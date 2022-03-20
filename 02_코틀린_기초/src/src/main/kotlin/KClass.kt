/** 클래스의 목적은 데이터를 캡슐화하고, 데이터를 다루는 코드를 한 주체 아래 가두는 것이다. */
/** 자바에서는 필드 + 접근자를 프로퍼티(Property) 라고 부른다. */

/*
// Java
public class KClass {
    private final String name;
    // getter
}
            =
class KClass(val name: String)


public class KClass {
    private String name;
    // getter, setter
}
            =
class KClass(Var name: String)
 */


// Kotlin
class KClass(
    val name: String, // 읽기 전용 프로퍼티, 코틀린은 (비공개) 필드와 필드를 읽는 단순한 (공개) 게터를 만들어낸다.
    var isMarried: Boolean // 쓸 수 있는 프로퍼티로, 코틀린은 (비공개) 필드, (공개) 게터, (공개) 세터를 만들어낸다.
)

class UsingClass {
    fun use() {
        val person = KClass("Dope", false)
        person.isMarried = true // Java 에서 setter 를 통해서 값을 변경하는것과 동일하다
        // 자바에서 isMarried 랑 setMarried 메서드를 제공한다면, 그에 상응하는 코틀린 프로퍼티 이름은 isMarried 이다.

        /**
         * 뒷받침하는 필드(backing field)
         *
         * 대부분의 프로퍼티에는 그 프로퍼티의 값을 저장하기 위한 필드가 있다. 이를 backing field 라고 한다.
         */
    }
}