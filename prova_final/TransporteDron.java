package prova_final;

public class TransporteDron implements Transporte {

    @Override
    public String selecionarTransportadora(Encomenda encomenda) {
        if (!encomenda.getLocal().equals("metropolitano") || encomenda.getPeso() > 2) {
            return "Não é possível realizar a entrega por drone para a encomenda " + encomenda.getDescricao() + ".";
        }
        return "Selecionando drone para entrega de pequeno pacote de " + encomenda.getDescricao() + ".";
    }
}
