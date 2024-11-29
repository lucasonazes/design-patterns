package prova_final;

public class Main {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda("Pacote Eletrônico", 3, 150, false, "metropolitano");

        SistemaDeSelecaoDeTransporte sistema = new SistemaDeSelecaoDeTransporte(new TransporteTerrestre());
        System.out.println(sistema.selecionar(encomenda));

        sistema.setTipoDeTransporte(new TransporteAereo());
        System.out.println(sistema.selecionar(encomenda));

        encomenda = new Encomenda("Pacote Internacional", 10, 150, true, "internacional");
        sistema.setTipoDeTransporte(new TransporteMaritimo());
        System.out.println(sistema.selecionar(encomenda));

        encomenda = new Encomenda("Pacote Pequeno", 1, 50, false, "metropolitano");
        sistema.setTipoDeTransporte(new TransporteDron());
        System.out.println(sistema.selecionar(encomenda));
    }
}
