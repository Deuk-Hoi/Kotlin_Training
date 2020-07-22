package com.test.deuk
//스코프 함수 => 인스턴스의 속성이나 함수를 좀 더 깔끔하게 불러올 수 있다.
//apply, run, with, also, let

//apply => 인스턴스를 생성한 후 변수에 담기전에 초기화과정을 수행할 때 사용

fun main() {
    var a = Book("김득회 자서전", 50000).apply {
        name = "[초특가]" + name
        discount()
    } //apply의 scope안에서 직접 인스턴스의 속성과 함수를 참조연산자 없이 사용가능  apply는 인스턴스 자신을 다시 반환한다.
    a.run { println("상품명 : ${name}, 가격 : ${price}원") } //이미 만들어진 인스턴스의 함수와 속성을 스코프 내에서 사용할 때 유용
    //run는 apply처럼 참조연산자를 사용하지 않아도되며 람다함수 처럼 인스턴스 대신 결과값을 반환한다.

    //with => run과 비슷한 기능을 가지지만 단지 인스턴스를 참조연산자대신 패러미터로 받는다.
    with(a){println("상품명 = ${a.name}, 가격 = ${a.price}원")}

    // also / apply => 처리가 끝나면 인스턴스를 반환
    //run / let => 처리가 끝나면 최종값을 반환
    //차이점 apply와 let은 it을 사용하여 구별한다  => 외부에도 같은 이름을 가진변수가 존재할 때 밖에 있는것이 영향을 준다. it으로 구별해준다.
}

class Book(var name : String, var price : Int)
{
    fun discount(){
        price -= 2000
    }
}