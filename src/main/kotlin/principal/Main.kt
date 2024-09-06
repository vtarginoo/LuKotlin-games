package principal


import dados.Banco
import dados.GamersDAO
import dados.JogosDAO

import dados.PlanosDAO
import model.*


fun main() {
    val manager = Banco.getEntityManager()
    val jogoDAO = JogosDAO(manager)
    val gamerDAO = GamersDAO(manager)
    val aluguelDAO = AluguelDAO(manager)

    val gamer = gamerDAO.recuperarPeloId(1)
    val jogo = jogoDAO.recuperarPeloId(3)
    val aluguel = gamer.alugaJogo(jogo, Periodo())

    aluguelDAO.adicionar(aluguel)

    val listaAluguel = aluguelDAO.getLista()
    println(listaAluguel)

    manager.close()
}