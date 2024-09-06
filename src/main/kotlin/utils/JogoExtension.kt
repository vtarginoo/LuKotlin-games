package utils

import dados.JogoEntity
import model.InfoJogoJson
import model.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}

    fun Jogo.toEntity(): JogoEntity {
        return JogoEntity(this.titulo, this.capa, this.preco, this.descricao, this.id)
    }

    fun JogoEntity.toModel(): Jogo {
        return Jogo(this.titulo, this.capa, this.preco, this.descricao, this.id)
    }