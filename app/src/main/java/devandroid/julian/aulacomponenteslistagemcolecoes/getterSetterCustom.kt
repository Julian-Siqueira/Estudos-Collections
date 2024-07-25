package devandroid.julian.aulacomponenteslistagemcolecoes

//Getter (conseguir, recuperar) e Setter (Configurar)
class Usuario(){

    var nome: String = ""
        get() {
            return field.uppercase()//Campo
        }
        set(value) {
            field = "set: $value"
        }

    var idade: Int = 0
    val maiorIdade
        get() = idade >= 18
}

fun main() {

    val usuario = Usuario()
    usuario.nome = "Pedro"
    usuario.idade = 15

    println("nome: ${usuario.nome} idade: ${usuario.idade} maiorIdade: ${usuario.maiorIdade}")
}