fun main() {
    println("Hello World!")

    // Cannot be changed
    val name = "Mary"
    val age = 20

    println("$name is $age years old")

    // Can be changed
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

    for (readOnlyShape in shapes) {
        println("That's a $readOnlyShape")
    }

    println("Enter an integer: ")
    var animal = readLine()!!;

    val result = when (animal.toInt()) {
        1 -> "Dog"
        2 -> "Cat"
        3 -> "Bird"
        4 -> "Lizard"
        5 -> "Hamster"
        else -> "Not an animal"
    }
    println(result)
}