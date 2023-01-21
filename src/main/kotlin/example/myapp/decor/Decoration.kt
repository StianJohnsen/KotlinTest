package example.myapp.decor

data class Decoration(val rocks: String, val wood: String, val diver: String) {

}

fun makeDecorations() {
    //val deco1 = Decoration("granite")
    //val deco2 = Decoration("slate")
    //val deco3 = Decoration("slate")

    val deco4 = Decoration("crystal","wood","diver")
    val (rocks,_,diver) = deco4


    //println("$deco1\n$deco2\n$deco3")
    //println(deco1 == deco2)
    //println(deco3 == deco2)

}

fun main() {
    makeDecorations()
}