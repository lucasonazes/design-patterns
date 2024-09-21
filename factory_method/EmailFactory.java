package factory_method;

public class EmailFactory extends NotificacaoFactory {

    @Override
    public iNotificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
