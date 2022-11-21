package list

import Arrays.User

fun main() {
// list

    //readonly list
    val list = listOf(1,2,3,4,5,6)//Returns an empty read-only list. The returned list is serializable (JVM). (can't be modified )
    list.forEach { println(it) }


    val users= listOf(
        User("ahmed","mohamed"),
        User("ali","ahmed")
    )
    users.forEach { println(it) }
    println("=========================")
    val first=users.first() //Returns the first element.
    val last= users.last() //Returns the last element
    println("=========================")
  val name:String?=null
    val stuff= if(name== null) emptyList() else listOf(name)

println(stuff)
}
