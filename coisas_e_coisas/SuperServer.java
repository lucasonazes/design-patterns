package coisas_e_coisas;

public class SuperServer extends Produto {

    @Override
    public Double calcularFrete() {
        Double frete = super.calcularFrete();
        Double seguro = this.preço * 0.3;

        return frete + seguro;
    }
}
