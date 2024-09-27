package relatorios_de_desempenho;

public class RelatorioPdf implements iRelatorio {
    
    @Override
    public void escreverRelatorio(String txt) {
        System.out.println("PDF: "+txt);
    }
}
