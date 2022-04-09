import java.io.BufferedReader
import java.io.InputStreamReader

// 코틀린의 try 키워드는 if 나 when 처럼 식(Expression) 이다. 따라서 try 의 값을 변수에 대입할 수 있다.
// 다른 최신 JVM 언어와 마찬가지로 코틀린도 Checked Exception 과 UnChecked Exception 를 구별하지 않는다.
// 코틀린에서는 함수가 던지는 예외를 지정하지 않고 발생한 예외를 잡아내도 되고, 잡아내지 않아도 된다.
fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
}

// catch 에서 값 반환하기
fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null // 예외가 발생하면 null 값을 사용한다.
    }

    println(number)
}

// Result 와 runCatching
// Result 는 동작이 성공하든 실패하든 동작의 결과를 캡슐화해서 나중에 처리될 수 있도록 하는 것이 목적이다

// NumberFormatException 발생 가능성이 있는 함수
fun read(reader: BufferedReader): Int {
//    return reader.readLine().toInt()
    throw NumberFormatException()
}

fun exceptionHandling() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    runCatching {
        read(reader)
    }.onSuccess {
        println("do Something")
    }.onFailure {
        e -> e.printStackTrace()
    }.also {
        println("do finally here")
    }
}