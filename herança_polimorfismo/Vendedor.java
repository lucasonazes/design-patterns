package herança_polimorfismo;

public class Vendedor extends Pessoa {
    // Sobrecarga do método construtor (polimorfismo)

    Vendedor(){}
    
    Vendedor(String cpf, String nome, String email, Double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    Vendedor(String cpf) {
        if(cpf.equals("888")) {
            this.nome = "Lucas Onazes";
        }
        if(cpf.equals("999")) {
            this.nome = "Araci de Almeida";
        }
    }

    public Double salario = 0.0;

    @Override
    public void Salvar() {
        super.Salvar();
        System.out.println("Na tabela de vendedores");
    }

    @Override
    public void Consultar() {
        super.Consultar();
        System.out.println("Na tabela de vendedores");
    }
}
