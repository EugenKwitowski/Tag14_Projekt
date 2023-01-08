import kotlin.math.*
fun main(){
kleinsteZahl(123.45, 5.67)
}

fun kleinsteZahl(zahl1: Double, zahl2: Double){
    val gewünschteZahl = min(zahl1, zahl2)
    println(gewünschteZahl)
}