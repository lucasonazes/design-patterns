package relatorios_de_desempenho;

public class Main {
    public static void main(String[] args) {

        RelatorioService service = new RelatorioService();

        service.relatorio(new CsvFactory(), "Esse é um relatório CSV");

        service.relatorio(new PdfFactory(), "Esse é um relatório PDF");

        service.relatorio(new ExcelFactory(), "Esse é um relatório Excel");
    }
}
