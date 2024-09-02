package substituição_de_liskov;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Motorista motorista1 = new Motorista(carro);

        motorista1.ligar();
        motorista1.acelerar(10.0);
        motorista1.frear(10.0);

        System.out.println(motorista1.veiculo.velocidade);
    }
}
