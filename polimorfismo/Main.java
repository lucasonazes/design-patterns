package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Desenhista desenhista = new Desenhista();
        Circulo circulo = new Circulo();
        circulo.raio = 10.0;
        System.out.println(desenhista.getPerimetro(circulo));

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 10.0;
        System.out.println(desenhista.getPerimetro(quadrado));

        Triangulo triangulo = new Triangulo();
        triangulo.ladoA = 10.0;
        triangulo.ladoB = 10.0;
        triangulo.ladoC = 10.0;
        System.out.println(desenhista.getPerimetro(triangulo));

        Retangulo retangulo = new Retangulo();
        retangulo.cor = "Verde";
        desenhista.alterarCor(retangulo);
        System.out.println(retangulo.cor);
    }
}
