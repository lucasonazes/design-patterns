package polimorfismo;

public class Retangulo implements iFigura {
    public Double lado1 = 0.0;
    public Double lado2 = 0.0;
    public String cor = "";

    public Double Calcular_perimetro() {
        return (this.lado1 * 2 + this.lado2 * 2);
    }
}
