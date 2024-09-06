package dados


import model.Jogo
import utils.toEntity
import utils.toModel
import javax.persistence.EntityManager

class JogosDAO(manager: EntityManager): DAO<Jogo,JogoEntity>(manager, JogoEntity::class.java) {


    override fun toEntity(objeto: Jogo): JogoEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: JogoEntity): Jogo {
        return entity.toModel()
    }
}