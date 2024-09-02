package coisas_e_coisas;

public class Main {
    public static void main(String[] args) {
        SuperServer superServer = new SuperServer();

        superServer.peso = 10.0;
        superServer.preço = 10.0;
        superServer.volume = 10.0;

        System.out.println();
        System.out.println(superServer.calcularFrete());
    }
}
