package relatorios_de_desempenho;

public class CsvFactory extends RelatorioFactory {
    
    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioCsv();
    }
}
