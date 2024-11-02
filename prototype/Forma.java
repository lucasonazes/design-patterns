package prototype;

abstract class Forma {
    private int x, y;
    private String cor;
    private String forma;

    Forma (String forma) {
        this.forma = forma;
    }

    public abstract Forma clone();

    public abstract void desenhar();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}
