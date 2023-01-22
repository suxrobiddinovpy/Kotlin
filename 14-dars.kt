import java.util.*

fun main() {
    // 2, 3, 5, 7, 9, 11, 13, 15, 17, 19...

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    for (i in 2..n) {
        var soni = 0
        for (j in 1..i) {
            if (j % i == 0) {
                soni++
            }
        }
        if (soni == 2) {
            print("$i ")
        }
    }
}