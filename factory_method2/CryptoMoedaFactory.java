package factory_method2;

public class CryptoMoedaFactory extends PagamentoFactory {
    
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCryptoMoeda();
    }
}
