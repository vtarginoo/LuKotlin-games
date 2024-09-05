package utils

import model.Gamer
import model.InfoGamerJson


    fun InfoGamerJson.criaGamer(): Gamer {
        return Gamer(this.nome, this.email, this.dataNascimento, this.usuario)
    }


