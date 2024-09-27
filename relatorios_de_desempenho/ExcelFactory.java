package relatorios_de_desempenho;

public class ExcelFactory extends RelatorioFactory {
    
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioExcel();
    }
}
