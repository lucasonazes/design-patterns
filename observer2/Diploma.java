package observer2;

public class Diploma extends AbsObserver {
    private Estudante estudante_observado;

    public Diploma(Estudante estudante) {
        this.estudante_observado = estudante;
        this.estudante_observado.attach(this);
    }

    public void processar() {
        System.out.println("O diploma do estudante foi adicionado");
    }
}
