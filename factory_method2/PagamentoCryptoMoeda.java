package factory_method2;

public class PagamentoCryptoMoeda implements iPagamento {
    
    public void processarPagamento(double valor, String saldoCarteira) {

        if(valor >= Integer.parseInt(saldoCarteira)) {
            System.out.println("Pagamento em Crypto Moeda realizado com sucesso!");
            return;
        }

        System.out.println("Saldo da carteira insuficiente.");
    }
}
