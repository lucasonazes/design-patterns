package polimorfismo;

public class Desenhista {

    public Double getPerimetro(iFigura f) {
        return f.Calcular_perimetro();
    }

    public void alterarCor(Retangulo r) {
        r.cor = "Vermelho";
    }
}
