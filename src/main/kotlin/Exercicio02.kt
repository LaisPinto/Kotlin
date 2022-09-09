fun main() {
    conversaoAnos(2)
    
    val str = "Programação Kotlin."
    println("Tamanho: ${str.length} caracteres.")

    println("O calculo ao cubo é ${cubo(2, 5, 8)}")

    println("A converção é ${milhasEmKm(1f)}")
}

fun cubo (a: Int, b: Int, c: Int): Int{
    return (a * b * c)
}

fun milhasEmKm(milhas: Float): Float {
    return milhas * 1.6f
}

fun conversaoAnos(anos: Int) {
    println("$anos ano(s) equivale(m) a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segunds")
}