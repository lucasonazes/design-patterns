package factory_method2;

public class PayPalFactory extends PagamentoFactory {
    
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoPayPal();
    }
}
