package factory_method3;

public class PagamentoService {
    
    public void pagar(PagamentoFactory factory, double valor) {
        iPagamento pagamento = factory.criarPagamento();
        pagamento.processarPagamento(valor);
    }
}
