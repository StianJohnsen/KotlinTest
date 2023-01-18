package klassetime

fun fakultet(n:Int):Long{
    if(n==0){
        return 1
    }else{
        return n*fakultet(n-1)
    }
}


fun euler(n:Int): Double{
    var returnInt = 1.0
    for (i in 1..n ){
        returnInt += 1.0/ fakultet(i)
    }
    return returnInt
}

fun main(){
    println(fakultet(6))
    println(euler(10))
}