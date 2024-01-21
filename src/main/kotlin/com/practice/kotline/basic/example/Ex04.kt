package com.practice.kotline.basic.example

fun main(){
    // java Object == Any
    var map = mapOf<String, Any>(
        // pair는 key value로 값을 가짐
        Pair("",""),
        "key" to "value"
    )

    val mutableMap = mutableMapOf(
        "key" to "value"
    )
    mutableMap["key"]= "value"
    val value = mutableMap["key"]

    // triple은 값을 세 가지르 가지게 된다.
    val hashMap = hashMapOf<String, Any>()

    var triple = Triple<String, String, String>(
        first="",
        second = "",
        third = ""
    )
}