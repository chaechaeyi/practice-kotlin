package com.practice.kotline.basic.example

/*
nullPoint에 대한 안정성 테스트
java에서는 Optional.ofNullable 등을 통해서
null이라면 에러를 던진다거나 default 값을 던진다거나 등등의 로직을 짜야한다.
 */

fun main() {
    val a: Int = 0
    val b = 20 // << 타입추론
    val c: Int = 30
    val d: Int? = null // null일 수 있다. (? = 엘비스 연산자)

    //int d;
    val e = 100
    val f = 20
    val g: Int? = null
    callFunction(a)
    callFunction(b)
    callFunction(c)
    callFunction(d)
    // 널이 넘어 올 수 있다 명시를 해 주면 아무것도 인자값으로 보내지 않는 것도 가능하다.
    callFunction()
    // kotlin은 java와 100% 호환이 가능하기 때문에 optional 사용도 가능하다.
    // Optional.ofNullable(d).ifPresent{}

}


// null이 올 수 있다.
// 변수가 null 이라면 default를 100으로 값을 줄거야.
fun callFunction(i: Int? = 100) {
    // ? << null 이 올 수 있다.
    // 변수? << 변수가 null이야?
    // 변수?. << 변수가 null이 아닐 때
    // 변수?: << 변수가 null 일 때

    i?.let{
        println(it);
    }?: run{
        println("null 입니다.")
    }

    val temp = i?:"null 입니다."
    println(temp)

    // 변수가 null이 아니라면 변수에 20을 곱하고 null 이라면 다음과 같은 메시지를 보여지도록 해줘.
    val temp2 = i?.let{it * 20} ?: "null 입니다."
}


