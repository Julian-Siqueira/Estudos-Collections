package devandroid.julian.aulacomponenteslistagemcolecoes

class Mensagem(
    //variaveis do objeto ficam disponiveis na classe toda.
    val mensagem: String,
    val duracao: Int
) {

    companion object {

        const val DURACAO_CURTA = 0
        const val DURACAO_LONGA = 1

        //metodo criado passando 2 parametros e retornando um construtor
        fun construirTexto( mensagem: String, duracao: Int ) : Mensagem {
            return Mensagem( mensagem, duracao )
        }
    }

    fun exibir(){
        //acesso aos atributos da classe Mensagem
        println("M: ${this.mensagem} - ${this.duracao}")
    }

}

fun main() {

    Mensagem.construirTexto(
        "Olá",
        Mensagem.DURACAO_LONGA
    ).exibir()

}