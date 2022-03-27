/**
 * 코틀린은 주 생성자(primary constructor)와 부 생성자(secondary constructor)를 구분한다.
 * 또한, 코틀린은 초기화 블록을 통해 초기화 로직을 추가할 수 있다.
 *
 * 모든 생성자 파라미터에 디폴트 값을 지정하면 컴파일러가 자동으로 파라미터가 없는 생성자를 만들어준다.
 * 그렇게 자동으로 만들어진 파라미터 없는 생성자는 디폴트 값을 사용해 클래스를 초기화 한다.
 * DI 프레임워크 등 자바 라이브러리 중에는 파라미터가 없는 생성자를 통해 객체를 생성해야만 라이브러리 사용이 가능한 경우가 있다.
 * 코틀린이 제공하는 파라미터 없는 생성자는 그런 라이브러리와의 통합을 쉽게 해준다.
 */

// 명시적 선언
// _(언더바) 는 생성자 파라미터와, 일반 파라미터를 구분하기 위함
// init (초기화 블록)은 주 생성자와 함께 사용된다.
// constructor 는 주 생성자나, 부 생성자를 정의 할 때 사용한다.
class User constructor(_nickname: String) {
    val nickname: String
    init {
        nickname = _nickname
    }
}

// 간단하게 변경
// val 은 이 파라미터에 상응하는 프로퍼티가 생성된다는 뜻이다.
class User2(val nickname: String)

// 디폴트 값 제공
class User3(val nickname: String, val isSubscribed: Boolean = true)

// 인자가 없는 디폴트 생성자 생성
open class Label

// 상위 클래스를 상속한 하위 클래스는 상위 클래스의 생성자를 호출해야 한다.
class BlueLable: Label()

// 주 생성자에 private 붙이기
// 이 클래스의 (유일한) 주 생성자는 비공개이다. 따라서 인스턴스화 할 수 없다.
class Secretive private constructor()

/**
 * 부 생성자
 *
 * 부 생성자가 필요한 주된 이유는 자바 상호운용성이다. 하지만 다른 이유도 있다.
 * 클래스 인스턴스를 생성할 때 파라미터 목록이 다른 생성 방법이 여럿 존재하는 경우에는 부 생성자를 어럿 둘 수 밖에 없다.
 */

/*
class MyButton: View {
    constructor(ctx: Context): this(ctx, MY_STYLE) { // 이 클래스의 다른 생성자에게 위임한다.
        // ...
    }

    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr) {

    }
}
*/