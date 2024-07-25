package devandroid.julian.aulacomponenteslistagemcolecoes

class Motorista( val nome: String ) {

    fun exibirDadosMotorista() = println("Motorista: $nome")

    inner class Caminhao( val nomeCaminhao: String ){//Classe aninhada (Nested Class)
        //sao classe que nao tem relacao com a classe que ela esta dentro, ela é uma classe
        //independente, se tentar acessar um atributo da classe Motorista, nao vai ser possivel.
        //Porem ela precisa de Motorista para ser acessada.
        //Motorista.Caminhao("FH 60")

        //Já inner class, tem uma ligacao com a classe que ela esta dentro, para ser acessada,
        //ela precisa da instancia desta classe.
        //Ex: val motorista = Motorista("Jamilton")
        //    val caminhao = motorista.Caminhao("FH 60")
    fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao motorista: $nome")
    }

}

fun main() {

    val motorista = Motorista("Jamilton")
    val caminhao = motorista.Caminhao("FH 60")
    caminhao.exibirDadosCaminhao()

    //val motorista = Motorista("Jamilton")
    /*val caminhao = Motorista.Caminhao("FH 60")
    caminhao.exibirDadosCaminhao()*/

    /*val motorista = Motorista("Jamilton")
    motorista.exibirDadosMotorista()*/

}