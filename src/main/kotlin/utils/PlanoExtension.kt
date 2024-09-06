package utils

import dados.PlanoAssinaturaEntity
import dados.PlanoAvulsoEntity
import dados.PlanoEntity
import model.Plano
import model.PlanoAssinatura
import model.PlanoAvulso

fun Plano.toEntity(): PlanoEntity {
    return if (this is PlanoAssinatura) {
        PlanoAssinaturaEntity(this.tipo, this.mensalidade, this.jogosIncluidos, this.percentualDescontoReputacao, this.id)
    } else {
        PlanoAvulsoEntity(this.tipo, this.id)
    }
}

fun PlanoEntity.toModel(): Plano {
    return if (this is PlanoAssinaturaEntity) {
        PlanoAssinatura(this.tipo, this.mensalidade, this.jogosIncluidos, this.percentualDescontoReputacao, this.id)
    } else {
        PlanoAvulso(this.tipo, this.id)
    }
}