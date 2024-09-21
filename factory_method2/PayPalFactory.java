package factory_method2;

public class PayPalFactory extends PagamentoFactory {
    
    public iPagamento criarPagamento() {
        return new PagamentoPayPal();
    }
}
