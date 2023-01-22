fun main() {
    // String functions:
    // length, trim, trimStart, trimEnd, toUpperCase, capitelize
    // toLowerCase, replace, substring, contains, hashcode, compareTo.

    var str = "salom dunyo!"

    println(str.length)

    println(str.trimStart())
    println(str.trimEnd())
    println(str.trim())

    println(str.toUpperCase())
    println(str.toLowerCase())
    println(str.capitalize())

    println(str.replace('o', 'a'))
    println(str.replace("salom", "xayr"))

    println(str.substring(1..8))

    println(str.contains("sa"))

    var belgi = 'w'
    println(belgi.hashCode())

    // ga solishtirish. Masalan "salom dunyo"da 's'ni olsak "alom dunyo" bo'ladi. Va 's' ya'ni 0-index ketadi va 10-indexgacha qoladi. Bu pastdagi kodda yozilgan.
    println(str.compareTo("s"))
}