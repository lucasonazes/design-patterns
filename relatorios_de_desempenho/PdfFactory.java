package relatorios_de_desempenho;

public class PdfFactory extends RelatorioFactory {
    
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioPdf();
    }
}
