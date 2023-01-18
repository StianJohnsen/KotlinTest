fun main(){
    println("What is your height? [M]")
    val height: String? = readlnOrNull()
    val heightDouble: Double = height!!.toDouble()

    println("What is your weight [KG]")
    val weight: String? = readlnOrNull()
    val weightDouble: Double = weight!!.toDouble()

    val bmi = weightDouble/(heightDouble*heightDouble)
    var result = ""

    when{
        bmi < 18.5 -> result = "undervekt"
        bmi in 18.5 .. 24.9 -> result = "normalvekt"
        bmi in 25.0.. 29.9 -> result = "overvekt"
        bmi > 30 -> result = "fedme"
    }
    println("Your bmi is $bmi which means your $result")
}