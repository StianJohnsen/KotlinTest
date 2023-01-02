
fun sayHello(greeting:String,vararg itemsToGreet:String){
    itemsToGreet.forEach { itemToGreet->
        println("$greeting $itemToGreet")
    }
    }


fun greetPerson(greeting: String = "Hi", name:String = "Stian") = println("$greeting $name")

fun main() {
    val person = Person("Stian","Johnsen")
}



