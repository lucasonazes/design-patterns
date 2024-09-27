package factory_method3;

public class CartaoCreditoFactory extends PagamentoFactory {
    public String numCartao;

    public CartaoCreditoFactory(String numCartao) {
        this.numCartao = numCartao;
    }
    
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCartaoCredito(this.numCartao);
    }
}
