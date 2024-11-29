package prova_final;

public class Encomenda {
    private String descricao;
    private double peso;
    private double dimensao;
    private boolean internacional;
    private String local;

    public Encomenda(String descricao, double peso, double dimensao, boolean internacional, String local) {
        this.descricao = descricao;
        this.peso = peso;
        this.dimensao = dimensao;
        this.internacional = internacional;
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public double getDimensao() {
        return dimensao;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public String getLocal() {
        return local;
    }
}
