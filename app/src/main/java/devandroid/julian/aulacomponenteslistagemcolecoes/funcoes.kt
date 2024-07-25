package devandroid.julian.aulacomponenteslistagemcolecoes

class Matematica {

    fun somar(n1: Int, n2: Int): Int{

        return n1 + n2
    }



}

fun soma(n1: Int, n2: Int): Int{

    return n1 + n2
}

fun calcular(funcao: (Int, Int) -> Int) {
    val retorno = funcao(15,10)

    println(retorno)

}

class Botao{

    fun executarBotao(funcao:(String)-> Unit){
        funcao("Flamengo")
    }


}

fun main(){
//    val matematica = Matematica()
//    val retorno = matematica.soma(n1 = 20, n2 = 30)
//    println("Retorno: $retorno")

//    calcular(matematica::somar)

    val funcaoLambda = { nome: String -> String
        "Nome: $nome"

    }

    val botao = Botao()
    botao.executarBotao {
//        funcaoLambda("Siqueira")
//        println("Lambda Executada")

        println("Nome: ${it.uppercase()}") //it é um nome padrao para parametros que nao foram nomeados.
    }

//    funcaoLambda("Julian")
}