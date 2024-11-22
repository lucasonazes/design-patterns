public class conta {
    private static conta instancia;
    private String numero_conta = "";
    private Double saldo = 0.0;

    private conta(String numero_conta) {
        this.numero_conta = numero_conta;
        this.saldo = 0.0;
    }

    public static conta getInstance(String numero_conta) {
        if (instancia == null) {
            instancia = new conta(numero_conta);
        }
        return instancia;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public Double verSaldo() {
        return this.saldo;
    }
}
