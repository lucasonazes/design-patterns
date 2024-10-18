package pattern_decorator;

public class LeiteDecorador extends AbsDecorator {

    public LeiteDecorador(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", leite";
    }

    @Override
    public Double getPreco() {
        return bebida.getPreco() + 2.0;
    }
}
