
fun sayHello(greeting:String,vararg itemsToGreet:String){
    itemsToGreet.forEach { itemToGreet->
        println("$greeting $itemToGreet")
    }
    }

fun returnNum(num: Int): Int{
    return num
}

fun greetPerson(greeting: String = "Hi", name:String = "Stian") = println("$greeting $name")

fun main() {
    //val person = Person("Stian","Johnsen")
    //println(person)
    println(returnNum(5))
    testingString("Hello World")

}



