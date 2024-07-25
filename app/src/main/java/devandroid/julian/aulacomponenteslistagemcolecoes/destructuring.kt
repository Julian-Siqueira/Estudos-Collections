package devandroid.julian.aulacomponenteslistagemcolecoes

data class Pergunta(val pergunta: String, val respostaCorreta: Int)

fun main() {
    val pergunta1 = Pergunta("Hoje ?", 1)
    val pergunta2 = Pergunta("Amanha ?", 2)

//    val p = pergunta1.pergunta
//    val r = pergunta1.respostaCorreta
//    println(p)
//    println(r)
    //Usando desestruturaçao para pegar dados da data class.
    val (pergunta, resposta) = pergunta1
    println(pergunta)
    println(resposta)


}