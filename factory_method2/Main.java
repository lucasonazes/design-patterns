package factory_method2;

public class Main {
    public static void main(String[] args) {
        
        PagamentoService service = new PagamentoService();

        service.pagar(new CartaoCreditoFactory(), 10, "1234567890123456");

        service.pagar(new CryptoMoedaFactory(), 10, "10");

        service.pagar(new PayPalFactory(), 10, "lucasonazes@gmail.com");
    }
}
