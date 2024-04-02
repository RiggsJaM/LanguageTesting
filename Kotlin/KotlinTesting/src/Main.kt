fun main() {
    println("Hello World!")

    val name = "Mary"
    val age = 20

    println("$name is $age years old")

    var customers = 10

    customers = 8

    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3

    println(customers)

    val g: Int

    g = 3

    val h: String = "hello"

    println(g)
    println(h)

    val a: Int = 100
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    
}