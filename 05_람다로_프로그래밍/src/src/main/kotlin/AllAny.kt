/** all, any, count, find: 컬렉션에 술어 적용 */

// 술어
val canBeInClub27 = { p: Person -> p.age <= 27 }

// 모든 원소가 이 술어를 만족하는지 검증
val people2 = listOf(Person("Alice", 27), Person("Bob", 31))
val validate = people2.all(canBeInClub27)

// 술어를 만족하는 원소가 하나라도 있는지 검증
val validate2 = people2.any(canBeInClub27)

// 술어를 만족하는 원소가 하나라도 있는지 검증
val validate3 = people2.find(canBeInClub27)