package factory_method;

public class NotificacaoService {
    
    public void enviarNotificacao(NotificacaoFactory factory, String mensagem) {
        iNotificacao notificacao = factory.criarNotificacao();
        notificacao.enviar(mensagem);
    }
}
