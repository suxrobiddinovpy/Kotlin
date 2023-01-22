import java.util.Scanner

fun main() {
    // Takrorlash operatori (sikl): for

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    for (i in 0..n) {
        for (j in 0..i) {
            print("*")
        }
        println()
    }
}