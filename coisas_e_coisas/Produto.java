package coisas_e_coisas;

public class Produto {
    public Double peso = 0.0;
    public Double preço = 0.0;
    public Double volume = 0.0;

    public Double calcularFrete() {
        Double n1 = this.peso * 0.8; 
        Double n2 = this.volume * 1.0;
        return (n1 + n2);
    }
}
