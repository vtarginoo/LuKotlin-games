package dados

import model.Plano
import utils.toEntity
import utils.toModel
import javax.persistence.EntityManager

class PlanosDAO(manager: EntityManager): DAO<Plano, PlanoEntity>(manager, PlanoEntity::class.java) {

    override fun toEntity(objeto: Plano): PlanoEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: PlanoEntity): Plano {
        return entity.toModel()
    }
}