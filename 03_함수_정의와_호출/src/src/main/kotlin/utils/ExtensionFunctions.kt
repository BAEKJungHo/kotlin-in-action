package utils

// 수신 객체 타입(receiver type): String > 함수가 확장할 클래스의 이름
// 수신 객체(receiver object): this > 인스턴스 객체
// this 는 생략 가능
fun String.lastChar(): Char = this.get(this.length - 1)

// 확장 함수를 사용하기 위해서는 똑같이 Import 를 해야 한다.
