/** 동반 객체에 이름 지정하기 */
enum class TravelLocation {
    ZEZU, HAWAII
}

class Hotel(
    private val name: String,
    private val address: String
) {

    companion object Location {
        fun of(type: TravelLocation): Hotel {
            return when (type) {
                TravelLocation.ZEZU -> Hotel("제주 신라 호텔", "제주시 ...")
                TravelLocation.HAWAII -> Hotel("하와이 신라 호텔", "하와이 ...")
            }
        }
    }
}

fun test() {
    Hotel.of(TravelLocation.ZEZU)
}

/** 인터페이스를 구현한 동반 객체 */
interface JSONFactory<T> {
    fun fromJSON(json: String): T
}

class Hotel2(
    private val name: String,
    private val address: String
) {
    companion object: JSONFactory<Hotel2> {
        override fun fromJSON(json: String): Hotel2 {
            TODO("Not yet implemented")
        }
    }
}

fun loadFromJSON<T>(factory: JSONFactory<T>) : T {

}

fun test2() {
    loadFromJSON(Hotel2)
}

/** 동반 객체 확장 */
class Hotel3(
    private val name: String,
    private val address: String
) {
    companion object {}
}

fun Hotel3.Companion.fromJSON(json: String): Hotel {

}

val p = Hotel3.fromJSON("JSON")