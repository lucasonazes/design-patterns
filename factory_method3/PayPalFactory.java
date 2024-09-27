package factory_method3;

public class PayPalFactory extends PagamentoFactory {
    public String email;

    public PayPalFactory(String email) {
        this.email = email;
    }
    
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoPayPal(this.email);
    }
}
