open class RichButton: Clickable {
    fun disable() {} // 이 함수는 final 이라서 오버라이드할 수 없다.
    open fun animate() {} // 오버라이드 가능 메서드
    override fun click() { // 오버라이드한 메서드는 기본적으로 열려있다.
        TODO("Not yet implemented")
    }
}

// 오버라이드 금지
open class RichButton2: Clickable {
    final override fun click() { // final 을 붙여서 오버라이드 금지시킬 수 있다.
        TODO("Not yet implemented")
    }
}