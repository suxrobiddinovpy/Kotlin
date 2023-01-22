fun main() {
    // continue, break

    // continue
    for (i in 0 until 10) {
        if (i % 2 == 0)
            continue
        println(i)
    }
    println()
    // break
    for (i in 0 until 10) {
        if (i == 5)
            break
        println(i)
    }
}