package pattern_decorator;

public class AcucarDecorador extends AbsDecorator {
    
    public AcucarDecorador(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", açucar";
    }

    @Override
    public Double getPreco() {
        return bebida.getPreco() + 1.0;
    }
}
