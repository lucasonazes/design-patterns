package polimorfismo;

public class Triangulo implements iFigura {
    public Double ladoA = 0.0;
    public Double ladoB = 0.0;
    public Double ladoC = 0.0;

    public Double Calcular_perimetro() {
        return (this.ladoA + this.ladoB + this.ladoC);
    }
}
