package devandroid.julian.aulacomponenteslistagemcolecoes

/*data class Produto(
    val nome: String
)*/

fun main() {

    // 0 -> "jamilton" 1 -> "ana"
    //val listaItens = listOf("jamilton", "ana")
    //val lista = mapOf(102545 to "Notebook", 105632 to "Iphone")
    val lista = mutableMapOf("nome" to "Julian", "cidade" to "Barra mansa")
    println( lista["nome"] )
    println( lista.size )
    //lista.put("idade", 20)
    lista["idade"] = "30"
    lista.remove("nome")
    lista.forEach { pessoa ->
        println( " ${pessoa.key} - ${pessoa.value} " )
    }

}