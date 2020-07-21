package com.test.deuk

fun main() {
    //배열
    var arr1 = listOf("1","2","3") //수정 불가능
    var arr2 = mutableListOf("1","2","3") //수정 가능

    //반복문 향상된 반복문
    for(item in arr1)
    {
        println(item)
    }
    for((index,item) in arr1.withIndex())
    {
        println("$index , $item")
    }

    //캐스팅(형변환)  최상위 객체 Any  Auto casting 지원원
   var hello : Any = "hello"

    if(hello is String)
    {
        var str : String = hello
    }

}