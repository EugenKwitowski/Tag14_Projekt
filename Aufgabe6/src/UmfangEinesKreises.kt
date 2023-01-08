import kotlin.math.PI

fun main() {
    umfang(5.5)
}

fun umfang(radius: Double) {
    val piMalZwei: Double = PI * 2
    var wunschZahl = radius * piMalZwei
    println(wunschZahl)
}