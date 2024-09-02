package herança_polimorfismo;

public class Cliente extends Pessoa {
    
    @Override
    public void Salvar() {
        super.Salvar();
        System.out.println("Na tabela de clientes");
    }

    @Override
    public void Consultar() {
        super.Consultar();
        System.out.println("Na tabela de clientes");
    }
}
