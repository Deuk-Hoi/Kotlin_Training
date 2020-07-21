package com.test.deuk

fun main() {
    var A = Person("박보영", 1990);
    var B = Person("전정국", 1997);
    var C = Person("장원영", 2004);

    println("안녕하세요, ${A.birthday}년생 ${A.name} 입니다.")
    A.Introduce()
    B.Introduce()
    C.Introduce()

}
//class Person(var name : String, var birthday : Int)//클래스 내부에 기능 구현 할게 없으면 변수 처럼 선언 해도 된다. 속성을 선언하는 동시에 생성자를 선언하는 방법
class Person(var name : String, var birthday : Int)
{
    fun Introduce(){
        println("안녕하세요, $birthday 년생 $name 입니다.")
    }
}
//코틀린은 객체 지향 언어를 기반 으로 함수형 언어의 장점을 흡수한 언어이다.