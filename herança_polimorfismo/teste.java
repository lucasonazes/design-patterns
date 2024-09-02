package herança_polimorfismo;

public class teste {
    public static void main(String[] args) {
        // Construir um objeto a partir do construtor padrão
        // O objeto não terá estado (atributos sem valores)

        Vendedor Vendedor;
        Vendedor = new Vendedor(); // Constrói
        Vendedor.nome = "Lucas Onazes"; // Atribui estado

        // Construir um objeto a partir do cpf
        // O Objeto terá os valores conforme a implementação do construtor
        Vendedor Vendedor2 = new Vendedor("999");
        System.out.println(Vendedor2.nome);
    }
}
