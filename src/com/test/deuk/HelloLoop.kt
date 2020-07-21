package com.test.deuk

fun main() {
    var a :Int = 0

    while (a < 5)
    {
        println(++a)
    }
    a = 0
    do {
        println(a++)
    }while (a < 5)


    for(i in 0..9 step 3)
    {
        println(i)
    }

    for(i in 9 downTo 0)
    {
        println(i)
    }

    for(i in 'a'..'e')
    {
        println(i)
    }
}