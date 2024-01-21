package com.practice.kotline.basic.example

import java.util.function.Predicate

fun main(){
    var numberList = listOf<Int>(1,2,3,4,5)

    /*val pred = object : Predicate<Int>{
        override fun test(t: Int): Boolean{
            return t %2 == 0
        }
    }*/

    val pred = Predicate<Int>{t -> t % 2 == 0}
    numberList.stream().filter(pred)

    //numberList.filter {it -> it % 2 == 0 }
    numberList.filter { it % 2 == 0 }

    val add = {x:Int, y:Int -> x+y}

    val _add = fun (x:Int, y:Int):Int{
        return x+y
    }

    println(_add(2,3))
    println(add(2,3))

    // 메소드를 넘기고 받는 형태가 kotlin에서는 조금 더 원활하고 직관적으로 전달이 가능하다.
    lambda(4,5, _add)
}

fun lambda(x: Int, y:Int, method: (Int, Int) -> Int){
    println(method(x,y))
}