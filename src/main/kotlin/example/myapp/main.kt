package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium(length = 10)
    val aquarium2 = Aquarium(width = 20)
    val aquarium3 = Aquarium(height = 30)
    //aquarium1.volume = 70
    println(
        "1st aquarium: \n${aquarium1.printSize()}\n\n" + "2nd aquarium: \n${aquarium2.printSize()}\n\n" + "3rd aquarium: \n${aquarium3.printSize()}"
    )
}


fun main() {
    buildAquarium()

}