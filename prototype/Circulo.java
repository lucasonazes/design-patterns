package prototype;

public class Circulo extends Forma {
    private int raio;

    public Circulo(int x, int y, int raio) {
        super("Circulo");
        this.setX(x);
        this.setY(y);
        this.setRaio(raio);
    }
    
    public Forma clone() {
        Circulo circulo_clone = new Circulo(this.getX(), this.getY(), getRaio());
        return circulo_clone;
    }

    public void desenhar() {
        System.out.println("Desenhando o círculo: " + this.getX() + " " + this.getY());
    }

    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
