package com.test.deuk

//scope 범위 => 패키지 내부, 클래스 내부, 함수 내부

//규칙 : 1. Scope 외부에서는 Scope 내부의 맴버를 참조 연산자로만 참조가 가능하다.
//      2. 동일 scope내에서느 맴버들을 공유 할 수 있다.
// 하위 스코프에서는 상위 스코프의 맴버를 재정의 할 수 있다. => 지역변수 전역변수

// 패키지 스코프에서 사용가능한 접근제한자 : public => 모든 패키지에서 접근이 가능
//                                   internal => 같은 모듈 내에서만 접근이 가능
//                                   private => 같은 파일 내에서만 접근이 가능

//클래스 스코프에서 사용가능한 접근제한자 : public => 모든 클래스에서 접근이 가능
//                                   private => 클래스 내부에서만 접근이 가능
//                                   protected = > 클래스 자신과 상속받은 클래스에서 접근 가능

var a = "패키지 스코프";

class B{
    fun print(){
        println(a)
    }
}

fun main() {
    var a = "함수 스코프"
    println(a)
    B().print()
}