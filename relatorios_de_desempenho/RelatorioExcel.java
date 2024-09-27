package relatorios_de_desempenho;

public class RelatorioExcel implements iRelatorio {
    
    @Override
    public void escreverRelatorio(String txt) {
        System.out.println("Excel: "+txt);
    }
}
