package relatorios_de_desempenho;

public class RelatorioCsv implements iRelatorio {
    
    @Override
    public void escreverRelatorio(String txt) {
        System.out.println("CSV: "+txt);
    }
}
