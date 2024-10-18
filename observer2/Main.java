package observer2;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Diploma diploma = new Diploma(estudante);
        Colacao colacao = new Colacao(estudante);

        estudante.setSituacao("formado");
    }
}
