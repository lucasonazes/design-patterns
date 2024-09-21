package factory_method2;

public class PagamentoCartaoCredito implements iPagamento {

    @Override
    public void processarPagamento(double valor, String numCartao) {

        if(numCartao.length() == 16) {
            System.out.println("Pagamento no cartão de crédito realizado com sucesso!");
            return;
        }

        System.out.println("Número do cartão inválido.");
    }
}
