package observer;

public class ObservadorSecretaria extends AbsObserver {
    
    // Propriedade com o objeto observado
    private Nota nota_observada; // Ponto de atenção: O ideal é utilizar um contrato para abstrair o objeto observado

    public ObservadorSecretaria(Nota nota_observada) {
        this.nota_observada = nota_observada;
        this.nota_observada.attach(this);
    }

    public void update() {
        System.out.println("Secretaria recebeu a notificação");
    }
}
