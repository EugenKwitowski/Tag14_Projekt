import kotlin.math.abs

fun main() {
    absoluterBetrag(-42)
    absoluterBetrag(20)
}

fun absoluterBetrag(zahl: Int) {
    val absoluteZahl = abs(zahl)
    println(absoluteZahl)
}