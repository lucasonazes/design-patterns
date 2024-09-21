package factory_method2;

public class CartaoCreditoFactory extends PagamentoFactory {
    
    public iPagamento criarPagamento() {
        return new PagamentoCartaoCredito();
    }
}
