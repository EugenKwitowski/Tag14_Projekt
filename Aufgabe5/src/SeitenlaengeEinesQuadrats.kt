import kotlin.math.*

fun main() {
    seitenLänge(64.0)
    seitenLänge(1089.0)
}

fun seitenLänge(zahl: Double) {
    var länge = sqrt(zahl)
    println(länge)
}