/**
 * Funções que contém uma única instrução podem ser escritas em uma única linha.
 * Funções de única linha não precisam da palavra reservada 'return'.
 */
fun main() {
    helloWorld()
   println(div(10f, 3.5f))
}

fun suma (a: Int, b: Int): Int{
    return (a + b)
}

fun sum2 (a: Int, b: Int) = (a + b)

fun helloWorld() = println("Hollo, world!")

fun div(a: Float, b: Float) = a / b