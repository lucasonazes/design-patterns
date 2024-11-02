package prototype;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10, 20, 30);
        c1.desenhar();
        System.out.println(c1);

        // Copiar com uso do "=" duplica por referência. Não é isso que queremos
        Circulo c2 = (Circulo) c1.clone();
        c2.desenhar(); // Deve reproduzir o mesmo estado do c1
        System.out.println(c2);
    }
}
