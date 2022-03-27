import java.io.Serializable

/**
 * 내부 클래스와 중첩된 클래스
 *
 * 클래스 안에 다른 클래스를 선언하면 도우미 클래스를 캡슐화 하거나, 코드 정의를 그 코드를 사용하는 곳에 가까이에 두고 싶을 때
 * 유용하다.
 *
 * 자바와의 차이는 코틀린의 중첩 클래스는 명시적으로 요청하지 않는 한 바깥쪽 클래스 인스턴스에 대한 접근 권한이 없다.
 */

interface State: Serializable
interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

/* 자바 */
/*
public class Button implements View {
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }
    @Override
    public void restoreState(State state) {}

    public class ButtonState implements State {

    }
}
*/

/**
 * 위 코드는 NotSerializableException 에러가 발생한다.
 * 자바에서 다른 클래스 안에 정의한 클래스는 자동으로 내부 클래스(inner class)가 된다. 따라서, Button Class 에 대한 참조를
 * 묵시적으로 포함한다.
 *
 * 이러한 참조를 제거하기 위해서는 내부 클래스를 static 으로 선언하면 된다. 그러면 그 클래스를 둘러싼 바깥쪽 클래스에 대한
 * 묵시적인 참조가 사라진다.
 *
 * 이러한 방식이 코틀린에서 중첩 클래스가 기본적으로 동작하는 방식이다.
 *
 * 클래스 B 안에 정의된 A 클래스                                자바에서는         코틀린에서는
 * 중첩 클래스(바깥쪽 클래스에 대한 참조를 저장하지 않음)       static class A      class A
 * 내부 클래스(바깥쪽 클래스에 대한 참조를 저장함)              class A             inner class A
 */
class Buttons: View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    // 자바의 static nested class 와 대응한다.
    // 코틀린에서 중첩 클래스에 아무런 변경자가 붙지 않으면 자바 static 중첩 클래스와 같다.
    // 이를 내부 클래스로 변경해서 바깥쪽 클래스에 대한 참조를 포함하게 만들고 싶다면 inner 변경자를 붙여야한다.
    class ButtonState: State {
        // 생략
    }
}

class Outer {
    inner class Inner {
        // this@Outer 로 바깥쪽 클래스 Outer 의 참조에 접근
        fun getOuterReference(): Outer = this@Outer
    }
}