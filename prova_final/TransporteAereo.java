package prova_final;

public class TransporteAereo implements Transporte {

    @Override
    public String selecionarTransportadora(Encomenda encomenda) {
        if (encomenda.getPeso() > 50 || encomenda.getDimensao() > 200) {
            return "Não é possível realizar o transporte aéreo para a encomenda " + encomenda.getDescricao() + ", pois excede os limites de peso ou dimensões.";
        }
        return "Selecionando transportadora aérea para entrega aérea de " + encomenda.getDescricao() + ".";
    }
}
