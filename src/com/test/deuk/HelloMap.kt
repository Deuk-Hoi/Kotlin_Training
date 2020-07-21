package com.test.deuk

fun main() {
    //map - key, value JSON {"name","deuk"}
    var map1 = mapOf(Pair("name","deuk")) //수정가능
    var map2 = mutableMapOf<String, String>() //type 수정 불가능
    map2.put("name","Hoi")
    map2.put("age", "24")

    println(map2.keys)
    for(item in map1)
    {
        println(item.key)
    }


}