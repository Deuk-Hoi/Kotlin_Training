package com.test.deuk

fun main() {
    // 1. class 자동차(시동, 운전), 사람(밥먹는다, 물마신다, 걷는다), 동물(뛴다), 식물(자란다)
    // 2. data class - set,get 데이터만 저장하고 불러오기 편하도록 해준다.
    // 3. 호출
    var hello = HelloClass()
    var hello2 = HelloClass(2)
    var human = Human(24, "Deuk")
    println(human.name)

    // 컬랙션 심화 (배열)
}
class HelloClass{

    var age : Int = 0
    init{
        //어떠한 값을 초기화 하고 싶을 때 사용하는 것
    }

    constructor() // 생성자 클래스를 호출 할 때 초기화 (기본생성자)
    constructor(age : Int){ // 매개변수로 받은 age로 클래스 안의 age를 초기화 한다. set 과정
        this.age =  age
    } //보조 생성자
    // 기본 생성자 => 값을 넘기지는 못하지만 초기화 가능
    // 보조 생성자 => 값을 넘기면서 초기화 가능
}

data class Human(val age : Int, var name : String) //최우선 생성자에는 var val로 생성해야한다.
//data class는 set, get 과정을 편하게 해준다.
