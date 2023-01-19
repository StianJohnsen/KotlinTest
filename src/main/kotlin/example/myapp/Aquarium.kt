package example.myapp

import kotlin.math.PI

open class Aquarium(open var length: Int = 100, open var width: Int = 40, open var height: Int = 60) {
    open val shape = "rectangle"
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open var water: Double = 0.0
        get() = volume * 0.9


    open fun printSize(): String {
        return "Shape: $shape\nWidth: $width cm \nLength: $length cm \nHeight: $height cm\nVolume is ${volume}L"
    }


}

class TowerTank(override var height: Int, var diameter: Int) :
    Aquarium(length = diameter, width = diameter, height = height) {
    override var volume: Int
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }
    override var water = volume * 0.8
    override var shape = "Cylinder"


}