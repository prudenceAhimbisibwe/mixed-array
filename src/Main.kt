fun main(){
    var x =sumOfAllNumerics(arrayOf(5,8,9,6.5F,"prudence",20,30,5.9))
    println(x)

}

fun sumOfAllNumerics(numbers:Array<Any>):Number {
    var sum = 0.0
    numbers.forEach { number ->
        if (number is Int || number is Float) {
            sum += number.toString().toDouble()
        }
    }
            return sum
        }
















































