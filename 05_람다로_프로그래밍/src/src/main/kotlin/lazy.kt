/** lazy collection operation */

// map, filter 같은 컬렉션 함수는 결과를 즉시(early) 생성한다.
// 시퀀스(sequence) 를 사용하면 중간 임시 컬렉션을 사용하지 않고도 컬렉션 연산을 연쇄할 수 있다.
// 시퀀스 안에는 iterator 라는 단 하나의 메서드가 존재하며, 그 메서드를 통해 시퀀스로부터 원소 값을 얻을 수 있다.

val peoples = listOf(Person("Alice", 27), Person("Bob", 31))
fun useSequence() {
    peoples.asSequence()
        .map(Person::name)
        .filter { it?.startsWith("A") ?: it == null }
        .toList()
}