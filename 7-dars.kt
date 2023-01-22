 // Taqqoslash operatorlari: <, >, <=, >=, ==, !=.
 // Mantiq operatorlari: &&, ||, !.

 fun main() {
     // Taqqoslash operatorlari: <, >, <=, >=, ==, !=.
     var a = 10
     var b = 100

     val result0 = a < b
     val result1 = a > b
     val result2 = a >= b
     val result3 = a <= b
     val result4 = a != b
     if (result0==true)
         println("To'g'ri")
     else
         println("Xato")
     if (result1==true)
         println("To'g'ri")
     else
         println("Xato")
     if (result2==true)
         println("To'g'ri")
     else
         println("Xato")
     if (result3==true)
         println("To'g'ri")
     else
         println("Xato")
     if (result4==true)
         println("To'g'ri")
     else
         println("Xato")

    // Mantiq operatorlari: &&, ||, !.

     val g = 5
     val h = 3
     val c = 10
     val d = 4
     val e = 6
     val f = 11

     var result = g * h > c && d + e == f // false
     if (result==true)
         println("To'g'ri")
     else
         println("Xato")
     result = g * h > c && c < d || e > f
     if (result==true)
         println("To'g'ri")
     else
         println("Xato")
 }