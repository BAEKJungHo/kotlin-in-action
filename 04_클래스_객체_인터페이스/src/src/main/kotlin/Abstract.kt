abstract class Animated { // 추상클래스는 인스턴스화 할 수 없다.
    abstract fun animate() // 추상 함수, 구현이 없다. 하위 클래스에서 반드시 오버라이드 해야 한다.
    open fun stopAnimating() {

    }
    fun animateTwice() {

    }
}