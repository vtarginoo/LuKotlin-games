package dados


import model.Jogo
import javax.persistence.EntityManager

class JogosDAO(manager: EntityManager): DAO<Jogo,JogoEntity>(manager, JogoEntity::class.java) {


    override fun toEntity(objeto: Jogo):JogoEntity {
        return JogoEntity(objeto.titulo,objeto.capa,objeto.preco,objeto.descricao,objeto.id)
    }

    override fun toModel(entity: JogoEntity): Jogo {
        return Jogo(entity.titulo,entity.capa,entity.preco,entity.descricao,entity.id)
    }

    override fun getLista(): List<Jogo> {
        return super.getLista() // Chamando o método da superclasse para obter a lista
    }

    override fun adicionar(objeto: Jogo) {
        super.adicionar(objeto) // Chamando o método da superclasse para adicionar
    }
}