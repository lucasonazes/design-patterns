package observer2;

import java.util.ArrayList;

public class Estudante {
    private String situacao = "";
    private ArrayList<AbsObserver> observadores = new ArrayList<AbsObserver>();

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;

        if(this.situacao.equals("formado"))
        this.notificarTodos();
    }

    private void notificarTodos() {
        for (AbsObserver observador : observadores) {
            observador.processar();
        }
    }

    public void attach(AbsObserver observador) {
        this.observadores.add(observador);
    }

    public void dettach(AbsObserver observador) {
        this.observadores.remove(observador);
    }
}
