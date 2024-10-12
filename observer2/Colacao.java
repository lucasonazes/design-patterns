package observer2;

public class Colacao extends AbsObserver {
    private Estudante estudante_observado;

    public Colacao(Estudante estudante) {
        this.estudante_observado = estudante;
        this.estudante_observado.attach(this);
    }

    public void processar() {
        System.out.println("O colação do estudante foi adicionada");
    }
}
