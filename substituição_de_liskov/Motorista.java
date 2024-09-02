package substituição_de_liskov;

public class Motorista {
    public Veiculo veiculo;

    public Motorista(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void ligar() {
        this.veiculo.ligar();
    }

    public void desligar() {
        this.veiculo.desligar();
    }

    public void acelerar(Double v) {
        this.veiculo.acelerar(v);
    }

    public void frear(Double v) {
        this.veiculo.frear(v);
    }
}
