package prova_final;

public class SistemaDeSelecaoDeTransporte {
    private Transporte tipoDeTransporte;

    public SistemaDeSelecaoDeTransporte(Transporte tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public void setTipoDeTransporte(Transporte tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public String selecionar(Encomenda encomenda) {
        return tipoDeTransporte.selecionarTransportadora(encomenda);
    }
}
