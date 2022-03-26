/**
 * 확장 함수(Extension Function)
 * 확장 함수는 어떤 클래스의 멤버 메서드인 것처럼 호출할 수 있지만 그 클래스의 밖에 선언된 함수이다.
 * 확장 함수를 만들려면 추가하려는 함수 이름 앞에 그 함수가 확장할 클래스의 이름을 덧붙이기만 하면 된다.
 *
 * 클래스 이름을 수신 객체 타입(receiver type) 이라 부르며
 * 확장 함수가 호출되는 대상이 되는 값(객체)를 수신 객체(receiver object) 라고 부른다.
 *
 * 자바스크립트의 prototype 과 유사하다.
 */

// String 이 receiver type, get 내부에서 사용되는 객체가 receiver object
// 수신 객체 타입은 확장이 정의될 클래스의 타입이며, 수신 객체는 그 클래스에 속한 인스턴스 객체다.
fun String.lastChar(): Char = get(length - 1) // 수신 객체 멤버에 this 없이 접근할 수 있다.

/*
사용 예

// "Kotlin" 이 수신 객치(receiver object) 이다.
print("Kotlin".lastChar())
*/