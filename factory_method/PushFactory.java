package factory_method;

public class PushFactory extends NotificacaoFactory {
    
    @Override
    public iNotificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
