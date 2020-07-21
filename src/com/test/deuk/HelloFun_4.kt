package com.test.deuk

fun main() {
    print(add(5,6,7))
}

fun add2(a : Int, b :Int, c :Int):Int= a + b + c // 단일 표현식 함수, 반환형 생략 가능
//=> 코틀린에서 함수는 내부적으로 기능을 가진 형태이지만, 외부에서 볼 때는 파라미터를 넣는다는 점 외애는
// 자료형이 결정된 변수 개념으로 접근을 해야한다 => 함수형 언어라는 특징을 이해하기 쉬울 것이다.

fun add(a: Int, b:Int, c : Int):Int{
    return a + b + c
}