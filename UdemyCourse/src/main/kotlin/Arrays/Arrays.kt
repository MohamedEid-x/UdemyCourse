package Arrays


fun main() {

// Array that take any type
    val items1= arrayOf(1,3,4,"mohamed",'h',44.4f,44.4)
        items1.forEach { println(it) }
    println("************************************************")
    //Array that take a specific type
    val items2= intArrayOf(1,23,4,6,6,6)
    items2.forEach { println(it) }
    println("************************************************")

    val items3= doubleArrayOf(1.3,23.3,4.3,6.4,6.5,6.5)
    items3.forEach { println(it) }

}

