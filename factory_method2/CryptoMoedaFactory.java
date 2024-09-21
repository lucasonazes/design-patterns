package factory_method2;

public class CryptoMoedaFactory extends PagamentoFactory {
    
    public iPagamento criarPagamento() {
        return new PagamentoCryptoMoeda();
    }
}
