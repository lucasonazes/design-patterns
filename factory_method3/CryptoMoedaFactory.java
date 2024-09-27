package factory_method3;

public class CryptoMoedaFactory extends PagamentoFactory{
    public int saldoCarteira;

    public CryptoMoedaFactory(int saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }
    
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCryptoMoeda(saldoCarteira);
    }
}
