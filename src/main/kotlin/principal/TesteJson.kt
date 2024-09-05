package principal

import com.google.gson.GsonBuilder
import model.Periodo
import model.PlanoAssinatura
import service.ConsumoApi
import java.io.File
import java.time.LocalDate

fun main(){

    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscaJogosJson()

    val gamerCamila = listaGamers[5]
    val gamerCaroline = listaGamers[3]

    val jogoResidentVillage = listaJogoJson[10]
    val jogoSpider = listaJogoJson[13]
    val jogoTheLastOfUs = listaJogoJson[2]
    val jogoDandara = listaJogoJson[5]
    val jogoAssassins = listaJogoJson[4]
    val jogoCyber = listaJogoJson[6]
    val jogoGod = listaJogoJson[7]
    val jogoSkyrim = listaJogoJson[18]

    gamerCamila.recomendarJogo(jogoResidentVillage, 7)
    gamerCamila.recomendarJogo(jogoTheLastOfUs, 10)
    gamerCamila.recomendarJogo(jogoAssassins, 8)
    gamerCamila.recomendarJogo(jogoCyber, 7)
    gamerCamila.recomendarJogo(jogoGod, 10)
    gamerCamila.recomendarJogo(jogoDandara, 8)
    gamerCamila.recomendarJogo(jogoSkyrim, 8)
    gamerCamila.recomendarJogo(jogoSpider, 6)

    val gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    val serializacao = gson.toJson(gamerCamila.jogosRecomendados)

    val arquivo = File("jogosRecomendados.json")
    arquivo.writeText(serializacao)
    println(arquivo.absolutePath)








}