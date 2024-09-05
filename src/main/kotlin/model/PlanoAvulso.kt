package model

class PlanoAvulso(
    tipo:String): Plano(tipo){

    override fun obterValor(aluguel: Aluguel): Double {

        var valorOriginal = super.obterValor(aluguel)
        if(aluguel.gamer.media > 8){
            valorOriginal *= 0.9
        }
        return valorOriginal
    }


}
