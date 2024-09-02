package polimorfismo2;

public class Main {
    public static void main(String[] args) {
        Operador caixa = new Operador();
        caixa.salario = 3000.0;

        Financeiro fin = new Financeiro();

        System.out.println();
        System.out.println(fin.getBonificacao(caixa));

        Gerente supervisor = new Gerente();
        supervisor.salario = 6000.0;

        System.out.println(fin.getBonificacao(supervisor));
    }
}
