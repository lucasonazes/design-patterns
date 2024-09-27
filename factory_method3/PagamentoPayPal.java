package factory_method3;

public class PagamentoPayPal implements iPagamento {
    public String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }
    
    @Override
    public void processarPagamento(double valor) {
        
        if(this.email.equals("lucasonazes@gmail.com")) {
            System.out.println("Pagamento no PayPal realizado com sucesso!");
            return;
        }

        System.out.println("A sua conta não está cadastrada no PayPal.");
    }
}
