package devandroid.julian.aulacomponenteslistagemcolecoes

//class normal compara a "caixa" que a variavel esta alocada.
//class Dados(val dado: Int){
//
//}
//data class compara os dados em si.
data class Dados(val dado: Int){

}

fun main() {

    val dado1 = Dados(1)
    val dado2 = Dados(1)
    println(dado1 == dado2)

    println(dado1)
    println(dado2)
}