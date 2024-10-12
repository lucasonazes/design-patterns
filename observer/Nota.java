package observer;

import java.util.ArrayList;

public class Nota {
    private String situacao = "";
    private ArrayList<AbsObserver> observadores = new ArrayList<AbsObserver>();

    public String getSituacao() {
        return situacao;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
        // Notificar todos os observadores
        this.notificar();
    }

    private void notificar() {
        for (AbsObserver observador : observadores) {
            observador.update();
        }
    }

    public void attach(AbsObserver observador) {
        this.observadores.add(observador);
    }

    public void dettach(AbsObserver observador) {
        this.observadores.remove(observador);
    }
}
