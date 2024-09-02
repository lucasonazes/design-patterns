package polimorfismo;

public class Circulo implements iFigura {
    public Double raio = 0.0;

    public Double Calcular_perimetro() {
        return (2 * this.raio * 3.14);
    }
}
