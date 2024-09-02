package polimorfismo2;

public class Financeiro {
    public Double getBonificacao(IFuncionario Funcionario) {
        return Funcionario.calcularBonificacao();
    }
}
