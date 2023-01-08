import kotlin.math.*

fun main() {
    seitenLänge(4.2, 6.5)
    seitenLänge(12.56, 3.56)
}

fun seitenLänge(a: Double, b: Double) {
    var seitenLängeA = a.pow(2)
    var seitenLängeB = b.pow(2)
    var sitenLängeChoch2 = seitenLängeA + seitenLängeB
    var seitenLängeC = sqrt(sitenLängeChoch2)
    println(seitenLängeC)
}