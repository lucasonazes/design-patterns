package factory_method;

public class NotificacaoSms implements iNotificacao {
    
    @Override
    public void enviar(String mensagem) {
        // Implementa a lógica do Sms
        System.out.println("Sms: " + mensagem);
    }
}
