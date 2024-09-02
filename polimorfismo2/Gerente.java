package polimorfismo2;

public class Gerente extends Funcionario {

    public Double calcularBonificacao() {
        return (this.salario * 0.015); // 1,5% do salário
    }
}
