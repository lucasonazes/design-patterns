package pattern_decorator;

public class Main {
    public static void main(String[] args) {
        
        Cafe cafePreto = new Cafe();
        System.out.println(cafePreto.getDescricao() + " - R$" + cafePreto.getPreco() + "0");

        LeiteDecorador cafeLeite = new LeiteDecorador(cafePreto);
        System.out.println(cafeLeite.getDescricao() + " - R$" + cafeLeite.getPreco() + "0");

        AcucarDecorador cafeLeiteAcucar = new AcucarDecorador(cafeLeite);
        System.out.println(cafeLeiteAcucar.getDescricao() + " - R$" + cafeLeiteAcucar.getPreco() + "0");
    }
}
