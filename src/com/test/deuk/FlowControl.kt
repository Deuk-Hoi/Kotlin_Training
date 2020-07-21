package com.test.deuk

fun main() {
    for (i in 1..10)
    {
        if(i == 3)
            break
        println(i)
    }

    for(i in 1..10)
    {
        if(i == 3)
            continue
        println(i)
    }


    //Lable
    for(i in 1..10) {  //기존 내부 조건문이 맞으면 break가 되서 외부 반복문으로 넘어가서 반복을 다 수행한다.
        for (j in 1..10){
            if(i == 1 && j ==2)
                break
        }
    }
    Loop@for(i in 1..10)
    {
        for(j in 1..10)
        {
            if(i == 1 && j == 2)
                break@Loop //조건이 맞으면 레이블이 달린 반목문을 즉시 종료 시킨다. countinue도 마찬가지
        }

        print(i)
    }

    println(true && false)
    println(true || false)
    println(!true)
    println(!false)

    var a :Int = 6
    var b :Int = 4
    println(a > 5 && b > 5)


}