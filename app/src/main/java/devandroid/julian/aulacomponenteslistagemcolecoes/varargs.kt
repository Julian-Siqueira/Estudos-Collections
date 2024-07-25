package devandroid.julian.aulacomponenteslistagemcolecoes

import java.util.Scanner

class Usuario1 {
    fun salvarTelefones( vararg telefones: String ){
        for ( telefone in telefones ){
            println("telefones: $telefone")
        }
    }
}

fun main() {

    val usuario = Usuario1()
    usuario.salvarTelefones(
        "(11) 995525-48754",
        "(11) 995525-48754",
        "(11) 995525-48754",
        "(11) 995525-48754",
        "(11) 995525-48754"
    )
}
