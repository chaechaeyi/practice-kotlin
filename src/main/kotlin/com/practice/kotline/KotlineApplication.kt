package com.practice.kotline

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/*
* java : 클래스 명과 파일명이 일치해야함
* kotlin : 클래스 명이 따로 명시 되어 있지 않아도 됨
* */

@SpringBootApplication
class KotlineApplication

fun main(args: Array<String>) {
    runApplication<KotlineApplication>(*args)
}
