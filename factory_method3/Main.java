package factory_method3;

public class Main {
    public static void main(String[] args) {

        PagamentoService service = new PagamentoService();

        service.pagar(new CartaoCreditoFactory("1234567890123456"), 10);

        service.pagar(new PayPalFactory("lucasonazes@gmail.com"), 10);

        service.pagar(new CryptoMoedaFactory(10), 10);

    }
}
