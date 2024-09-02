package substituição_de_liskov;

public interface IVeiculo {
    void ligar();
    void desligar();
    void acelerar(Double v);
    void frear(Double v);
}
