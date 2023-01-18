fun main(){
    val sayHello = {num1 : Int, num2: Int, phrase: String -> "Number = ${num1+num2} and phrase = $phrase"}
    println(sayHello(10,10,"Hello World"))
}