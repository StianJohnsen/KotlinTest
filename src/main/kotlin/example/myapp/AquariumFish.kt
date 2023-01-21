package example.myapp


object GoldColor : FishColor {
    override val color: String = "Gold"
}


class PrintingFishAction(val food: String) : FishAction {
    override fun action() {
        println(food)
    }
}

class Shark : FishColor, FishAction {

    override val color: String = "Gray"
    override fun action() {
        println("The shark is eating!")
    }


}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction by PrintingFishAction("eat algea"),
    FishColor by fishColor


interface FishColor {
    val color: String
}

interface FishAction {
    fun action()
}