class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : empty $fieldName")
        }
    }

    // 로컬 함수를 홏ㄹ해서 각 필드를 검증한다.
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // user 를 데이터베이스에 저장한다.
}

/**
 * 로컬 함수는 자신이 속한 바깥 함수의 모든 파라미터와 변수를 사용하 룻 있다.
 */

// 개선한 버전
fun saveUser2(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : empty $fieldName")
        }
    }

    // 로컬 함수에서 바깥 함수의 파라미터 접근하기
    validate(user.name, "Name")
    validate(user.address, "Address")

    // user 를 데이터베이스에 저장한다.
}

// 검증 로직을 확장 함수로 호출하기
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            // User 의 프로퍼티를 직접 사용할 수 있다.
            throw IllegalArgumentException("Can't save user ${id} : empty $fieldName")
        }
    }

    // 로컬 함수에서 바깥 함수의 파라미터 접근하기
    validate(name, "Name")
    validate(address, "Address")

    // user 를 데이터베이스에 저장한다.
}

fun saveUser3(user: User) {
    user.validateBeforeSave()
    // user 를 데이터베이스에 저장한다.
}

