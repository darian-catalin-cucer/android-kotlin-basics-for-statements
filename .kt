// Examples of FOR statements in Kotlin
fun main() {
    // Simple FOR loop
    for (i in 1..5) {
        println(i)
    }

    // FOR loop with an index
    val names = arrayOf("John", "Mary", "Tom")
    for (index in names.indices) {
        println("$index: ${names[index]}")
    }

    // FOR loop with a step
    for (i in 0..10 step 2) {
        println(i)
    }
}
