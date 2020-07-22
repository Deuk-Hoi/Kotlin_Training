package com.test.deuk

//고차함수 => 클래스에서 만들어낸 인스턴스 처럼 취급

fun main() {
    b(::a)

    var c : (String) ->Unit = { str -> println("$str 람다 함수") }
    var d = {str : String -> println("이렇게도 가능")}

    var e : (String) -> Unit = {str ->
        println("$str 람다 함수")
        println("hello")
        println("world")
    }

    var sum : (Int, Int) -> Int = {a, b ->
        println(a)
        println(b)
        a + b//마지막 구간이 return
    }

    var f : () -> Unit = {println("hello")}
    var g : (String) -> Unit = {println("$it")} //파라메터가 1개면 it을 사용
    println("sum : ${sum(1,2)}")

    b(c)
    g("hello")
}

fun a(str : String)
{
    println("$str 함수 a")
}

fun b(function : (String) -> Unit )
{
    function("b가 호출한")
}
