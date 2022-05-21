import java.time.LocalDate

/** 날짜 범위 다루기 */
fun rangeToDate() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10) // now.rangeTo(now.plusDays(10))
    // rangeTo 는 Comparable 에 대한 확장함수이다. rangeTo 는 다른 산술 연산자보다 우선순위가 낮다. 하지만 혼동을 피하기 위해 괄호로 감싸주는게 좋다.
    // Ex. (0 .. (n + 1))
}

/** 날짜 범위에 대한 이터레이션 */
operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object: Iterator<LocalDate> { // 이 객체는 LocalDate 원소에 대한 Iterator 를 구현한다.
        var current = start

        override fun hasNext() =
            current <= endInclusive // compareTo 를 사용해 날짜를 비교한다.


        override fun next() = current.apply {  // 현재 날짜를 저장한 다음에 날짜를 변경한다. 그 후 저장해둔 날짜를 반환한다.
            current = plusDays(1) // 현재 날짜를 1일 뒤로 변경한다.
        }
    }

fun test() {
    val newYear = LocalDate.ofYearDay(2022, 5)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) {
        println(daysOff)
    }
}