package prova;

import java.util.ArrayList;

public class Produto {
    private int estoque = 0;
    private ArrayList<AbsObserver> observadores = new ArrayList<AbsObserver>();

    public int getEstoque() {
        return estoque;
    }

    public void aumentarEstoque(int estoque) {
        this.estoque += estoque;
        System.out.println("Estoque aumentou, " + estoque + " unidades de estoque foram acresentadas");
        this.notificar();
    }

    public void diminuirEstoque(int estoque) {
        if (this.estoque - estoque < 0) {
            System.out.println("Estoque insuficiente");
        } else {
            this.estoque -= estoque;
            System.out.println("Estoque diminuiu, " + estoque + " unidades de estoque foram removidas");
            this.notificar();
        }
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
