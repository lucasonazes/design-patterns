package factory_method2;

public class PagamentoService {
    
    public void pagar(PagamentoFactory factory, double valor, String validador) {
        iPagamento pagamento = factory.criarPagamento();
        pagamento.processarPagamento(valor, validador);
    }
}
