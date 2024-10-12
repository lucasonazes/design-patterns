package observer;

public class ObservadorEstudante extends AbsObserver {

    // Propriedade com o objeto observado
    private Nota nota_observada; // Ponto de atenção: O ideal é utilizar um contrato para abstrair o objeto observado

    public ObservadorEstudante(Nota nota_observada) {
        this.nota_observada = nota_observada;
        this.nota_observada.attach(this);
    }

    public void update() {
        System.out.println("Estudante recebeu a notificação");
    }
}
