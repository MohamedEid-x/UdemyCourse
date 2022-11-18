fun main(args: Array<String>) {
val message:String="""
    hello 
    my name is mohamed.
    what about you?
""".trimIndent()
    println(message)
    print("----------------------------------------------------------------")
    val message2:String="""
        
    hello 
    my name is mohamed.
    what about you?
""".replaceIndent("*")
    println(message2)
    print("----------------------------------------------------------------")
    val message3:String="""
   >> hello 
   >> my name is mohamed.
    >>what about you?
""".trimMargin(">>")
    println(message3)



}