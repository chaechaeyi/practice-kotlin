package com.practice.kotline.basic.ex01

/* primitive type, reference type 두 가지를 어떻게 표현하고 있는가? */
/*
class Ex01 {
}
*/

fun main(){
    /**
    var, val
    var = mutable(가변), val = final immutable (불변)
    java는 primitive type과 reference type을 구분 하고 있는데 kotlin은 모든 것이 reference type 이다.(kotlin에는 primitive type이 없다.)
    그래서 변수를 선언할 때는 불변이냐 가변이냐만 신경 써 주면 된다.
    */

    // 변수 선언

    // 변수 명 : 변수의 타입 = 초기화
    val name: String = "이채경"
    var _name: String = "이채경"
    var n = "이채경"

    val result = "내 이름은 : $name"
    println(result);
    println("내 이름은 :  $name")

    var i=10
    var _i:Int = 10

    var d: Double = 20.0
    var _d: Double

    var f:Float = 10f

    var b : Boolean = true
}
