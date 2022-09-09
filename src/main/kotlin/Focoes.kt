/**
 * Funções, também chamadas de métodos, são trechos específicos de códigos que podem ser
 * chamados diversas vezes. Geralmente possuem uma responsabilidade específica.
 *
 * Funções podem ou não ter retorno.
 * Funções podem ou não ter parâmetros.
 *
 * Funções que não possuem retorno podem ser explicitamente marcadas com retorno Unit.
 * Isso significa que a função ainda não retorna nada, porém pode facilitar para leitura.
 */

fun main() {
    //helloWorld()

    println("A soma de 10 e 5 é ${sum(10, 5)}")
}

/*fun helloWorld(){
    println("Hollo, world!")
}*/

fun sum (a: Int, b: Int): Int{
    return (a + b)
}