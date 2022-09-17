/**
 * Assim como if/else, when também é uma expressão e pode retornar valores.
 */

fun bonus(cargo: String): Float{
    var bonus = 0f
    if (cargo == "Gerente"){
        bonus = 2000f
    }else if (cargo == "Coordenador"){
        bonus = 1500f
    }else if (cargo == "Engenheiro de Software"){
        bonus = 1000f
    }else if (cargo == "Estagiario"){
        bonus = 500f
    }
    return bonus
}

fun bonusWhen(cargo: String): Float{
    return when(cargo){
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}

fun main() {
    bonusWhen("ushauhsuahsh")

    val n = false
    when(n){
        true -> println("1..10")
        false -> println("1..10")
    }
}