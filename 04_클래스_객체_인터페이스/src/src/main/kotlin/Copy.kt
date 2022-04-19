/**
 * 데이터 클래스 객체를 키로 하는 값을 컨테이너에 담은 다음에 키로 쓰인 데이터 객체의 프로퍼티를 변경하면
 * 컨테이너 상태가 잘못 될 수 있다. 게다가 불변 객체를 사용하면 프로그램에 대해 훨씬 쉽게 추론할 수있다.
 * 특히 멀티 스레드 프로그래밍에서는 불변 객체를 사용한다면 스레드가 사용 중인 데이터를 다른 스레드가 변경할 수 없으므로
 * 스레드를 동기화 해야할 필요성이 없어진다.
 *
 * 객체를 메모리상에서 직접 바꾸는 대신 복사본을 만드는 편이 낫다.
 * 코틀린은 copy() 를 통해서 객체를 복사할 수 있다.
 * 복사된 객체의 생명 주기는 원본과 다르다.
 */