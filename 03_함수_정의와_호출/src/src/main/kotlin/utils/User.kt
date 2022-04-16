package utils

//class User(val id: Int, val name: String, val address: String) {
//
//    fun User.validateBeforeSave() {
//        fun validate(value: String, fieldName: String) {
//            if (value.isEmpty()) {
//                throw IllegalArgumentException()
//            }
//        }
//        validate(name, "Name")
//        validate(address, "Address")
//    }
//
//    fun saveUser(user: User) {
//        user.validateBeforeSave()
//    }
//}

class User(val id: Int, private val name: String, private val address: String) {
    fun save(user: User) {
        validateBeforeSave(user)
        // do save
    }

    private fun validateBeforeSave(user: User) {
        checkNotNullParameter(user.name, "Name")
        checkNotNullParameter(user.address, "Address")
        // do something else
    }
}

// 다른 클래스에서도 공통으로 쓰일만한 함수는 유틸리티성으로 관리하는게 좋다
fun checkNotNullParameter(value: String, fieldName: String) {
    if (value.isEmpty()) throw IllegalArgumentException()
}