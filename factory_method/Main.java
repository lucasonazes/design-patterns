package factory_method;

public class Main {
    public static void main(String[] args) {
        
        NotificacaoService service = new NotificacaoService();

        service.enviarNotificacao(new EmailFactory(), "Seja bem-vindo à plataforma");

        service.enviarNotificacao(new PushFactory(), "Você tem uma nova mensagem!");

        service.enviarNotificacao(new SmsFactory(), "Seu código é 563");
    }
}
