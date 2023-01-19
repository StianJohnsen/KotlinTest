package example.myapp

abstract class AquariumFish {
   abstract val color: String
}

class Shark: AquariumFish(){
    override val color: String = "Gray"
}

class Plecostomus: AquariumFish(){
    override val color: String = "Gold"

}