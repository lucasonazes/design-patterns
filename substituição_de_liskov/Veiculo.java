package substituição_de_liskov;

public class Veiculo implements IVeiculo {
    public boolean motor = false;
    public Double velocidade = 0.0;

    public void ligar() {
        this.motor = true;
    }

    public void desligar() {
        this.motor = false;
    }

    public void acelerar(Double v) {
        if(this.motor) this.velocidade += v;
        if(!this.motor) System.out.println("O carro está desligado");
    }

    public void frear(Double v) {
        v = v / 100;
        if(this.motor) this.velocidade = this.velocidade * (1 - v);
        if(!this.motor) System.out.println("O carro está desligado");
    }
}
