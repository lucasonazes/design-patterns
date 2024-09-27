package factory_method2;

public class CartaoCreditoFactory extends PagamentoFactory {
    
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCartaoCredito();
    }
}
