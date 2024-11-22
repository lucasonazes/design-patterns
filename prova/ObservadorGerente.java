package prova;

public class ObservadorGerente extends AbsObserver {

    // Propriedade com o objeto observado
    private Produto estoque_observado; // Ponto de atenção: O ideal é utilizar um contrato para abstrair o objeto observado

    public ObservadorGerente(Produto estoque_observado) {
        this.estoque_observado = estoque_observado;
        this.estoque_observado.attach(this);
    }

    public void update() {
        System.out.println("Gerente recebeu a notificação");
    }
}
