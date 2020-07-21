package com.test.deuk

fun main() {
    var a = Tiger()
    a.eat();

    var cake = Cake()
    cake.bread()
    cake.smell()

    var rabbit = Rabbit()

    rabbit.Run()
    rabbit.eat()
}

open class Animal2
{
    open fun eat(){ // 하위 클래스에 override를 허용하려면 open을 해서 열어 줘야한다.
        println("음식을 먹습니다.")
    }
    //추상화 => 선언부만 있고 기능이 구현되지 않은 추상함수 추상함수를 포함하는 추상 클래스
}

class Tiger:Animal2()
{
    override fun eat(){ //상속받은 클래스는 상위 클래스의 함수와 같은 이름을 사용할 수 없지만 오버라이드를 하면 가능하다.
        println("고기를 먹습니다.")
    }
}

abstract class Food{
    abstract fun bread() //비어있는 껍데기라고 생각하면 됨 일부 함수가 구현되있지 않는 미완성 클래스 단독으로 인스턴스 만들지 못함
    fun smell(){
        println("향긋")
    }
}

class Cake : Food()
{
    override fun bread(){
        println("케이크 입니다.")
    }
}

interface Runner{
    fun Run() //interface에서 구현부가 없는 함수 => abstract 함수
}

interface Eater{
    fun eat(){ //interface에서 구현부가 있는 함수 => open 함수
        println("음식을 먹습니다.")
    }
}

class Rabbit: Runner, Eater //interface에서는 여러개 상속이 가능하다
{
    override fun Run() {
        println("깡총깡총 뜁니다.")
    }

    override fun eat() {
        println("깨작깨작 먹습니다.")
    }
}