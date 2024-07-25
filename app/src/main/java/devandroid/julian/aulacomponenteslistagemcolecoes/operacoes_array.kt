package devandroid.julian.aulacomponenteslistagemcolecoes

fun main() {
    //array especifico de inteiros
    //val lista = intArrayOf(10,11,12)

    //array generico
    val lista = arrayOf("Julian", 30, "Siqueira")
    //para visualizar um array usamos forEach

//    lista.forEach { item ->
//        println(item)
//    }

    //para pegarmos um item do array
    println(lista[0])

    //lembrando que nao conseguimos adicionar elementos ao array, porem podemos usar o plus
    //que retorna um array novo adicionando o array antigo + o item que queira adicionar

    /*val novaLista = lista.plus("Rodrigues")
    novaLista.forEach { item ->
        println(item)
    }*/

    //para verificar quantos items tem o array, usamos size
    println(lista.size)

    //para pegar o indice de um item usamos indexOf
    println(lista.indexOf("Siqueira"))

    //para pegar o primeiro elemento
    println(lista.first())

    //para pegar o ultimo elemento
    println(lista.last())

    //verifica se tem o item no array
    println(lista.contains("Rodrigues"))

    //embaralha o array
    lista.shuffle()
    lista.forEach { item ->
        println(item)
    }
}