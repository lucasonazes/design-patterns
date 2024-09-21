package factory_method2;

public class PagamentoPayPal implements iPagamento {
    
    @Override
    public void processarPagamento(double valor, String email) {

        if(email == "lucasonazes@gmail.com") {
            System.out.println("Pagamento no PayPal realizado com sucesso!");
            return;
        }

        System.out.println("A sua conta não está cadastrada no PayPal.");
    }
}
