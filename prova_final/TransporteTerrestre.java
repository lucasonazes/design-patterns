package prova_final;

public class TransporteTerrestre implements Transporte {

    @Override
    public String selecionarTransportadora(Encomenda encomenda) {
        return "Selecionando transportadora local para entrega terrestre de " + encomenda.getDescricao() + ".";
    }
}
