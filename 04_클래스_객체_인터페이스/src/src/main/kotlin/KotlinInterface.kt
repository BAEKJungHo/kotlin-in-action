/**
 * 코틀린 인터페이스는 자바 8 인터페이스와 비슷하다.
 */

interface Clickable {
    fun click() // 일반 메서드
    fun showOff() = println("I'm clickable!") // 구현이 들어가있으면 디폴트 메서드
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button: Clickable, Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun execute() {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}