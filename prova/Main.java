package prova;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        ObservadorGerente gerente = new ObservadorGerente(produto);
        ObservadorEncarregado encarregado = new ObservadorEncarregado(produto);
        produto.aumentarEstoque(3);
        produto.diminuirEstoque(1);
        System.out.println("Estoque atual: " + produto.getEstoque());
    }
}
