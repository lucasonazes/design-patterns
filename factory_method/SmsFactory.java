package factory_method;

public class SmsFactory extends NotificacaoFactory {
    
    @Override
    public iNotificacao criarNotificacao() {
        return new NotificacaoSms();
    }
}
