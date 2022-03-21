class Collections {
}

fun createCollections() {
    val set = hashSetOf(1, 8, 53)
    val list = arrayListOf(1, 8, 53)
    var map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    // javaClass 는 자바의 getClass() 에 해당하는 코틀린 코드이다.
    println(set.javaClass) // class java.util.HashSet

    // 코틀린은 자신만의 컬렉션 기능을 제공하지 않는다.
    // 따라서, 자바 개발자가 기존 자바 컬렉션을 활용할 수 있다.
    // 따로 컬렉션을 제공하지 않는 이유는 자바와의 상호 작용성 때문이다. 코틀린에서 자바 함수를 호출할 때 자바와 코틀린 컬렉션을 서로 변환할 필요가 없다.
    // 여기서 코틀린의 철학을 엿볼 수 있다.
}