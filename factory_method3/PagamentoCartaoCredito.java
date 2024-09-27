package factory_method3;

public class PagamentoCartaoCredito implements iPagamento {
    public String numCartao;

    public PagamentoCartaoCredito(String numCartao) {
        this.numCartao = numCartao;
    }

    @Override
    public void processarPagamento(double valor) {

        if(this.numCartao.length() == 16) {
            System.out.println("Pagamento no cartão de crédito realizado com sucesso!");
            return;
        }

        System.out.println("Número do cartão inválido.");
    }
}
