package com.test.deuk

fun main() {
    var a = Person2("김득회", 1997)
    var b = Person2("홍길동", 1000)

    var c = Person2("아이린")
    var d = Person2("장원영")
    var e = Person2("솔라")
}

class Person2(var name : String, var birthday : Int)
{
    init {
        println("${this.birthday}년생 ${this.name}님이 생성되었습니다.");
    }
    //보조생성자 => 기본 생성자와 다른 형태의 생성자를 제공하여 인스턴스를 생성시 편의를 제공 추가적인 기능을 제공

    constructor(name: String):this(name, 1997)
    {
        println("보조 생성자가 호출 됨")
    }//보조 생성자를 만들 때는 기본생성자를 호출하여 속성을 초기화 해야한다.
}
