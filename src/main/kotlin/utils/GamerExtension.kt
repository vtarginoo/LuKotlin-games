package utils

import dados.GamerEntity
import model.Gamer
import model.InfoGamerJson


    fun InfoGamerJson.criaGamer(): Gamer {
        return Gamer(this.nome, this.email, this.dataNascimento, this.usuario)
    }


    fun Gamer.toEntity(): GamerEntity {
        return GamerEntity(this.id, this.nome, this.email, this.dataNascimento, this.usuario, this.plano.toEntity())
    }

    fun GamerEntity.toModel(): Gamer {
        return Gamer(this.nome, this.email, this.dataNascimento, this.usuario, this.id)
    }



