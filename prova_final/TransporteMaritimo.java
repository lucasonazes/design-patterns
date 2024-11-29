package prova_final;

public class TransporteMaritimo implements Transporte {

    @Override
    public String selecionarTransportadora(Encomenda encomenda) {
        if (!encomenda.isInternacional()) {
            return "Transporte marítimo disponível apenas para entregas internacionais. Encomenda " + encomenda.getDescricao() + " não é internacional.";
        }
        return "Selecionando transportadora marítima para entrega internacional de " + encomenda.getDescricao() + ".";
    }
}

