package relatorios_de_desempenho;

public class RelatorioService {
    
    public void relatorio(RelatorioFactory factory, String txt) {
        iRelatorio relatorio = factory.criarRelatorio();
        relatorio.escreverRelatorio(txt);
    }
}
