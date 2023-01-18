package example.myapp

open class Aquarium(var length: Int = 100, var width: Int = 40, var height: Int = 60) {
    open val shape = "rectangle"
    open var volume: Int get() = width * height * length / 1000
        set(value){
            height = (value * 1000) / (width*length)
        }
    open var water: Double = 0.0
        get() = volume * 0.9


    open fun printSize(): String {
        return "Width: $width cm \nLength: $length cm \nHeight: $height cm\nVolume is ${volume}L"
    }


}