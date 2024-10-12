package observer;

public class Main {
    public static void main(String[] args) {
        Nota nota = new Nota();
        ObservadorEstudante estudante = new ObservadorEstudante(nota);
        ObservadorSecretaria secretaria = new ObservadorSecretaria(nota);
        nota.setSituacao("lançada");
    } 
}
