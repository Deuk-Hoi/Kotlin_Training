package com.test.deuk

fun main() {
    var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)

    var c = Cat("냥이", 6)
    a.Introduce()
    b.Introduce()
    b.bark()

    c.Introduce()
    c.meow()
}

open class Animal(var name : String, var age : Int, var type : String) //상속을 해주는 부모 클래스는 class앞에 open을 붙혀준다. 코틀린은 기본적으로 상속이 금지 되어있다.
{
    fun Introduce()
    {
        println("저는 ${this.type} ${this.name}이고, ${this.age}살 입니다.")
    }
}

class Dog(name: String, age: Int):Animal(name, age, "개")
{
    fun bark(){
        println("멍멍")
    }
}

class Cat(name: String, age: Int):Animal(name, age, "고양이")
{
    fun meow(){
        println("야옹")
    }
}

//상속 규칙 => 슈퍼 클래스에 존재하는 속성과 같은 이름의 속성을 가질 수 없음
//           서브 클래스가 생성될 때는 반드시 부모클래스이 생성자를 호출 해야한다.
