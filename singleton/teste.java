public class teste {
    public static void main(String[] args) {
        cliente cliente1 = new cliente("123", "Alice");
        cliente cliente2 = new cliente("345", "Bob");

        cliente1.depositar(10000.00);
        cliente2.depositar(11000.00);

        cliente1.sacar(2000.00);
        cliente2.sacar(500.00);

        System.err.println("Saldo de Alice: " + cliente1.verValor());
        System.out.println("Saldo de Bob: " + cliente2.verValor());

        conta outraInstancia = conta.getInstance("123");
        System.out.println("Verificando Singleton, saldo de Alice deve ser o mesmo: " + outraInstancia.verSaldo());
    }
}
