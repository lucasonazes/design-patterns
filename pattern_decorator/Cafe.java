package pattern_decorator;

public class Cafe implements iBebida {

    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public Double getPreco() {
        return 3.0;
    }
    
}
