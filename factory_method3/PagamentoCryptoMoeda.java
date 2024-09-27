package factory_method3;

public class PagamentoCryptoMoeda implements iPagamento {
    public int saldoCarteira;

    public PagamentoCryptoMoeda(int saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    @Override
    public void processarPagamento(double valor) {

        if(valor <= this.saldoCarteira) {
            System.out.println("Pagamento em Crypto Moeda realizado com sucesso!");
            return;
        }

        System.out.println("Saldo da carteira insuficiente.");
    }
}
