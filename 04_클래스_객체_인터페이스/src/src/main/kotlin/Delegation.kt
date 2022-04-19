/**
 * Kotlin 은 by 키워드를 사용하여 클래스를 위임할 수 있다.
 * 위임을 언어가 제공하는 일급 시민 기능으로 지원한다.
 * by 키워드를 통해 그 인터페이스에 대한 구현을 다른 객체에 위임 중이라는 사실을 명시할 수 있다.
 */

// Collection 내부의 메서드들에 대한 구현은 컴파일러가 알아서 해준다.
class DelegatingCollection<T>(
    innerList: Collection<T> = ArrayList()
): Collection<T> by innerList

// MutableCollection 의 구현을 innserSet 에게 위임한다.
// CountingSet 은 MutableCollection 를 프로퍼티로 가지고 있지만, MutableCollection 의 구현 방식에는 의존하지 않는다.
// 예를 들어, 내부 컨테이너가 addAll 을 처리할 때 루프를 돌면서 add 를 호출할 수도 있지만, 최적화를 위해 다른 방식을 택할 수도 있다.
class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet()
): MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}