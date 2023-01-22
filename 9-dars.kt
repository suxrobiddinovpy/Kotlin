fun main() {
    // Shart operatori: WHEN
    /* 18 sonini so'zlarda ifodalash.
    val a = 18
    when (a) {
        1 -> println("1 - Bir")
        2 -> println("2 - Ikki")
        3 -> println("3 - Uch")
        4 -> println("4 - To'rt")
        5 -> println("5 - Besh")
        6 -> println("6 - Olti")
        7 -> println("7 - Yettti")
        8 -> println("8 - Sakkiz")
        9 -> println("9 - To'qqiz")
        10 -> println("10 - O'n")
        11 -> println("11 - O'n bir")
        12 -> println("12 - O'n ikki")
        13 -> println("13 - O'n uch")
        14 -> println("14 - O'n to'rt")
        15 -> println("15 - O'n besh")
        in 1..20 -> println("1 dan 20 gacha son")

    }
     */
/*  var a = "Ikki"
    var number = when (a) {
        "Bir" -> 1
        "Ikki" -> 2
        else -> 0
    }
    println(number)
 */
    // Masala
    // 1 dan 100 gacha bo'lgan sonlarni harf bilan ifodalash. (Bitta-bittalab emas!)
    var inputNumber = 99


    val readable1 = arrayOf(" ", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz")
    val readable2 = arrayOf("o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson")
    var i = inputNumber % 10
    var a = inputNumber / 10
    if (0 >= inputNumber || inputNumber >= 100) {
        println("0 dan katta va 100 dan kichik son kiriting")
    }
    else {
        println("Siz kiritgan son ${readable2[a-1]} ${readable1[i]}")
    }
}