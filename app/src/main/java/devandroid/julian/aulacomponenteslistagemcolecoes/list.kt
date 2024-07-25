package devandroid.julian.aulacomponenteslistagemcolecoes

data class Cliente(
    val nome: String,
    val idade: Int
)

fun main() {

    //val cliente1 = Cliente("Julian", 35)
    //val cliente2 = Cliente("Marcos", 22)

    val lista = mutableListOf("marcelo", "ana", "maria", "pedro")
    /*val listaClientes = mutableListOf(
        Cliente("Julian", 35),
        Cliente("Ana", 22)
    )*/

    /*listaArray[0] = "Julian 777"

    val novaLista = listOf("marcos", "fernanda")
    listaArray.addAll( novaLista )
    listaArray.add("márcia")
    //listaArray.remove("ana")
    listaArray.removeAt(1)*/
    //listaClientes.clear()
    //listaClientes.size
    //println( lista[1] )
    val novaLista = lista.shuffled()
    novaLista.forEach { nome ->
        println( nome )
        //println("${cliente.nome} - ${cliente.idade}")
    }

}