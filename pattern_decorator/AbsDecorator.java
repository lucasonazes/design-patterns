package pattern_decorator;

public class AbsDecorator implements iBebida {
    protected iBebida bebida;

    public AbsDecorator(iBebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return "";
    }

    @Override
    public Double getPreco() {
        return 0.0;
    }
    
}
