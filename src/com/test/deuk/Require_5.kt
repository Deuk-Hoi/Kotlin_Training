package com.test.deuk

fun main() {
    var a :Int = 7

    if(a > 10) {
        println("a는 10보다 크다")
    }else{
        println("a는 10보다 작다")
    }
    dowhen2(1)
    dowhen2("히히")
    dowhen2(11234L)
    dowhen2(55.153)
    dowhen2("Deuk")
}

fun dowhen(a : Any/*Any 어떤 자료형이든지 호환되는 코틀린의 최상위 자료형*/)
{
    when(a){
        1 -> println("a는 숫자입니다.")
        "히히" -> println("a는 문자입니다.")
        is Long ->println("a는 Long 타입 입니다.")
        !is String -> println("a는 String 타입이 아닙니다.")
        else -> println("어떤 조건에도 만족하지 않습니다.")
    }
}

fun dowhen2(a : Any/*Any 어떤 자료형이든지 호환되는 코틀린의 최상위 자료형*/)
{
    var result = when(a){
        1 -> "a는 숫자입니다."
        "히히" -> "a는 문자입니다."
        is Long ->"a는 Long 타입 입니다."
        !is String -> "a는 String 타입이 아닙니다."
        else -> "어떤 조건에도 만족하지 않습니다."
    }

    println(result)
}
