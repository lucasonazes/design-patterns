package polimorfismo2;

public class Funcionario implements IFuncionario {
    
    public String cpf = "";
    public String nome = "";
    public Double salario = 0.0;

    public Double calcularBonificacao() {
        return (this.salario * 0.01); // 1% do salário
    }
}
