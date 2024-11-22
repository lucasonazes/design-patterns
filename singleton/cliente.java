public class cliente {
    private String clienteId;
    private String nome;
    private conta conta;

    public cliente(String clienteId, String nome) {
        this.clienteId = clienteId;
        this.nome = nome;
        this.conta = conta.getInstance(clienteId);
    }

    public void depositar(double valor) {
        this.conta.depositar(valor);
    }

    public void sacar(double valor) {
        this.conta.sacar(valor);
    }

    public Double verValor() {
        return this.conta.verSaldo();
    }
}
