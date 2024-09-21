package factory_method;

public class NotificacaoEmail implements iNotificacao {

    @Override
    public void enviar(String mensagem) {
        // Implementa a lógica do e-mail
        System.out.println("Email: " + mensagem);
    }
}
