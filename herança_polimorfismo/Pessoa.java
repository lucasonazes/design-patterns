package herança_polimorfismo;

public abstract class Pessoa {
    public String cpf = "";
    public String nome = "";
    public String email = "";

    public void Salvar() {
        // Classes não podem imprimir no console!!!
        System.out.println("Gravando no Banco de Dados");
    }

    public void Consultar() {
        // Classes não podem imprimir no console!!!
        System.out.println("Consultando o Banco de Dados");
    }
}
