/** groupBy: 리스트를 여러 그룹으로 이뤄진 맵으로 변경 */

val people3 = listOf(
    Person("A", 29),
    Person("B", 29),
    Person("C", 27),
    Person("D", 25),
    Person("E", 23)
)

val grouped = people3.groupBy { it.age } // age 를 키값으로 group by
// 29 끼리 묶이고, 27 끼리 묶이고 ...