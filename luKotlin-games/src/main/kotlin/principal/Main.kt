package principal


import model.Gamer
import model.Jogo
import service.ConsumoApi
import java.util.*


/// https://apidocs.cheapshark.com/#e3d7f1f0-f7a4-b36a-587a-6514a40f4d88

fun main() {

    val leitura = Scanner(System.`in`)
    val gamer = Gamer.criarGamer(leitura)
    println("Cadastro concluído com sucesso. Dados do gamer:")
    println(gamer)

    do{
    println("Digite um Código do Jogo para Buscar:")
    val busca = leitura.nextLine()


    val api = ConsumoApi()
    var meuJogo: Jogo? = null

    val resultado = runCatching {

        val infoJogo = api.consumoApi(busca)
        meuJogo = Jogo(infoJogo.info.title, infoJogo.info.thumb)
    }

    resultado.onFailure {
        println("Jogo Inexistente tente outro Id")
    }.onSuccess{
        println("Deseja Introduzir uma descrição personalizada? S/N")
        val opcao = leitura.nextLine()
        if(opcao.equals("s",true)) {
            println("Insira a descrição personalizada para o seu jogo:")
            val descricaoPersonalizada = leitura.nextLine()
            meuJogo?.descricao = descricaoPersonalizada
        } else {
            meuJogo?.descricao = meuJogo?.titulo
        }

        gamer.jogosBuscados.add(meuJogo)
    }

        println("Deseja buscar um novo jogo? S/N")
        val resposta = leitura.nextLine()

    } while (resposta.equals("s", true))


    println("\n Lista atualizada:")
    println(gamer.jogosBuscados)

    println("Busca finalizada com sucesso.")

}