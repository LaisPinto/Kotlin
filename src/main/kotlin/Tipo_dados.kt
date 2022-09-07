fun main() {

    var c: Char = 'a'
    var s: String = "sgaysgyagsyasgyagysg"
    var b: Boolean = true

    var double: Double = 10.0
    var float: Float = 10f
    var log: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    // Possível declarar uma variável sem tipo, desde que seja incializada.
    // Tipo de dado é definido através da inferência.
    var idade = 18

    // Isso não pode ser feito, a variável não sabe nem o valor, nem o tipo
    // var idade2

    // Variável declarada, mas não inicializada
    var idade3: Int



    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
}
/**
 * -- Anotações --
 * O tamanho Boolean pode ser representado somente com 1 bit, true ou false
 * Porém o tamanho é depende da JVM e a especificaçacão não deixa claro
 *
 * String
 * O tamanho de uma String depende de seu conteúdo.
 *
 * Char
 * O tamanho de um char, assim como Boolean, também é variável e dependente da JVM
 */