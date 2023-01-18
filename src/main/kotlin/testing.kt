import kotlin.random.Random
fun main(){
    var dirtyLevel = 19

    feedTheFish()
    println(divideByTwo(5.toDouble(),4.toDouble()))
    println(updateDirty(dirtyLevel){dirtyLevel -> dirtyLevel + 23})
    println(updateDirty(5,::functionDirty))
}

val returnDirty:(Int) -> Int = {num -> num/2}

fun functionDirty(num:Int) = num/2

fun feedTheFish(){
    val day = randomDay()
    println("The fish eats ${fishFood(day)} on $day")
}

fun randomDay():String{
    val listDays = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return listDays[Random.nextInt(0,7)]
}

fun fishFood(day:String):String{
    return when(day){
        "Monday" -> "Pizza"
        "Wednesday" -> "Beef"
        "Thursday" -> "Vegetables"
        "Friday" -> "Nachos"
        "Sunday" -> "Cracker"
        else -> "Salmon"
    }
}

val divideByTwo: (Double,Double) -> Double = {num:Double, num2:Double -> num/num2}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int{
    return operation(dirty)
}