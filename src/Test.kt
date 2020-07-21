fun main() {
    var a : Int = 100
    var b : Long = a.toLong()

    var c = arrayOf(1,2,3,4); //배열 array
    var nullArray = arrayOfNulls<Int>(5); //0으로 초기화하는 배열
    var d = listOf(1,1,2,3); //리스트 -> java ArrayList

    println(c[3])
    c[4] = 34

}