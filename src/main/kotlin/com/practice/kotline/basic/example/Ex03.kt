package com.practice.kotline.basic.example

class User(
    var name: String,
    var age: Int
)
fun main(){
    //kotlin에서는 가변 var, 불변 val을 엄격히 나누어서 사용을 하고 있기 때문에 java보다 오류 발생률이 적다.
    // mutable, immutable

    val userList = mutableListOf<User>()
    userList.add(User("1", 10))
    userList.add(User("2", 20))
    userList.add(User("3", 30))

    // java 에서처럼 add라는 메서드가 immutable로 지정 해 두었을 때 지원이 되지 않으므로 주의.
    // 데이터 베이스에서 꺼내온 리스트는 더 이상 변경이되면 안된다 원본에 대한 보장이 되어야 하기 때문에 반드시 불변으로 선언
    // default immutable 임
    val list = listOf<User>(
        User("4", 40)
    )

    for(element in userList){
        println(element)
    }

    // 인덱스 뽑아오는 방법
    userList.forEach { it -> println(it) }

    // kotlin에서는 함수형 인터페이스가 없더라도 이렇게 사용하는 것이 가능하다.
    userList.forEachIndexed { index, user ->
        println("index : $index user : $user")
    }

    userList.forEachIndexed(fun (index, user){
        println("index : $index user : $user")
    })

    for((index, element) in userList.withIndex()){
        println("index : $index user : $element")
    }
}

